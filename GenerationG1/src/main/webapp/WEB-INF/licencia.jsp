<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 23-06-2022
  Time: 12:11
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


    <title>Licencias</title>

</head>
<body>
<div>

    <c:if test="${msgError!=null}">
        <C:out> "${msgError}"</C:out>


    </c:if>
    <%--@elvariable id="licencia" type=""--%>
    <form:form action="/licencia/guardar" method ="post" modelAttribute="licencia">
        <form:label  path = "Numero"> Numero</form:label>
        <form:input path="numero" type = "number" />
        <br>
        <form:label  path = "fechaVencimiento"> Fecha Vencimiento</form:label>
        <form:input path="fechaVencimiento" type = "date" min="2018-01-01" max="2030-01-01" class="form-control"/>
        <br> <!--Min y Max da un rango para ingresar fecha, que hace form-control?-->
        <form:label  path = "clase"> Clase</form:label>
        <form:input path="clase" type="text" />
        <br>
        <form:label  path = "estado"> Estado</form:label>
        <form:input path="estado" type = "text" />
        <br>
        <!--USUARIO-->
        <form:select  path = "usuario"> Usuario
        <form:option value="0">Seleccione su usuario</form:option>

        <c:forEach var = "usuario" items = "${listaUsuario}">
           <c:if test="${usuario.licencia.id == null}"><!--Se puede ingresar desde usuario a la informacion de licencia-->
            <form:option value="${usuario.id}">${usuario.nombre} ${usuario.apellido}</form:option>
           </c:if>
        </c:forEach>

        </form:select>
        <br>
        <input type ="submit" class="btn btn-danger" role="button" value="Editar">
    </form:form>




</div>
</body>
</html>