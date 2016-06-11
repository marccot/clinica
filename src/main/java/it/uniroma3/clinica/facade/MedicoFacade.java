package it.uniroma3.clinica.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.dao.MedicoDao;

@Service
@Transactional
public class MedicoFacade {
		
	@Autowired
	private MedicoDao medicoDao;
	
	public List<Medico> getMedici(){
		List<Medico> medici = medicoDao.findAll();
		return medici;
	}
	
	public Medico getMedico(long id){
		Medico medico = medicoDao.findById(id);
		return medico;
	}
	
	public void saveMedico(Medico medico){
		medicoDao.save(medico);
	}

}
