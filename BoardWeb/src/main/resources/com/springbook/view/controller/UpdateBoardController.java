package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;



//@Controller
public class UpdateBoardController {// implements Controller
	

	//@RequestMapping("/updateBoard.do")
	public String UpdateBoard( BoardVO vo,BoardDAO boardDAO) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
	
	
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";


	}

}
