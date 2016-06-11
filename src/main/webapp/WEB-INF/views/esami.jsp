<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Medi Cure Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- //for-mobile-apps -->
<link href="<c:url value="/bootstrap/css/bootstrap.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/bootstrap/css/style.css"/>" rel="stylesheet"
	type="text/css" media="all" />
<!-- toggle menu links -->
<link href="<c:url value="/bootstrap/css/component.css"/>"
	rel="stylesheet" type="text/css" />
<!-- //menu links -->
<link href="<c:url value="/bootstrap/css/popuo-box.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<!-- effect9 links -->
<link href="<c:url value="css/ihover.css"/>" rel="stylesheet"
	media="all">
<!-- js -->
<script src="<c:url value="/bootstrap/js/jquery-1.11.1.min.js"/>"></script>
<!-- //js -->
<link
	href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic'
	rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->

</head>
<%@include file='header.html'%>

<body>


	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="collapse navbar-collapse navbar-ex1-collapse">
		<ul class="nav navbar-nav navbar-right">
		</ul>
	</div>
	</nav>
	<div id="banner-bottom" class="banner-bottom">
		<div class="container">
			<h3 class="tittle">Elenco esami disponibili</h3>
		</div>
		<div class="content">
		<ul class="list-group">
		<c:forEach items='${esami }' var='esame'>
		<li><span class="label label-info esamebutton">${esame.nome}</span></br></li>
		<div>
		<ul type="disc">
		<li>Descrizione: ${esame.descrizione}</li>
		<li>Costo(€): ${esame.costo}</li>
		<li>Prerequisiti:
			<c:if test="${empty esame.prerequisiti}">
		                Nessun Prerequisito</br>
		                </c:if>
		                <ol>
		<c:forEach items='${esame.prerequisiti }' var='prerequisito'>
						${prerequisito.nome} <br/>
	                         </c:forEach></li>
	                         </ol>
	                         </ul>
		</div></br></br>
		</c:forEach>
		</ul>
			<table border="2">
			     <tr>
			     <td>Nome Esame</td>
			     <td>Descrizione</td>
			     <td>Costo (€)</td>
			     <td>Prerequisiti</td>
			     </tr>
				<c:forEach items='${esami }' var='esame'>
					<tr>
						<td>${esame.nome}</td>
						<td>${esame.descrizione}</td>
						<td>${esame.costo}</td>
						<td><c:forEach items='${esame.prerequisiti }' var='prerequisito'>
						${prerequisito.nome} <br/>
	                         </c:forEach></td>
					</tr>
					
				</c:forEach>
			</table>
			<a href='<c:url value="/areaAmministrazione" />'><span class="label label-danger annullabutton">Torna alla Home</span></a>
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