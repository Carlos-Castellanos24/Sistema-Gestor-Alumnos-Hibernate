<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../../JSPs/links2.jsp"/>
        <title>Estadisticas Generales</title>
    </head>
    <body>
        <div class="grey-bg container-fluid">
            <section id="minimal-statistics">
                <!-- HEADER -->
                <div class="row">
                    <div class="col-12 mt-3 mb-1">
                        <h4 class="text-uppercase text-center">ESTADISTICAS GENERALES</h4>
                        <p class="text-center">En este apartado se muestran las estadisticas generales de todo el sistema.</p>
                    </div>
                </div>
                <!-- HEADER -->
                <div class="row">
                    <!-- ALUMNOS -->
                    <div class="col-xl-4 col-sm-7 col-12"> 
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-graduation primary font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Alumnos</span>
                                            <h2>${totalAlumnos}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletAlumno">Ver Alumnos</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ALUMNOS -->   

                    <!-- ASIGNACIONES -->
                    <div class="col-xl-4 col-sm-7 col-12">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-calendar warning font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Asignaciones</span>
                                            <h2>${totalAsignaciones}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletAsignacion">Ver Asignaciones</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ASIGNACIONES -->

                    <!-- COMENTARIOS -->
                    <div class="col-xl-4 col-sm-7 col-12">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-speech warning font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Comentarios</span>
                                            <h2>${totalComentarios}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletComentario">Ver Comentarios</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- COMENTARIOS -->

                    <!-- CONTACTOS -->
                    <div class="col-xl-4 col-sm-7 col-12">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-notebook success font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Contactos</span>
                                            <h2>${totalContactos}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletContacto">Ver Contactos</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- CONTACTOS -->

                    <!-- CURSOS -->
                    <div class="col-xl-4 col-sm-7 col-12">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-note danger font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Cursos</span>
                                            <h2>${totalCursos}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletCurso">Ver Cursos</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- CURSOS -->

                    <!-- DOMICILIOS -->
                    <div class="col-xl-4 col-sm-7 col-12">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-map danger font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Domicilios</span>
                                            <h2>${totalDomicilios}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletDomicilio">Ver Domicilios</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- DOMICILIOS -->

                    <!-- ADMINISTRADORES -->
                    <div class="col-xl-4 col-sm-7 col-12">
                        <div class="card">
                            <div class="card-content">
                                <div class="card-body">
                                    <div class="media d-flex">
                                        <div class="align-self-center">
                                            <i class="icon-user danger font-large-2 float-left"></i>
                                        </div>
                                        <div class="media-body text-right">
                                            <span>Cantidad de Administradores</span>
                                            <h2>${totalAdministradores}</h2>
                                            <a href="${pageContext.request.contextPath}/ServletAdministrador">Ver Administradores</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ADMINISTRADORES -->
                </div>                                        
            </section>
        </div>
    </body>
</html>
