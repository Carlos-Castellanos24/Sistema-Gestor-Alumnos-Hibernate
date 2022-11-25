<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloFormularios.css"/>
        <title>Modificar Curso</title>
    </head>
    <body>       
        <div class="container">
            <header>Modificar Curso</header>

            <form action="${pageContext.request.contextPath}/ServletModificarCurso" method="post">
                <div class="form first">
                    <div class="details personal">

                        <span class="title">Datos del Curso</span>

                        <div class="fields">
                            <div class="input-field">
                                <input type="hidden" name="idCurso" value="${curso.idCurso}"/>
                                <label>Nombre</label>
                                <input type="text" name="nombre" value="${curso.nombre}" placeholder="Nombre" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Precio</label>
                                <input type="text" name="precio" value="${curso.precio}" placeholder="Precio" required="true"/>
                            </div>
                            <div class="input-field">
                                <label>Descripcion</label>
                                <input type="text" name="descripcion" value="${curso.descripcion}" placeholder="Descripcion" required="true"/>
                            </div>
                        </div>                     
                        <button class="nextBtn" type="submit" name="Modificar" value="Modificar">
                            <span class="btnText">Modificar</span>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>

