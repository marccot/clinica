package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
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
		return (Utente) openSession().get(Utente.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Utente> findAll() {
		String hql = "FROM Utente";
		Query query = openSession().createQuery(hql);
		List<Utente> list = query.list();
		return list;
	}


}
