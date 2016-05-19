package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Paziente;

public class PazienteDao extends Dao<Paziente> {
	
	public PazienteDao(EntityManagerFactory em){
		super(em);
	}

	@Override
	public Paziente findById(Long id) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Paziente p = em.find(Paziente.class, id);
		tx.commit();
		em.close();
		return p;
	}

	@Override
	public List<Paziente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
