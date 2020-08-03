<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>登录页面</h2>
<font color="red">${msg }</font> <br/>

<form action="<%=request.getContextPath()%>/login.action" method="post">
	<table border="1" width="60%">
		<tr>
			<td>用户名</td>
			<td>
				<input type="text" name="userName" />
			</td>
		</tr>
		<tr>
			<td>密码</td>
			<td>
				<input type="password" name="password" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="登录" />
			</td>
		</tr>
	</table>
</form>

</body>
</html>