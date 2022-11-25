package mx.com.gm.contacto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Contacto;
import mx.com.gm.servicio.ServicioContactos;

@WebServlet("/ServletAgregarContacto")
public class ServletAgregarContacto extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {      
        
        String telefono = req.getParameter("telefono");
        String Email = req.getParameter("email");
        
        Contacto contacto = new Contacto();
        contacto.setTelefono(telefono);
        contacto.setEmail(Email);
        
        ServicioContactos servicioContactos = new ServicioContactos();
        servicioContactos.insertarContacto(contacto);

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
