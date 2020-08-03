<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="assets/css/layui.css">
    <link rel="stylesheet" href="assets/css/login.css">
    <link rel="icon" href="/favicon.ico">
    <title>HIS</title>
</head>

<body class="login-wrap">
<!-- 获取cookie信息 -->
<%
	//定义变量
	String userName = "";
	String password = "";
	String check = "";
	//获取cookie数组
	Cookie cookies[] = request.getCookies();
	if(cookies != null){
		for(int i = 0;i < cookies.length;i++){
			String cname = cookies[i].getName();//获取键值
			if("userName".equals(cname)){
				userName = cookies[i].getValue();//获取value值
				check = "checked";//记住【记住密码】的状态
			}
			//判断cookie是密码
			if("password".equals(cname)){
				password = cookies[i].getValue();
				check = "checked";
			}
		}
	}
%>

    <div class="login-container">
    
        <form action="<%=request.getContextPath()%>/login.action" method="post" class="login-form">
            <div class="input-group">
	            <font color="red">${msg }</font><br/><br/>
	               	 用户名：<input type="text" name="userName" value="<%=userName %>" class="input-field" />
	                <label for="userName" class="input-label" ></label>
            		密码：<input type="password" name="password" value="<%=password %>" class="input-field" />
                	<label for="password" class="input-label"></label>
                	<input type="checkbox" name="rembMe" <%=check %>/>记住密码
            </div>
            <input type="submit" class="login-button" value="登录" />
        </form>
    </div>
</body>

<script src="assets/layui.js"></script>
<script src="index.js" data-main="login"></script>

</html>