package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;


@Controller
public class GetBoardController  {//implements Controller

	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo , BoardDAO boardDAO, ModelAndView mav) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		
		mav.addObject("board",boardDAO.getBoard(vo));
		mav.setViewName("getBoard.jsp");
		return mav;
		
	}

}
