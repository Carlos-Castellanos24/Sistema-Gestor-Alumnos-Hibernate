
package mx.com.gm.curso;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Curso;
import mx.com.gm.servicio.ServicioCursos;

@WebServlet("/ServletAgregarCurso")
public class ServletAgregarCurso extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {      
        
        String nombre = req.getParameter("nombre");
        String precioString = req.getParameter("precio");
        String descripcion = req.getParameter("descripcion");
        
        Double precio = Double.parseDouble(precioString);
        
        Curso curso = new Curso();
        curso.setNombre(nombre);
        curso.setPrecio(precio);
        curso.setDescripcion(descripcion);
        
        ServicioCursos servicioCursos = new ServicioCursos();
        servicioCursos.insertarCurso(curso);

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
