package mx.com.gm.domicilio;

import mx.com.gm.contacto.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedireccionarDomicilio")
public class ServletRedireccionarDomicilio extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        req.getRequestDispatcher("/WEB-INF/Domicilio/agregarDomicilio.jsp").forward(req, resp);
    }
}
