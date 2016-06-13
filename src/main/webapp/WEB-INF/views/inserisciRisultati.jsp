<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file='header.jsp' %>
<body>
<form:form  class='form-clinica' method="post" action="addRisultati" modelAttribute="risultato">
<label>Nome risultato</label><form:input type='text' path='nome'/><br/>
<label>Valore risultato</label><form:input type='text' path='valore'/><br/>
<label>Esame</label>
<fieldset>
<div class='DivToScroll DivWithScroll'>
<c:forEach items='${esami}' var='esame'>
<input type='radio' name='esamePrenotato' value='${esame.id }'/> #${esame.id}: ${esame.tipologia } paziente: ${esame.paziente }<br/>
</c:forEach>
</div >
</fieldset>
<input type='submit' value='Aggiungi risultati' name='submit'/> 
</form:form>
</body>
</html>