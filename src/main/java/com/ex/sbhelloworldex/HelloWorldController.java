package com.ex.sbhelloworldex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String hello() {
		return "Hey its my Hello World";
		
	}
}
