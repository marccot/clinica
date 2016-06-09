//package it.uniroma3.clinica.controller;
//
//import java.io.IOException;
//
//import javax.persistence.*;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
////import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import it.uniroma3.clinica.facade.Facade;
//import it.uniroma3.clinica.model.Medico;
//import it.uniroma3.clinica.persistence.MedicoDao;
//
////@WebServlet("/addMedico")
//public class InserimentoMedicoController extends HttpServlet{
//	
//	private static final long serialVersionUID = 1L;
//
//	
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		HttpSession session = request.getSession();
//		String nome = request.getParameter("nome");
//		String cognome = request.getParameter("cognome");
//		Medico m = new Medico();
//		m.setNome(nome);
//		m.setCognome(cognome);
//		Facade facade = new Facade();
//		facade.saveMedico(m);
//		facade.closeEm();
//		session.setAttribute("statoInserimentoMedico", m.getNome() + " " + m.getCognome()
//														+ " inserito con successo");
//		String nextUrl = "/areaAmministrazione.jsp";
//		ServletContext application  = getServletContext();
//		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
//		rd.forward(request, response);
//		return; 
//	}
//}
package it.uniroma3.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.clinica.facade.MedicoFacade;
import it.uniroma3.clinica.model.Medico;

@Controller
public class InserimentoMedicoController extends WebMvcConfigurerAdapter{
	@Autowired
	MedicoFacade facade;
	
	@RequestMapping(value="/inserisciMedico", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		model.addAttribute("medico", new Medico());
		return "inserisciMedico";
	}
	
	@RequestMapping(value="/addMedico", method = RequestMethod.POST) 
	public String aggiungiMedico(@ModelAttribute Medico medico, ModelMap model){ 
		facade.saveMedico(medico);
		return "areaAmministrazione";
	}
}
