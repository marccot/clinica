package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import it.uniroma3.clinica.entity.Esame;
import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.entity.TipologiaEsame;

public class TipologiaEsameDao extends Dao<TipologiaEsame> {

	public TipologiaEsameDao(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TipologiaEsame findById(Long id) {

		TipologiaEsame t = em.find(TipologiaEsame.class, id);
		return t;
	}

	@Override
	public List<TipologiaEsame> findAll() {
		TypedQuery<TipologiaEsame> query = em.createNamedQuery("TipologiaEsame.findAll", TipologiaEsame.class);
		List<TipologiaEsame> list = query.getResultList();
		return list;
	}

}
