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
    <% request.setCharacterEncoding("utf-8"); %>
    
    ${param.num}의 절대값은 
       <c:if test="${param.num-0 >0 }">${param.num}이다.</c:if>
       <c:if test="${param.num-0 <0 }">${param.num*-1}이다.</c:if>
    
    
    
    
    
</body>
</html>