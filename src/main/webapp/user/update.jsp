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
<form action="<%=request.getContextPath()%>/user.action?act=update" method="post">
	
	<!-- 隐藏文本框用来保存id的值，当表单提交时，id的值也会提交到后台 -->
	<input type="hidden" name="id" value="${user.id }"/>
	
	<table border="1" width="80%" class="table table-striped">
		<tr>
			<td>登录名</td>
			<td>
				<input type="text" name="userName" value="${user.userName }" class="input-field"/>
			</td>
			<td>密码</td>
			<td>
				<input type="password" name="password" value="${user.password }" class="input-field"/>
			</td>
		</tr>
		<tr>
			<td>真实姓名</td>
			<td>
				<input type="text" name="realName" value="${user.realName }" class="input-field"/>
			</td>
			<td>用户类别</td>
			<td>
				<select name="useType">
					<option value="1" ${user.useType==1 ? "selected='selected'" : "" }>医院管理员</option>
					<option value="2" ${user.useType==2 ? "selected='selected'" : "" }>挂号收费员</option>
					<option value="3" ${user.useType==3 ? "selected='selected'" : "" }>门诊医生</option>
					<option value="4" ${user.useType==4 ? "selected='selected'" : "" }>医技医生</option>
					<option value="5" ${user.useType==5 ? "selected='selected'" : "" }>药房操作员</option>
					<option value="6" ${user.useType==6 ? "selected='selected'" : "" }>财务管理员</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>所在科室</td>
			<td>
				<select name="deptId">
					<option value="1" ${user.deptId==1 ? "selected='selected'" : "" }>心血管内科</option>
					<option value="2" ${user.deptId==2 ? "selected='selected'" : "" }>神经内科</option>
					<option value="9" ${user.deptId==9 ? "selected='selected'" : "" }>感染内科</option>
				</select>
			</td>
			<td>医生职称</td>
			<td>
				<select name="docTitleId" >
					<option value="81" ${u2.docTitleId==81 ? "selected='selected'" : "" }>主任医师</option>
					<option value="82" ${u2.docTitleId==82 ? "selected='selected'" : "" }>副主任医师</option>
					<option value="83" ${u2.docTitleId==83 ? "selected='selected'" : "" }>主治医师</option>
					<option value="84" ${u2.docTitleId==84 ? "selected='selected'" : "" }>住院医师</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>参与排班</td>
			<td>
				<select name="isScheduling">
					<option value="是" ${user.isScheduling=="是" ? "selected='selected'" : "" }>是</option>
					<option value="否" ${user.isScheduling=="否" ? "selected='selected'" : "" }>否</option>
				</select>
			</td>
			<td>挂号级别</td>
			<td>
				<select name="registLeId">
					<option value="1" ${u2.registLeId==1? "selected='selected'" : "" }>专家号</option>
					<option value="2" ${u2.registLeId==2? "selected='selected'" : "" }>普通号</option>
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