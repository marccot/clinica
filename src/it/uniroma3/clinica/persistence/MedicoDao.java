package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Medico;

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
		List<Medico> list = (List<Medico>) em.createQuery("SELECT m FROM Medico m").getResultList(); 
		return list;
	}
}
