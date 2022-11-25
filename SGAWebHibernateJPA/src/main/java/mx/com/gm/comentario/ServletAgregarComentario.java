package mx.com.gm.comentario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Comentario;
import mx.com.gm.servicio.ServicioComentarios;

@WebServlet("/ServletAgregarComentario")
public class ServletAgregarComentario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombre = req.getParameter("nombre");
        String email = req.getParameter("email");
        String comentarioP = req.getParameter("comentario");

        if (nombre.isEmpty() || email.isEmpty() || comentarioP.isEmpty()) {

            req.getRequestDispatcher("index.jsp").forward(req, resp);

        } else {

            Comentario comentario = new Comentario();
            comentario.setNombre(nombre);
            comentario.setEmail(email);
            comentario.setComentario(comentarioP);

            ServicioComentarios servicioComentarios = new ServicioComentarios();
            servicioComentarios.insertarComentario(comentario);           
        }
        
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
