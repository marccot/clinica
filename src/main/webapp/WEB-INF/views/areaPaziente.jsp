<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file='header.jsp' %>
<body>
<div class='clinica-content'>
<h3 class='tittle'>Benvenuto nell'area paziente</h3>
<h3 class='tittle'>Ecco lo stato dei tuoi esami</h3>
<c:forEach items='${esami }' var='esame' >
<div class='esame-riepilogo'>
<table class='full-table'>
<tr><th>
<b>#${esame.id} ${esame.tipologia.nome }</b> </th></tr>
<tr><td><label>Medico</label></td><td><p>${esame.medico }</p></td></tr>
<tr><td><label>Data Prenotazione</label></td> <td><p> ${esame.dataPrenotazione }</p></td></tr>
<tr><td><label>Effettuato in data</label></td><td><p> ${esame.dataEsame }</p></td></tr>
<tr><td><label>Risultati</label></td> <td>
<c:choose>
<c:when test='${empty esame.risultati}'>
<p>N/D</p>
</c:when>
<c:when test='${!empty esame.risultati }'>
<div  class='DivToScroll DivWithScroll esame-risultati'>
<c:forEach items='${esame.risultati }' var='risultato'>
${risultato.nome}, ${risultato.valore } <br/>
</c:forEach>
</div>
</c:when>
</c:choose>
</td></tr>
</table>
</div> <br/>
</c:forEach>
</div>
<%@include file='footer.html' %>

</body>
</html>