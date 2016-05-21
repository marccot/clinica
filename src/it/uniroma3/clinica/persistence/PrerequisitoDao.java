package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.entity.Prerequisito;

public class PrerequisitoDao extends Dao<Prerequisito> {

	public PrerequisitoDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prerequisito findById(Long id) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Prerequisito p = em.find(Prerequisito.class, id);
		tx.commit();
		em.close();
		return p;
	}

	@Override
	public List<Prerequisito> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
