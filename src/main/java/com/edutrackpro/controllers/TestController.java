package com.edutrackpro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@GetMapping("/test")
	public String test() {
		return "Test Successful";
	}

	@GetMapping("/webpagetest")
	public String webpage() {
		return "test";
	}
}
