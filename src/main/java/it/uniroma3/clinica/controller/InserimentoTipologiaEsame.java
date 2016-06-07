package it.uniroma3.clinica.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.clinica.facade.Facade;
import it.uniroma3.clinica.model.TipologiaEsame;

//@WebServlet("/addTipoEsame")

public class InserimentoTipologiaEsame extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		HttpSession session = request.getSession();
		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String costo = request.getParameter("costo");
		Double costoDouble = Double.parseDouble(costo);
		TipologiaEsame te = new TipologiaEsame();
		te.setNome(nome);
		te.setDescrizione(descrizione);
		te.setCosto(costoDouble);
		Facade facade = new Facade();
//		facade.saveTipoEsame(te);
//		facade.closeEm();
		session.setAttribute("statoInserimentoTipoEsame", "è stato aggiunto l'esame "+ te.getNome() + " al costo di €" +te.getCosto());
		String nextUrl = "/areaAmministrazione.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextUrl);
		rd.forward(request, response);
		return; 
	}
}
