package it.uniroma3.clinica.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.dao.UtenteDao;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.Utente;

@Transactional
@Service
public class UtenteFacade {
	
	@Autowired
	private UtenteDao utenteDao;
	
	public void save(Utente utente) {
		utenteDao.save(utente);
	}
	public Utente findByName(String name){
		return utenteDao.findByName(name);
	}
}
