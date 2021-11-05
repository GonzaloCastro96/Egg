/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import libreria.entidades.editorial;

/**
 *
 * @author Gonzalo
 */
public class editorialDAO implements Serializable {
    
    private final EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA1PU2");
    private EntityManager em= emf.createEntityManager();
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public editorialDAO() {
    }

    public void create(editorial editorial) {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(editorial editorial) throws NonexistentEntityException, Exception {
        try {
            em.getTransaction().begin();
            editorial = em.merge(editorial);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = editorial.getId();
                if (findeditorial(id) == null) {
                    throw new NonexistentEntityException("The editorial with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        try {
            em.getTransaction().begin();
            editorial editorial;
            try {
                editorial = em.getReference(editorial.class, id);
                editorial.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The editorial with id " + id + " no longer exists.", enfe);
            }
            em.remove(editorial);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<editorial> findeditorialEntities() {
        return findeditorialEntities(true, -1, -1);
    }

    public List<editorial> findeditorialEntities(int maxResults, int firstResult) {
        return findeditorialEntities(false, maxResults, firstResult);
    }

    private List<editorial> findeditorialEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(editorial.class));
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

    public editorial findeditorial(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(editorial.class, id);
        } finally {
            em.close();
        }
    }

    public int geteditorialCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<editorial> rt = cq.from(editorial.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
