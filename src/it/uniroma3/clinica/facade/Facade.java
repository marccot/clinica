package it.uniroma3.clinica.facade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.clinica.entity.Utente;
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
	
	public void closeEm() {
		this.em.close();
	}
	
}
