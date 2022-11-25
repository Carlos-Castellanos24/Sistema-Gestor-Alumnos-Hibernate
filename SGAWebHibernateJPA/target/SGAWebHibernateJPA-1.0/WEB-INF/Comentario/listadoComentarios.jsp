<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de los Comentarios</title>
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <table class="table">
            <thead>
                <th>Id Comentario</th>
                <th>Nombre Completo</th>
                <th>Email</th>
                <th>Comentario</th>
                <th>Eliminar</th>
            </thead>
            <tbody>
            <c:forEach var="comentario" items="${comentarios}">
                <tr>
                    <td data-label="Id Curso">${comentario.idComentario}</td>
                    <td data-label="Nombre">${comentario.nombre}</td>
                    <td data-label="Precio">${comentario.email}</td>
                    <td data-label="Precio">${comentario.comentario}</td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/Administracion/ServletEliminarComentario?idComentario=${comentario.idComentario}" class="text-white">ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>        
    </body>
</html>
