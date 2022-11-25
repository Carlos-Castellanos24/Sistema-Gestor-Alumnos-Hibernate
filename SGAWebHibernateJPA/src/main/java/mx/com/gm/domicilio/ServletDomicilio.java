package mx.com.gm.domicilio;

import mx.com.gm.domicilio.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Domicilio;
import mx.com.gm.servicio.ServicioDomicilios;

@WebServlet("/ServletDomicilio")
public class ServletDomicilio extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioDomicilios servicioDomicilios = new ServicioDomicilios();

        List<Domicilio> domicilios = servicioDomicilios.listarDomicilios();
        req.setAttribute("domicilios", domicilios);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Domicilio/listadoDomicilios.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }
}
