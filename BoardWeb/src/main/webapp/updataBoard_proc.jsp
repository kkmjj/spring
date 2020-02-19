<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=utf-8" %>

<%
request.setCharacterEncoding("UTF-8");
String title = request.getParameter("title");
String content = request.getParameter("content");
String seq = request.getParameter("seq");


BoardVO vo = new BoardVO(); // USERDTO와 동일
vo.setTitle(title);
vo.setWriter(content);
vo.setSeq(Integer.parseInt(seq));


BoardDAO boardDAO = new BoardDAO();
boardDAO.updateBoard(vo);

response.sendRedirect("getBoardList.jsp");

%>