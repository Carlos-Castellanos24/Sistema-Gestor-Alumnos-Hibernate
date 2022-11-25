package mx.com.gm.comentario;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Comentario;
import mx.com.gm.servicio.ServicioComentarios;

@WebServlet("/ServletComentario")
public class ServletComentario extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioComentarios servicioComentarios = new ServicioComentarios();

        List<Comentario> comentarios = servicioComentarios.listarComentarios();
        req.setAttribute("comentarios", comentarios);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Comentario/listadoComentarios.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }
}
