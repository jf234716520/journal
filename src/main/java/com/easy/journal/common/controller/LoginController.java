package com.easy.journal.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("login/login")
	public String toHello(){
		
		return "login/login";
	}
	@RequestMapping("login/register")
	public String toRegister(){
		
		return null;
	}
}
