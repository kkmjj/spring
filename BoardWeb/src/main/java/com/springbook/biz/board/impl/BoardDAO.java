package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.com.JDBCUtil;

@Repository("boardDAO") // component�� �Ȱ��� ���� : boardDAO ��� �̸��� ��ü�� �����ϰڴ� .
public class BoardDAO { 

	private Connection conn =null;
	private PreparedStatement stmt =null;
	private ResultSet rs =null;
	
	
	//sql ��ɾ� ����� ���� 
	private final String sql="insert into board(seq,title,writer,content) values("
			+ "(select nvl(max(seq),0)+1 from board),?,?,?)";
	
	
	//
	public void insertBoard(BoardVO vo)
	{
		System.out.println("jdbc�� insert �ϱ�");
		
		try {
			conn = JDBCUtil.getConnection();
			System.out.println("���� ���� ");
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
