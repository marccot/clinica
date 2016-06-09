<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci nuovo paziente</title>
</head>
<body>
	<!-- va creato il controller per questo form -->
	<form:form method="post" action="inserisciPaziente"
		modelAttribute="paziente" name="form">
		<table>
		<tr>
			<td>Nome Paziente :</td>
			<td><form:input type="text" path='nome' placeholder="nome" /></td>
			<td><form:errors path="nome"  /></td>
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
			<td><input type="submit" value="invia" /></td>
		</tr>
		</table>
	</form:form>
</body>
</html>