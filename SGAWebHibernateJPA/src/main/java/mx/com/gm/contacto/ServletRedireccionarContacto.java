package mx.com.gm.contacto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedireccionarContacto")
public class ServletRedireccionarContacto extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        req.getRequestDispatcher("/WEB-INF/Contacto/agregarContacto.jsp").forward(req, resp);
    }
}
