package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.TipologiaEsameFacade;

@Controller
public class InserimentoTipologiaEsameController {

	@Autowired
	private TipologiaEsameFacade tipoEsameFacade;

	@RequestMapping(value = "/addTipologiaEsame", method = RequestMethod.GET)
	public String addTipologiaEsame(ModelMap model) {
//		model.addAttribute("employeesList", employeeService.listEmployee());
//		System.out.println("ciao");
		return "esami";
	}
	
	@RequestMapping(value = "/deleteTipologiaEsame", method = RequestMethod.POST)
	public String deleteTipologiaEsame() {
		
		return "login";
	}
	
}
