<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Esto es un login</h1>

<div class="container">
    <c:if test="${msgError!= null}">
    <div class="text-danger"><c:out value="${msgError}"></c:out></div>
    </c:if>

    <form action="/registro/usuario/ingreso" method="post">

        <%--@declare id="password"--%>
        <%--@declare id="email"--%>

            <label>
                Email:
                <input type="email" class="form-control" name="email"/>
            </label>
            <br>

            <label>
                Contraseña:
                <input type="password" class="form-control" name="password"/>
            </label>
            <br>
        <input type="submit"  value="Ingresar">
</body>
</html>
