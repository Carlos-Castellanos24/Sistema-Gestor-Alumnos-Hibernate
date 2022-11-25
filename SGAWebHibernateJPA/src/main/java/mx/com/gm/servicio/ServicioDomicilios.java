package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.DomicilioDAO;
import mx.com.gm.domain.Domicilio;

public class ServicioDomicilios {
    
    private DomicilioDAO domicilioDAO;
    
    public ServicioDomicilios(){
    
        this.domicilioDAO = new DomicilioDAO();
    }
    
    public List<Domicilio> listarDomicilios(){
        
        return this.domicilioDAO.listar();
    }
    
    public void insertarDomicilio(Domicilio domicilio){
    
        if (domicilio != null && domicilio.getIdDomicilio()== null) {
            
            domicilioDAO.insertar(domicilio);
            
        }else{
            
           domicilioDAO.actualizar(domicilio);
        }

    }
    
    public void eliminarDomicilio(Domicilio domicilio){
        
        domicilioDAO.eliminar(domicilio);
    }
    
    public Domicilio encontrarDomicilio(Domicilio domicilio){
        
       return domicilioDAO.buscarPorId(domicilio);
    }
}
