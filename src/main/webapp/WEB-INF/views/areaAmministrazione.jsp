<%@ page session='true' language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<head>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Medi Cure Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="<c:url value="/bootstrap/css/bootstrap.css" />" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/bootstrap/css/style.css" />" rel="stylesheet" type="text/css" media="all" />
<!-- toggle menu links -->
<link href="<c:url value="/bootstrap/css/component.css" />" rel="stylesheet" type="text/css"  />
<!-- //menu links -->
<link href="<c:url value="/bootstrap/css/popuo-box.css" />"rel="stylesheet" type="text/css" media="all"/>
<!-- effect9 links -->
<link href="<c:url value="/bootstrap/css/ihover.css" />" rel="stylesheet" media="all">
<!-- js -->
<script src="<c:url value ="/bootstrap/js/jquery-1.11.1.min.js"/>"> </script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->
		<script type="text/javascript" src="<c:url value="/bootstrap/js/move-top.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/bootstrap/js/easing.js"/>"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
	<!-- start-smoth-scrolling -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AreaAmministrazione</title>
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
<%@include file='header.jsp' %>
<body>
<!-- Classie - class helper functions by @desandro https://github.com/desandro/classie -->
		<script src="<c:url value="/bootstrap/js/classie.js"/>"></script>
		<script>
			var menuLeft = document.getElementById( 'cbp-spmenu-s1' ),
				showLeftPush = document.getElementById( 'showLeftPush' ),
				showRightPush = document.getElementById( 'showRightPush' ),
				body = document.body;

			showLeftPush.onclick = function() {
				classie.toggle( this, 'active' );
				classie.toggle( body, 'cbp-spmenu-push-toright' );
				classie.toggle( menuLeft, 'cbp-spmenu-open' );
				disableOther( 'showLeftPush' );
			};

			function disableOther( button ) {
				if( button !== 'showLeftPush' ) {
					classie.toggle( showLeftPush, 'disabled' );
				}
				if( button !== 'showRightPush' ) {
					classie.toggle( showRightPush, 'disabled' );
				}
			}
		</script>
<!-- 	<nav class="navbar navbar-default navbar-fixed-top" role="navigation"> -->
<!-- 	<div class="collapse navbar-collapse navbar-ex1-collapse"> -->
<!-- 		<ul class="nav navbar-nav navbar-right"> -->
<!-- 			<ul class="nav navbar-nav navbar-right"> -->
<%-- 				<li class="active"><a href="<c:url value="/index"/>" >Home</a></li> --%>
<!-- 				<li><a href="#">Log In</a></li> -->
<!-- 				<li><a href="#">About us</a></li> -->
<!-- 				<a href="#"><span class="label label-danger logout">LOGOUT</span></a> -->
<!-- 			</ul> -->
<!-- 	</div> -->
<!-- 	</nav> -->
	<div id="banner-bottom" class="banner-bottom">
		<div class="container">
			<h3 class="tittle">Benvenuto nell'Area Amministrativa</h3>
			<p>Usa questa area per l'inserimento di dati nel sistema</p>
			
			<h4 class ="success"> ${messaggioSuccesso} </h4>
			<ul id="sti-menu" class="sti-menu">
				<li data-hovercolor="#fff" class=""><a
					href="<c:url value="/inserisciTipologiaEsame"/>" class=""> <strong
						data-type="mText" class="sti-item"
						style="display: block; top: 106px; color: rgb(0, 0, 0);padding-top: 0.5em;">INSERISCI
							ESAME</strong>
						<p data-type="sText" class="sti-item"
							style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci
							un esame nel sistema.</p> <span data-type="icon"
						class="sti-icon glyphicon glyphicon-plus sti-item"
						style="display: inline-block; margin-top: 1em; background-position: left top;"></span>
				</a></li>
				<li data-hovercolor="#fff" class=""><a
					href="<c:url value="/vediEsamiPerMedici"/>" class=""> <strong
						data-type="mText" class="sti-item"
						style="display: block; top: 106px; color: rgb(0, 0, 0);padding-top: 0.5em;">VEDI ESAMI</strong>
						<p data-type="sText" class="sti-item"
							style="display: block; top: 135px; color: rgb(0, 0, 0);">visualizza gli esami
							catalogati per medico</p> <span data-type="icon"
						class="sti-icon glyphicon glyphicon-plus sti-item"
						style="display: inline-block; margin-top: 1em; background-position: left top;"></span>
				</a></li>
				<li data-hovercolor="#fff" class=""><a
					href="<c:url value="/inserisciMedico" /> "> <strong
						data-type="mText" class="sti-item"
						style="display: block; top: 106px; color: rgb(0, 0, 0);padding-top: 0.5em;">INSERISCI
							MEDICO</strong>
						<p data-type="sText" class="sti-item"
							style="display: block; top: 135px; color: rgb(0, 0, 0);">Aggiungi
							un medico alla clinica.</p> <span data-type="icon"
						class="sti-icon glyphicon glyphicon-scissors sti-item"
						style="display: inline-block; margin-top: 1em; background-position: left top;"></span>
				</a></li>
				<li data-hovercolor="#fff" class=""><a
					href="<c:url value="/nuovoPaziente" /> "> <strong
						data-type="mText" class="sti-item"
						style="display: block; top: 106px; color: rgb(0, 0, 0);padding-top: 0.5em;">INSERISCI
							PAZIENTE</strong>
						<p data-type="sText" class="sti-item"
							style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci
							un paziente nel sistema.</p> <span data-type="icon"
						class="sti-icon glyphicon glyphicon-education sti-item"
						style="display: inline-block; margin-top: 1em; background-position: left top;"></span>
				</a></li>
				<li data-hovercolor="#fff" class=""><a
					href="<c:url value="/nuovoEsame" /> "> <strong
						data-type="mText" class="sti-item"
						style="display: block; top: 106px; color: rgb(0, 0, 0);padding-top: 0.5em;">INSERISCI
							PRENOTAZIONE</strong>
						<p data-type="sText" class="sti-item"
							style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci
							una prenotazione nel sistema.</p> <span data-type="icon"
						class="sti-icon glyphicon glyphicon-apple sti-item"
						style="display: inline-block; margin-top: 1em; background-position: left top;"></span>
				</a></li>
<li data-hovercolor="#fff" class=""><a
					href="<c:url value="/inserisciRisultatiEsame" /> "> <strong
						data-type="mText" class="sti-item"
						style="display: block; top: 106px; color: rgb(0, 0, 0);padding-top: 0.5em;">INSERISCI
							RISULTATO</strong>
						<p data-type="sText" class="sti-item"
							style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci
							nel sistema il risultato di un esame.</p> <span data-type="icon"
						class="sti-icon glyphicon glyphicon-apple sti-item"
						style="display: inline-block; margin-top: 1em; background-position: left top;"></span>
				</a></li>
				<script type="text/javascript" src="js/jquery.iconmenu.js"></script>
				<script type="text/javascript">
					$(function() {
						$('#sti-menu').iconmenu({
							animMouseenter : {
								'mText' : {
									speed : 400,
									easing : 'easeOutExpo',
									delay : 140,
									dir : 1
								},
								'sText' : {
									speed : 400,
									easing : 'easeOutExpo',
									delay : 0,
									dir : 1
								},
								'icon' : {
									speed : 800,
									easing : 'easeOutBounce',
									delay : 280,
									dir : 1
								}
							},
							animMouseleave : {
								'mText' : {
									speed : 400,
									easing : 'easeInExpo',
									delay : 140,
									dir : 1
								},
								'sText' : {
									speed : 400,
									easing : 'easeInExpo',
									delay : 280,
									dir : 1
								},
								'icon' : {
									speed : 400,
									easing : 'easeInExpo',
									delay : 0,
									dir : 1
								}
							}
						});
					});
				</script>
			</ul>
		</div>
	</div>
	<!-- <div id="es" class="bs-docs-example" style="display:none";>
<c:url var="url" value="/paziente" />
        <form method="post" action="inserisciPaziente"
		modelAttribute="paziente" name="form">
		<table>
		<tr>
			<td>Nome Paziente :</td>
			<td><input type="text" path='nome' placeholder="nome" required="true"/></td>
		</tr>
		<tr>
			<td>Cognome Paziente :</td>
			<td><input type="text" path='cognome' placeholder="cognome" required="true"/></td>
		</tr>
		<tr>
			<td>Codice Fiscale :</td>
			<td><input type="text" path='codiceFiscale' placeholder="codice fiscale" required="true"/></td>
		</tr>
		<tr>
			<td>Codice Personale :</td>
			<td><input type="text" path='codice' placeholder="codice" required="true"/></td>
		</tr>
		<tr>
			<td><a href="#" onclick="document.getElementById('es').style.display='none';"></a><input type="submit" value="invia" /></td>
		</tr>
		</table>
	</form>
          </div>-->
	<div class="copy-right">
		<div class="container">
			<p>
				&copy; 2016 Clinica Progetto Siw
				<!-- design by e bla bla bla -->
				</a>
			</p>
		</div>
</body>
</html>