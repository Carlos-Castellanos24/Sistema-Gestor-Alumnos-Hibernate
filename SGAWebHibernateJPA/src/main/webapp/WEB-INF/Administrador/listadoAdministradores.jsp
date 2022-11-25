<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Administradores</title>
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <section>
            <button class="btn btn-primary"><a href="${pageContext.request.contextPath}/ServletRedireccionarAdministrador" class="text-white">AGREGAR ADMINISTRADOR</a></button>
        </section>
        <table class="table">
            <thead>
                <th>Id Administrador</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Correo</th>
                <th>Contrase&ntilde;a</th>
                <th>Actualizar</th>
                <th>Eliminar</th>
            </thead>
            <tbody>
            <c:forEach var="administrador" items="${administradores}">
                <tr>
                    <td data-label="Id Administrador">${administrador.idAdministrador}</td>
                    <td data-label="Nombre">${administrador.nombre}</td>
                    <td data-label="Apellido">${administrador.apellido}</td>
                    <td data-label="Correo">${administrador.correo}</td>
                    <td data-label="Contraseña">${administrador.password}</td>
                    <td data-label="Actualizar"><button class="btn btn-success"><a href="${pageContext.request.contextPath}/ServletModificarAdministrador?idAdministrador=${administrador.idAdministrador}" class="text-white"
                        >ACTUALIZAR</a></button></td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/ServletEliminarAdministrador?idAdministrador=${administrador.idAdministrador}" class="text-white"
                        >ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>        
    </body>
</html>

