<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="JSPs/links.jsp"/>
    </head>
    <body class="main-layout">
        <div class="loader_bg">
            <div class="loader"><img src="images/loading.gif" alt="#" /></div>
        </div>
        <jsp:include page="JSPs/header.jsp"/>
        <!-- Inicio ForEach -->
        <div class="blog_main" id="blog_main">
            <div class="container col-md-12">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Alumnos Destacados</h2>
                            <span>En esta sección se muestran los alumnos mas destacados.</span>
                        </div>
                    </div>
                </div>         
                <!-- Seccion ForEach -->
                <c:forEach var="alumno" items="${alumnos}">
                    <div class="col-md-6 float-left margin_top_30" style="">
                        <div class="col-md-12">
                            <div class="our_img">
                                <figure><img src="images/estudiante.png" alt="#"/></figure>
                            </div>
                            <div class="our_text_box three_box">
                                <div class="post_box d_flex padding_top3 justify-content-center">
                                    <h3 class="awesome padding_flot">${alumno.nombre} ${alumno.apellido}</h3>
                                </div>
                                <div class="post_box d_flex padding_top3 justify-content-center">
                                    <h3 class="awesome padding_flot">${alumno.grado}</h3>
                                </div>
                            </div>
                        </div>                   
                    </div>
                </c:forEach>
            </div>
        </div>
        <!-- Final ForEach -->

        <!--  footer -->
        <!--<footer>
            <div class="footer" style="">
                <div class="copyright">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <p>© 2022 Todos los derechos reservados. Diseñado por Carlos Castellanos</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>-->
        <!-- end footer -->
        <jsp:include page="JSPs/scripts.jsp"/>
    </body>
</html>

