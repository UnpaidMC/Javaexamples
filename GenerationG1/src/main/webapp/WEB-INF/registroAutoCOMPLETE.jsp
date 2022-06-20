<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 16-06-2022
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Felicitaciones</title>
</head>
<body>
<h1>Felicitaciones</h1>
<div>
    <c:forEach var="auto" items = "${ListaAutos}">

        <p>${auto.marca}, ${auto.color}, ${auto.modelo}, ${auto.motor}, ${auto.precioUSD}, ${auto.matricula}</p>
<br>


   </c:forEach>

</div>
</body>
</html>
