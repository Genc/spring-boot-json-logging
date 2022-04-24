package com.farukgenc.logging.controller;

import com.farukgenc.logging.placeholder.JsonPlaceHolderService;
import com.farukgenc.logging.placeholder.model.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/json-placeholder")
public class JsonPlaceholderController {

	private final JsonPlaceHolderService jsonPlaceHolderService;

	@GetMapping("/single-post")
	public ResponseEntity<PostDto> getSinglePost() {

		final PostDto singlePost = jsonPlaceHolderService.getSinglePost();

		return ResponseEntity.ok(singlePost);
	}
}
