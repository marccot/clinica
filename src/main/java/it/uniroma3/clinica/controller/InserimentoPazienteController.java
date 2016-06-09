//package it.uniroma3.clinica.controller;
//
//import java.io.IOException;
//
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
//import it.uniroma3.clinica.model.Paziente;
//
////@WebServlet("/addPaziente")
//public class InserimentoPazienteController extends HttpServlet{
//	private static final long serialVersionUID = 1L;
//
//	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
//		HttpSession session = request.getSession();
//		String nome = request.getParameter("nome");
//		String cognome = request.getParameter("cognome");
//		String cf = request.getParameter("codFiscale");
//		String codice = request.getParameter("cod");
//		Paziente p = new Paziente();
//		p.setCodice(codice);
//		p.setNome(nome);
//		p.setCognome(cognome);
//		p.setCodiceFiscale(cf);
//		Facade facade = new Facade();
//		facade.savePaziente(p);
//		facade.closeEm();
//		session.setAttribute("statoInserimentoPaziente", "Paziente #"+p.getCodice());
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

import it.uniroma3.clinica.facade.PazienteFacade;
import it.uniroma3.clinica.model.Paziente;

@Controller
public class InserimentoPazienteController extends WebMvcConfigurerAdapter {
	
	@Autowired
	PazienteFacade facade;
	
	@RequestMapping(value="/inserisciPaziente", method = RequestMethod.POST)
	public String inserisciPaziente(@ModelAttribute Paziente paziente, ModelMap model) {
		facade.savePaziente(paziente);
		return "pazienteInserito";
	}
	
	@RequestMapping(value="/nuovoPaziente", method = RequestMethod.GET)
	public String nuovoPazienteRedirect(ModelMap model) {
		model.addAttribute("paziente", new Paziente());
		return "inserisciPaziente";
	}

}
