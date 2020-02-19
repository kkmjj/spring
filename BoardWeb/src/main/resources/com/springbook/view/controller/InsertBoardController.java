package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class InsertBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
	
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");


		BoardVO vo = new BoardVO(); // USERDTO�� ����
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);


		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);

		return "getBoardList.do";
	}

}
