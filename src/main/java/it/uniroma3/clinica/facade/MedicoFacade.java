package it.uniroma3.clinica.facade;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.dao.MedicoDao;

@Service
public class MedicoFacade {
		
	@Autowired
	private MedicoDao medicoDao;
	
	@Transactional
	public List<Medico> getMedici(){
		List<Medico> medici = medicoDao.findAll();
		return medici;
	}
	
	@Transactional
	public Medico getMedico(long id){
		Medico medico = medicoDao.findById(id);
		return medico;
	}
	
	@Transactional
	public void saveMedico(Medico medico){
		medicoDao.save(medico);
	}

}
