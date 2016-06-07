package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;

@Repository
public class MedicoDao extends Dao<Medico>{

	@Override
	public Medico findById(Long id) {
		return (Medico) openSession().get(Medico.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Medico> findAll() {
		String hql = "FROM Medico";
		Query query = openSession().createQuery(hql);
		List<Medico> list = query.list();
		return list;
	}
	
	
}
