package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class Dao<T> {
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Dao() {
	}
	
	protected final Session openSession(){
		Session session = this.sessionFactory.getCurrentSession();
		if(session != null) {
			return session;
		}
		else return this.sessionFactory.openSession();
	}

	public void save(T entity) {
		this.openSession().save(entity);;
	}

	public void update(T entity) {
		this.openSession().merge(entity);
	}

	public void delete(T entity) {
		this.openSession().delete(entity);
	}

	public abstract T findById(Long id);

	public abstract List<T> findAll();

}