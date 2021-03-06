package it.uniroma3.clinica.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.clinica.facade.EsameFacade;
import it.uniroma3.clinica.facade.MedicoFacade;
import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.validator.MedicoValidator;

@Controller
public class MedicoController extends WebMvcConfigurerAdapter{
	@Autowired
	MedicoFacade medicoFacade;
	@Autowired
	EsameFacade eFacade;
	
	@RequestMapping(value="/adminInserisciMedico", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		model.addAttribute("medico", new Medico());
		return "amministrazione/inserisciMedico";
	}
	
	@RequestMapping(value="/addMedico", method = RequestMethod.POST) 
	public String aggiungiMedico(@ModelAttribute Medico medico, BindingResult bindingResult, ModelMap model){ 
		MedicoValidator validator = new MedicoValidator();
		validator.validate(medico, bindingResult);
		if(bindingResult.hasErrors()){
			model.addAttribute("messaggioErrore", "compila tutti i campi");
			return "amministrazione/inserisciMedico";
		}
		medicoFacade.saveMedico(medico);
		model.addAttribute("messaggioSuccesso", "Il medico " + medico.getNome() + " " + medico.getCognome()+" è stato inserito nel sistema");
		return "amministrazione/areaAmministrazione";
	}
	
	@RequestMapping(value="/adminVisualizzaEsamiMedico", method = RequestMethod.POST)
	public String visualizzaEsami(ModelMap model, HttpServletRequest request){
		long id = Long.parseLong(request.getParameter("id_medico"));
		Medico m = medicoFacade.getMedico(id);
		List<Esame> esami = eFacade.findByMedico(id);
		model.addAttribute("medico", m);
		model.addAttribute("esami", esami);
		return "amministrazione/riepilogoEsamiMedico";
	}
	@RequestMapping(value="/adminVediEsamiPerMedici", method = RequestMethod.GET)
	public String vediEsamiPerMedici(ModelMap model){
		model.addAttribute("listaMedici", medicoFacade.getMedici());
		//model.addAttribute("medico", new Medico());
		return "amministrazione/riepilogoEsamiAmministrazione";
	}
}
