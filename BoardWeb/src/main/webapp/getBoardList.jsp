<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>

<%@page contentType="text/html; charset=utf-8" %>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>글 목록 </title>
</head>
<body>
<center>
<h1>글 목록 </h1>
<h3>${userName}환영합니다  <a href="logout.do">로그아웃</a></h3>



<!-- 검색기능 -->
<form action="getBoardList.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<td align="right">
			<select name="searchCondition">
				<option value="TITLE">제목</option>
				<option value="CONTENT">내용 </option>
			</select>
			<input name="searchKeyword" type="text"/>
			<input type="submit" value="검색"/>
		</td>
	
	</tr>

</table>

</form>
<!-- - -->

<table  border="1" cellpadding="0" cellspacing="0" width="700">

<tr>
	<th bgcolor="orange" with="100">번호</th>
	<th bgcolor="orange" with="100">제목</th>
	<th bgcolor="orange" with="100">작성자</th>
	<th bgcolor="orange" with="100">등록일</th>
	<th bgcolor="orange" with="100">조회수</th>
</tr>

<c:forEach items="${boardList}" var="board">
<tr>

	<td>${ board.seq}</td>
	<td align="left"><a href="getBoard.do?seq=${board.seq}">${ board.title}</a></td>
	<td>${ board.writer}</td>
	<td>${ board.regDate}</td>
	<td>${ board.cnt}</td>

</tr>



</c:forEach>

</table>


<br>
<a href="insertBoard.jsp">새글 등록</a>

</center>

</body>
</html>