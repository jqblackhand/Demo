<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更新用户</title>
</head>
<body>
<h3>编辑用户</h3>
<form  action="<c:url value="/user/edit"/> ">
    <input type="hidden" name="id" value="${user.id}">
    用户名：<input type="text" name="username" value="${user.username}"><br>
    密  码：<input type="password" name="password" value="${user.password}"><br>
    性  别：<input type="radio" name="sex" value="M" <c:if test="${user.sex=='M'}">checked </c:if> >男
    <input type="radio" name="sex" value="W" <c:if test="${user.sex=='W'}">checked </c:if> >女 <br>
    <input type="submit" name="subimt" value="提交">
</form>
<br>
<a href="<c:url value="/user/ulist"/>">返回</a>
</body>
</html>
