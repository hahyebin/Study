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
	   request.setCharacterEncoding("UTF-8");	
		session.setAttribute("id", request.getParameter("id"));
		session.setAttribute("pw", request.getParameter("pw"));
		session.setAttribute("name", request.getParameter("name"));
	
	%>
		<form action="quiz08c_onlyjava.jsp" method="post">
		<h2>이용약관</h2>
		--------------------------------------------------------<br>
		1. 회원 정보는 웹 사이트 운영을 위해서만 사용됩니다.<br>
		2. 원치 않으면 정보 제공을 하지 않을 수 있습니다.<br>
		3. 다만 이 경우 정상적인 웹 사이트 이용이 제한됩니다.<br>
		--------------------------------------------------------<br>
		<input type="radio" name="check" value="agree" id="agree">
		<label for="agree">동의 함&nbsp;&nbsp;&nbsp;</label>
		<input type="radio" name="check" value="disagree" id="disagree">
		<label for="disagree">동의 안 함</label><br>
		<button>회원가입</button>
		</form>
</body>
</html>