package it.uniroma3.clinica.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.model.TipologiaEsame;
import it.uniroma3.clinica.persistence.TipologiaEsameDao;

@Service
@Transactional
public class TipologiaEsameFacade {
	
	@Autowired
	private TipologiaEsameDao tipologiaDao;

	
	public void saveTipologiaEsame(TipologiaEsame esame){
		tipologiaDao.save(esame);
	}
}
