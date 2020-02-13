package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.com.JDBCUtil;

@Repository("boardDAO") // component와 똑같은 느낌 : boardDAO 라는 이름의 객체를 생성하겠다 .
public class BoardDAO { 

	private Connection conn =null;
	private PreparedStatement stmt =null;
	private ResultSet rs =null;
	
	
	//sql 명령어 만들어 놓기 
	private final String sql="insert into board(seq,title,writer,content) values("
			+ "(select nvl(max(seq),0)+1 from board),?,?,?)";
	
	
	//
	public void insertBoard(BoardVO vo)
	{
		System.out.println("jdbc로 insert 하기");
		
		try {
			conn = JDBCUtil.getConnection();
			System.out.println("연결 성공 ");
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,vo.getTitle());
			stmt.setString(2,vo.getWriter());
			stmt.setString(3,vo.getContent());

			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally
		{
			JDBCUtil.close(stmt, conn);
		}
	}
	
	
}
