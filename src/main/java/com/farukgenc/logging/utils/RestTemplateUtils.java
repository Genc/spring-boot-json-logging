package com.farukgenc.logging.utils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.zalando.logbook.spring.LogbookClientHttpRequestInterceptor;

import java.util.Collections;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RestTemplateUtils {

	private final LogbookClientHttpRequestInterceptor logbookClientHttpRequestInterceptor;

	public RestTemplate createRestTemplate(RestTemplateBuilder restTemplateBuilder, String baseUri, int readTimeOut, int connectTimeOut) {

		final DefaultUriBuilderFactory defaultUriBuilderFactory = new DefaultUriBuilderFactory(baseUri);
		final RestTemplate restTemplate = restTemplateBuilder.uriTemplateHandler(defaultUriBuilderFactory).build();

		final OkHttpClient okHttpClient = new OkHttpClient.Builder().cache(null).build();
		final OkHttp3ClientHttpRequestFactory httpRequestFactory = new OkHttp3ClientHttpRequestFactory(okHttpClient);
		httpRequestFactory.setReadTimeout(readTimeOut);
		httpRequestFactory.setConnectTimeout(connectTimeOut);

		final BufferingClientHttpRequestFactory bufferingClientHttpRequestFactory = new BufferingClientHttpRequestFactory(httpRequestFactory);
		restTemplate.setRequestFactory(bufferingClientHttpRequestFactory);
		restTemplate.setInterceptors(Collections.singletonList(logbookClientHttpRequestInterceptor));

		return restTemplate;
	}
}
