
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import libreria.entidades.autor;

public class autorDAO implements Serializable {

    private final EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA1PU2");
    private final EntityManager em= emf.createEntityManager();
    
    public autorDAO() {  
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(autor autor) {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editar(autor autor) throws NonexistentEntityException, Exception {
        try {
            em.getTransaction().begin();
            autor = em.merge(autor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = autor.getId();
                if (buscarautorporid(id) == null) {
                    throw new NonexistentEntityException("The autor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(String id) throws NonexistentEntityException {
        try {
            em.getTransaction().begin();
            autor autor;
            try {
                autor = em.getReference(autor.class, id);
                autor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El autor con la id, " + id + "no existe.", enfe);
            }
            em.remove(autor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<autor> findautorEntities() {
        return buscarautor(true, -1, -1);
    }

    public List<autor> findautorEntities(int maxResults, int firstResult) {
        return buscarautor(false, maxResults, firstResult);
    }

    private List<autor> buscarautor(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(autor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public autor buscarautorporid(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(autor.class, id);
        } finally {
            em.close();
        }
    }

    public int getautorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<autor> rt = cq.from(autor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
