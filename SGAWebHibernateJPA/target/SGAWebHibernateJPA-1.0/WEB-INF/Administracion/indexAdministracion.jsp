<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- ICONOS LINK -->
        <link href="css/estiloIndexAdministracion.css" rel="stylesheet">
        <link href="css/inicioIndexAdmin.css" rel="stylesheet">
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
        <title>Administracion</title>
    </head>
    <body>
        <div class="sidebar">
            <div class="logo_content">
                <div class="logo">
                    <i class="bx bx-user"></i>
                    <div class="logo_name">Administrador</div>
                </div>
            </div>
            <ul class="nav_list">
                <li>
                    <i class="bx bx-search"></i>
                    <input type="text" placeholder="Buscar">
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletEstadisticas">
                        <i class="bx bx-grid-alt"></i>
                        <span class="links_name">Estadisticas</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletAlumno">
                        <i class="bx bxs-face"></i>
                        <span class="links_name">Alumnos</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletAsignacion">
                        <i class="bx bx-calendar"></i>
                        <span class="links_name">Asignacion</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletContacto">
                        <i class="bx bxs-contact"></i>
                        <span class="links_name">Contactos</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletCurso">
                        <i class="bx bx-math"></i>
                        <span class="links_name">Cursos</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletDomicilio">
                        <i class="bx bx-map"></i>
                        <span class="links_name">Domicilio</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletComentario">
                        <i class="bx bx-chat"></i>
                        <span class="links_name">Comentarios</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/ServletAdministrador">
                        <i class="bx bx-user"></i>
                        <span class="links_name">Administradores</span>
                    </a>
                </li>
            </ul>
            <div class="profile_content">
                <div class="profile">
                    <div class="profile_details">
                        <img src="https://us.123rf.com/450wm/ahasoft2000/ahasoft20001607/ahasoft2000160700065/60449697-icono-administrador-estilo-glifo-es-s%C3%ADmbolo-ic%C3%B3nico-plana-con-%C3%A1ngulos-redondeados-de-color-gris-fond.jpg?ver=6"/>
                        <div class="name_job">
                            <div class="name">Administrador</div>
                            <div class="job"> Diseñador Web</div>
                        </div>
                    </div>
                    <a href="${pageContext.request.contextPath}/ServletCerrarSesion">
                        <i class="bx bx-log-out" id="log_out"></i>
                    </a>
                </div>
            </div>
        </div> 
        <div class="home_content" style="text-align: center;"> 
            <div class="text" style="font-size: 40px;">Bienvenido Administrador</div>
        </div>
    </body>
</html>
