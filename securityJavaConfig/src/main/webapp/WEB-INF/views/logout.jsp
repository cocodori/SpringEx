<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<h1>로그아웃</h1>
	<form action="/logout" method="post">
		<input type='hidden' name='${_csrf.parameterName }' value="${_csrf.token }">
		<button>로그아웃</button>	
	</form>
</body>
</html>