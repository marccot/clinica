package it.uniroma3.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogController {
	
	@RequestMapping(value="/amministrazione**", method=RequestMethod.GET)
	public String logAdmin(){
		return "amministrazione/homeAdmin";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String LogInPage(ModelMap model) {
		return "login";
	}

}
