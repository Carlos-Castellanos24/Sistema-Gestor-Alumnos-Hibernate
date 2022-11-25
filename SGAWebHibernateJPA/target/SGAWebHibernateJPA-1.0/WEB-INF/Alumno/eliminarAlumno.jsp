<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Eliminar Alumno</title>
    </head>
    <body>       
        <div class="container">
            <header>Eliminar Alumno</header>

            <form action="${pageContext.request.contextPath}/ServletEliminarAlumno" method="post">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos Personales</span>

                        <div class="fields">
                            <div class="input-field">
                                <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
                                <label>Nombre</label>
                                <input type="text" name="nombre" value="${alumno.nombre}" placeholder="Nombre" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Apellido</label>
                                <input type="text" name="apellido" value="${alumno.apellido}" placeholder="Apellido" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Grado</label>
                                <input type="text" name="grado" value="${alumno.grado}" placeholder="Grado" required="true"/>
                            </div>
                        </div>

                        <div class="details personal">

                            <span class="title">Datos de Domicilio</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Calle</label>
                                    <input type="text" name="calle" value="${alumno.domicilio.calle}" placeholder="Calle" required="true"/>
                                </div>
                                <div class="input-field">
                                    <label>No.Calle</label>
                                    <input type="text" name="numeroCalle" value="${alumno.domicilio.numeroCalle}" placeholder="Numero de Calle" required="true"/>
                                </div>
                                <div class="input-field">
                                    <label>Pais</label>
                                    <input type="text" name="pais" value="${alumno.domicilio.pais}" placeholder="Pais" required="true"/>
                                </div>
                            </div>
                        </div>

                        <div class="details personal">
                            <span class="title">Datos de Contacto</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Email</label>
                                    <input type="email" name="email" value="${alumno.contacto.email}" placeholder="Email" required="true"/>
                                </div>
                                <div class="input-field">
                                    <label>Telefono</label>
                                    <input type="tel" name="telefono" value="${alumno.contacto.telefono}" placeholder="Telefono" required="true"/>
                                </div>
                            </div>
                        </div>
                        <button class="nextBtn" type="submit" name="Eliminar" value="Eliminar">
                            <span class="btnText">Eliminar</span>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>

