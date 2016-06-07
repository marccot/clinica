package it.uniroma3.clinica.facade;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.clinica.persistence.UtenteDao;
import it.uniroma3.clinica.model.Utente;

@Service
public class UtenteFacade  {

	@Autowired
	private UtenteDao utenteDao;
	
	@Transactional
	public Utente getUtente(String username) {
//		Utente utente = utenteDao.findByUsername(username);
		Utente utente = null;
		return utente;
	}
	
	@Transactional
	public void saveUtente(Utente utente) {
		utenteDao.save(utente);

	}

}