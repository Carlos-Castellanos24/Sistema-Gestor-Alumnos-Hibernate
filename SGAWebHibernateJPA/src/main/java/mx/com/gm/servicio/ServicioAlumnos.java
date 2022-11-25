package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.domain.Alumno;

public class ServicioAlumnos {
    
    private AlumnoDAO alumnoDAO;
    
    public ServicioAlumnos(){
        
        this.alumnoDAO = new AlumnoDAO();
    }
    
    public List<Alumno> listarAlumnos(){
        
        return this.alumnoDAO.listar();
    }
    
    public void insertarAlumno(Alumno alumno){
    
        if (alumno != null && alumno.getIdAlumno() == null) {
            
            alumnoDAO.insertar(alumno);
            
        }else{
            
           alumnoDAO.actualizar(alumno);
        }

    }
    
    public void eliminarAlumno(Alumno alumno){
        
        alumnoDAO.eliminar(alumno);
    }
    
    public Alumno encontrarAlumno(Alumno alumno){
        
       return alumnoDAO.buscarPorId(alumno);
    }
}
