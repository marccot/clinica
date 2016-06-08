package it.uniroma3.clinica.controller;

//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.clinica.helper.LogInHelper;
import it.uniroma3.clinica.model.Utente;
import it.uniroma3.clinica.dao.UtenteDao;

//@WebServlet("/userLogout")
public class LogOutController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// gestione della RICHIESTA
		
		// metto i valori nella sessione
		HttpSession session = request.getSession();
		String nextUrl = "/index.jsp";
		if(session!=null) {
			session.invalidate();
		}

		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
		rd.forward(request, response);
		return; 
	}

}
