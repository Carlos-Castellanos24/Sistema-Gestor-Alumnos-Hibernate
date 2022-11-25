package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.CursoDAO;
import mx.com.gm.domain.Curso;


public class ServicioCursos {
    
    private CursoDAO cursoDAO;
    
    public ServicioCursos(){
    
        this.cursoDAO = new CursoDAO();
    }
    
    public List<Curso> listarCursos(){
        
        return this.cursoDAO.listar();
    }
    
    public void insertarCurso(Curso curso){
    
        if (curso != null && curso.getIdCurso()== null) {
            
            cursoDAO.insertar(curso);
            
        }else{
            
           cursoDAO.actualizar(curso);
        }

    }
    
    public void eliminarCurso(Curso curso){
        
        cursoDAO.eliminar(curso);
    }
    
    public Curso encontrarCurso(Curso curso){
        
       return cursoDAO.buscarPorId(curso);
    }
}
