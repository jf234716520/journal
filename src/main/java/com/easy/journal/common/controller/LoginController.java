package com.easy.journal.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.easy.journal.common.model.ResultMessage;
import com.easy.journal.common.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 返回登录页面
	 * @return
	 */
	@RequestMapping("/login/login")
	public String toHello(){
		
		return "login/login";
	}
	
	/**
	 * 注册
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	@ResponseBody
	@RequestMapping("login/register")
	public ResultMessage Register(String username,String password){
		
		userService.register(username,password);
		
		ResultMessage rm = new ResultMessage();
		rm.setStatus(1);
		rm.setMessage("it is ok");
		
		return rm;
	}
	
}
