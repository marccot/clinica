<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@include file ='../header.jsp' %>
<body class="form-clinica">
<h3 class="tittle">Seleziona un medico per vedere i suoi esami</h3>

<form name='form' class='form-centrato' action='visualizzaEsamiMedico' method='post'>
<select name='id_medico'>
<c:forEach items='${listaMedici }' var='medico'>
<option value='${medico.id }'> ${medico.nome } ${medico.cognome }</option>
</c:forEach>
</select>
 <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
<input class='label-success' type='submit' name='submit' value='avanti' />
</form>
<c:forEach var='type' items='${esamiByMedico }'>
<span class="label  label-info esamebutton">${type.key.nome } ${type.key.cognome }:<br/></span>
<c:forEach var='esame' items='${type.value }'>
<div class="esame-riepilogo">
<div><b>${esame.tipologia }:</b> paziente <b>${esame.paziente }</b>   </div></div>
</c:forEach>

</c:forEach></br>
</body>
<%@include file ='../footer.html' %>
</html>