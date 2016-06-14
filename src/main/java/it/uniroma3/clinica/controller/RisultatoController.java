package it.uniroma3.clinica.controller;

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
	public String aggiungiRisultato( ModelMap model, HttpServletRequest request){
//		System.out.println(risultatos.getNome());	
		Esame e = esameFacade.getEsame(Long.parseLong(request.getParameter("esameScelto")));
		System.out.println(e.getId());
		for(int i = 1; i<=(Integer.parseInt(request.getParameter("nRes")));i++){
			System.out.println("*************");
			Risultato risultato = new Risultato(request.getParameter("nome"+i), request.getParameter("valore"+i));
			risultato.setEsame(e);
			e.getRisultati().add(risultato);
			esameFacade.aggiornaEsame(e);
			rFacade.saveRisultato(risultato);
		}
//		model.addAttribute("success", "Risultato inserito nel sistema");
		return "areaAmministrazione";
	}
	
	@RequestMapping(value="recuperaEsame", method = RequestMethod.POST)
	public String recuperaEsame(ModelMap model, HttpServletRequest request){
		String s = request.getParameter("esamePrenotato");
		int nRes = Integer.parseInt(request.getParameter("nResults"));
		for(int i=0; i<nRes; i++){
			model.addAttribute("risultato"+i, new Risultato());
		}
//		System.out.println(nRes);
		long id = Long.parseLong(s);
		model.addAttribute("esame", esameFacade.getEsame(id));
		model.addAttribute("nRes", nRes);
		return "amministrazione/inserisciRisultati_step2";
	}
	
	@RequestMapping(value="/inserisciRisultatiEsame", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
//		System.out.println("CISONO");
		System.out.println(esameFacade.getEsami());
		model.addAttribute("esami", esameFacade.getEsami());
		return "amministrazione/inserisciRisultati_step1";
	}
}
