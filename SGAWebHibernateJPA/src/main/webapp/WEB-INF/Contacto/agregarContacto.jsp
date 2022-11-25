<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Agregar Contacto</title>
    </head>
    <body>
        <div class="container">
            <header>Agregar Contacto</header>

            <form action="${pageContext.request.contextPath}/ServletAgregarContacto" method="POST">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos del Contacto</span>

                        <div class="fields">
                            <div class="input-field">
                                <label>Telefono</label>
                                <input type="tel" name="telefono" placeholder="Telefono" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Email</label>
                                <input type="email" name="email" placeholder="Email" required="true"/>
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

