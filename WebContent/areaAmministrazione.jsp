<%@ page session='true' language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AreaAmministrazione</title>
</head>
<body>
<h1>Benevenuto nel pannello di amministrazione</h1>

<a href="inserisciMedico.jsp"> Aggiungi dottore </a> ${statoInserimentoMedico }  <br />
<a href="inserisciPaziente.jsp">Aggiungi paziente</a> ${statoInserimentoPaziente } <br />
<a href="inserisciTipologiaEsame.jsp">Aggiungi esame</a> ${statoInserimentoTipoEsame }<br />
<a href="inserisciPrenotazione.jsp"> Aggiungi prenotazione </a> <br /> 
<% session.removeAttribute("statoInserimentoMedico"); %>
</body>
</html>