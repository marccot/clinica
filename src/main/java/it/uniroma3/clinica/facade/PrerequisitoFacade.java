package it.uniroma3.clinica.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.clinica.dao.PrerequisitoDao;
import it.uniroma3.clinica.model.Prerequisito;

@Service
@Transactional
public class PrerequisitoFacade {
	@Autowired
	private PrerequisitoDao prerequisitoDao;
	
	public List<Prerequisito> getPrerequisiti(){
		List<Prerequisito> prerequisiti = prerequisitoDao.findAll();
		return prerequisiti;
	}
	public void aggiornaPrerequisito(Prerequisito p){
		prerequisitoDao.update(p);
	}
	public Prerequisito getPrerequisito(long id) {
		Prerequisito prerequisito = prerequisitoDao.findById(id);
		return prerequisito;
	}
	
	public void savePrerequisito(Prerequisito prerequisito){
		prerequisitoDao.save(prerequisito);
	}
}
