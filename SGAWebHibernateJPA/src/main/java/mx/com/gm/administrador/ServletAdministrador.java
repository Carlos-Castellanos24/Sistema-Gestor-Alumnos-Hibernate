package mx.com.gm.administrador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Administrador;
import mx.com.gm.servicio.ServicioAdministradores;

@WebServlet("/ServletAdministrador")
public class ServletAdministrador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioAdministradores servicioAdministradores = new ServicioAdministradores();

        List<Administrador> administradores = servicioAdministradores.listarAdministradores();
        req.setAttribute("administradores", administradores);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Administrador/listadoAdministradores.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }
}
