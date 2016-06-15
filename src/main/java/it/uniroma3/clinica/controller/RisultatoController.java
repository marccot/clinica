package it.uniroma3.clinica.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.clinica.facade.EsameFacade;
import it.uniroma3.clinica.facade.RisultatoFacade;
import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Risultato;
import it.uniroma3.clinica.validator.RisultatoValidator;

@Controller
public class RisultatoController {
	
	@Autowired
	private EsameFacade esameFacade;
	@Autowired
	private RisultatoFacade rFacade;
	
	@RequestMapping(value="/addRisultati", method = RequestMethod.POST)
	public String aggiungiRisultato( ModelMap model, HttpServletRequest request){
		int n =(Integer.parseInt(request.getParameter("nRes")));
		Esame e = esameFacade.getEsame(Long.parseLong(request.getParameter("esameScelto")));
		System.out.println(e.getId());
		for(int i = 1; i<=n;i++){
			System.out.println("*************");
			Risultato risultato = new Risultato(request.getParameter("nome"+i), request.getParameter("valore"+i));
			risultato.setEsame(e);
			if(risultato.getNome().equals("")|| risultato.getValore().equals("")){
				model.addAttribute("esami", esameFacade.getEsami());
				model.addAttribute("nRes", n);
				model.addAttribute("messaggioErrore", "compilare tutti i campi");
				return "amministrazione/inserisciRisultati_step2";
			}
			e.getRisultati().add(risultato);
			esameFacade.aggiornaEsame(e);
			rFacade.saveRisultato(risultato);
		}
//		model.addAttribute("success", "Risultato inserito nel sistema");
		return "amministrazione/areaAmministrazione";
	}
	
	@RequestMapping(value="recuperaEsame", method = RequestMethod.POST)
	public String recuperaEsame(ModelMap model, HttpServletRequest request){
		String s = request.getParameter("esamePrenotato");
		if(s == null){
			model.addAttribute("esami", esameFacade.getEsami());
			model.addAttribute("messaggioErroreEsame", "Campo obbligatorio");
			return "amministrazione/inserisciRisultati_step1";
		}
		String n = request.getParameter("nResults");
		for(int j=0; j<n.length();j++){
			char c = n.charAt(j);
			if(!Character.isDigit(c)){
				model.addAttribute("esami", esameFacade.getEsami());
				model.addAttribute("messaggioErroreNumero", "E' richiesto un numero");
				return "amministrazione/inserisciRisultati_step1";
			}
		}
		int nRes = Integer.parseInt(n);
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
