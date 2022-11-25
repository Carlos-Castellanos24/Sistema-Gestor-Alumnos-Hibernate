package mx.com.gm.administrador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.dao.AdministradorDAO;

@WebServlet("/ServletValidarLogin")
public class ServletValidarLogin extends HttpServlet {

    private AdministradorDAO administradorDAO;

    @Override
    public void init() {

        administradorDAO = new AdministradorDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            validacion(req, resp);

        } catch (Exception e) {

            e.printStackTrace(System.out);
        }
    }

    //VALIDACION DE EL ADMINISTRADOR
    private void validacion(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            HttpSession sesion = req.getSession();

            String nombre = req.getParameter("nombre");
            String password = req.getParameter("password");

            if (administradorDAO.validarLogin(nombre, password)) {
                
                sesion.setAttribute("administrador", nombre);
                
                RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp");
                dispatcher.forward(req, resp);
               
            } else {

                RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
                dispatcher.forward(req, resp);
            }

        } catch (Exception e) {

            e.printStackTrace(System.out);
        }
    }
}
