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
		location.href = "<%=request.getContextPath()%>/user/add.jsp";
	}
</script>

<style type="text/css">
	body{
		padding: 20px;
	}
</style>

</head>
<body>

欢迎  ${USER.realName } 登录

<a href="<%=request.getContextPath()%>/logout.action">退出</a> <br/>

<font color="red">${msg }</font> <br/>

<form action="<%=request.getContextPath()%>/user.action?act=query&pager.pageNum=1" method="post">

	<table border="1" width="50%"  class="table table-bordered">
		<tr>
			<td>登录名</td>
			<td>
				<input type="text" name="userName" value="${user.userName }"/>
			</td>
			<td>真实姓名</td>
			<td>
				<input type="text" name="realName" value="${user.realName }" />
			</td>
		</tr>
		<tr>
			<td>用户类别</td>
			<td>
				<select name="useType">
					<option value="-1">请选择</option>
					<option value="1" ${user.useType==1 ? "selected='selected'" : "" }>医院管理员</option>
					<option value="2" ${user.useType==2 ? "selected='selected'" : "" }>挂号收费员</option>
					<option value="3" ${user.useType==3 ? "selected='selected'" : "" }>门诊医生</option>
					<option value="4" ${user.useType==4 ? "selected='selected'" : "" }>医技医生</option>
					<option value="5" ${user.useType==5 ? "selected='selected'" : "" }>药房操作员</option>
					<option value="6" ${user.useType==6 ? "selected='selected'" : "" }>财务管理员</option>
				</select>
			</td>
			<td>所在科室</td>
			<td>
				<select name="deptId">
					<option value="-1">请选择</option>
					${deptOptions }
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="submit" value="查询" class="btn btn-info"/>
				<input type="button" value="增加" onclick="toAdd()" class="btn btn-info"/>
			</td>
		</tr>
	</table>
</form>


	<c:if test="${list==null || list.size()==0 }">没有查询结果</c:if>
	
	<c:if test="${list!=null && list.size()>0 }">
		<table border="1" width="80%"  class="table table-striped">
			<tr>
				<th>id</th>
				<th>登录名</th>
				<th>密码</th>
				<th>真实姓名</th>
				<th>用户类别</th>
				<th>医生职称</th>
				<th>所在科室</th>
				<th>挂号级别</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.userName }</td>
					<td>${user.password }</td>
					<td>${user.realName }</td>
					<td>
						${user.useType==1 ? "医院管理员" : "" }
						${user.useType==2 ? "挂号收费员" : "" }
						${user.useType==3 ? "门诊医生" : "" }
						${user.useType==4 ? "医技医生" : "" }
						${user.useType==5 ? "药房操作员" : "" }
						${user.useType==6 ? "财务管理员" : "" }
					</td>
					<td>${user.userConstantItem.constantName }</td>
					<td>${user.userDepartment.deptName }</td>
					<td>${user.userRegistLevel.registName }</td>
					<td>
						<a href="<%=request.getContextPath()%>/user.action?act=toUpdate&id=${user.id}">修改</a>
						<a href="<%=request.getContextPath()%>/user.action?act=delete&id=${user.id}"
							onclick="return confirm('您确认要删除本记录么？')">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
		<!-- 分页相关代码  -->
		共有${pager.rowCounts }条记录&nbsp;&nbsp;第${pager.pageNum }/${pager.pageCounts }页
		&nbsp;&nbsp;&nbsp;&nbsp;
		<!-- 超链接调用js函数 -->
		<a href="javascript: doJump(1)">首页</a>
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
					var url = "<%=request.getContextPath()%>/user.action?act=query&pager.pageNum=" + pageNum;
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