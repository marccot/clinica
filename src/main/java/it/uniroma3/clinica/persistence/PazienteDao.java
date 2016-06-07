package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Paziente;

@Repository
public class PazienteDao extends Dao<Paziente> {

	@Override
	public Paziente findById(Long id) {
		return (Paziente) openSession().get(Paziente.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Paziente> findAll() {
		String hql = "FROM Paziente";
		Query query = openSession().createQuery(hql);
		List<Paziente> list = query.list();
		return list;
	}
	
}
