<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file='header.jsp' %>
<body>
<form:form  class='form-clinica' method="post" action="addRisultati" modelAttribute="risultato">
<form:input type='text' path='nome'/>
<form:input type='text' path='valore'/>
<c:forEach items='${esami}' var='esame'>
<input type='radio' name='${esame.id }' value='${esame.id }'/> ${esame.tipologia }<br/>
</c:forEach>
<input type='submit' value='Aggiungi risultati' name='submit'/> 
</form:form>
</body>
</html>