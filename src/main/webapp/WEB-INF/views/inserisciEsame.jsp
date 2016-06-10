<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Effettua una prenotazione</h2>
	<form:form method="post" action="inserisciEsame" modelAttribute="esame"
		name="form">
		<table>
			<tr>
				<td>Tipologia d'esame :</td>
				<td><form:select path="tipologia">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${listaTipologie}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Paziente :</td>
				<td><form:select path="paziente">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${listaPazienti}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Medico :</td>
				<td><form:select path="medico">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${listaMedici}" />
					</form:select></td>
			</tr>
			<tr>
			<fmt:formatDate value="transactions['${loopStatus.index}'].valueTransactionDate"  
                type="date" 
                pattern="dd-MM-yyyy"
                var="theFormattedDate" />
<form:input type="text" path="dataEsame" value="${theFormattedDate}"/>
			</tr>
		</table>
	</form:form>
</body>
</html>