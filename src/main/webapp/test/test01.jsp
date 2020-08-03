<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function doCheck(){
		var hobbys = document.getElementsByName("hobby");
		var flag = false;
		for(var i=0; i<hobbys.length; i++){
			//console.log("--" + hobbys[i].checked);
			if(hobbys[i].checked){
				flag = true;
				break;
			}
		}
		//console.log("--flag=" + flag);
		if(!flag){
			alert("至少选中一个复选框，才允许提交");
		}
		return flag;
	}
</script>
</head>
<body>
<h1>复选框选中检查</h1>
<h6>要实现：下面复选框至少选中一个，才允许提交</h6>
<!-- 下面form的action就是为了显示是否有跳转功能 -->
<form action="<%=request.getContextPath()%>/login.jsp" method="post"
		onsubmit="return doCheck()">
	爱好：<input type="checkbox" name="hobby" value="eat"/>吃
		<input type="checkbox" name="hobby" value="drink"/>喝
		<input type="checkbox" name="hobby" value="play"/>玩
		<input type="checkbox" name="hobby" value="study"/>学习
	<br/>
	<input type="submit" value="提交"/>
</form>

</body>
</html>