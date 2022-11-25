package mx.com.gm.administrador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Administrador;
import mx.com.gm.servicio.ServicioAdministradores;

@WebServlet("/ServletEliminarAdministrador")
public class ServletEliminarAdministrador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idAdministradorString = req.getParameter("idAdministrador");
        Integer idAdministrador = Integer.parseInt(idAdministradorString);

        Administrador administrador = new Administrador();
        administrador.setIdAdministrador(idAdministrador);

        ServicioAdministradores servicioAdministradores = new ServicioAdministradores();
        administrador = servicioAdministradores.encontrarAdministrador(administrador);

        //CREAMOS UNA SESION PARA QUE LOS DATOS NO SE PIERDAN
        HttpSession sesion = req.getSession();
        sesion.setAttribute("administrador", administrador);

        req.getRequestDispatcher("/WEB-INF/Administrador/eliminarAdministrador.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String nombre = req.getParameter("nombre");
            String apellido = req.getParameter("apellido");
            String correo = req.getParameter("correo");
            String password = req.getParameter("password");

            //RECUPERAMOS EL OBJETO DE LA SESION
            HttpSession sesion = req.getSession();
            Administrador administrador = (Administrador) sesion.getAttribute("administrador");

            administrador.setNombre(nombre);
            administrador.setApellido(apellido);
            administrador.setCorreo(correo);
            administrador.setPassword(password);

            ServicioAdministradores servicioAdministradores = new ServicioAdministradores();
            servicioAdministradores.eliminarAdministrador(administrador);

            //REMOVEMOS LA SESION
            sesion.removeAttribute("administrador");
        
        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
