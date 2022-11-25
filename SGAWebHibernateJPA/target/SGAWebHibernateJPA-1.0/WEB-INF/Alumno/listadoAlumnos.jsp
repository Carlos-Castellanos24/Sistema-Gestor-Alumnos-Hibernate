<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>        
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Listado de Alumnos</title>
    </head>
    <body>
        <section>
            <button class="btn btn-primary"><a href="${pageContext.request.contextPath}/ServletRedireccionar" class="text-white">AGREGAR ALUMNO</a></button>
        </section>
        <table class="table">
            <thead>
            <th>Id Alumno</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Grado</th>
            <th>Domicilio</th>
            <th>Contacto</th>
            <th>Actualizar</th>
            <th>Eliminar</th>
        </thead>
        <tbody>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td data-label="Id Persona">${alumno.idAlumno}</td>
                    <td data-label="Nombre">${alumno.nombre}</td>
                    <td data-label="Apellido">${alumno.apellido}</td>
                    <td data-label="Apellido">${alumno.grado}</td>
                    <td data-label="Email">${alumno.domicilio.calle}</td>
                    <td data-label="Telefono">${alumno.contacto.telefono}</td>  
                    <td data-label="Actualizar"><button class="btn btn-success"><a href="${pageContext.request.contextPath}/ServletModificarAlumno?idAlumno=${alumno.idAlumno}" class="text-white"
                                                                                   >ACTUALIZAR</a></button></td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/ServletEliminarAlumno?idAlumno=${alumno.idAlumno}" class="text-white"
                                                                                >ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>        
</body>
</html>
