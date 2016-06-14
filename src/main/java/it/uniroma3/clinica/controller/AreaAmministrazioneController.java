package it.uniroma3.clinica.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AreaAmministrazioneController {
	
	@RequestMapping(value="/areaAmministrazione", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {

		return "amministrazione/areaAmministrazione";
	}

}
