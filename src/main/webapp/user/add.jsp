<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		padding: 20px;
	}
</style>

</head>
<body>

<a href="<%=request.getContextPath()%>/user/query.jsp">返回查询页面</a>
<br/>
<font color="red">${msg }</font>
<br/>
<form action="<%=request.getContextPath()%>/user.action?act=add" method="post">
	
	<!-- 隐藏文本框用来保存id的值，当表单提交时，id的值也会提交到后台 -->
	<input type="hidden" name="id" value="${user.id }"/>
	
	<table border="1" width=60% class="table table-striped">
		<tr>
			<td>登录名</td>
			<td>
				<input type="text" name="userName" />
			</td>
			<td>密码</td>
			<td>
				<input type="password" name="password" />
			</td>
		</tr>
		<tr>
			<td>真实姓名</td>
			<td>
				<input type="text" name="realName" />
			</td>
			<td>用户类别</td>
			<td>
				<select name="useType" >
					<option value="-1">请选择</option>
					<option value="1">医院管理员</option>
					<option value="2">挂号收费员</option>
					<option value="3">门诊医生</option>
					<option value="4">医技医生</option>
					<option value="5">药房操作员</option>
					<option value="6">财务管理员</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>所在科室</td>
			<td>
				<select name="deptId" >
					<option value="-1">请选择</option>
					<option value="1">心血管内科</option>
					<option value="2">神经内科</option>
					<option value="9">感染内科</option>
				</select>
			</td>
			<td>医生职称</td>
			<td>
				<select name="docTitleId" >
					<option value="-1">请选择</option>
					<option value="81">主任医师</option>
					<option value="82">副主任医师</option>
					<option value="83">主治医师</option>
					<option value="84">住院医师</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>参与排班</td>
			<td>
				<select name="isScheduling" >
					<option value="-1">请选择</option>
					<option value="否">否</option>
					<option value="是">是</option>
				</select>
			</td>
			<td>挂号级别</td>
			<td>
				<select name="registLeId" >
					<option value="-1">请选择</option>
					<option value="1">专家号</option>
					<option value="2">普通号</option>
				</select>
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