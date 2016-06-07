<%@page import="java.util.*,it.uniroma3.clinica.facade.*,it.uniroma3.clinica.model.TipologiaEsame" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Elenco esami</title>
</head>
<%@include file='header.html' %>
<body>
<% Facade facade = new Facade();
List<TipologiaEsame> esami = facade.getTipologieEsami();
facade.closeEm();
%>
<div class="content">
<%for(TipologiaEsame esame : esami){
	out.print("<div class='elementoElenco'><p class='titolo'><b>"+esame.getNome()+"</b></p><br />"+
				"<p class='descrizione'>"+esame.getDescrizione()+"</p><br />"+
				"<p class='prezzo'>costo € " + esame.getCosto()+"</div>");	
	}%>

</div>
</body>
</html>