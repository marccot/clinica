package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.entity.TipologiaEsame;

public class TipologiaEsameDao extends Dao<TipologiaEsame> {

	public TipologiaEsameDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TipologiaEsame findById(Long id) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TipologiaEsame t = em.find(TipologiaEsame.class, id);
		tx.commit();
		em.close();
		return t;
	}

	@Override
	public List<TipologiaEsame> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
