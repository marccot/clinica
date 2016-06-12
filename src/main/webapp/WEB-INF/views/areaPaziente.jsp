<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file='header.jsp' %>
<body>
<div class='clinica-content'>
<h1>Benvenuto nell'area paziente</h1>
<h3>Ecco lo stato dei tuoi esami</h3>
<c:forEach items='${esami }' var='esame' >
<div class='esame-riepilogo'>
<b>${esame.tipologia.nome }</b> <br/>
Medico: ${esame.medico }<br/>
Prenotato il: ${esame.dataPrenotazione }<br/>
Effettuato il: ${esame.dataEsame }<br/>
</div>
</c:forEach>
</div>
<%@include file='footer.html' %>

</body>
</html>