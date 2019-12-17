<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户列表</title>
</head>
<style>
    table.dataintable {
        margin-top:15px;
        border-collapse:collapse;
        border:1px solid #aaa;
        width:100%;
    }
    table.dataintable th {
        vertical-align:baseline;
        padding:5px 15px 5px 6px;
        background-color:#3F3F3F;
        border:1px solid #3F3F3F;
        text-align:left;
        color:#fff;
    }
    table.dataintable td {
        vertical-align:text-top;
        padding:6px 15px 6px 6px;
        border:1px solid #aaa;
    }
    table.dataintable tr:nth-child(odd) {
        background-color:#F5F5F5;
    }
    table.dataintable tr:nth-child(even) {
        background-color:#fff;
    }
</style>
<body>
<h3 align="center">用户列表</h3>
<a href='<c:url value="/user/addIndex"/>'>添加</a>

<table class="dataintable">
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>操作</th>
    </tr>

    <c:forEach var="user" items="${list}">
        <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>
                <c:if test="${user.sex=='M'}">男</c:if>
                <c:if test="${user.sex=='W'}">女</c:if>
            </td>
            <td>
                <a href="<c:url value="/user/editIndex?id=${user.id}"/> ">编辑</a>&nbsp;&nbsp;
                <a href="<c:url value="/user/del?id=${user.id}"/> ">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
