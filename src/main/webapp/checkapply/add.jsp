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
	function doKaiLi(){
		document.forms[0].action="<%=request.getContextPath()%>/checkapply.action?act=doKaiLi";
		document.forms[0].submit();
	}
	function doZanCun(){
		document.forms[0].action="<%=request.getContextPath()%>/checkapply.action?act=doZanCun";
		document.forms[0].submit();
	}
	function queryTemplate(){
		document.forms[0].action="<%=request.getContextPath()%>/checkapply.action?act=queryTemplate";
		document.forms[0].submit();
	}
	function addTemplate(){
		document.forms[0].action="<%=request.getContextPath()%>/checkapply.action?act=addTemplate";
		document.forms[0].submit();
	}
</script>

<style type="text/css">
	body{
		padding: 20px;
	}
</style>

</head>
<body>

<a href="<%=request.getContextPath()%>/checkapply/query.jsp">返回查询页面</a>

<br/>
<font color="red">${msg }</font>
<br/>
<form action="<%=request.getContextPath()%>/checkapply.action?act=doZanCun" method="post">
	
	<!-- 隐藏文本框用来保存id的值，当表单提交时，id的值也会提交到后台 -->
	<input type="hidden" name="id" value="${checkApply.id }"/>
	
	<table border="1" width="80%" class="table table-bordered">
		<tr>
			<td>病历ID</td>
			<td>
				<input type="text" name="medicalId" value="${checkApply.medicalId }"/>
			</td>
			<td>挂号ID</td>
			<td>
				<input type="text" name="registId" value="${checkApply.registId }"/>
			</td>
		</tr>
		<tr>
			<td>项目ID</td>
			<td>
				<input type="text" name="itemId" value="${checkApply.itemId }" />
			</td>
			<td>项目名称</td>
			<td>
				<input type="text" name="name" value="${checkApply.name }" />
			</td>
		</tr>
		<tr>
			<td>目的要求</td>
			<td>
				<input type="text" name="objective" value="${checkApply.objective }"/>
			</td>
			<td>检查部位</td>
			<td>
				<input type="text" name="position" value="${checkApply.position }"/>
			</td>
		</tr>
		<tr>
			<td>处置方法</td>
			<td>
				<input type="text" name="treatment" value="${checkApply.treatment }"/>
			</td>
			<td>是否加急</td>
			<td>
				<select name="isUrgent" >
					<option value="-1">请选择</option>
					<option value="0">不加急</option>
					<option value="1">加急</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>数量</td>
			<td>
				<input type="text" name="num" value="${checkApply.num }"/>
			</td>
			<td>开立时间</td>
			<td>
				<input type="date" name="creationTime" value="<fmt:formatDate value="${checkApply.creationTime}" pattern="yyyy-MM-dd"/>"/>
			</td>
		</tr>
		<tr>
			<td>开立医生ID</td>
			<td>
				<input type="text" name="doctorId" value="${checkApply.doctorId }"/>
			</td>
			<td>检察人员ID</td>
			<td>
				<input type="text" name="checkOperId" value="${checkApply.checkOperId }"/>
			</td>
		</tr>
		<tr>
			<td>录入人员ID</td>
			<td>
				<input type="text" name="resultOperId" value="${checkApply.resultOperId }"/>
			</td>
			<td>检查时间</td>
			<td>
				<input type="date" name="checkTime" value="<fmt:formatDate value="${checkApply.checkTime}" pattern="yyyy-MM-dd"/>"/>
			</td>
		</tr>
		<tr>
			<td>检查结果</td>
			<td>
				<input type="text" name="result" value="${checkApply.result }"/>
			</td>
			<td>结果时间</td>
			<td>
				<input type="date" name="resultTime" value="<fmt:formatDate value="${checkApply.resultTime}" pattern="yyyy-MM-dd"/>"/>
			</td>
		</tr>
		<%-- <tr>
			<td>状态</td>
			<td>
				<select name="state" >
					<option value="-1">请选择</option>
					<option value="0" ${checkApply.state==0 ? "selected='selected'" : "" }>已作废</option>
					<option value="1" ${checkApply.state==1 ? "selected='selected'" : "" }>暂存</option>
					<option value="2" ${checkApply.state==2 ? "selected='selected'" : "" }>已开立</option>
					<option value="3" ${checkApply.state==3 ? "selected='selected'" : "" }>已缴费</option>
					<option value="4" ${checkApply.state==4 ? "selected='selected'" : "" }>已登记</option>
					<option value="5" ${checkApply.state==5 ? "selected='selected'" : "" }>执行完</option>
					<option value="6" ${checkApply.state==6 ? "selected='selected'" : "" }>已退费</option>
				</select>
			</td>
			
		</tr> --%>
		<tr>
			<td>记录类型</td>
			<td>
				<select name="recordType" >
					<option value="-1">请选择</option>
					<option value="1" ${checkApply.recordType==1 ? "selected='selected'" : "" }>检查</option>
					<option value="2" ${checkApply.recordType==2 ? "selected='selected'" : "" }>检验</option>
					<option value="3" ${checkApply.recordType==3 ? "selected='selected'" : "" }>处置</option>
				</select>
			</td>
			<td colspan="2" align="right">
				<input type="button" value="存为组套" onclick="queryTemplate()" class="btn btn-info"/>
				<input type="button" value="引用组套" onclick="addTemplate()" class="btn btn-info"/>
				<input type="button" value="暂存" onclick="doZanCun()" class="btn btn-info"/>
				<input type="button" value="开立" onclick="doKaiLi()" class="btn btn-info"/>
			</td>
		</tr>
	</table>
	<br/>
	
	
	
</form>
</body>
<script type="text/javascript">
	
</script>

<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>
</html>