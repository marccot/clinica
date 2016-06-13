package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.clinica.facade.MedicoFacade;
import it.uniroma3.clinica.model.Medico;

@Controller
public class MedicoController extends WebMvcConfigurerAdapter{
	@Autowired
	MedicoFacade medicoFacade;
	
	@RequestMapping(value="/inserisciMedico", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		model.addAttribute("medico", new Medico());
		return "inserisciMedico";
	}
	
	@RequestMapping(value="/addMedico", method = RequestMethod.POST) 
	public String aggiungiMedico(@ModelAttribute Medico medico, ModelMap model){ 
		medicoFacade.saveMedico(medico);
		return "areaAmministrazione";
	}
	
	@RequestMapping(value="/visualizzaEsamiMedico", method = RequestMethod.GET)
	public String visualizzaEsami(ModelMap model){
		return "riepilogoEsamiMedico";
	}
	@RequestMapping(value="/vediEsamiPerMedici", method = RequestMethod.GET)
	public String vediEsamiPerMedici(ModelMap model){
		model.addAttribute("listaMedici", medicoFacade.getMedici());
		model.addAttribute("medico", new Medico());
		return "riepilogoEsamiAmministrazione";
	}
}
