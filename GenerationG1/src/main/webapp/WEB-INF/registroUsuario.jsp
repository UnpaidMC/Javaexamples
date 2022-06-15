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
      <!--PASAR INFORMACION DESDE LA VISTA A UNA URL(action)
          SIN method, EL DEFAULT ES get-->

      <!--GET = PARAMETROS SE VAN A LA RUTA-->
      <!--POST = PARAMETROS NO SE VEN(OCULTOS)-->
      <!--name INTERACTUA CON EL BACKEND-->
      <!--id INTERACTUA SOLO CON ESTE JSP, NO PUEDEN HABER id IGUALES-->
      <form action= "/registro/usuario" method="post">
          <label for="nombre">Nombre: </label>
          <input type="text" id="nombre" name="nombre">
          <br>
          <label for="apellido">Apellido: </label>
          <input type="text" id="apellido" name="apellido">
          <br>
          <label for="edad">Edad: </label>
          <input type="number" id="edad" name="edad">
          <br>
          <!--SUBMIT ENVIA INFORMACION-->
          <input type="submit" value="registrar">
          <!--SOLO BOTON, NO RECARGA PAGINA-->
          <input type="button" value="Enviar">
      </form>

  </div>
</body>
</html>
