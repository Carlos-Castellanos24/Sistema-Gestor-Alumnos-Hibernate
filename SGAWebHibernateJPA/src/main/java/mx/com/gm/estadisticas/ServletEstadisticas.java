package mx.com.gm.estadisticas;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.*;
import mx.com.gm.servicio.*;

@WebServlet("/ServletEstadisticas")
public class ServletEstadisticas extends HttpServlet{
       
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        this.estadisticasGenerales(req, resp);
    }
    
    private void estadisticasGenerales(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    
        List<Alumno> alumnos =  new ServicioAlumnos().listarAlumnos();
        List<Asignacion> asignaciones = new ServicioAsignaciones().listarAsignaciones();
        List<Comentario> comentarios = new ServicioComentarios().listarComentarios();
        List<Contacto> contactos = new ServicioContactos().listarContactos();
        List<Curso> cursos = new ServicioCursos().listarCursos();
        List<Domicilio> domicilios = new ServicioDomicilios().listarDomicilios();
        List<Administrador> administradores = new ServicioAdministradores().listarAdministradores();
        
        HttpSession sesion = req.getSession();
        sesion.setAttribute("totalAlumnos", alumnos.size());
        sesion.setAttribute("totalAsignaciones", asignaciones.size());
        sesion.setAttribute("totalComentarios", comentarios.size());
        sesion.setAttribute("totalContactos", contactos.size());
        sesion.setAttribute("totalCursos", cursos.size());
        sesion.setAttribute("totalDomicilios", domicilios.size());
        sesion.setAttribute("totalAdministradores", administradores.size());
        
        req.getRequestDispatcher("/WEB-INF/Estadisticas/estadisticas.jsp").forward(req, resp);
    }   
}
