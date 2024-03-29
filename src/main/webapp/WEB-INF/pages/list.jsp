<%--
  Created by IntelliJ IDEA.
  User: yqx
  Date: 2020/11/20
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户列表页面</title>
</head>
<body>
<table border="1" width="300px">
    <tr>
        <th>编号</th>
        <th>账户名称</th>
        <th>账户余额</th>
    </tr>
    <c:forEach items="${accounts}" var="account" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
