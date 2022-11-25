
package mx.com.gm.domicilio;

import mx.com.gm.domicilio.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mx.com.gm.domain.Domicilio;
import mx.com.gm.servicio.ServicioDomicilios;

@WebServlet("/ServletEliminarDomicilio")
public class ServletEliminarDomicilio extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idDomicilioString = req.getParameter("idDomicilio");
        Integer idDomicilio = Integer.parseInt(idDomicilioString);

        Domicilio domicilio = new Domicilio();
        domicilio.setIdDomicilio(idDomicilio);

        ServicioDomicilios servicioDomicilios = new ServicioDomicilios();
        domicilio = servicioDomicilios.encontrarDomicilio(domicilio);

        //CREAMOS UNA SESION PARA QUE LOS DATOS NO SE PIERDAN
        HttpSession sesion = req.getSession();
        sesion.setAttribute("domicilio", domicilio);

        req.getRequestDispatcher("/WEB-INF/Domicilio/eliminarDomicilio.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String calle = req.getParameter("calle");
        String numeroCalle = req.getParameter("numeroCalle");
        String pais = req.getParameter("pais");

        //RECUPERAMOS EL OBJETO DE LA SESION
        HttpSession sesion = req.getSession();
        Domicilio domicilio = (Domicilio) sesion.getAttribute("domicilio");

        domicilio.setCalle(calle);
        domicilio.setNumeroCalle(numeroCalle);
        domicilio.setPais(pais);

        ServicioDomicilios ServicioDomicilios = new ServicioDomicilios();
        ServicioDomicilios.eliminarDomicilio(domicilio);

        //REMOVEMOS LA SESION
        sesion.removeAttribute("domicilio");

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
