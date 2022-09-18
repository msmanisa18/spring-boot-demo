package com.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

	@PostMapping(value = "/welcome")
	public String welcome() {
		return "{\"userName\":\"Shakti\"}";
	}
}