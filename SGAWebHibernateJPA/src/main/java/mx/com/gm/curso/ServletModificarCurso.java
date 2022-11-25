package mx.com.gm.curso;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Curso;
import mx.com.gm.servicio.ServicioCursos;

@WebServlet("/ServletModificarCurso")
public class ServletModificarCurso extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idCursoString = req.getParameter("idCurso");
        Integer idCurso = Integer.parseInt(idCursoString);

        Curso curso = new Curso();
        curso.setIdCurso(idCurso);

        ServicioCursos servicioCursos = new ServicioCursos();
        curso = servicioCursos.encontrarCurso(curso);

        //CREAMOS UNA SESION PARA QUE LOS DATOS NO SE PIERDAN
        HttpSession sesion = req.getSession();
        sesion.setAttribute("curso", curso);

        req.getRequestDispatcher("/WEB-INF/Curso/modificarCurso.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombre = req.getParameter("nombre");
        String precioString = req.getParameter("precio");
        String descripcion = req. getParameter("descripcion");

        Double precio = Double.parseDouble(precioString);

        //RECUPERAMOS EL OBJETO DE LA SESION
        HttpSession sesion = req.getSession();
        Curso curso = (Curso) sesion.getAttribute("curso");

        curso.setNombre(nombre);
        curso.setPrecio(precio);
        curso.setDescripcion(descripcion);

        ServicioCursos ServicioCursos = new ServicioCursos();
        ServicioCursos.insertarCurso(curso);

        //REMOVEMOS LA SESION
        sesion.removeAttribute("curso");

        req.getRequestDispatcher("/WEB-INF/Administracion/indexAdministracion.jsp").forward(req, resp);
    }
}
