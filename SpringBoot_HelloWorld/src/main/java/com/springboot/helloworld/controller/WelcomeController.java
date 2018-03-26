package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/set")
	public String welcome() {
		return "Getting Ready for party****";
	}

}
