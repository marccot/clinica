<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@include file ='header.jsp' %>

<body>


	<div class="container">
          </div>
	<!-- va creato il controller per questo form -->
	<form:form class='form-clinica' method="post" action="inserisciPaziente"
		modelAttribute="paziente" name="form">
				<h3 class="tittle">Inserire dati del Paziente</h3>
		
		<table>
		<tr>
			<td>Nome Paziente :</td>
			<td><form:input type="text" path='nome' placeholder="nome" /></td>
			<td><form:errors path="nome"   /></td>
		</tr>
		<tr>
			<td>Cognome Paziente :</td>
			<td><form:input type="text" path='cognome' placeholder="cognome" required="true"/></td>
			<td><form:errors path="cognome"  /></td>
		</tr>
		<tr>
			<td>Codice Fiscale :</td>
			<td><form:input type="text" path='codiceFiscale' placeholder="codice fiscale" required="true"/></td>
			<td><form:errors path="codiceFiscale"/></td>
		</tr>
		<tr>
			<td>Codice Personale :</td>
			<td><form:input type="text" path='codice' placeholder="codice" required="true"/></td>
			<td><form:errors path="codice"  /></td>
		</tr>
		<tr>
			<td><button class="btn btn-success" type="submit" >Invia</button></td>
		</tr>
		</table>
		<a href='<c:url value="/areaAmministrazione" />'><span class="label label-danger annullabutton">Annulla Operazione</span></a>
	</form:form>
	
	<div class="copy-right">
	<div class="container">
		<p> &copy; 2016 Clinica Progetto Siw<!-- design by e bla bla bla --></a></p>
	</div>
</div>
</body>
</html>