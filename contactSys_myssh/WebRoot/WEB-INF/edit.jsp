<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>添加员工</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    

  </head>
  
  <body>
  	<s:form action="/emp_update.action" method="post" theme="simple">
  	 <table border="1" align="center" cellpadding="5" cellspacing="0">
  	 	<tr>
  	 		<td>员工姓名</td>
  	 		<td align = "center">
  	 			<input type="text" name="name" value="${employee.name }"/>
  	 		</td>
  	 	</tr>
  	 	<tr>
  	 		<td>员工薪水</td>
  	 		<td align = "center">
  	 			<input type="text" name="salary" value="${employee.salary }"/>
  	 		</td>
  	 	</tr>
  	 	<tr>
  	 		<td>选择部门</td>
  	 		<td>
  	 			<!-- 传统的html标签
  	 			<select name="deptId">
  	 				<option value="-1">请选择</option>  
  	 				<option value="1">开发部</option> 循环迭代  s:iterator value="#request.listDept"
  	 			</select>
  	 			 -->
  	 			 <!-- 
  	 			 	Struts下拉列表标签：
  	 			 		name="deptId"  下拉列表标签的名称(服务器根据这个名称获取选择的项的实际的值value值)
  	 			 		headerKey   默认选择项的实际的值
  	 			 		headerValue  默认下拉列表显示的内容
  	 			 		list      下拉列表显示数据的集合
  	 			 		listKey    集合对象的哪个属性作为下拉列表的实例的值，即value值
  	 			 		listValue  集合对象的哪个属性作为下拉列表显示的值
  	 			 		value      默认选择的项的设置 
  	 			  -->
  	 			  <s:select
  	 			  	name="deptId" 
  	 			  	headerKey="-1"
  	 			  	headerValue="请选择"
  	 			  	list="#request.listDept"
  	 			  	listKey="id"
  	 			  	listValue="name"
  	 			  	value="#request.employee.deptId"
  	 			  ></s:select>
  	 		</td>
  	 	</tr>
  	 	<tr>
  	 		<td colspan="2">
  	 			<s:submit value="保存修改"></s:submit>
  	 		</td>
  	 	</tr>
  	 </table>
  	 </s:form>
  </body>
  </body>
</html>
