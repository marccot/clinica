<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file='header.jsp' %>
<body>
<form class='form-clinica' method='post' action='recuperaEsame'>
<h3 class='tittle'>Step 1: Indicare esame e numero di risultati</h3>
<table>
<tr>
<td><label>Esame</label></td>
<td><fieldset>
<div class='DivToScroll DivWithScroll'>
<c:forEach items='${esami}' var='esame'>
<input type='radio' name='esamePrenotato' value='${esame.id }'/> #${esame.id}: ${esame.tipologia } paziente: ${esame.paziente }<br/>
</c:forEach>
</div >
</fieldset></td>
</tr>
<tr><td><label>numero di risultati</label></td>
<td><input type='text' name='nResults' /></td></tr>
<tr><td><input class='label-success'type='submit' name='submit' value='avanti'/></td></tr>
<tr><td><a href='<c:url value="/areaAmministrazione" />'><span class="label label-danger annullabutton">Annulla Operazione</span></a></td></tr>
</table>
</form>
<%@include file='footer.html' %>
</body>
</html>