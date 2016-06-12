<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title></title> -->
<!-- <!-- for-mobile-apps --> 
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> -->
<!-- <meta name="keywords" content="Medi Cure Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,  -->
<!-- Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" /> -->
<!-- <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); -->
<!-- 		function hideURLbar(){ window.scrollTo(0,1); } </script> -->
<!-- //for-mobile-apps -->
<%-- <link href="<c:url value="/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css" media="all" /> --%>
<%-- <link href="<c:url value="/bootstrap/css/style.css"/>" rel="stylesheet" type="text/css" media="all" /> --%>
<!-- <!-- toggle menu links  -->
<%-- <link href="<c:url value="/bootstrap/css/component.css"/>" rel="stylesheet" type="text/css"  /> --%>
<!-- <!-- //menu links --> 
<%-- <link href="<c:url value="/bootstrap/css/popuo-box.css"/>" rel="stylesheet" type="text/css" media="all"/> --%>
<!-- <!-- effect9 links --> 
<%-- <link href="<c:url value="css/ihover.css"/>" rel="stylesheet" media="all"> --%>
<!-- <!-- js --> 
<%-- <script src="<c:url value="/bootstrap/js/jquery-1.11.1.min.js"/>"></script> --%>
<!-- <!-- //js -->
<!-- <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'> -->
<!-- 	<!-- start-smoth-scrolling --> 

<!-- </head> -->
<%@include file ='header.jsp' %>

<body>
<!-- <nav class="navbar navbar-default navbar-fixed-top" role="navigation"> -->
<!--  <div class="collapse navbar-collapse navbar-ex1-collapse"> -->
<!--   <ul class="nav navbar-nav navbar-right"> -->
<!-- <a href="#"><span class="label label-danger logout">LOGOUT</span></a></ul></div></nav> -->


	<div class="container">
          </div>
	<!-- va creato il controller per questo form -->
	<form:form class='form-clinica' method="post" action="inserisciPaziente"
		modelAttribute="paziente" name="form">
				<h3 class="tittle">Inserire dati del Paziente</h3>
		
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
			<td><input class='label-success' type="submit" value="invia" /></td>
		</tr>
		</table>
		<a href='<c:url value="/areaAmministrazione" />'><span class="label label-danger annullabutton">Annulla Operazione</span></a>
	</form:form>
	
	<div class="copy-right">
	<div class="container">
		<p> &copy; 2016 Clinica Progetto Siw<!-- design by e bla bla bla --></a></p>
	</div>
</div>
</body>
</html>