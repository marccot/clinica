package it.uniroma3.clinica.facade;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.dao.EsameDao;
import it.uniroma3.clinica.model.Esame;

@Service
@Transactional
public class EsameFacade {
	
	@Autowired
	private EsameDao esameDao;
	
	public List<Esame> getPazienti(){
		List<Esame> esame = esameDao.findAll();
		return esame;
	}
	
	public Esame getEsame(long id) {
		Esame esame = esameDao.findById(id);
		return esame;
	}
	
	public void saveEsame(Esame esame){
		esameDao.save(esame);
	}


}