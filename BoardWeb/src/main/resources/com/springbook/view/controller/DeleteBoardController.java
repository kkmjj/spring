package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String seq = request.getParameter("seq");




		BoardVO vo = new BoardVO(); // USERDTO¿Í µ¿ÀÏ

		vo.setSeq(Integer.parseInt(seq));


		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);

		return "getBoardList.do";
	
	}

}
