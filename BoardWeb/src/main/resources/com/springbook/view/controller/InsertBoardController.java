package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;


//@Controller
public class InsertBoardController // implements Controller 
{

	
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	
	
	//@RequestMapping(value = "/insertBoard.do")	// xml���� HandlerMapping �ȿ� property�� �ִ� ���� ������̼� 
	public String insertBoard(BoardVO vo,BoardDAO boardDAO)//insertBoard(HttpServletRequest request)
	
	{
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//
//
//		BoardVO vo = new BoardVO(); // USERDTO�� ����
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);


		//BoardDAO boardDAO = new BoardDAO();	// �̷��� ó���ϸ� �ٷ� ����� �Է� ���� vo ��ü �׸� �� ������ ��� �ڵ����� ó�� 
		boardDAO.insertBoard(vo);

			//ModelAndView mav = new ModelAndView();
			//	mav.setViewName("getBoardList.do");
			//return mav;
	return "getBoardList.do";
	}
}
