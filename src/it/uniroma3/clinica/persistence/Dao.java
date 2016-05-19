package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public abstract class Dao<T> {
	public EntityManagerFactory emf;

	public Dao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public void save(T entity) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(entity);
		tx.commit();
		em.close();
	}

	public void update(T entity) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(entity);
		tx.commit();
		em.close();
	}

	public void delete(T entity) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T toRemove = em.merge(entity);
		em.remove(toRemove);
		tx.commit();
		em.close();
	}

	public abstract T findById(Long id);

	public abstract List<T> findAll();

}