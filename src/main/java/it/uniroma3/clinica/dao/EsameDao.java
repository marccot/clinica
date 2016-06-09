package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;

@Repository
public class EsameDao extends Dao<Esame> {

	@Override
	public Esame findById(Long id) {
		return (Esame) em.find(Esame.class, id);
	}

	@Override
	public List<Esame> findAll() {
		TypedQuery<Esame> query = em.createNamedQuery("Esame.findAll", Esame.class);
		List<Esame> list = query.getResultList();
		return list;
	}
	
	
}
