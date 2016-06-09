<%@ page session='true' language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AreaAmministrazione</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Medi Cure Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="<c:url value="/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/bootstrap/css/style.css"/>" rel="stylesheet" type="text/css" media="all" />
<!-- toggle menu links -->
<link href="<c:url value="/bootstrap/css/component.css"/>" rel="stylesheet" type="text/css"  />
<!-- //menu links -->
<link href="<c:url value="/bootstrap/css/popuo-box.css"/>" rel="stylesheet" type="text/css" media="all"/>
<!-- effect9 links -->
<link href="<c:url value="css/ihover.css"/>" rel="stylesheet" media="all">
<!-- js -->
<script src="<c:url value="/bootstrap/js/jquery-1.11.1.min.js"/>"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->

</head>
<body >
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
 <div class="collapse navbar-collapse navbar-ex1-collapse">
  <ul class="nav navbar-nav navbar-right">
  <button class="login-button logoutposition margineNavAreaAmministrazione" type="submit">Logout</button></ul></div></nav>
  
<div class="SfondoAreaAmministrazione"><h1 class="TitoloAreaAmministrazione" style="text-align:center">Benvenuto nel pannello di amministrazione</h1>
<!--<a href="<c:url value="/inserisciMedico"/>"> Aggiungi dottore </a> ${statoInserimentoMedico }  <br />-->
<a href="<c:url value="/inserisciMedico"/>"class="shiny-button pulsantiAreaAmministrazione"> <strong>Inserisci Dottore</strong> </a> ${statoInserimentoMedico }
<a href="<c:url value="/inserisciPaziente"/>"class="shiny-button pulsantiAreaAmministrazione"><strong>Inserisci Paziente</strong></a> ${statoInserimentoPaziente }
<a href="<c:url value="/inserisciTipologiaEsame"/>"class="shiny-button pulsantiAreaAmministrazione"><strong>Inserisci Esame</strong></a> ${statoInserimentoTipoEsame }
<a href="<c:url value="/inserisciPrenotazione"/>"class="shiny-button"> <strong>Avvia Prenotazione</strong> </a> <br />
<% session.removeAttribute("statoInserimentoMedico"); %>
<form action = "userLogout" method = "get">

</form></div>
</body>
</html>