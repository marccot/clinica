package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class Dao<T> {
	
	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	protected EntityManager em;

	public Dao() {
	}

	public void save(T entity) {
		this.em.persist(entity);;
	}

	public void update(T entity) {
		this.em.merge(entity);
	}

	public void delete(T entity) {
		this.em.remove(entity);
	}

	public abstract T findById(Long id);

	public abstract List<T> findAll();

}