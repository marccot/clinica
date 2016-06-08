package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
//import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.model.Utente;

@Repository
public class UtenteDao extends Dao<Utente> {

	@Override
	public Utente findById(Long id) {
		return (Utente) em.find(Utente.class, id);
	}

	@Override
	public List<Utente> findAll() {
		TypedQuery<Utente> query = em.createNamedQuery("Utente.findAll", Utente.class);
		List<Utente> list = query.getResultList();
		return list;
	}


}
