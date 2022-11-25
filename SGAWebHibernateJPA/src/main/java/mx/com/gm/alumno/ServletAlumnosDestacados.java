package mx.com.gm.alumno;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Alumno;
import mx.com.gm.servicio.ServicioAlumnos;

@WebServlet("/ServletAlumnosDestacados")
public class ServletAlumnosDestacados extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();

        List<Alumno> alumnos = servicioAlumnos.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        try{
        
            req.getRequestDispatcher("alumnosDestacados.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }  
}
