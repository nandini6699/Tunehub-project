package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("*")
@RestController
public class SPAController {
	@RequestMapping(value = "/{path:[^\\.]*}")
	public String redirect() {
		return "forward:/";
	}

}
