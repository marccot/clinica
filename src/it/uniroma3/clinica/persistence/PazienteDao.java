package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import it.uniroma3.clinica.entity.Esame;
import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.entity.Prerequisito;

public class PazienteDao extends Dao<Paziente> {
	
	public PazienteDao(EntityManager em){
		super(em);
	}

	@Override
	public Paziente findById(Long id) {
		Paziente p = em.find(Paziente.class, id);
		return p;
	}

	@Override
	public List<Paziente> findAll() {
		TypedQuery<Paziente> query = em.createNamedQuery("Paziente.findAll", Paziente.class);
		List<Paziente> list = query.getResultList();
		return list;
	}

}
