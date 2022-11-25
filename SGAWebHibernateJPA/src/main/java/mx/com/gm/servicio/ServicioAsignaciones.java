package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.AsignacionDAO;
import mx.com.gm.domain.Asignacion;


public class ServicioAsignaciones {
    
    private AsignacionDAO asignacionDAO;
    
    public ServicioAsignaciones(){
    
        this.asignacionDAO = new AsignacionDAO();
    }
    
    public List<Asignacion> listarAsignaciones(){
        
        return this.asignacionDAO.listar();
    }
    
    public void insertarAsignacion(Asignacion asignacion){
    
        if (asignacion != null && asignacion.getIdAsignacion()== null) {
            
            asignacionDAO.insertar(asignacion);
            
        }else{
            
           asignacionDAO.actualizar(asignacion);
        }

    }
    
    public void eliminarAsignacion(Asignacion asignacion){
        
        asignacionDAO.eliminar(asignacion);
    }
    
    public Asignacion encontrarAsignacion(Asignacion asignacion){
        
       return asignacionDAO.buscarPorId(asignacion);
    }
}
