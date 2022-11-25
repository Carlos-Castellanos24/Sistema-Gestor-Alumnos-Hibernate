<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Contactos</title>
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <section>
            <button class="btn btn-primary"><a href="${pageContext.request.contextPath}/ServletRedireccionarContacto" class="text-white">AGREGAR CONTACTO</a></button>
        </section>
        <table class="table">
            <thead>
                <th>Id Contacto</th>
                <th>Telefono</th>
                <th>Email</th>
                <th>Actualizar</th>
                <th>Eliminar</th>
            </thead>
            <tbody>
            <c:forEach var="contacto" items="${contactos}">
                <tr>
                    <td data-label="Id Contacto">${contacto.idContacto}</td>
                    <td data-label="Telefono">${contacto.telefono}</td>
                    <td data-label="Email">${contacto.email}</td>
                    <td data-label="Actualizar"><button class="btn btn-success"><a href="${pageContext.request.contextPath}/ServletModificarContacto?idContacto=${contacto.idContacto}" class="text-white">ACTUALIZAR</a></button></td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/ServletEliminarContacto?idContacto=${contacto.idContacto}" class="text-white">ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>        
    </body>
</html>

