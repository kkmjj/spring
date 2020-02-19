<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>새등록</title>
</head>
<body>
<center>
<h1>글 등록</h1>

<a href="logout_proc.jsp">log-out</a>
<hr>
<form action="insertBoard.do" method="post">
<table border="1" cellpadding="0" cellspacing="0" >
	<tr>
		<td bgcolor="orange" width="70">제목</td><!-- 내용과 제목은 수정가능하게 구성되있어 name값을 지정  -->
		<td align="left"><input name="title" type="text"/></td>
	</tr>
	<tr>
		<td bgcolor="orange" >작성자</td>
		<td align="left"><input name="writer" type="text"/></td>
	</tr>
	<tr>
		<td bgcolor="orange" >내용</td>			<!-- 내용과 제목은 수정가능하게 구성되있어 name값을 지정  -->
		<td align="left"><textarea  name="content" cols="40" rows="10"></textarea></td>
	</tr>
	
	<tr>
		<td colspan="2" align="center"><input type="submit" value="글 등록" /></td>
		
	</tr>

</table>

</form>
<a href="getBoardList.jsp">뒤로가기</a>



</center>



</body>
</html>