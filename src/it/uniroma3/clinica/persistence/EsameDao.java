package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Esame;

public class EsameDao extends Dao<Esame> {

	public EsameDao(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Esame findById(Long id) {
		Esame e = em.find(Esame.class, id);
		return e;
	}

	@Override
	public List<Esame> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
