package com.farukgenc.logging.placeholder;

import com.farukgenc.logging.utils.RestTemplateUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */

@Slf4j
@Configuration
@RequiredArgsConstructor
public class JsonPlaceholderApiConfig {

	private final RestTemplateUtils restTemplateUtils;

	private final JsonPlaceholderPropertiesConfig jsonPlaceHolderConfig;

	@Bean("jsonPlaceholderRestTemplate")
	public RestTemplate jsonPlaceholderRestTemplate(RestTemplateBuilder restTemplateBuilder) {

		final String baseUri = jsonPlaceHolderConfig.getBaseUri();
		final int readTimeout = jsonPlaceHolderConfig.getReadTimeout();
		final int connectTimeout = jsonPlaceHolderConfig.getConnectTimeout();

		log.info("Creating JsonPlaceholder RestTemplate with: Base URI --> {} , {}ms read timeout ,{}ms connect timeout", baseUri, readTimeout, connectTimeout);

		return restTemplateUtils.createRestTemplate(restTemplateBuilder, baseUri, readTimeout, connectTimeout);
	}

}
