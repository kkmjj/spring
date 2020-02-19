package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");


		UserVO vo = new UserVO(); // USERDTO�� ����
		vo.setId(id);
		vo.setPassword(password);


		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);

		if(user!=null)
		{
			return "getBoardList.do";
			
		}else
		{
			return "login";
		}
	}

}
