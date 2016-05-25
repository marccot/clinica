package it.uniroma3.clinica.controller;

import javax.servlet.annotation.WebServlet;
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

import it.uniroma3.clinica.entity.Utente;
import it.uniroma3.clinica.facade.Facade;
import it.uniroma3.clinica.helper.LogInHelper;
import it.uniroma3.clinica.persistence.UtenteDao;

@WebServlet("/userLogin")
public class LogInControllerRequest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// gestione della RICHIESTA

		// leggo e manipolo i parametri
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// metto i valori nella sessione
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		String nextUrl;
		
		LogInHelper helper = new LogInHelper();
		if(helper.logInValidator(username, password)) {
			Facade facade = new Facade();
			Utente utente = facade.getUtente(username);
			facade.closeEm();
			if(!utente.checkPassword(password)) {
				session.setAttribute("inserimentoErrato", "username o password sbagliati" );
				nextUrl = "/login.jsp";
			}
			else {
				session.setAttribute("utenteAutenticato", utente);
				nextUrl = "/paginaUtente.jsp";
			}
		}
		
		else {
			session.setAttribute("inserimentoErrato", "username e password sono campi obbligatori");
			nextUrl = "/paginaUtente";
		}

		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
		rd.forward(request, response);
		return; 
	}

}
