<%@page import="java.util.*,it.uniroma3.clinica.facade.*,it.uniroma3.clinica.model.TipologiaEsame, it.uniroma3.clinica.model.Esame" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Elenco esami</title>
</head>
<%@include file='header.html' %>
<body>

<div class="content">

<h1>esami</h1>
<c:forEach items='${esami }' var='esame'>
	 ${esame}<br/>
	</c:forEach>
</div>
</body>
</html>