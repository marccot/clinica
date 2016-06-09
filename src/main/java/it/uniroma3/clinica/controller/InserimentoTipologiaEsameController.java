package it.uniroma3.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.TipologiaEsameFacade;
import it.uniroma3.clinica.model.TipologiaEsame;

@Controller
public class InserimentoTipologiaEsameController {

	@Autowired
	private TipologiaEsameFacade tipoEsameFacade;

	@RequestMapping(value = "/addTipologiaEsame", method = RequestMethod.POST)
	public String addTipologiaEsame(@ModelAttribute TipologiaEsame esame, ModelMap model) {
		tipoEsameFacade.saveTipologiaEsame(esame);
		return "areaAmministrazione";
	}
	
	@RequestMapping(value = "/deleteTipologiaEsame", method = RequestMethod.POST)
	public String deleteTipologiaEsame() {
		
		return "login";
	}
	@RequestMapping(value="/vediEsami" ,method = RequestMethod.GET)
	public String vediEsami(ModelMap model){
		List<TipologiaEsame> esami = tipoEsameFacade.getAllTipologiaEsame();
		model.addAttribute("esami", esami);
		return "esami";
	}
	@RequestMapping(value="/inserisciTipologiaEsame", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		model.addAttribute("esame", new TipologiaEsame());
		return "inserisciTipologiaEsame";
	}
}
