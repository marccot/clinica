package it.uniroma3.clinica.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import it.uniroma3.clinica.model.Medico;

@Repository
public class MedicoDao extends Dao<Medico>{

	@Override
	public Medico findById(Long id) {
		return (Medico) em.find(Medico.class, id);
	}

	@Override
	public List<Medico> findAll() {
		TypedQuery<Medico> query = em.createNamedQuery("Medico.findAll", Medico.class);
		List<Medico> list = query.getResultList();
		return list;
	}


}
