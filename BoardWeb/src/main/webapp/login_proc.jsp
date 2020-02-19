<%@page import="com.springbook.biz.user.UserVO"%>
<%@page import="com.springbook.biz.user.impl.UserDAO"%>
<%@page contentType="text/html; charset=utf-8" %>

<%

String id = request.getParameter("id");
String password = request.getParameter("password");


UserVO vo = new UserVO(); // USERDTO와 동일
vo.setId(id);
vo.setPassword(password);


UserDAO userDAO = new UserDAO();
UserVO user = userDAO.getUser(vo);

if(user!=null)
{
	response.sendRedirect("getBoardList.jsp"); // 값이 있으면 redirect 방식으로 값을 넣어서 getBoardList.jsp로 페이지 이동 
	
}else
{
	response.sendRedirect("login.jsp"); // 값이 없으면 redirect 방식으로 login.jsp로 이동 
}


%>