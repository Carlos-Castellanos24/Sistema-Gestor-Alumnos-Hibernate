package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.ContactoDAO;
import mx.com.gm.domain.Contacto;

public class ServicioContactos {
    
    private ContactoDAO contactoDAO;
    
    public ServicioContactos(){
    
        this.contactoDAO = new ContactoDAO();
    }
    
    public List<Contacto> listarContactos(){
        
        return this.contactoDAO.listar();
    }
    
    public void insertarContacto(Contacto contacto){
    
        if (contacto != null && contacto.getIdContacto()== null) {
            
            contactoDAO.insertar(contacto);
            
        }else{
            
           contactoDAO.actualizar(contacto);
        }

    }
    
    public void eliminarContacto(Contacto contacto){
        
        contactoDAO.eliminar(contacto);
    }
    
    public Contacto encontrarContacto(Contacto contacto){
        
       return contactoDAO.buscarPorId(contacto);
    }
}
