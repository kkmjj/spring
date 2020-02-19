package com.springbook.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController  {//implements Controller

	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo , BoardDAO boardDAO, ModelAndView mav){ // handleRequest(HttpServletRequest request, HttpServletResponse response) 
		//BoardVO vo = new 	BoardVO();
	//	BoardDAO boardDAO = new BoardDAO();

	//	List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
	//	HttpSession session = request.getSession();
	//	session.setAttribute("boardList", boardList);
	//	return "getBoardList";
		
		
	//	ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardDAO.getBoardList(vo));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}

}
