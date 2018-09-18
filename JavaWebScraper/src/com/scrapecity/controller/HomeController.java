package com.scrapecity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		// returns /WEB-INF/view/main-menu.jsp when homepage is hit
		System.out.println("HOME PAGE");
		return "main-menu";
	}

}