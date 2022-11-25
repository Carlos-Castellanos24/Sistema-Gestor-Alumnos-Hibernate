package mx.com.gm.asignacion;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.*;
import mx.com.gm.servicio.*;

@WebServlet("/ServletModificarAsignacion")
public class ServletModificarAsignacion extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();
        List<Alumno> alumnos = servicioAlumnos.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        
        ServicioCursos servicioCursos = new ServicioCursos();
        List<Curso> cursos = servicioCursos.listarCursos();
        req.setAttribute("cursos", cursos);
        
        String idAsignacionString = req.getParameter("idAsignacion");
        Integer idAsignacion = Integer.parseInt(idAsignacionString);

        Asignacion asignacion = new Asignacion();
        asignacion.setIdAsignacion(idAsignacion);

        ServicioAsignaciones servicioAsignaciones = new ServicioAsignaciones();
        asignacion = servicioAsignaciones.encontrarAsignacion(asignacion);

        HttpSession sesion = req.getSession();
        sesion.setAttribute("asignacion", asignacion);

        req.getRequestDispatcher("/WEB-INF/Asignacion/modificarAsignacion.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idAlumnoString = req.getParameter("idAlumno");
        String idCursoString = req.getParameter("idCurso");
        String turno = req.getParameter("turno");

        Integer idAlumno = Integer.parseInt(idAlumnoString);
        Integer idCurso = Integer.parseInt(idCursoString);
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);
        
        Curso curso = new Curso();
        curso.setIdCurso(idCurso);

        //RECUPERAMOS EL OBJETO DE LA SESION
        HttpSession sesion = req.getSession();
        Asignacion asignacion = (Asignacion) sesion.getAttribute("asignacion");

        asignacion.setAlumno(alumno);
        asignacion.setCurso(curso);
        asignacion.setTurno(turno);

        ServicioAsignaciones servicioAsignaciones = new ServicioAsignaciones();
        servicioAsignaciones.insertarAsignacion(asignacion);

        //REMOVEMOS LA SESION
        sesion.removeAttribute("asignacion");

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
