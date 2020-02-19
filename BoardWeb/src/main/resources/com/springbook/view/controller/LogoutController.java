package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController  {//implements Controller

	@RequestMapping("/logout.do")
	public String logout(HttpSession session)  {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		
		session.invalidate();
		
		return "login.jsp";

	}

}
