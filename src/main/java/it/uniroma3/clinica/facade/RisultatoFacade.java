package it.uniroma3.clinica.facade;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.dao.RisultatoDao;
import it.uniroma3.clinica.model.Risultato;

@Service
@Transactional
public class RisultatoFacade {
	
	@Autowired
	private RisultatoDao RisultatoDao;
	
	public List<Risultato> getRisultati(){
		List<Risultato> Risultato = RisultatoDao.findAll();
		return Risultato;
	}
	
	public Risultato getRisultato(long id) {
		Risultato Risultato = RisultatoDao.findById(id);
		return Risultato;
	}
	
	public void saveRisultato(Risultato Risultato){
		RisultatoDao.save(Risultato);
	}


}
