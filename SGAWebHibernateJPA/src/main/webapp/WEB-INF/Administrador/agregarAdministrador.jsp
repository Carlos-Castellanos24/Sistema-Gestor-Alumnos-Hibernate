<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Agregar Administrador</title>
    </head>
    <body>
        <div class="container">
            <header>Agregar Administrador</header>

            <form action="${pageContext.request.contextPath}/ServletAgregarAdministrador" method="POST">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos de la Persona</span>

                        <div class="fields">
                            <div class="input-field">
                                <label>Nombre</label>
                                <input type="text" name="nombre" placeholder="Nombre" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Apellido</label>
                                <input type="text" name="apellido" placeholder="Apellido" required="true"/>
                            </div>
                        </div>
                        <span class="title">Datos del Administrador</span>

                        <div class="fields">
                            <div class="input-field">
                                <label>Correo</label>
                                <input type="email" name="correo" placeholder="Correo" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Contraseña</label>
                                <input type="password" name="password" placeholder="Contraseña" required="true"/>
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


