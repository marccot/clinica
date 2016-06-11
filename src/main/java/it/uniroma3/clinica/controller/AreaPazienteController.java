package it.uniroma3.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AreaPazienteController {
	@RequestMapping(value="/areaPaziente", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		return "areaPaziente";
	}
}
