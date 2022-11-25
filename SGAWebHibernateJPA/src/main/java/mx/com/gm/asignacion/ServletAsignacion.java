package mx.com.gm.asignacion;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Asignacion;
import mx.com.gm.servicio.ServicioAsignaciones;

@WebServlet("/ServletAsignacion")
public class ServletAsignacion extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioAsignaciones servicioAsignaciones = new ServicioAsignaciones();

        List<Asignacion> asignaciones = servicioAsignaciones.listarAsignaciones();
        req.setAttribute("asignaciones", asignaciones);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Asignacion/listadoAsignaciones.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }
}
