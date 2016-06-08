package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.model.Paziente;

@Repository
public class PazienteDao extends Dao<Paziente> {

	@Override
	public Paziente findById(Long id) {
		return (Paziente) em.find(Paziente.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Paziente> findAll() {
		TypedQuery<Paziente> query = em.createNamedQuery("Paziente.findAll", Paziente.class);
		List<Paziente> list = query.getResultList();
		return list;
	}
	
}
