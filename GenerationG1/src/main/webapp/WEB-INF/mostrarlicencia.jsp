<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 23-06-2022
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">

    <title>ListadoAutos</title>
</head>
<body>
<div class = "container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Numero</th>
            <th scope="col">Fecha de Vencimiento</th>
            <th scope="col">Clase</th>
            <th scope="col">Estado</th>
            <th scope="col">Usuario</th>
            <th scope="col">Acciones</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var= "licencia" items = "${listaLicencia}">
            <tr>
                <th scope="row">${licencia.id}</th>
                <td>${licencia.numero}</td>
                <td>${licencia.fechaVencimiento}</td>
                <td>${licencia.clase}</td>
                <td>${licencia.estado}</td>
                <td>${licencia.usuario.nombre} ${licencia.usuario.apellido}</td>
                <td><a class="btn btn-warning" href="/licencia/editar/${licencia.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/licencia/eliminar/${licencia.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
</body>
</html>