package it.uniroma3.clinica.controller;

import java.io.IOException;

import javax.persistence.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.clinica.facade.Facade;
import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.persistence.MedicoDao;

//@WebServlet("/addMedico")
public class InserimentoMedicoController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		Medico m = new Medico();
		m.setNome(nome);
		m.setCognome(cognome);
		Facade facade = new Facade();
		facade.saveMedico(m);
		facade.closeEm();
		session.setAttribute("statoInserimentoMedico", m.getNome() + " " + m.getCognome()
														+ " inserito con successo");
		String nextUrl = "/areaAmministrazione.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
		rd.forward(request, response);
		return; 
	}
}
