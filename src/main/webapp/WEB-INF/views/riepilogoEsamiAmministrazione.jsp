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
<body>
	<div>
		<form:form method="post" action="visualizzaEsamiMedico" name="form" modelAttribute = "medico">
			<fieldset class="form-group">
				<table>
					<tr>
						<td>Ricerca gli esami effettuati da un medico :</td>
						<td><form:select path="id" class="form-control">
								<form:options items="${listaMedici}" itemLabel="nomeCognome" itemValue="id" />
							</form:select>
							</td>
					</tr>
					<tr>
					<td>
					<input type = "submit" value = "Ricerca" />
					</td>
					</tr>
				</table>
			</fieldset>
		</form:form>
	</div>
</body>
</html>