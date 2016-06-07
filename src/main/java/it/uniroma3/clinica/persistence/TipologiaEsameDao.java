package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		return (TipologiaEsame) openSession().get(TipologiaEsame.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipologiaEsame> findAll() {
		String hql = "FROM TipologiaEsame";
		Query query = openSession().createQuery(hql);
		List<TipologiaEsame> list = query.list();
		return list;
	}
	
}
