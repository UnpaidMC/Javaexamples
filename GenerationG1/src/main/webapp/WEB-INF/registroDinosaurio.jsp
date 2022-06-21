<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 13-06-2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>





<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<meta charset="UTF-8">
<head>
    <title>Registro</title>

</head>
<body>
<div>
    <%--@elvariable id="usuario" type=""--%>
    <c:if test="${msgError!=null}">
        <C:out> "${msgError}"</C:out>
    </c:if>
    <%--@elvariable id="dinosaurio" type=""--%>
    <form:form action="/registroDinosaurio/completo" method ="post" modelAttribute="dinosaurio">
        <form:label  path = "nombre"> Nombre:</form:label>
        <form:input path="nombre" />
        <br>
        <form:label  path = "color"> Color:</form:label>
        <form:input path="color" />
        <br>
        <form:label  path = "altura"> Altura:</form:label>
        <form:input path="altura" type = "number" />
        <br>
        <form:label  path = "especie"> Especie:</form:label>
        <form:input path="especie" />
        <br>
        <input type = "submit"  value ="Registrar">


    </form:form>

</div>
</body>
</html>
