package mx.com.gm.servicio;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import mx.com.gm.dao.AdministradorDAO;
import mx.com.gm.domain.Administrador;


public class ServicioAdministradores {
    
    private AdministradorDAO administradorDAO;
    
    public ServicioAdministradores(){
        
        this.administradorDAO = new AdministradorDAO();
    }
    
    public List<Administrador> listarAdministradores(){
        
        return this.administradorDAO.listar();
    }
    
    public void insertarAdministrador(Administrador administrador){
    
        if (administrador != null && administrador.getIdAdministrador() == null){
            
            administradorDAO.insertar(administrador);
            
        }else{
            
           administradorDAO.actualizar(administrador);
        }

    }
    
    public void eliminarAdministrador(Administrador administrador){
        
        administradorDAO.eliminar(administrador);
    }
    
    public Administrador encontrarAdministrador(Administrador administrador){
        
       return administradorDAO.buscarPorId(administrador);
    }
    
    public boolean validarLogin(String correo, String password) throws NoSuchAlgorithmException{
        
        return administradorDAO.validarLogin(correo, password);
    }
}
