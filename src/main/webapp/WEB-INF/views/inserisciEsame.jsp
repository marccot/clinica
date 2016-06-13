<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@include file='header.jsp'%>

<body>
	<form:form class='form-clinica' method="post" action="inserisciEsame"
		modelAttribute="esame" name="form">
		<h3 class="tittle">Crea la prenotazione di un esame</h3>
		<fieldset class="form-group">
			<table>
				<tr>
					<td>Tipologia d'esame :</td>
					<td><form:select path="tipologia" class="form-control">
							<form:options items="${listaTipologie}" itemLabel="nome"
								itemValue="id" />
						</form:select></td>
				</tr>
				<tr>
					<td>Paziente :</td>
					<td><form:select path="paziente" class="form-control">
							<form:options items="${listaPazienti}" itemLabel="nomeCognome"
								itemValue="id" />
						</form:select></td>
				</tr>
				<tr>
					<td>Medico :</td>
					<td><form:select path="medico" class="form-control">
							<form:options items="${listaMedici}" itemLabel="nomeCognome"
								itemValue="id" />
						</form:select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Invia" class="label-success" />
					</td>
				</tr>
				<tr>
					<td><a href='<c:url value="/areaAmministrazione" />'><span
							class="label label-danger annullabutton">Annulla
								Operazione</span></a></td>
				</tr>
			</table>
		</fieldset>
	</form:form>


	<%@include file='footer.html'%>

</body>
</html>
