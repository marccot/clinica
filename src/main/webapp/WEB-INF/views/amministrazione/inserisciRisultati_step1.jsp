<%@ page session='true' language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file='../header.jsp' %>
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
<c:if test='${!empty messaggioErroreEsame }'><td><div class='error'><p>${messaggioErroreEsame }</p></div></td></c:if>
</fieldset></td>
</tr>
<tr><td><label>numero di risultati</label></td>
<td><input type='text' name='nResults' /></td>
<c:if test='${!empty messaggioErroreNumero }'>
<td><div class='error'><p>${messaggioErroreNumero }</p></div></td>
</c:if>
</tr> 
<tr><td><input class='label-success'type='submit' name='submit' value='avanti'/></td></tr>
<tr><td><a href='<c:url value="/areaAmministrazione" />'><span class="label label-danger annullabutton">Annulla Operazione</span></a></td></tr>
</table>
 <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
</form>
<%@include file='../footer.html' %>
</body>
</html>