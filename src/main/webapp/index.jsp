<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="assets/css/layui.css">
    <link rel="stylesheet" href="assets/css/admin.css">
    <link rel="icon" href="/favicon.ico">
    <title>HIS</title>
</head>

<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header custom-header">
            
            <ul class="layui-nav layui-layout-left">
                <li class="layui-nav-item slide-sidebar" lay-unselect>
                    <a href="javascript:;" class="icon-font"><i class="ai ai-menufold"></i></a>
                </li>
            </ul>

            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item">
                    <a href="javascript:;">${USER.realName}</a>
                    <dl class="layui-nav-child">
                        <dd><a href="login.jsp">注销</a></dd>
                    </dl>
                </li>
            </ul>
        </div>

        <div class="layui-side custom-admin">
            <div class="layui-side-scroll">

                <div class="custom-logo">
                    <img src="assets/images/hos.jpg" alt=""/>
                    <h1>医院管理系统</h1>
                </div>
                <ul id="Nav" class="layui-nav layui-nav-tree">
                
                	 <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe617;</i>
                            <em>基础信息维护</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="<%=request.getContextPath()%>/user.action?act=toQuery">用户管理</a></dd>
                            <dd><a href="views/xxx.jsp">科室管理</a></dd>
                            <dd><a href="registlevel/query.jsp">挂号级别管理</a></dd>
                            <dd><a href="views/xxx.jsp">结算类别管理</a></dd>
                            <dd><a href="views/xxx.jsp">诊断目录管理</a></dd>
                            <dd><a href="views/xxx.jsp">非药品收费项目管理</a></dd>
                            <dd><a href="views/xxx.jsp">医生排班管理</a></dd>
                           <%--  <a href="<%=request.getContextPath()%>/user.action?act=toUpdate&id=${user.id}">修改</a> --%>
                        </dl>
                    </li>
                	
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe609;</i>
                            <em>门诊挂号收费</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="views/xxx.jsp">现场挂号</a></dd>
                            <dd><a href="views/xxx.jsp">收费</a></dd>
                            <dd><a href="views/xxx.jsp">退号</a></dd>
                            <dd><a href="views/xxx.jsp">退费</a></dd>
                            <dd><a href="views/xxx.jsp">患者费用查询</a></dd>
                            <dd><a href="views/xxx.jsp">收费员日结</a></dd>
                        </dl>
                    </li>
                    
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe857;</i>
                            <em>门诊医生工作站</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="views/xxx.jsp">门诊病历首页</a></dd>
                            <dd><a href="views/xxx.jsp">检查申请</a></dd>
                            <dd><a href="views/xxx.jsp">检验申请</a></dd>
                            <dd><a href="views/xxx.jsp">门诊确诊</a></dd>
                            <dd><a href="checkapply/query.jsp">处置申请</a></dd>
                            <dd><a href="views/xxx.jsp">成药处方</a></dd>
                            <dd><a href="views/xxx.jsp">草药处方</a></dd>
                            <dd><a href="views/xxx.jsp">诊毕</a></dd>
                            <dd><a href="views/xxx.jsp">患者费用明细查询</a></dd>
                            <dd><a href="views/xxx.jsp">病历模板管理</a></dd>
                            <dd><a href="views/xxx.jsp">检查组套管理</a></dd>
                            <dd><a href="views/xxx.jsp">检验组套管理</a></dd>
                            <dd><a href="views/xxx.jsp">处置组套管理</a></dd>
                            <dd><a href="views/xxx.jsp">处方组套管理</a></dd>
                            <dd><a href="views/xxx.jsp">个人工作量统计</a></dd>
                        </dl>
                    </li>
                    
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe612;</i>
                            <em>门诊医技工作站</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="tech/apply.jsp">检查\检验登记</a></dd>
                            <dd><a href="views/xxx.jsp">检查\检验结果录入</a></dd>
                            <dd><a href="views/xxx.jsp">个人工作量统计</a></dd>
                        </dl>
                    </li>
                    
                     <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe600;</i>
                            <em>门诊药房工作站</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="views/xxx.jsp">门诊发药</a></dd>
                            <dd><a href="views/xxx.jsp">门诊退药</a></dd>
                            <dd><a href="views/xxx.jsp">药品目录管理</a></dd>
                        </dl>
                    </li>
                    
                     <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe615;</i>
                            <em>门诊财务管理</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="views/xxx.jsp">费用科目管理</a></dd>
                            <dd><a href="views/xxx.jsp">门诊日结核对</a></dd>
                            <dd><a href="views/xxx.jsp">门诊科室工作量统计</a></dd>
                            <dd><a href="views/xxx.jsp">门诊医生工作量统计</a></dd>
                        </dl>
                    </li>
                    
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                            <i class="layui-icon">&#xe617;</i>
                            <em>基础信息维护</em>
                        </a>
                        <dl class="layui-nav-child">
                            <dd><a href="user/query.jsp">用户管理</a></dd>
                            <dd><a href="views/xxx.jsp">科室管理</a></dd>
                            <dd><a href="registlevel/query.jsp">挂号级别管理</a></dd>
                            <dd><a href="views/xxx.jsp">结算类别管理</a></dd>
                            <dd><a href="views/xxx.jsp">诊断目录管理</a></dd>
                            <dd><a href="views/xxx.jsp">非药品收费项目管理</a></dd>
                            <dd><a href="views/xxx.jsp">医生排班管理</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>

        <div class="layui-body">
             <div class="layui-tab app-container" lay-allowClose="true" lay-filter="tabs">
                <ul id="appTabs" class="layui-tab-title custom-tab"></ul>
                <div id="appTabPage" class="layui-tab-content"></div>
            </div>
        </div>


        <div class="mobile-mask"></div>
    </div>
    
    
    <script src="assets/layui.js"></script>
    <script src="index.js" data-main="home"></script>
</body>
</html>