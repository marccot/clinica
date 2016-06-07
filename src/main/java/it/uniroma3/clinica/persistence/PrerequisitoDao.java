package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.Prerequisito;
import it.uniroma3.clinica.model.TipologiaEsame;

@Repository
public class PrerequisitoDao extends Dao<Prerequisito> {

	@Override
	public Prerequisito findById(Long id) {
		return (Prerequisito) openSession().get(Paziente.class, id);
	}

	@Override
	public List<Prerequisito> findAll() {
		String hql = "FROM Prerequisito";
		Query query = openSession().createQuery(hql);
		List<Prerequisito> list = query.list();
		return list;
	}


}
