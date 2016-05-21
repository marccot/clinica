package it.unrioma3.clinica.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LogInControllerRequest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// gestione della RICHIESTA

		// leggo e manipolo i parametri
		String nome = request.getParameter("username");
		String cognome = request.getParameter("password");
		
		// metto i valori nella sessione
		HttpSession session = request.getSession();
		session.setAttribute("USER", nome);
		session.setAttribute("PASSWORD", cognome);

		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/");
		rd.forward(request, response);
		return; 
	}

}
