package it.uniroma3.clinica.facade;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.TipologiaEsame;
import it.uniroma3.clinica.model.Utente;
import it.uniroma3.clinica.persistence.EsameDao;
import it.uniroma3.clinica.persistence.MedicoDao;
import it.uniroma3.clinica.persistence.PazienteDao;
import it.uniroma3.clinica.persistence.TipologiaEsameDao;
import it.uniroma3.clinica.persistence.UtenteDao;

public class Facade {
//	
//	private EntityManagerFactory emf;
//	private EntityManager em;
//	
//	public Facade() {
//
//	}
//	
//	public Utente getUtente(String username) {
//		UtenteDao uDao = new UtenteDao();
//		EntityTransaction tx = this.em.getTransaction();
//		tx.begin();
////		Utente utente = uDao.findByUsername(username);
//		Utente utente = null;
//		tx.commit();
//		return utente;
//	}
//	
//	public void saveUtente(Utente utente) {
//		UtenteDao uDao = new UtenteDao();
//		EntityTransaction tx = this.em.getTransaction();
//		tx.begin();
//		uDao.save(utente);
//		tx.commit();
//
//	}
//	
//	public void savePaziente(Paziente paziente){
//		PazienteDao pdao = new PazienteDao();
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		pdao.save(paziente);
//		tx.commit();
//	}
//	
//	public void saveTipoEsame(TipologiaEsame esame){
//		TipologiaEsameDao edao = new TipologiaEsameDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		edao.save(esame);
//		t.commit();
//	}
//	
//	public void savePrenotazione(Esame prenotazione){
//		EsameDao edao = new EsameDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		edao.save(prenotazione);
//		t.commit();
//	}
//	
//	public List<TipologiaEsame> getTipologieEsami(){
//		TipologiaEsameDao edao = new TipologiaEsameDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		List<TipologiaEsame> tlist = edao.findAll();
//		t.commit();
//		return tlist;
//
//	}
//	
//	public List<Medico> getMedici(){
//		MedicoDao mdao = new MedicoDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		List<Medico> medici = mdao.findAll();
//		t.commit();
//		return medici;
//	}
//	public List<Esame> getEsami(){
//		EsameDao edao = new EsameDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		List<Esame> esami = edao.findAll();
//		t.commit();
//		return esami;
//	}
//	public Medico getMedico(long id){
//		MedicoDao mdao = new MedicoDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		Medico medico = mdao.findById(id);
//		t.commit();
//		return medico;
//	}
//	
//	public TipologiaEsame getTipologiaEsame(long id){
//		TipologiaEsameDao tdao = new TipologiaEsameDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		TipologiaEsame tipo = tdao.findById(id);
//		t.commit();
//		return tipo;
//	}
//	
//	public Paziente getPaziente(long id){
//		PazienteDao pdao = new PazienteDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		Paziente paziente = pdao.findById(id);
//		t.commit();
//		return paziente;
//	}
//	
//	public List<Paziente> getPazienti(){
//		PazienteDao pdao = new PazienteDao();
//		EntityTransaction t = em.getTransaction();
//		t.begin();
//		List<Paziente> pazienti = pdao.findAll();
//		t.commit();
//		return pazienti;
//	}
//	
//	public void saveMedico(Medico medico){
//		MedicoDao mDao = new MedicoDao();
//		EntityTransaction tx = this.em.getTransaction();
//		tx.begin();
//		mDao.save(medico);
//		tx.commit();
//	}
//	
//	public void closeEm() {
//		this.em.close();
//	}
	
}
