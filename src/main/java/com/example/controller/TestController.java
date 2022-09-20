package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/test")
	@ResponseBody
	public String Test() {
<<<<<<< HEAD
		
		
		
		return "hi";
		
		
		
=======
		return "hi"
>>>>>>> 0bf3519c524c304984a47025189815c53fa86c47
	}

}
