<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">

<style type="text/css">
	body{
		padding: 20px;
	}
</style>

<script>
	function toAdd(){
		location.href = "<%=request.getContextPath()%>/registlevel/add.jsp";
	}
</script>

</head>
<body>

<h4>请输入条件查询</h4>

<font color="red">${msg }</font> <br/>

<form action="<%=request.getContextPath()%>/registlevel.action?act=query" method="post">
	<table border="1" width="80%" class="table table-bordered">
		<tr>
			<td>号别编码</td>
			<td>
				<input type="text" name="registCode" value="${registLevel.registCode }"/>
			</td>
			<td>号别名称</td>
			<td>
				<input type="text" name="registName" value="${registLevel.registName }" />
			</td>
			<td align="right">
				<input type="submit" value="查询" class="btn btn-info"/>
				<input type="button" value="增加" onclick="toAdd()" class="btn btn-info"/>
			</td>
		</tr>
	</table>
</form>

<br/>

	<c:if test="${list==null || list.size()==0 }">没有查询结果</c:if>
	
	<c:if test="${list!=null && list.size()>0 }">
		<table border="1" width="80%" class="table table-striped">
			<tr>
				<th>id</th>
				<th>号别编码</th>
				<th>号别名称</th>
				<th>显示顺序号</th>
				<th>挂号费</th>
				<th>挂号限额</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="registLevel">
				<tr>
					<td>${registLevel.id }</td>
					<td>${registLevel.registCode }</td>
					<td>${registLevel.registName }</td>
					<td>${registLevel.sequenceNo }</td>
					<td>${registLevel.registFee }</td>
					<td>${registLevel.registQuota }</td>
					<td>
						<a href="<%=request.getContextPath()%>/registlevel.action?act=toUpdate&id=${registLevel.id}">修改</a>
						<a href="<%=request.getContextPath()%>/registlevel.action?act=delete&id=${registLevel.id}"
							onclick="return confirm('您确认要删除本记录么？')">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
		<!-- 分页 -->
		
	</c:if>

</body>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>
</html>