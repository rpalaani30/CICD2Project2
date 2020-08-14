package com.CICD.Project2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class webController {
	
	@RequestMapping("/")
	public String index() {
		return "<h1>Greetings from CICD Project2!</h1>";
	}
	
	
}
