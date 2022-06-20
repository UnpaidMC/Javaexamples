<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 16-06-2022
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<meta charset="UTF-8">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">


    <title>Editar</title>

</head>
<body>
<div>

    <c:if test="${msgError!=null}">
        <C:out> "${msgError}"</C:out>


    </c:if>
    <%--@elvariable id="auto" type=""--%>
    <form:form action="/registroAuto/actualizar/${auto.id}" method ="post" modelAttribute="auto">
        <form:label  path = "marca"> Marca</form:label>
        <form:input path="marca" />
        <br>
        <form:label  path = "modelo"> Modelo</form:label>
        <form:input path="modelo" />
        <br>
        <form:label  path = "color"> Color</form:label>
        <form:input path="color" />
        <br>
        <form:label  path = "motor"> Motor</form:label>
        <form:input path="motor" />
        <br>
        <form:label  path = "precioUSD" type = "number"> PrecioUSD</form:label>
        <form:input path="precioUSD" />
        <br>
        <form:label  path = "matricula"> Matricula</form:label>
        <form:input path="matricula" />
        <br>
        <button type ="submit" class="btn btn-warning">Editar</button>


    </form:form>

</div>
</body>
</html>