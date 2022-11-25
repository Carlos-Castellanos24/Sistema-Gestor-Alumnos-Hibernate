<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Eliminar Domicilio</title>
    </head>
    <body>       
        <div class="container">
            <header>Eliminar Domicilio</header>

            <form action="${pageContext.request.contextPath}/ServletEliminarDomicilio" method="post">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos del Domicilio</span>

                        <div class="fields">
                            <div class="input-field">
                                <input type="hidden" name="idDomicilio" value="${domicilio.idDomicilio}"/>
                                <label>Calle</label>
                                <input type="text" name="calle" value="${domicilio.calle}" placeholder="Calle" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>No.Calle</label>
                                <input type="text" name="numeroCalle" value="${domicilio.numeroCalle}" placeholder="Numero de Calle" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Pais</label>
                                <input type="text" name="pais" value="${domicilio.pais}" placeholder="Pais" required="true"/>
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


