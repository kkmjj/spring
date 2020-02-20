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
	
	
	//@RequestMapping(value = "/insertBoard.do")	// xml에서 HandlerMapping 안에 property로 넣는 과정 어노테이션 
	public String insertBoard(BoardVO vo,BoardDAO boardDAO)//insertBoard(HttpServletRequest request)
	
	{
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//
//
//		BoardVO vo = new BoardVO(); // USERDTO와 동일
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);


		//BoardDAO boardDAO = new BoardDAO();	// 이렇게 처리하면 바로 사용자 입력 값과 vo 객체 그릭 값 설정을 모두 자동으로 처리 
		boardDAO.insertBoard(vo);

			//ModelAndView mav = new ModelAndView();
			//	mav.setViewName("getBoardList.do");
			//return mav;
	return "getBoardList.do";
	}
}
