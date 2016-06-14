package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.EsameFacade;
import it.uniroma3.clinica.facade.UtenteFacade;
import it.uniroma3.clinica.model.Utente;

@Controller
public class AreaPazienteController {
	@Autowired
	private EsameFacade eFacade;
	@Autowired
	private UtenteFacade uFacade;
	
	@RequestMapping(value="/areaPaziente", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username
	      System.out.println("___"+name);
	      if(name.equals("admin")){
	    	  model.addAttribute("messaggioErrore", "Per una questione di privacy l'amministratore "
		    	  		+ "non può entrare nell'area dei pazienti");
	    	  return "home";
	      }
	      if(name.equals("anonymousUser")){
	    	  return "login";
	      }
	    
	      Utente u = uFacade.findByName(name);
	      long id = u.getPaziente().getId();
	      System.out.println("___"+id);
	    model.addAttribute("username", name);
		model.addAttribute("esami", eFacade.getEsamiByPaziente(id));
		return "areaPaziente";
	}
}
