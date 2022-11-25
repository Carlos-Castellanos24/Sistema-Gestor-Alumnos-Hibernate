<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Agregar Asignacion</title>
    </head>
    <body>
        <div class="container">
            <header>Agregar Asignacion</header>

            <form action="${pageContext.request.contextPath}/ServletAgregarAsignacion" method="post">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos de Asignacion</span>

                        <div class="fields">
                            <div class="input-field">
                                <label>Turno</label>
                                <input type="text" name="turno" placeholder="Turno" required="true"/>
                            </div>
                        </div>                 
                    </div>
                    <div class="form first">
                        <div class="details personal">

                            <span class="title">Datos del Alumno</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Nombre del Alumno</label>
                                    <br/>
                                    <select name="idAlumno" id="idAlumno" class="form-control">                                    
                                        <c:forEach items="${alumnos}" var="alumno">
                                            <option value="${alumno.idAlumno}">${alumno.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>  
                    </div>
                    <div class="form first">
                        <div class="details personal">

                            <span class="title">Datos del Curso</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Nombre del Curso</label>
                                    <br/>
                                    <select name="idCurso" class="form-control">
                                        <c:forEach items="${cursos}" var="curso">
                                            <option value="${curso.idCurso}">${curso.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <button class="nextBtn" type="submit" name="Agregar" value="Agregar">
                            <span class="btnText">Agregar</span>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </body>    
</html>
