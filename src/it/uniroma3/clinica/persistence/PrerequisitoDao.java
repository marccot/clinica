package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Esame;
import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.entity.Prerequisito;

public class PrerequisitoDao extends Dao<Prerequisito> {

	public PrerequisitoDao(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prerequisito findById(Long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Prerequisito p = em.find(Prerequisito.class, id);
		tx.commit();
		em.close();
		return p;
	}

	@Override
	public List<Prerequisito> findAll() {
		List<Prerequisito> list = em.createQuery("SELECT p FROM Prerequisito p").getResultList();
		return list;
	}

}
