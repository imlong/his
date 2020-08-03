<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.neuedu.util.Pager" %>
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
		location.href = "<%=request.getContextPath()%>/checkapply/add.jsp";
		${checkApply.state==2 ? "已开立" : "" }
	}
	function doCheck(){
		var flag = true;
		if(${checkApply.state}==2){
			alert("该项目已开立，无法修改");
			flag = false;
		}
		return flag;
	}
</script>

<style type="text/css">
	body{
		padding: 20px;
	}
</style>

</head>
<body>

<h4>请输入条件查询</h4>
<font color="red">${msg }</font> <br/>

<form action="<%=request.getContextPath()%>/checkapply.action?act=query&pager.pageNum=1" method="post">

	<table border="1" width="50%"  class="table table-bordered">
		<tr>
			<td>病历ID</td>
			<td>
				<input type="text" name="medicalId" value="${checkApply.medicalId }"/>
			</td>
			<td>挂号ID</td>
			<td>
				<input type="text" name="registId" value="${checkApply.registId }" />
			</td>
		</tr>
		<tr>
			<td>项目ID</td>
			<td>
				<input type="text" name="itemId" value="${checkApply.itemId }" />
			</td>
			<td>是否加急</td>
			<td>
				<select name="isUrgent">
					<option value="-1">请选择</option>
					<option value="0" ${checkApply.isUrgent==0 ? "selected='selected'" : "" }>不加急</option>
					<option value="1" ${checkApply.isUrgent==1 ? "selected='selected'" : "" }>加急</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="submit" value="查询" class="btn btn-info"/>
				<!-- <input type="button" value="增加" onclick="toAdd()" class="btn btn-info"/> -->
			</td>
		</tr>
	</table>
</form>


	<c:if test="${list==null || list.size()==0 }">没有查询结果</c:if>
	
	<c:if test="${list!=null && list.size()>0 }">
		<table border="1" width="80%"  class="table table-striped">
			<tr>
				<th>id</th>
				<th>病历ID</th>
				<th>挂号ID</th>
				<th>项目ID</th>
				<th>项目名称</th>
				<th>目的要求</th>
				<th>检查部位</th>
				<th>处置方法</th>
				<th>是否加急</th>
				<th>数量</th>
				<th>开立时间</th>
				<th>开立医生</th>
				<th>检查人员</th>
				<th>录入人员</th>
				<th>检查时间</th>
				<th>检查结果</th>
				<th>结果时间</th>
				<th>状态</th>
				<th>记录类型</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="checkApply">
				<tr>
					<td>${checkApply.id }</td>
					<td>${checkApply.medicalId }</td>
					<td>${checkApply.registId }</td>
					<td>${checkApply.itemId }</td>
					<td>${checkApply.name }</td>
					<td>${checkApply.objective }</td>
					<td>${checkApply.position }</td>
					<td>${checkApply.treatment }</td>
					<td>
						${checkApply.isUrgent==0 ? "不加急" : "" }
						${checkApply.isUrgent==1 ? "加急" : "" }
					</td>
					<td>${checkApply.num }</td>
					<td><fmt:formatDate value="${checkApply.creationTime }" pattern="yyyy-MM-dd"/></td>
					<td>${checkApply.applyUser1.realName }</td>
					<td>${checkApply.applyUser2.realName }</td>
					<td>${checkApply.applyUser3.realName }</td>
					<td><fmt:formatDate value="${checkApply.checkTime }" pattern="yyyy-MM-dd"/></td>
					<td>${checkApply.result }</td>
					<td><fmt:formatDate value="${checkApply.resultTime }" pattern="yyyy-MM-dd"/></td>
					<td id="state">
						${checkApply.state==0 ? "已作废" : "" }
						${checkApply.state==1 ? "暂存" : "" }
						${checkApply.state==2 ? "已开立" : "" }
						${checkApply.state==3 ? "已交费" : "" }
						${checkApply.state==4 ? "已登记" : "" }
						${checkApply.state==5 ? "执行完" : "" }
						${checkApply.state==6 ? "已退费" : "" }
					</td>
					<td>
						${checkApply.recordType==1 ? "检查" : "" }
						${checkApply.recordType==2 ? "检验" : "" }
						${checkApply.recordType==3 ? "处置" : "" }
					</td>
					<td>
						<a href="<%=request.getContextPath()%>/checkapply.action?act=toAdd&id=${checkApply.id}">新增</a>
						<a href="<%=request.getContextPath()%>/checkapply.action?act=toUpdate&id=${checkApply.id}"
							onclick="return doCheck()">修改</a>
						<a href="<%=request.getContextPath()%>/checkapply.action?act=delete&id=${checkApply.id}"
							onclick="return confirm('您确认要删除本记录么？')">删除</a>
						<a href="<%=request.getContextPath()%>/checkapply.action?act=zuoFei&id=${checkApply.id}">作废</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
		<!-- 分页相关代码  -->
		共有${pager.rowCounts }条记录&nbsp;&nbsp;第${pager.pageNum }/${pager.pageCounts }页
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="javascript: doJump(1)">首页</a><!-- 超链接调用js函数 -->
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="javascript: doJump(${pager.pageNum - 1 })">上一页</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="javascript: doJump(${pager.pageNum + 1 })">下一页</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="javascript: doJump(${pager.pageCounts })">尾页</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		
		跳转到第
		<select onchange="doJump(this.value)">
			<%
				Pager p = (Pager)request.getAttribute("pager");
				if(p!=null){
					int pageNum = p.getPageNum();
					int pageCounts = p.getPageCounts();
					for(int i=1; i<=pageCounts; i++){
						//下面的代码为了拼接得到：<option value='1' selected='selected'>1</option>
						out.print("<option value='");
						out.print(i);
						out.print("' ");
						if(i==pageNum){
							out.print("selected='selected'");
						}
						out.print(">");
						out.print(i);
						out.print("</option>");
					}
				}
			%>
		</select>页
		<!-- 页面跳转方法实现 -->
		<script type="text/javascript">
			function doJump(pageNum){
					var action = document.forms[0].action;//第一个form表单的action
					var url = "<%=request.getContextPath()%>/checkapply.action?act=query&pager.pageNum="+pageNum;
					document.forms[0].action = url;
					document.forms[0].submit();//手动提交
					document.forms[0].action = action;//恢复原有的action值
					
				}
		</script>
	</c:if>
</body>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>

</html>