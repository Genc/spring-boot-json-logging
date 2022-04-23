package com.farukgenc.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */
@Slf4j
@RestController
public class HelloController {

	@GetMapping
	public String sayHello() {
		log.info("Hello from {}", this.getClass().getSimpleName());
		return "Hello";
	}

}
