<%@ page session='true' language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- toggle menu links -->
<link href="css/component.css" rel="stylesheet" type="text/css"  />
<!-- //menu links -->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<!-- effect9 links -->
<link href="css/ihover.css" rel="stylesheet" media="all">
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->

</head>
<body>
<h1>Benevenuto nel pannello di amministrazione</h1>

<a href="inserisciMedico.jsp"> Aggiungi dottore </a> ${statoInserimentoMedico }  <br />
<a href="inserisciPaziente.jsp">Aggiungi paziente</a> ${statoInserimentoPaziente } <br />
<a href="inserisciTipologiaEsame.jsp">Aggiungi esame</a> ${statoInserimentoTipoEsame }<br />
<a href="inserisciPrenotazione.jsp"> Aggiungi prenotazione </a> <br /> 
<% session.removeAttribute("statoInserimentoMedico"); %>
<form action = "userLogout" method = "get">
<button class="btn btn-lg btn-danger btn-block" type="submit">Logout</button> 
</form>
</body>
</html>