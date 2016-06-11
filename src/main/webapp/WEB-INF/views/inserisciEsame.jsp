<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@include file ='header.html' %>
</head>
<body>
<div id="banner-bottom" class="banner-bottom">
		<div class="container">
	<form:form method="post" action="inserisciEsame" modelAttribute="esame"
		name="form">
		<fieldset class="form-group">
		<table>
			<tr>
				<td>Tipologia d'esame :</td>
				<td><form:select path="tipologia" class="form-control">
						<form:options items="${listaTipologie}" itemLabel="nome"
					itemValue="id"/>
					</form:select></td>
			</tr>
			<tr>
				<td>Paziente :</td>
				<td><form:select path="paziente" class="form-control">
						<form:options items="${listaPazienti}" itemLabel="nomeCognome"
					itemValue="id"/>
					</form:select></td>
			</tr>
			<tr>
				<td>Medico :</td>
				<td><form:select path="medico" class="form-control">
						<form:options items="${listaMedici}"  itemLabel="nomeCognome"
					itemValue="id"/>
					</form:select></td>
			</tr>
			<tr>
			<td>
			<input type="submit" value="Invia" class="label-success" />
			</td>
			</tr>
		</table>
		</fieldset>
	</form:form>
	</div>
</div>
	<div class="copy-right">
		<div class="container">
			<p>
				&copy; 2016 Clinica Progetto Siw
				<!-- design by e bla bla bla -->
			</p>
		</div>
	</div>
</body>
</html>
