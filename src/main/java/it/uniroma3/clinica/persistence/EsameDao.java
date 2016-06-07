package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;

@Repository
public class EsameDao extends Dao<Esame> {

	@Override
	public Esame findById(Long id) {
		return (Esame) openSession().get(Esame.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Esame> findAll() {
		String hql = "FROM Esame";
		Query query = openSession().createQuery(hql);
		List<Esame> list = query.list();
		return list;
	}
	
	
}
