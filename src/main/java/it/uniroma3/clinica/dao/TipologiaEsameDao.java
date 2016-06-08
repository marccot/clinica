package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.TipologiaEsame;

@Repository 
public class TipologiaEsameDao extends Dao<TipologiaEsame> {

	@Override
	public TipologiaEsame findById(Long id) {
		return (TipologiaEsame) em.find(TipologiaEsame.class, id);
	}

	@Override
	public List<TipologiaEsame> findAll() {
		TypedQuery<TipologiaEsame> query = em.createNamedQuery("TipologiaEsame.findAll", TipologiaEsame.class);
		List<TipologiaEsame> list = query.getResultList();
		return list;
	}
	
}