<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "it.uniroma3.clinica.model.Utente" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Questa pagina dovr� diventare la pagina dell'utente -->

<div class = "wrapper">
<c:if test="${utenteAutenticato.isAdmin()}">
<%@include  file="areaAmministrazione.jsp" %>
</c:if>

</div>
</body>
</html>