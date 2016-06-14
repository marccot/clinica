package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.PrerequisitoFacade;
import it.uniroma3.clinica.model.Prerequisito;
import it.uniroma3.clinica.model.TipologiaEsame;

@Controller
public class InserimentoPrerequisitoController {
	
	@Autowired
	private PrerequisitoFacade pFacade;
	
	@RequestMapping(value="/inserisciPrerequisito", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		model.addAttribute("prerequisito", new Prerequisito());
		return "inserisciPrerequisito";
	}
	@RequestMapping(value="/addPrerequisito", method = RequestMethod.POST)
	public String aggiungiPrerequisito(@ModelAttribute Prerequisito prerequisito ,ModelMap model){
		model.addAttribute("esame", new TipologiaEsame());
		pFacade.savePrerequisito(prerequisito);
		model.addAttribute("prerequisitiEsistenti", pFacade.getPrerequisiti());
		model.addAttribute("messaggioSuccesso", "prerequisito inserito correttamente");
		return "amministrazione/inserisciTipologiaEsame";
	}
}
