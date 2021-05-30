package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	
	@RequestMapping("/")
	public String viewHome()
	{
		return "home";
	}
	
	@GetMapping("/home")
	public String viewHome2()
	{
		return "home";
	}
}
