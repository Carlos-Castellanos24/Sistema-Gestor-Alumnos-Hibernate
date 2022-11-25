package mx.com.gm.contacto;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Contacto;
import mx.com.gm.servicio.ServicioContactos;

@WebServlet("/ServletContacto")
public class ServletContacto extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioContactos servicioContactos = new ServicioContactos();

        List<Contacto> contactos = servicioContactos.listarContactos();
        req.setAttribute("contactos", contactos);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Contacto/listadoContactos.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }
}
