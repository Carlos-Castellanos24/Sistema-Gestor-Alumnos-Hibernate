<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Asignaciones</title>
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <section>
            <button class="btn btn-primary"><a href="${pageContext.request.contextPath}/ServletAgregarAsignacion" class="text-white">AGREGAR ASIGNACION</a></button>
        </section>
        <table class="table">
            <thead> 
                <th>Id Asignacion</th>
                <th>Id Alumno</th>
                <th>Id Curso</th>
                <th>Turno</th>
                <th>Actualizar</th>
                <th>Eliminar</th>
            </thead>
            <tbody>
            <c:forEach var="asignacion" items="${asignaciones}">
                <tr>
                    <td data-label="Id Asignacion">${asignacion.idAsignacion}</td>
                    <td data-label="Id Alumno">${asignacion.alumno.idAlumno}</td>
                    <td data-label="Id Curso">${asignacion.curso.idCurso}</td>
                    <td data-label="Turno">${asignacion.turno}</td>
                    <td data-label="Actualizar"><button class="btn btn-success"><a href="${pageContext.request.contextPath}/ServletModificarAsignacion?idAsignacion=${asignacion.idAsignacion}" class="text-white"
                        >ACTUALIZAR</a></button></td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/ServletEliminarAsignacion?idAsignacion=${asignacion.idAsignacion}" class="text-white"
                        >ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>        
    </body>
</html>
