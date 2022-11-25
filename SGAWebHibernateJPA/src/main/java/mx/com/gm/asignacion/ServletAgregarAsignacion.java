package mx.com.gm.asignacion;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.*;
import mx.com.gm.servicio.*;

@WebServlet("/ServletAgregarAsignacion")
public class ServletAgregarAsignacion extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {      
        
        
        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();
        List<Alumno> alumnos = servicioAlumnos.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        
        ServicioCursos servicioCursos = new ServicioCursos();
        List<Curso> cursos = servicioCursos.listarCursos();
        req.setAttribute("cursos", cursos);    
        
        req.getRequestDispatcher("/WEB-INF/Asignacion/agregarAsignacion.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {             
        
        String turno = req.getParameter("turno");
        String idAlumnoString = req.getParameter("idAlumno");
        String idCursoString = req.getParameter("idCurso");
        
        Integer idAlumno = Integer.parseInt(idAlumnoString);
        Integer idCurso = Integer.parseInt(idCursoString);
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);
        
        Curso curso = new Curso();
        curso.setIdCurso(idCurso);      
        
        Asignacion asignacion = new Asignacion();
        asignacion.setTurno(turno);
        asignacion.setAlumno(alumno);
        asignacion.setCurso(curso);
        
        ServicioAsignaciones servicioAsignaciones = new ServicioAsignaciones();
        servicioAsignaciones.insertarAsignacion(asignacion);
        
        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
