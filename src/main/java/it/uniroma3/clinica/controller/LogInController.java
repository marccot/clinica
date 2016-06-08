package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.UtenteFacade;

@Controller
public class LogInController {
	
	@Autowired
	private UtenteFacade uFacade;

	@RequestMapping(value = "/checkLogIn", method = RequestMethod.POST)
	public String effettuaLogIn(ModelMap model) {
		return "";		
	}
	
	@RequestMapping(value = "/pageLogIn", method = RequestMethod.GET)
	public String pageLogIn(ModelMap model) {
		return "login";		
	}
}
