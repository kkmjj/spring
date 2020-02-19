package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class UpdateBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String seq = request.getParameter("seq");


		BoardVO vo = new BoardVO(); // USERDTO¿Í µ¿ÀÏ
		vo.setTitle(title);
		vo.setWriter(content);
		vo.setSeq(Integer.parseInt(seq));


		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);

		return "getBoardList.do";

	}

}
