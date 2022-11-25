
package mx.com.gm.contacto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mx.com.gm.domain.Contacto;
import mx.com.gm.servicio.ServicioContactos;

@WebServlet("/ServletEliminarContacto")
public class ServletEliminarContacto extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idContactoString = req.getParameter("idContacto");
        Integer idContacto = Integer.parseInt(idContactoString);

        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);

        ServicioContactos servicioContactos = new ServicioContactos();
        contacto = servicioContactos.encontrarContacto(contacto);

        //CREAMOS UNA SESION PARA QUE LOS DATOS NO SE PIERDAN
        HttpSession sesion = req.getSession();
        sesion.setAttribute("contacto", contacto);

        req.getRequestDispatcher("/WEB-INF/Contacto/eliminarContacto.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String telefono = req.getParameter("telefono");
        String email = req.getParameter("email");

        //RECUPERAMOS EL OBJETO DE LA SESION
        HttpSession sesion = req.getSession();
        Contacto contacto = (Contacto) sesion.getAttribute("contacto");

        contacto.setTelefono(telefono);
        contacto.setEmail(email);

        ServicioContactos ServicioContactos = new ServicioContactos();
        ServicioContactos.eliminarContacto(contacto);

        //REMOVEMOS LA SESION
        sesion.removeAttribute("contacto");

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
