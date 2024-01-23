package com.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/get")
@Slf4j
public class Controller {
	@GetMapping("/map")
	public String welcome() {
		log.info("here is controller");
		return "SPRING BOOT + GITHUB ACTIVE DIRECTORY AUTH EXAMPLE||";
	}
}
