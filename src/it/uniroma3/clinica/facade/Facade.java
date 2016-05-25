package it.uniroma3.clinica.facade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.clinica.entity.Medico;
import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.entity.Utente;
import it.uniroma3.clinica.persistence.MedicoDao;
import it.uniroma3.clinica.persistence.PazienteDao;
import it.uniroma3.clinica.persistence.UtenteDao;

public class Facade {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public Facade() {
		this.emf = Persistence.createEntityManagerFactory("clinica-unit");
		this.em = emf.createEntityManager();
	}
	
	public Utente getUtente(String username) {
		UtenteDao uDao = new UtenteDao(this.em);
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Utente utente = uDao.findByUsername(username);
		tx.commit();
		return utente;
	}
	
	public void saveUtente(Utente utente) {
		UtenteDao uDao = new UtenteDao(this.em);
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		uDao.save(utente);
		tx.commit();

	}
	
	public void savePaziente(Paziente paziente){
		PazienteDao pdao = new PazienteDao(this.em);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		pdao.save(paziente);
		tx.commit();
	}
	
	public void saveMedico(Medico medico){
		MedicoDao mDao = new MedicoDao(this.em);
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		mDao.save(medico);
		tx.commit();
	}
	
	public void closeEm() {
		this.em.close();
	}
	
}