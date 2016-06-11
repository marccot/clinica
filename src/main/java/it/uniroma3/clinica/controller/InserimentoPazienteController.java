package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.clinica.facade.PazienteFacade;
import it.uniroma3.clinica.model.Paziente;

@Controller
public class InserimentoPazienteController extends WebMvcConfigurerAdapter {
	
	@Autowired
	PazienteFacade facade;
	
	@Autowired
	@Qualifier("pazienteValidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/inserisciPaziente", method = RequestMethod.POST)
	public String inserisciPaziente(@ModelAttribute("paziente") @Validated Paziente paziente, BindingResult bindingResult, ModelMap model) {
		if (bindingResult.hasErrors()) 
			return "inserisciPaziente";
		facade.savePaziente(paziente);
		return "pazienteInserito";
	}
	
	@RequestMapping(value="/nuovoPaziente", method = RequestMethod.GET)
	public String nuovoPazienteRedirect(ModelMap model) {
		model.addAttribute("paziente", new Paziente());
		return "inserisciPaziente";
	}

}
