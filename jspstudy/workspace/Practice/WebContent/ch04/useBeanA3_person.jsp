<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="ch4.com.dao.Person" scope="request" />
	<p>아이디 : <%= bean.getId() %> </p>
	<p>이름 : <%= bean.getName() %>  </p>
	
</body>
</html>