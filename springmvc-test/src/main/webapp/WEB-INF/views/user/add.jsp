<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<h3>新增用户</h3>
<form  action="<c:url value="/user/add"/> ">
    用户名：<input type="text" name="username"><br>
    密  码：<input type="password" name="password"><br>
    性  别：<input type="radio" name="sex" value="M">男
    <input type="radio" name="sex" value="W">女 <br>
    <input type="submit" name="subimt" value="提交">
</form>
<br>
<a href="<c:url value="/user/ulist"/>">返回</a>
</body>
</html>
