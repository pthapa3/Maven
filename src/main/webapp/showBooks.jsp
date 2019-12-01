<%@page import="com.servletmavenweb.BookModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//BookModel book = (BookModel)request.getAttribute("book");
		
	BookModel book = (BookModel)session.getAttribute("book");
		out.println(book);
	
	
	%>


</body>
</html>