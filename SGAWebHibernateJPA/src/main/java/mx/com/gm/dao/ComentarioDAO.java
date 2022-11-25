package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Comentario;

public class ComentarioDAO extends GenericDAO{
    
        public List<Comentario> listar() {

        String consulta = "SELECT a FROM Comentario a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Comentario comentario) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(comentario);
            em.getTransaction().commit();            
        } catch (Exception e) {

            e.printStackTrace(System.out);
            
        }
    }
    
     public void actualizar(Comentario comentario) {

        try {
            
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(comentario);
            em.getTransaction().commit();
            
        } catch (Exception e) {

            e.printStackTrace(System.out);
            
        }
    }
     
    public void eliminar(Comentario comentario) {

        try {
            
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(comentario));
            em.getTransaction().commit();
            
        } catch (Exception e) {

            e.printStackTrace(System.out);
            
        }
    }
    
    public Comentario buscarPorId(Comentario comentario){
        
        em = getEntityManager();
        return em.find(Comentario.class, comentario.getIdComentario());
    }
}
