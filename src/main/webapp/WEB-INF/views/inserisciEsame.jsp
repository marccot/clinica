<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@include file ='header.html' %>
<body>
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
			<td>
			<input type="submit" value="Invia" />
			</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
