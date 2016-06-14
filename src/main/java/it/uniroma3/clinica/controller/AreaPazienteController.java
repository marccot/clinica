package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.EsameFacade;

@Controller
public class AreaPazienteController {
	@Autowired
	private EsameFacade eFacade;
	
	@RequestMapping(value="/areaPaziente", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		model.addAttribute("esami", eFacade.getEsamiByPaziente(27));
		return "areaPaziente";
	}
}
