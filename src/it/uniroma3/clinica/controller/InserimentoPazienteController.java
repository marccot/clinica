package it.uniroma3.clinica.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.clinica.entity.Paziente;
import it.uniroma3.clinica.facade.Facade;

@WebServlet("/addPaziente")
public class InserimentoPazienteController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession session = request.getSession();
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String cf = request.getParameter("codFiscale");
		String codice = request.getParameter("cod");
		Paziente p = new Paziente();
		p.setCodice(codice);
		p.setNome(nome);
		p.setCognome(cognome);
		p.setCodiceFiscale(cf);
		Facade facade = new Facade();
		facade.savePaziente(p);
		facade.closeEm();
		session.setAttribute("statoInserimentoPaziente", "Paziente #"+p.getCodice());
		String nextUrl = "/areaAmministrazione.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
		rd.forward(request, response);
		return; 
	}
}
