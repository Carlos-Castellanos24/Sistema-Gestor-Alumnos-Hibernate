package mx.com.gm.alumno;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gm.domain.Alumno;
import mx.com.gm.servicio.ServicioAlumnos;

@WebServlet("/ServletAlumno")
public class ServletAlumno extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();

        List<Alumno> alumnos = servicioAlumnos.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        try{
        
            req.getRequestDispatcher("/WEB-INF/Alumno/listadoAlumnos.jsp").forward(req, resp);
            
        }catch(Exception e){
            
            e.printStackTrace(System.out);
        }
    }   
}
