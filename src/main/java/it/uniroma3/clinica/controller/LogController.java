package it.uniroma3.clinica.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.clinica.facade.UtenteFacade;
import it.uniroma3.clinica.model.Paziente;
import it.uniroma3.clinica.model.Utente;
import it.uniroma3.clinica.validator.MedicoValidator;
import it.uniroma3.clinica.validator.UtenteValidator;

@Controller
public class LogController extends WebMvcConfigurerAdapter{

	@Autowired
	UtenteFacade utenteFacade;

	@RequestMapping(value="/amministrazione**", method=RequestMethod.GET)
	public String logAdmin(){
		return "amministrazione/homeAdmin";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String LogInPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value ="iniziaRegistrazione")
	public String formRegistrazione(ModelMap model) {
		model.addAttribute("utente", new Utente());
		model.addAttribute("paziente",new Paziente());
		return "signup";
	}

	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public String logOut(HttpServletRequest request, HttpServletResponse response){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		return "home";
	}
	@RequestMapping(value= "creaUtente")
	public String effettuaRegistrazione(@ModelAttribute("paziente") Paziente paziente, @ModelAttribute("utente") Utente utente, BindingResult bindingResult, ModelMap model) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		utente.setPassword(passwordEncoder.encode(utente.getPassword()));
		utente.setPaziente(paziente);
		UtenteValidator validator = new UtenteValidator();
		validator.validate(utente, bindingResult);
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getAllErrors());;
			return "signup";
		}
		utente.setRole("ROLE_USER");
		utenteFacade.save(utente);
		model.addAttribute("utente", utente);
		return "home";
	}
	@RequestMapping(value="/error", method = RequestMethod.GET)
	public String errorpage(ModelMap model) {
		return "error";
	}
}
