package com.easy.journal.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/hello")
	public String toHello(){
		
		return "login/login";
	}
}
