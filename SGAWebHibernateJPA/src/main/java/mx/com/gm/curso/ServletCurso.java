
package mx.com.gm.curso;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Curso;
import mx.com.gm.servicio.ServicioCursos;

@WebServlet("/ServletCurso")
public class ServletCurso extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioCursos servicioCursos = new ServicioCursos();

        List<Curso> cursos = servicioCursos.listarCursos();
        req.setAttribute("cursos", cursos);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Curso/listadoCursos.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    } 
}
