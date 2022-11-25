<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Domicilios</title>
        <link rel="stylesheet" href="css/estilo.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <section>
            <button class="btn btn-primary"><a href="${pageContext.request.contextPath}/ServletRedireccionarDomicilio" class="text-white">AGREGAR DOMICILIO</a></button>
        </section>
        <table class="table">
            <thead>
                <th>Id Domicilio</th>
                <th>Calle</th>
                <th>Numero de Calle</th>
                <th>Pais</th>
                <th>Actualizar</th>
                <th>Eliminar</th>
            </thead>
            <tbody>
            <c:forEach var="domicilio" items="${domicilios}">
                <tr>
                    <td data-label="Id Domicilio">${domicilio.idDomicilio}</td>
                    <td data-label="Telefono">${domicilio.calle}</td>
                    <td data-label="Email">${domicilio.numeroCalle}</td>
                    <td data-label="Email">${domicilio.pais}</td>
                    <td data-label="Actualizar"><button class="btn btn-success"><a href="${pageContext.request.contextPath}/ServletModificarDomicilio?idDomicilio=${domicilio.idDomicilio}" class="text-white">ACTUALIZAR</a></button></td>
                    <td data-label="Eliminar"><button class="btn btn-danger"><a href="${pageContext.request.contextPath}/ServletEliminarDomicilio?idDomicilio=${domicilio.idDomicilio}" class="text-white">ELIMINAR</a></button></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>        
    </body>
</html>

