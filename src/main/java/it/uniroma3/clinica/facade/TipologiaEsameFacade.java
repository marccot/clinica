package it.uniroma3.clinica.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.model.TipologiaEsame;
import it.uniroma3.clinica.dao.TipologiaEsameDao;

@Service
@Transactional
public class TipologiaEsameFacade {
	
	@Autowired
	private TipologiaEsameDao tipologiaDao;

	
	public void saveTipologiaEsame(TipologiaEsame esame){
		tipologiaDao.save(esame);
	}
	
	public List<TipologiaEsame> getAllTipologiaEsame() {
		return tipologiaDao.findAll();
	}
	
	public TipologiaEsame getTipologiaEsame(Long id) {
		return tipologiaDao.findById(id);
	}
}
