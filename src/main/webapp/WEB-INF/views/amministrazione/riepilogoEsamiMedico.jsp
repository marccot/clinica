<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file='../header.jsp' %>
<body class='form-clinica'>
<h3 class='tittle'>Lista completa degli esami di ${medico.nome } ${medico.cognome }</h3>
<c:forEach items='${esami }' var='esame'>
<div>
<p><b>${esame.tipologia }</b></p>
<p>Paziente: <b>${esame.paziente }</b></p>
<p>Prenotato il: <b>${esame.dataPrenotazione }</b></p>
<p>Effettutato il: <b>${esame.dataEsame }</b></p>
</div>
</c:forEach>
</body>
</html>