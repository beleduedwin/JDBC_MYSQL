<%--
  Created by IntelliJ IDEA.
  User: lapiscine
  Date: 2019-07-22
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Liste des Jedis</h1>
<ul>
    <c:forEach items="${myJediList}" var="jedi">
        <li>Nom : ${jedi.name}</li>
        <li>Nom de famille : ${jedi.surname}</li>
    </c:forEach>
</ul>
</body>
</html>



