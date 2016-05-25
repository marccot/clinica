package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public abstract class Dao<T> {
	public EntityManager em;

	public Dao(EntityManager em) {
		this.em = em;
	}

	public void save(T entity) {
		em.persist(entity);;
	}

	public void update(T entity) {
		em.merge(entity);
	}

	public void delete(T entity) {
		T toRemove = em.merge(entity);
		em.remove(toRemove);
	}

	public abstract T findById(Long id);

	public abstract List<T> findAll();

}