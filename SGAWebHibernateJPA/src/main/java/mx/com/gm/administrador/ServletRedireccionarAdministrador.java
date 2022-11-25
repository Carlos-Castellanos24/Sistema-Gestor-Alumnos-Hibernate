package mx.com.gm.administrador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedireccionarAdministrador")
public class ServletRedireccionarAdministrador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        req.getRequestDispatcher("/WEB-INF/Administrador/agregarAdministrador.jsp").forward(req, resp);
    }
}
