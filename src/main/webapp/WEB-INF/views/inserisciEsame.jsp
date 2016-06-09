<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="inserisciEsame" modelAttribute="esame"
		name="form">
		<table>
			<tr>
				<form:select path="tipologia">
					<form:option value="NONE" label="--- Select ---" />
					<form:options items="${listaTipologie}" />
				</form:select>
			</tr>
		</table>
	</form:form>
</body>
</html>