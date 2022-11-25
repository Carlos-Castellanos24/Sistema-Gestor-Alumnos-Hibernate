<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de los Cursos</title>
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <section>
            <button class="btn btn-primary"><a href="${pageContext.request.contextPath}/ServletRedireccionarCurso" class="text-white">AGREGAR CURSO</a></button>
        </section>
        <table class="table">
            <thead>
                <th>Id Curso</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Descripcion</th>
                <th>Actualizar</th>
                <th>Eliminar</th>
            </thead>
            <tbody>
            <c:forEach var="curso" items="${cursos}">
                <tr>
                    <td data-label="Id Curso">${curso.idCurso}</td>
                    <td data-label="Nombre">${curso.nombre}</td>
                    <td data-label="Precio">${curso.precio}</td>
                    <td data-label="Descripcion">${curso.descripcion}</td>
                    <td data-label="Actualizar"><button class="btn btn-success"><a href="${pageContext.request.contextPath}/ServletModificarCurso?idCurso=${curso.idCurso}" class="text-white">ACTUALIZAR</a></button></td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/ServletEliminarCurso?idCurso=${curso.idCurso}" class="text-white">ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>        
    </body>
</html>
