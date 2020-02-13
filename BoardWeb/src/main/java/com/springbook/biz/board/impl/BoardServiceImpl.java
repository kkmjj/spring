package com.springbook.biz.board.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;


@Service("boardService")	// boardService��� ��ü�� ����µ� BoardDAO�� ���Խ��� �����.
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	public void insertBoard(BoardVO vo) 
	{
		boardDAO.insertBoard(vo);
	}

}