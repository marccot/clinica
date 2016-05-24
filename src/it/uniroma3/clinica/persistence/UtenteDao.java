package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
//import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Restrictions;

import it.uniroma3.clinica.entity.Utente;

public class UtenteDao extends Dao<Utente> {

	public UtenteDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Utente findById(Long id) {
		return null;
	}
	
	public Utente findByUsername(String username) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Utente u = em.find(Utente.class, username);
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
