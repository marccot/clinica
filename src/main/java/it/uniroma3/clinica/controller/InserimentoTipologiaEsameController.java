package it.uniroma3.clinica.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.PrerequisitoFacade;
import it.uniroma3.clinica.facade.TipologiaEsameFacade;
import it.uniroma3.clinica.model.Prerequisito;
import it.uniroma3.clinica.model.TipologiaEsame;

@Controller
public class InserimentoTipologiaEsameController {

	@Autowired
	private TipologiaEsameFacade tipoEsameFacade;
	@Autowired
	private PrerequisitoFacade pFacade;

	@RequestMapping(value = "/addTipologiaEsame", method = RequestMethod.POST)
	public String addTipologiaEsame(@ModelAttribute TipologiaEsame esame, ModelMap model, HttpServletRequest request) {
		List<Prerequisito> p = pFacade.getPrerequisiti();
		for(Prerequisito pre : p){
			String s = request.getParameter(String.valueOf(pre.getId()));
			if( s != null){
				esame.getPrerequisiti().add(pre);
				pre.getEsame().add(esame);
				pFacade.aggiornaPrerequisito(pre);
			}
		}
		tipoEsameFacade.saveTipologiaEsame(esame);
		return "areaAmministrazione";
	}

	@RequestMapping(value = "/deleteTipologiaEsame", method = RequestMethod.POST)
	public String deleteTipologiaEsame() {

		return "login";
	}
	@RequestMapping(value="/inserisciTipologiaEsame", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		List<Prerequisito> prerequisitiEsistenti = pFacade.getPrerequisiti();
		model.addAttribute("esame", new TipologiaEsame());
		model.addAttribute("prerequisito", new Prerequisito());
		model.addAttribute("prerequisitiEsistenti", prerequisitiEsistenti);
		return "amministrazione/inserisciTipologiaEsame";
	}
}
