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

<script>
	function toAdd(){
		location.href = "<%=request.getContextPath()%>/employee/add.jsp";
	}
</script>

<style type="text/css">
	body{
		padding: 20px;
	}
</style>

</head>
<body>

<font color="red">${msg }</font> <br/>

<form action="<%=request.getContextPath()%>/employee.action?act=query" method="post">

	<table border="0" width="50%"  class="table table-bordered">
		<tr>
			<td>
				<input type="text" name="id" value="${emp.id }"> 
			</td>
			<td>
				<input type="submit" value="查询" class="btn btn-info"/>
				<input type="button" value="新增" onclick="toAdd()" class="btn btn-info"/>
			</td>
		</tr>
	</table>
</form>

<br/>

	<c:if test="${list==null || list.size()==0 }">没有查询结果</c:if>
	
	<c:if test="${list!=null && list.size()>0 }">
		<table border="1" width="80%"  class="table table-striped">
			<tr>
				<th>员工编码</th>
				<th>姓名</th>
				<th>性别</th>
				<th>学历/学位</th>
				<th>岗位名称</th>
				<th>部门名称</th>
				<th>员工类型</th>
				<th>职员状态</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="employee">
				<tr>
					<td>${employee.id }</td>
					<td>${employee.name }</td>
					<td>${employee.sex }</td>
					<td>${employee.edu }</td>
					<td>${employee.post }</td>
					<td>${employee.dept }</td>
					<td>${employee.type }</td>
					<td>${employee.station }</td>
					<td>
						<a href="<%=request.getContextPath()%>/employee.action?act=toUpdate&id=${employee.id}">修改</a>
						<a href="<%=request.getContextPath()%>/employee.action?act=delete&id=${employee.id}"
							onclick="return confirm('您确认要删除本记录么？')">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>

</html>