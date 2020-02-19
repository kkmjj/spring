<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=utf-8" %>

<%
request.setCharacterEncoding("UTF-8");
String title = request.getParameter("title");
String writer = request.getParameter("writer");
String content = request.getParameter("content");


BoardVO vo = new BoardVO(); // USERDTO와 동일
vo.setTitle(title);
vo.setWriter(writer);
vo.setContent(content);


BoardDAO boardDAO = new BoardDAO();
boardDAO.insertBoard(vo);

response.sendRedirect("getBoardList.jsp");

%>