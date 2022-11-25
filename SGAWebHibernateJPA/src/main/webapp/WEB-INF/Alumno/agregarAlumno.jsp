<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estiloFormularios.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Alumno</title>
    </head>
    <body>
        <div class="container">
            <header>Agregar Alumno</header>

            <form action="${pageContext.request.contextPath}/ServletAgregarAlumno" method="POST">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos Personales</span>

                        <div class="fields">
                            <div class="input-field">
                                <label>Nombre</label>
                                <input type="text" name="nombre" placeholder="Nombre" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Apellido</label>
                                <input type="text" name="apellido" placeholder="Apellido" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Grado</label>
                                <input type="text" name="grado" placeholder="Grado" required="true"/>
                            </div>
                        </div>

                        <div class="details personal">

                            <span class="title">Datos de Domicilio</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Calle</label>
                                    <input type="text" name="calle" placeholder="Calle" required="true"/>
                                </div>
                                <div class="input-field">
                                    <label>No.Calle</label>
                                    <input type="text" name="numeroCalle" placeholder="Numero de Calle" required="true"/>
                                </div>
                                <div class="input-field">
                                    <label>Pais</label>
                                    <input type="text" name="pais" placeholder="Pais" required="true"/>
                                </div>
                            </div>
                        </div>

                        <div class="details personal">
                            <span class="title">Datos de Contacto</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Email</label>
                                    <input type="email" name="email" placeholder="Email" required="true"/>
                                </div>
                                <div class="input-field">
                                    <label>Telefono</label>
                                    <input type="tel" name="telefono" placeholder="Telefono" required="true"/>
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
