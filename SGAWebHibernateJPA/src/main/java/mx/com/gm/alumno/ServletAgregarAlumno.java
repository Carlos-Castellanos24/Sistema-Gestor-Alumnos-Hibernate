package mx.com.gm.alumno;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.*;
import mx.com.gm.servicio.ServicioAlumnos;

@WebServlet("/ServletAgregarAlumno")
public class ServletAgregarAlumno extends HttpServlet{
    
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
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNumeroCalle(numeroCalle);
        domicilio.setPais(pais);
                
        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setGrado(grado);
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        ServicioAlumnos servicioAlumnos = new ServicioAlumnos();
        servicioAlumnos.insertarAlumno(alumno);
        
        
        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
