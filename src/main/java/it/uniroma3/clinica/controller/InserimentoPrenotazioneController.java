//	package it.uniroma3.clinica.controller;
//
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
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
//import it.uniroma3.clinica.model.Esame;
//
////@WebServlet("/addPrenotazione")
//public class InserimentoPrenotazioneController extends HttpServlet{
//	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
//		HttpSession session = request.getSession();
//		Long esame = Long.valueOf(request.getParameter("esame"));
//		Long paziente = Long.valueOf(request.getParameter("paziente"));
//		Long medico = Long.valueOf(request.getParameter("medico"));
//		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dataEsame = null;
//		try{
//		dataEsame = dateFormat.parse(request.getParameter("data"));
//		
//		}
//		catch(ParseException e){
//			e.getMessage();
//		}
//		Date dataRegistrazione = new Date();
//		Facade facade = new Facade();
//		Esame prenotazione = new Esame();
//		prenotazione.setDataEsame(dataEsame);
//		prenotazione.setDataPrenotazione(dataRegistrazione);
//		prenotazione.setMedico(facade.getMedico(medico));
//		prenotazione.setPaziente(facade.getPaziente(paziente));
//		prenotazione.setTipologiaEsame(facade.getTipologiaEsame(esame));
//		facade.savePrenotazione(prenotazione);
//		facade.closeEm();
//		session.setAttribute("statoInserimentoPrenotazione", "prenotazione #"+prenotazione.getId()+" effettuata con successo");
//		String nextUrl = "/areaAmministrazione.jsp";
//		ServletContext application  = getServletContext();
//		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
//		rd.forward(request, response);
//		return; 
//	}
//}
package it.uniroma3.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InserimentoPrenotazioneController {
	
	@RequestMapping(value="/inserisciPrenotazione", method = RequestMethod.GET)
	public String indexRedirect(ModelMap model) {
		return "inserisciEsame";
	}

}
