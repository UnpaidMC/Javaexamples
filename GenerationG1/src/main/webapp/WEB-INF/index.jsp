<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 13-06-2022
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html>
<head>
    <title>Lo que se ve en la pestaña</title>
</head>
<body>
<h1>Hola <c:out value="${nombres}"></c:out> <c:out value="${apellidos}"></c:out></h1>
<p><c:out value="${edad}"></c:out></p>
<br>
<p><c:out value="${usuario.nombre} ${usuario.apellido} ${usuario.edad}"></c:out></p>





</body>
</html>