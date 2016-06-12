package it.uniroma3.clinica.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.EsameFacade;
import it.uniroma3.clinica.facade.RisultatoFacade;
import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Risultato;

@Controller
public class RisultatoController {
	
	@Autowired
	private EsameFacade esameFacade;
	@Autowired
	private RisultatoFacade rFacade;
	
	@RequestMapping(value="/addRisultati", method = RequestMethod.POST)
	public String aggiungiRisultato(@ModelAttribute Risultato risultato, ModelMap model, HttpServletRequest request){
		List<Esame> esami = esameFacade.getEsami();
		System.out.println("********************");
		System.out.println(request.getParameterMap());
		for(Esame e : esami){
			System.out.println(String.valueOf(e.getId()));
			String s = request.getParameter(String.valueOf(e.getId()));
			System.out.println("eccolo" + s);

			if(s!=null){
				risultato.setEsame(e);
				e.getRisultati().add(risultato);
				esameFacade.aggiornaEsame(e);
			}
		}
		rFacade.saveRisultato(risultato);
		return "areaAmministrazione";
	}
	
	@RequestMapping(value="/inserisciRisultati", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
//		System.out.println("CISONO");
		model.addAttribute("risultato", new Risultato());
		System.out.println(esameFacade.getEsami());
		model.addAttribute("esami", esameFacade.getEsami());
		return "inserisciRisultati";
	}
}
