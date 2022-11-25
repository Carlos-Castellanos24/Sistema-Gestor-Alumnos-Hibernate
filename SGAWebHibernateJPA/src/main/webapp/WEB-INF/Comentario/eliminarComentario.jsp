<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Eliminar Comentario</title>
    </head>
    <body>       
        <div class="container">
            <header>Eliminar Comentario</header>

            <form action="${pageContext.request.contextPath}/ServletEliminarComentario" method="post">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos de la Persona</span>

                        <div class="fields">
                            <div class="input-field">
                                <input type="hidden" name="idComentario" value="${comentario.idComentario}"/>
                                <label>Nombre Completo</label>
                                <input type="text" name="nombre" value="${comentario.nombre}" placeholder="Nombre Completo" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Email</label>
                                <input type="email" name="email" value="${comentario.email}" placeholder="Email" required="true"/>
                            </div>
                        </div>
                        <span class="title">Datos del comentario</span>

                        <div class="fields">
                            <div class="input-field">
                                <label>Comentario</label>
                                <input type="text" name="comentario" value="${comentario.comentario}" placeholder="Comentario" required="true"/>
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


