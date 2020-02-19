package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;


@Controller
public class LoginController {// implements Controller

	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO, HttpSession session)  {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		UserVO user = userDAO.getUser(vo);
		
		if(user!=null)
		{
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
			
		}else
		{
			return "login.jsp";
		}
		
	
	}

}
