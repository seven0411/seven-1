package com.myExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author song.qi
 * @version 2018年5月24日
 * @see 
 */
@RestController
public class TestRestController {

	@RequestMapping("/hello")
	public Object name() {
		return "hello spring-boot ^_^ ";
	}
}
