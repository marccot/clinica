package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Esame;

public class EsameDao extends Dao<Esame> {

	public EsameDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Esame findById(Long id) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Esame e = em.find(Esame.class, id);
		tx.commit();
		em.close();
		return e;
	}

	@Override
	public List<Esame> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
