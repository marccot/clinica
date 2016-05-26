package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import it.uniroma3.clinica.entity.Medico;
import it.uniroma3.clinica.entity.Prerequisito;

public class MedicoDao extends Dao<Medico>{
	
	public MedicoDao(EntityManager em){
		super(em);
	}
	
	@Override
	public Medico findById(Long id){

		Medico medico = this.em.find(Medico.class, id);
		return medico;
	}
	
	@Override
	public List<Medico> findAll(){
		TypedQuery<Medico> query = em.createNamedQuery("Medico.findAll", Medico.class);
		List<Medico> list = query.getResultList();
		return list;
	}
}
