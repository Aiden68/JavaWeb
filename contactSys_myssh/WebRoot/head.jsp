<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

 <div align="center" style="width:80% ">
	<s:if test="#session.adminInfo != null">
	欢迎你：<s:property value="#session.adminInfo.adminName"/><br>
			<s:a href="emp_viewAddEmp">添加员工</s:a>
			<s:a href="#">退出</s:a>
	</s:if>
	<s:else>
		<s:a href="login.jsp">登陆</s:a>
	</s:else>
</div> 
  