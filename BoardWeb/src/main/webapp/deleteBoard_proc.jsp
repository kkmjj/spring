<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=utf-8" %>

<%

String seq = request.getParameter("seq");




BoardVO vo = new BoardVO(); // USERDTO와 동일

vo.setSeq(Integer.parseInt(seq));


BoardDAO boardDAO = new BoardDAO();
boardDAO.deleteBoard(vo);

response.sendRedirect("getBoardList.jsp");

%>