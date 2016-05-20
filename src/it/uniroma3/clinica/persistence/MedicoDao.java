package it.uniroma3.clinica.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import it.uniroma3.clinica.entity.Medico;

public class MedicoDao extends Dao<Medico>{
	
	public MedicoDao(EntityManagerFactory emf){
		super(emf);
	}
	
	@Override
	public Medico findById(Long id){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Medico medico = em.find(Medico.class, id);
		tx.commit();
		em.close();
		return medico;
	}
	
	@Override
	public List<Medico> findAll(){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Medico> list = em.createQuery("SELECT m FROM Medico m").getResultList(); //trovato su internet. Non so se è la best practice
		return list;
	}
}
