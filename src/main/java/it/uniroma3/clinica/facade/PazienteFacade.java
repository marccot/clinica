package it.uniroma3.clinica.facade;

import java.util.List;

import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.dao.PazienteDao;

@Service
@Transactional
public class PazienteFacade {
	
	@Autowired
	private PazienteDao pazienteDao;
	
	public List<Paziente> getPazienti(){
		List<Paziente> pazienti = pazienteDao.findAll();
		return pazienti;
	}
	
	public Paziente getPaziente(long id) {
		Paziente paziente = pazienteDao.findById(id);
		return paziente;
	}
	
	public void savePaziente(Paziente paziente){
		pazienteDao.save(paziente);
	}

}
