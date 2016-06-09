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

import it.uniroma3.clinica.facade.EsameFacade;
import it.uniroma3.clinica.facade.TipologiaEsameFacade;
import it.uniroma3.clinica.model.Esame;

@Controller
public class EsameController extends WebMvcConfigurerAdapter {
	
	@Autowired
	EsameFacade esameFacade;
	@Autowired
	TipologiaEsameFacade tipologiaFacade;
	
//	@Autowired
//	@Qualifier("esameValidator")
//	private Validator validator;
//	
//	@InitBinder
//	private void initBinder(WebDataBinder binder) {
//		binder.setValidator(validator);
//	}
	
	@RequestMapping(value="/inserisciEsame", method = RequestMethod.POST)
	public String inserisciPaziente(@ModelAttribute("esame") Esame esame,  ModelMap model) {
//		if (bindingResult.hasErrors()) 
//			return "inserisciEsame";
		esameFacade.saveEsame(esame);
		return "esameInserito";
	}
	
	@RequestMapping(value="/nuovoEsame", method = RequestMethod.GET)
	public String nuovoPazienteRedirect(ModelMap model) {
		model.addAttribute("esame", new Esame());
		model.addAttribute("listaTipologie",tipologiaFacade.getAllTipologiaEsame() );
		return "inserisciEsame";
	}

}
