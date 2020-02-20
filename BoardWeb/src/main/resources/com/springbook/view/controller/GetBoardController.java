package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;


//@Controller
public class GetBoardController  {//implements Controller

	//@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo , BoardDAO boardDAO, Model model) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		
		model.addAttribute("board",boardDAO.getBoard(vo));
		return "getBoard.jsp";
		
	}

}
