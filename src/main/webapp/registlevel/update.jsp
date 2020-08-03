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

<h4>修改后记得保存</h4>
<a href="<%=request.getContextPath()%>/registlevel/query.jsp">返回查询页面</a>
<br/>
<font color="red">${msg }</font>
<br/>
<form action="<%=request.getContextPath()%>/registlevel.action?act=update" method="post">
	
	<!-- 隐藏文本框用来保存id的值，当表单提交时，id的值也会提交到后台 -->
	<input type="hidden" name="id" value="${registLevel.id }"/>
	
	<table border="1" width="80%" class="table table-bordered">
		<tr>
			<td>号别编码</td>
			<td>
				<input type="text" name="registCode" value="${registLevel.registCode }" />
			</td>
			<td>号别名称</td>
			<td>
				<input type="text" name="registName" value="${registLevel.registName }" />
			</td>
		</tr>
		<tr>
			<td>显示顺序号</td>
			<td>
				<input type="text" name="sequenceNo" value="${registLevel.sequenceNo }" />
			</td>
			<td>挂号费</td>
			<td>
				<input type="text" name="registFee" value="${registLevel.registFee }"/>
			</td>
		</tr>
		<tr>
			<td>挂号限额</td>
			<td>
				<input type="text" name="registQuota" value="${registLevel.registQuota }"/>
			</td>
			<td colspan="2" align="right">
				<input type="submit" value="保存" class="btn btn-info"/>
			</td>
		</tr>
	</table>
</form>
</body>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>
</html>