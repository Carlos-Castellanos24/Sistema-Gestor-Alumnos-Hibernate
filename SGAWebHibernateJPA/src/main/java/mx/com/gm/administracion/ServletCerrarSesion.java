package mx.com.gm.administracion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletCerrarSesion")
public class ServletCerrarSesion extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession sesion = req.getSession();
        sesion.removeAttribute("administrador");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
