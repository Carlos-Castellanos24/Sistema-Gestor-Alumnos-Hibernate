
package mx.com.gm.curso;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedireccionarCurso")
public class ServletRedireccionarCurso extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        req.getRequestDispatcher("/WEB-INF/Curso/agregarCurso.jsp").forward(req, resp);
    }
}
