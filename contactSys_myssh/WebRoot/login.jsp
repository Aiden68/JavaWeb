<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>管理员登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    

  </head>
  
  <body>
  	<s:form action="admin_login.action" method="post" theme="simple">
  	 <table border="1" align="center" cellpadding="5" cellspacing="0">
  	 	<tr>
  	 		<td>用户名</td>
  	 		<td>
  	 			<s:textfield name="adminName" id="adminName" value=""></s:textfield>
  	 		</td>
  	 	</tr>
  	 	<tr>
  	 		<td>密码</td>
  	 		<td>
  	 			<s:textfield name="pwd" id="pwd" value=""></s:textfield>
  	 		</td>
  	 	</tr>
  	 	<tr>
  	 		<td colspan="2">
  	 			<s:submit value="登陆"></s:submit>
  	 		</td>
  	 	</tr>
  	 </table>
  	 </s:form>
  </body>
  </body>
</html>
