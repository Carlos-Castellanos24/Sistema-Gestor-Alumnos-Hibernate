package mx.com.gm.administracion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Administracion/ServletRedireccionarAdmin")
public class ServletRedireccionarAdmin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            req.getRequestDispatcher("indexAdministracion.jsp").forward(req, resp);
    }
}
