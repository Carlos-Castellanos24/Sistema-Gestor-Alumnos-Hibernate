package mx.com.gm.administrador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Administrador;
import mx.com.gm.servicio.ServicioAdministradores;

@WebServlet("/ServletAgregarAdministrador")
public class ServletAgregarAdministrador extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {      
        
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String correo = req.getParameter("correo");
        String password = req.getParameter("password");
        
        Administrador administrador = new Administrador();
        administrador.setNombre(nombre);
        administrador.setApellido(apellido);
        administrador.setCorreo(correo);
        administrador.setPassword(password);
        
        ServicioAdministradores servicioAdministradores = new ServicioAdministradores();
        servicioAdministradores.insertarAdministrador(administrador);

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
