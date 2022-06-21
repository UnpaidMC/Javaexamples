<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">

    <title>ListadoDinos</title>
</head>
<body>
<div class = "container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Indice</th>
            <th scope="col">Nombre</th>
            <th scope="col">Altura</th>
            <th scope="col">Color</th>
            <th scope="col">Especie</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var= "dino" items = "${ListaDinosaurio}">
            <tr>
                <th scope="row">${dino.id}</th>
                <td>${dino.nombre}</td>
                <td>${dino.altura}</td>
                <td>${dino.color}</td>
                <td>${dino.especie}</td>
                <td><a class="btn btn-warning" href="/registroAuto/editar/${dino.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/registroAuto/eliminar/${dino.id}" role="button">Eliminar</a></td>
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