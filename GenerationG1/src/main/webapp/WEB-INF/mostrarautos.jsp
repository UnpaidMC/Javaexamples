<%--
  Created by IntelliJ IDEA.
  User: jetdr
  Date: 16-06-2022
  Time: 12:10
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
        <th scope="col">Marca</th>
        <th scope="col">Modelo</th>
        <th scope="col">Color</th>
        <th scope="col">Motor</th>
        <th scope="col">PrecioUSD</th>
        <th scope="col">Matricula</th>
        <th scope="col">Acciones</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var= "auto" items = "${ListaAutos}">
    <tr>
        <th scope="row">${auto.id}</th>
        <td>${auto.marca}</td>
        <td>${auto.modelo}</td>
        <td>${auto.color}</td>
        <td>${auto.motor}</td>
        <td>${auto.precioUSD}</td>
        <td>${auto.matricula}</td>
        <td><a class="btn btn-warning" href="/registroAuto/editar/${auto.id}" role="button">Editar</a></td>
        <td><a class="btn btn-danger" href="/registroAuto/eliminar/${auto.id}" role="button">Eliminar</a></td>
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