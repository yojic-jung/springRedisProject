<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
</head>
<body>
	<form method="post" action="./loginprocess">
		이메일
		<br />
		<input name="email" type="text" />
		<br />
		비밀번호
		<br />
		<input name="password" type="password" />
		<br />
		<br />
		<input type="submit" value="로그인" style="background: navy; color: white; padding: 10px; width: 150px;" />
	</form>
</body>
</html>