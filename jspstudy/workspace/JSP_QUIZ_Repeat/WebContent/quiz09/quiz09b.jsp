<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:forEach var="singer" items="${paramValues.singers}" varStatus="v"> 
			좋아하는 가수 ${v.count} : ${singer} <br>
		</c:forEach>
</body>
</html>