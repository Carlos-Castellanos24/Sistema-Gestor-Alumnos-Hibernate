package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.ComentarioDAO;
import mx.com.gm.domain.Comentario;

public class ServicioComentarios {

    private ComentarioDAO comentarioDAO;
    
    public ServicioComentarios(){
    
        this.comentarioDAO = new ComentarioDAO();
    }
    
    public List<Comentario> listarComentarios(){
        
        return this.comentarioDAO.listar();
    }
    
    public void insertarComentario(Comentario comentario){
    
        if (comentario != null && comentario.getIdComentario()== null) {
            
            comentarioDAO.insertar(comentario);
            
        }else{
            
           comentarioDAO.actualizar(comentario);
        }

    }
    
    public void eliminarComentario(Comentario comentario){
        
        comentarioDAO.eliminar(comentario);
    }
    
    public Comentario encontrarComentario(Comentario comentario){
        
       return comentarioDAO.buscarPorId(comentario);
    }    
}
