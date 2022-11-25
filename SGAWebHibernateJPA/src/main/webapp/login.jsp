<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <link rel="stylesheet" href="css/estiloLogin.css"/>
        <title>Login Administracion</title>       
    </head>
    <body>
        <div class="container">
            <form action="${pageContext.request.contextPath}/ServletValidarLogin" method="post">
                <div class="form-content">
                    <div class="login-form">
                        <div class="title">ADMINISTRACION</div>
                        <div class="input-boxes">
                            <div class="input-box">
                                <i class="fas fa-user"></i>
                                <input type="text" name="nombre" placeholder="Ingresa tu nombre" required="true"/>
                            </div>
                            <div class="input-box">
                                <i class="fas fa-lock"></i>
                                <input type="password" name="password" placeholder="Ingresa tu contraseña" required="true"/>
                            </div>
                            <div class=" button input-box">
                                <input type="submit" value="Ingresar"/>
                            </div>
                        </div>
                    </div>    
                </div>
            </form>               
        </div>        
    </body>
</html>
