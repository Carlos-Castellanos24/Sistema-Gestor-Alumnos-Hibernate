package mx.com.gm.domicilio;

import mx.com.gm.domicilio.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Domicilio;
import mx.com.gm.servicio.ServicioDomicilios;

@WebServlet("/ServletAgregarDomicilio")
public class ServletAgregarDomicilio extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {      
        
        String calle = req.getParameter("calle");
        String numeroCalle = req.getParameter("numeroCalle");
        String pais = req.getParameter("pais");
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNumeroCalle(numeroCalle);
        domicilio.setPais(pais);
        
        ServicioDomicilios servicioDomicilios = new ServicioDomicilios();
        servicioDomicilios.insertarDomicilio(domicilio);

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
