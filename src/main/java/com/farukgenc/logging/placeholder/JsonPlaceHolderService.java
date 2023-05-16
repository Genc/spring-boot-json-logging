package com.farukgenc.logging.placeholder;

import com.farukgenc.logging.placeholder.model.PostDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class JsonPlaceHolderService {

	private static final String SINGLE_POST_URI = "/posts/1";

	private final RestTemplate jsonPlaceholderRestTemplate;

	public PostDto getSinglePost(){

		log.info("Calling json place holder api for {} path", SINGLE_POST_URI);

		return jsonPlaceholderRestTemplate.getForObject(SINGLE_POST_URI, PostDto.class);
	}

}
