<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>Institución</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
    </head>
    <!-- body -->
    <body class="main-layout">
        <!-- loader  -->
        <div class="loader_bg">
            <div class="loader"><img src="images/loading.gif" alt="#" /></div>
        </div>
        <!-- end loader -->
        <!-- header -->
        <header>
            <!-- header inner -->
            <div  class="head_top">
                <div class="header">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                                <div class="full">
                                    <div class="center-desk">
                                        <div class="logo">
                                            <a href="index.jsp">Institución</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                                <nav class="navigation navbar navbar-expand-md navbar-dark ">
                                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                                        <span class="navbar-toggler-icon"></span>
                                    </button>
                                    <div class="collapse navbar-collapse" id="navbarsExample04">
                                        <ul class="navbar-nav mr-auto">
                                            <li class="nav-item">
                                                <a class="nav-link" href="#banner_main">Misión y Visión</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/ServletAlumnosDestacados">Alumnos Destacados</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/ServletCursosDisponibles">Cursos Disponibles</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="#contact">Comentarios</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/ServletRedireccionarLogin">Administracion</a>
                                            </li>
                                        </ul>
                                    </div>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- end header inner -->
                <!-- end header -->
                <!-- banner -->
                <section class="banner_main" id="banner_main">
                    <div class="container">
                        <div class="row d_flex">
                            <div class=" col-xl-8 col-lg-8 col-md-8 col-12-9">
                                <div class="text-bg">
                                    <h1>Misión y Visión<br> <span class="white1">Misión</span></h1>
                                    <p>Nuestra mision es garantizar un servicio educativo de calidad, en todos los niveles y modalidades del sistema educativo, promoviendo la formación integral y desarrollo de la identidad y autoestima del educando, que facilite su integración social con hábitos de aprendizaje permanente acorde a los cambios científico tecnológicos, así como a las exigencias del mundo globalizado </p>
                                    <h1><span class="white1">Visión</span></h1>
                                    <p>Es una Institución reconocida por la comunidad Local, por su gestión eficiente y haber logrado niveles de rendimiento académico de los alumnos por encima del promedio nacional; mantiene liderazgo entre las instituciones similares con propuestas innovadoras en los procesos de gestión con una plana de personal docente y Administrativo competente y motivado que genera un clima organizacional favorable</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </header>
        <!-- end banner -->      
        <!-- contact -->
        <div id="contact" class="contact">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Comentarios</h2>
                            <span>¡Deja un comentario para poder seguir mejorando!</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-md-12 ">
                        <form class="main_form " action="${pageContext.request.contextPath}/ServletAgregarComentario" method="post">
                            <div class="row">
                                <div class="col-md-12 ">
                                    <input class="form_contril" placeholder="Nombre Completo" type="text" name="nombre">
                                </div>
                                <div class="col-md-12">
                                    <input class="form_contril" placeholder="Email" type="text" name="email">
                                </div>
                                <div class="col-md-12">
                                    <input class="form_contril" placeholder="Comentario" type="text" name="comentario">
                                </div>
                                <div class="col-sm-12">
                                    <button class="send_btn">Enviar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- end contact -->
        <!--  footer -->
        <footer>
            <div class="footer">
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
        </footer>
        <!-- end footer -->
        <!-- Javascript files-->
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery-3.0.0.min.js"></script>

        <!-- sidebar -->
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/custom.js"></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
    </body>
</html>
