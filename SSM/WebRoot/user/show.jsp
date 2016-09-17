<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
<table border="1" width="100%">
<tr>
<td>id号</td>
<td>账号</td>
<td>邮箱</td>
<td>删除</td>
<td>修改</td>
</tr>
<c:forEach var="user" items="${usersList }">
<tr>
<td>${user.userid }</td>
<td><a href="users/findById${user.userid }.html">${user.username }</a></td>
<td>${user.email }</td>
<td><a href="users/delete${user.userid }.html">删除</a></td>
<td><a href="users/update${user.userid }.html">修改</a></td>

</tr>
</c:forEach>
</table>
</body>
</html>
