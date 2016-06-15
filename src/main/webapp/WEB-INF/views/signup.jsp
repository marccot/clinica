<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file='header.jsp'%>
</head>
<body>


	<form action="creaUtente" method="post" class="form-clinica">
		<table class='full-table'>
			<tr>
				<td><label>Username</label></td>
				<td><spring:bind path="utente.username">
						<input type="text" name="${status.expression}"
							value="${status.value}" >
		</spring:bind></td>
		<td><form:errors path="utente.username"  /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><spring:bind path="utente.password">
						<input type="password" name="${status.expression}"
							value="${status.value}" >
						<br />
					</spring:bind></td>
					<td><form:errors path="utente.password" /></td>
			<tr>
				<td><label>Nome</label></td>
				<td><spring:bind path="paziente.nome">
						<input type="text" name="${status.expression}"
							value="${status.value}" >
						<br />
					</spring:bind></td>
					<td><form:errors path="utente.paziente.nome"/></td>
			</tr>

			<tr>
				<td><label>Cognome</label></td>
				<td><spring:bind path="paziente.cognome">
						<input type="text" name="${status.expression}"
							value="${status.value}" >
						<br />
					</spring:bind></td>
					<td><form:errors path="utente.paziente.cognome" /></td>
			</tr>

			<tr>
				<td><label>Codice Fiscale</label></td>
				<td><spring:bind path="paziente.codiceFiscale">
						<input type="text" name="${status.expression}"
							value="${status.value}" >
						<br />
					</spring:bind></td>
					<td><form:errors path="utente.paziente.codiceFiscale" /></td>
			</tr>

			<tr>
				<td><label>Email</label></td>
				<td><spring:bind path="paziente.email">
						<input type="text" name="${status.expression}"
							value="${status.value}" >
						<br />
					</spring:bind></td>
					<td><form:errors path="utente.paziente.email" /></td>
			</tr>

			<tr>
				<td><input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" /></td>
			</tr>

			<tr>
				<td><button type="submit" class='btn btn-success'>Registrati</button></td>
			</tr>
		</table>
	</form>
</body>
<%@include file='footer.html'%>
</html>