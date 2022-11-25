<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Eliminar Contacto</title>
    </head>
    <body>       
        <div class="container">
            <header>Eliminar Contacto</header>

            <form action="${pageContext.request.contextPath}/ServletEliminarContacto" method="post">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos del Contacto</span>

                        <div class="fields">
                            <div class="input-field">
                                <input type="hidden" name="idContacto" value="${contacto.idContacto}"/>
                                <label>Telefono</label>
                                <input type="tel" name="telefono" value="${contacto.telefono}" placeholder="Telefono" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Email</label>
                                <input type="email" name="email" value="${contacto.email}" placeholder="Email" required="true"/>
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


