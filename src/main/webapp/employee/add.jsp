<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
<style type="text/css">
	body{
		padding: 20px;
	}
</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="<%=request.getContextPath()%>/registlevel/query.jsp">返回查询页面</a>
<br/>
<font color="red">${msg }</font>
<br/>
<form action="<%=request.getContextPath()%>/employee.action?act=add" method="post">
	
	<input type="hidden" name="id" value="${emp.id }"/>
	
	<table border="1" width="80%" class="table table-bordered">
		<tr>
			<td>员工编码</td>
			<td>
				<input type="text" name="id" />
			</td>
			<td>姓名</td>
			<td>
				<input type="text" name="name" />
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
				<input type="text" name="sex" />
			</td>
			<td>学历/学位</td>
			<td>
				<input type="text" name="edu" />
			</td>
		</tr>
		<tr>
			<td>岗位名称</td>
			<td>
				<input type="text" name="post" />
			</td>
			<td>部门名称</td>
			<td>
				<input type="text" name="dept" />
			</td>
		</tr>
		<tr>
			<td>员工类型</td>
			<td>
				<input type="text" name="type" />
			</td>
			<td>职员状态</td>
			<td>
				<input type="text" name="station" />
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="submit" value="保存" class="btn btn-info"/>
			</td>
		</tr>
	</table>
</form>

</body>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>
</html>