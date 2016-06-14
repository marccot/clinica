package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.UtenteFacade;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.Utente;

@Controller
public class LogController {
	
	@Autowired
	UtenteFacade utenteFacade;
	
	@RequestMapping(value="/amministrazione**", method=RequestMethod.GET)
	public String logAdmin(){
		return "amministrazione/homeAdmin";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String LogInPage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value ="iniziaRegistrazione")
	public String formRegistrazione(ModelMap model) {
		model.addAttribute("utente", new Utente());
		model.addAttribute("paziente",new Paziente());
		return "signup";
	}
	
	@RequestMapping(value= "creaUtente")
	public String effettuaRegistrazione(@ModelAttribute("utente") Utente utente, @ModelAttribute("paziente") Paziente paziente, ModelMap model) {
		utente.setRole("ROLE_USER");
		utente.setPaziente(paziente);
		utenteFacade.save(utente);
		model.addAttribute("utente", utente);
		return "ciaoProva";
	}

}
