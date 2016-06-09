package it.uniroma3.clinica.facade;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.clinica.dao.UtenteDao;
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