package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HomeController {

	@RequestMapping(value="/welcome",method="POST",produces="application/xml")
	public @ResponseBody String hello(){  
		
		return"Hello!";  
}
}