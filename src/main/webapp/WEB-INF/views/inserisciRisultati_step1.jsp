<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file='header.jsp' %>
<body>
<form class='form-clinica' method='post' action='recuperaEsame'>
<label style='float:left'>Esame</label>
<fieldset>
<div class='DivToScroll DivWithScroll div-clinica'>
<c:forEach items='${esami}' var='esame'>
<input type='radio' name='esamePrenotato' value='${esame.id }'/> #${esame.id}: ${esame.tipologia } paziente: ${esame.paziente }<br/>
</c:forEach>
</div >
</fieldset>
<label>numero di risultati</label>
<input type='text' name='nResults' />
<input type='submit' name='submit' value='avanti'/>
</form>
<%@include file='footer.html' %>
</body>
</html>