package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import it.uniroma3.clinica.entity.Utente;

public class UtenteDao extends Dao<Utente> {

	public UtenteDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Utente findById(Long id) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Utente u = em.find(Utente.class, id);
		tx.commit();
		em.close();
		return u;
	}
	
	public Utente findByUsername(String username) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		tx.begin();
		Criteria criteria = openSession.createCriteria(Utente.class);
		Utente u = (Utente) criteria.add(Restrictions.eq("username", username)).uniqueResult();
		tx.commit();
		em.close();
		return u;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
