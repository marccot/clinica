package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Risultato;

@Repository
public class RisultatoDao extends Dao<Risultato> {

	@Override
	public Risultato findById(Long id) {
		return em.find(Risultato.class, id);
		}

	@Override
	public List<Risultato> findAll() {
		TypedQuery<Risultato> query = em.createNamedQuery("Risultato.findAll", Risultato.class);
		List<Risultato> list = query.getResultList();
		return list;
	}

}
