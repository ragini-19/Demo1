package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbk.dao.LoginRepo;

@Controller
public class LoginController {
	
	@Autowired
	LoginRepo repo;
	
	
	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	
@RequestMapping("/loginpage")
public String loginpage()
{
	return "show.jsp";
	
}
}
