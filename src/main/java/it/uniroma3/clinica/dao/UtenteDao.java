package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Utente;

@Repository
public class UtenteDao extends Dao<Utente> {

	@Override
	public Utente findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utente> findAll() {
		TypedQuery<Utente> query = em.createNamedQuery("Utente.findAll", Utente.class);
		List<Utente> list = query.getResultList();
		return list;

	}
	
	public Utente findByUsername(String username) {
		return em.find(Utente.class, username);
	}
	public Utente findByName(String nome){
		TypedQuery<Utente> query = em.createNamedQuery("Utente.findByName", Utente.class).setParameter("username", nome);
		Utente u = query.getSingleResult();
		return u;
	}
}
