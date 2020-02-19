package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String seq = request.getParameter("seq");
		
		BoardVO vo = new 	BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);
		
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		return "getBoard";
		
	}

}
