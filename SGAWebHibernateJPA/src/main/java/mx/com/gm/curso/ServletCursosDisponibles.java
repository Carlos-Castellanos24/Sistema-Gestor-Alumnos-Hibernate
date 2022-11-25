package mx.com.gm.curso;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gm.domain.Curso;
import mx.com.gm.servicio.ServicioCursos;

@WebServlet("/ServletCursosDisponibles")
public class ServletCursosDisponibles extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioCursos servicioCursos = new ServicioCursos();

        List<Curso> cursos = servicioCursos.listarCursos();
        req.setAttribute("cursos", cursos);
        try{
        
            req.getRequestDispatcher("cursosDisponibles.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    } 
}
