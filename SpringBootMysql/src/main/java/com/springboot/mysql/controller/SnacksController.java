package com.springboot.mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnacksController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome***";
	}

}
