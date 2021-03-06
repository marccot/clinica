package it.uniroma3.clinica.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.TipologiaEsame;
import it.uniroma3.clinica.editor.EditorMedico;
import it.uniroma3.clinica.editor.EditorPaziente;
import it.uniroma3.clinica.editor.EditorTipologiaEsame;
import it.uniroma3.clinica.facade.EsameFacade;
import it.uniroma3.clinica.facade.MedicoFacade;
import it.uniroma3.clinica.facade.PazienteFacade;
import it.uniroma3.clinica.facade.TipologiaEsameFacade;
import it.uniroma3.clinica.model.Esame;

@Controller
public class EsameController extends WebMvcConfigurerAdapter {
	
	@Autowired
	private EditorPaziente editorPaziente;
	@Autowired 
	private EditorMedico editorMedico ;
	@Autowired 
	private EditorTipologiaEsame editorTipologiaEsame;
	@Autowired
	EsameFacade esameFacade;
	@Autowired
	TipologiaEsameFacade tipologiaFacade;
	@Autowired
	PazienteFacade pazienteFacade;
	@Autowired
	MedicoFacade medicoFacade;
	
	@Autowired
	@Qualifier("esameValidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
		binder.registerCustomEditor(Paziente.class, this.editorPaziente);
		binder.registerCustomEditor(TipologiaEsame.class, this.editorTipologiaEsame);
		binder.registerCustomEditor(Medico.class, this.editorMedico);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	@RequestMapping(value="/adminInserisciEsame", method = RequestMethod.POST)
	public String inserisciEsame(@RequestParam("dataEsame")Date dataEsame, @ModelAttribute("esame") @Validated Esame esame,BindingResult bindingResult, ModelMap model) {
		System.out.println(dataEsame);

		if (bindingResult.hasErrors()) {
//			System.out.println(bindingResult.getAllErrors());
			model.addAttribute("esame", new Esame());
			model.addAttribute("listaTipologie",tipologiaFacade.getAllTipologiaEsame() );
			model.addAttribute("listaPazienti", pazienteFacade.getPazienti());
			model.addAttribute("listaMedici", medicoFacade.getMedici());
			return "amministrazione/inserisciEsame";
		}
		esame.setDataPrenotazione(new Date());
		esameFacade.saveEsame(esame);
		model.addAttribute("messaggioSuccesso", "Prenotazione effettuata con successo");
		return "amministrazione/areaAmministrazione";
	}
	@RequestMapping(value="/vediEsami", method = RequestMethod.GET)
	public String vediEsami(ModelMap model) {
		model.addAttribute("esami", tipologiaFacade.getAllTipologiaEsame());
		return "esami";
	}
	@RequestMapping(value="/adminNuovoEsame", method = RequestMethod.GET)
	public String nuovoPazienteRedirect(ModelMap model) {
		model.addAttribute("esame", new Esame());
		model.addAttribute("listaTipologie",tipologiaFacade.getAllTipologiaEsame() );
		model.addAttribute("listaPazienti", pazienteFacade.getPazienti());
		model.addAttribute("listaMedici", medicoFacade.getMedici());
		return "amministrazione/inserisciEsame";
	}

}
