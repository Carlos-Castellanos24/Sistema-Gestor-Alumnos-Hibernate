package mx.com.gm.comentario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Comentario;
import mx.com.gm.servicio.ServicioComentarios;

@WebServlet("/ServletEliminarComentario")
public class ServletEliminarComentario extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idComentarioString = req.getParameter("idComentario");
        Integer idComentario= Integer.parseInt(idComentarioString);

        Comentario comentario = new Comentario();
        comentario.setIdComentario(idComentario);

        ServicioComentarios servicioComentarios = new ServicioComentarios();
        comentario = servicioComentarios.encontrarComentario(comentario);

        //CREAMOS UNA SESION PARA QUE LOS DATOS NO SE PIERDAN
        HttpSession sesion = req.getSession();
        sesion.setAttribute("comentario", comentario);

        req.getRequestDispatcher("/WEB-INF/Comentario/eliminarComentario.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombre = req.getParameter("nombre");
        String email = req.getParameter("email");
        String comentarioP = req.getParameter("comentario");

        //RECUPERAMOS EL OBJETO DE LA SESION
        HttpSession sesion = req.getSession();
        Comentario comentario = (Comentario) sesion.getAttribute("comentario");

        comentario.setNombre(nombre);
        comentario.setEmail(email);
        comentario.setComentario(comentarioP);

        ServicioComentarios servicioComentarios = new ServicioComentarios();
        servicioComentarios.eliminarComentario(comentario);

        //REMOVEMOS LA SESION
        sesion.removeAttribute("comentario");

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
