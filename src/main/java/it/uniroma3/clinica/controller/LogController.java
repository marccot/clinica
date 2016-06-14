package it.uniroma3.clinica.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
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
	
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logOut(HttpServletRequest request, HttpServletResponse response){
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    if (auth != null){    
		        new SecurityContextLogoutHandler().logout(request, response, auth);
		    }
//		HttpSession session = request.getSession();
//		if(session!=null)
//			session.invalidate();
		return "areaAmministrazione";
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
