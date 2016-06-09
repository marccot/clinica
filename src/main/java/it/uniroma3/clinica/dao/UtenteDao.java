package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

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
