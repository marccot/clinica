package it.uniroma3.clinica.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.PrerequisitoFacade;
import it.uniroma3.clinica.facade.TipologiaEsameFacade;
import it.uniroma3.clinica.model.Prerequisito;
import it.uniroma3.clinica.model.TipologiaEsame;
import it.uniroma3.clinica.validator.TipologiaEsameValidator;

@Controller
public class TipologiaEsameController {

	@Autowired
	private TipologiaEsameFacade tipoEsameFacade;
	@Autowired
	private PrerequisitoFacade pFacade;

	@RequestMapping(value = "/addTipologiaEsame", method = RequestMethod.POST)
	public String addTipologiaEsame(@ModelAttribute TipologiaEsame esame,BindingResult bindingResult, ModelMap model, HttpServletRequest request) {
		String n = request.getParameter("costo");
		for(int i=0; i<n.length();i++){
			char c = n.charAt(i);
			if(!Character.isDigit(c))
				if(c!='.'){
				model.addAttribute("esame", esame);
				model.addAttribute("prerequisito", new Prerequisito());
				model.addAttribute("prerequisitiEsistenti", pFacade.getPrerequisiti());
				model.addAttribute("messaggioErroreCosto", "Il costo deve essere un numero");
				return "amministrazione/inserisciTipologiaEsame";
			}
		}
		List<Prerequisito> p = pFacade.getPrerequisiti();
		for(Prerequisito pre : p){
			String s = request.getParameter(String.valueOf(pre.getId()));
			if( s != null){
				esame.getPrerequisiti().add(pre);
				pre.getEsame().add(esame);
				pFacade.aggiornaPrerequisito(pre);
			}
		}
		TipologiaEsameValidator validator= new TipologiaEsameValidator();
		validator.validate(esame,bindingResult);
		if(bindingResult.hasErrors()){
		//	model.put(BindingResult.class.getName() + ".esame", bindingResult);
			model.addAttribute("esame", esame);
			model.addAttribute("prerequisito", new Prerequisito());
			model.addAttribute("prerequisitiEsistenti", pFacade.getPrerequisiti());
			return "amministrazione/inserisciTipologiaEsame";
		}
		tipoEsameFacade.saveTipologiaEsame(esame);
		model.addAttribute("messaggioSuccesso", "Tipologia d'esame " + esame.getNome() + " inserita con successo");
		return "amministrazione/areaAmministrazione";
	}

	@RequestMapping(value="/adminInserisciTipologiaEsame", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		List<Prerequisito> prerequisitiEsistenti = pFacade.getPrerequisiti();
		model.addAttribute("esame", new TipologiaEsame());
		model.addAttribute("prerequisito", new Prerequisito());
		model.addAttribute("prerequisitiEsistenti", prerequisitiEsistenti);
		return "amministrazione/inserisciTipologiaEsame";
	}
}
