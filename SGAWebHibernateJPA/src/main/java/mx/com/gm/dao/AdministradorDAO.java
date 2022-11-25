package mx.com.gm.dao;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Administrador;
import mx.com.gm.helper.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdministradorDAO extends GenericDAO {

    public List<Administrador> listar() {

        String consulta = "SELECT a FROM Administrador a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Administrador administrador) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(administrador);
            em.getTransaction().commit();
        } catch (Exception e) {

            e.printStackTrace(System.out);

        }
    }

    public void actualizar(Administrador administrador) {

        try {

            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(administrador);
            em.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace(System.out);

        }
    }

    public void eliminar(Administrador administrador) {

        try {

            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(administrador));
            em.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace(System.out);
        }
    }

    public Administrador buscarPorId(Administrador administrador) {

        em = getEntityManager();
        return em.find(Administrador.class, administrador.getIdAdministrador());
    }

    public boolean validarLogin(String nombre, String password) throws NoSuchAlgorithmException{

        Transaction transaction = null;
        Administrador administrador = null;
        String passwordE = Md5.getMd5(password);

        try ( Session sesion = HibernateUtil.getSessionFactory().openSession()) {

            transaction = sesion.beginTransaction();
            administrador = (Administrador) sesion.createQuery("FROM Administrador a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();

            if (administrador != null && administrador.getPassword().equals(passwordE)) {

                return true;
            }

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {

                transaction.rollback();

            }
            e.printStackTrace(System.out);
        }

        return false;
    }    
}
