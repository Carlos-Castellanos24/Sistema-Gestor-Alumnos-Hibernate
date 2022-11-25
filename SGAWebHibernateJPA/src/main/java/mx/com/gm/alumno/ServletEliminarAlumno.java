package mx.com.gm.alumno;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Alumno;
import mx.com.gm.servicio.ServicioAlumnos;

@WebServlet("/ServletEliminarAlumno")
public class ServletEliminarAlumno extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idAlumnoString = req.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoString);   
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);     
        
        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();
        alumno = servicioAlumnos.encontrarAlumno(alumno);

        HttpSession sesion = req.getSession();
        sesion.setAttribute("alumno", alumno);        

        req.getRequestDispatcher("/WEB-INF/Alumno/eliminarAlumno.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String grado = req.getParameter("grado");
        //CAMPOS DE DOMICILIO
        String calle = req.getParameter("calle");
        String numeroCalle = req.getParameter("numeroCalle");
        String pais = req.getParameter("pais");
        //CAMPOS DE CONTACTO
        String email = req.getParameter("email");
        String telefono = req.getParameter("telefono");

        //RECUPERAMOS EL OBJETO DE LA SESION
        HttpSession sesion = req.getSession();
        Alumno alumno = (Alumno) sesion.getAttribute("alumno");        

        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setGrado(grado);
        alumno.getDomicilio().setCalle(calle);
        alumno.getDomicilio().setNumeroCalle(numeroCalle);
        alumno.getDomicilio().setPais(pais);
        alumno.getContacto().setEmail(email);
        alumno.getContacto().setTelefono(telefono);

        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();
        servicioAlumnos.eliminarAlumno(alumno);      
        
        //REMOVEMOS LAS SESIONES
        sesion.removeAttribute("alumno");

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
