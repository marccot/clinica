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
<body>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
 <div class="collapse navbar-collapse navbar-ex1-collapse">
  <ul class="nav navbar-nav navbar-right">
<a href="#"><span class="label label-danger logout">LOGOUT</span></a></ul></div></nav>
<div id="banner-bottom" class="banner-bottom">
	<div class="container">
		<h3 class="tittle">Benvenuto nell'Area Amministrativa</h3>
		<p> Usa questa area per l'inserimento di dati nel sistema  </p>
		<ul id="sti-menu" class="sti-menu">
				<li data-hovercolor="#fff" class="">
					<a href="#"onclick=document.getElementById("es"); style="display:block";>
						<strong data-type="mText" class="sti-item" style="display: block; top: 106px; color: rgb(0, 0, 0);">INSERISCI ESAME</strong>
						<p data-type="sText" class="sti-item" style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci un esame nel sistema.</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-plus sti-item" style="display: inline-block; top: 1px; background-position: left top;"></span>
					</a>
				</li>
				<li data-hovercolor="#fff" class="">
					<a href="#">
						<strong data-type="mText" class="sti-item" style="display: block; top: 106px; color: rgb(0, 0, 0);">INSERISCI MEDICO</strong>
						<p data-type="sText" class="sti-item" style="display: block; top: 135px; color: rgb(0, 0, 0);">Aggiungi un medico alla clinica.</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-scissors sti-item" style="display: inline-block; top: 1px; background-position: left top;"></span>
					</a>
				</li>
				<li data-hovercolor="#fff" class="">
					<a href="#">
						<strong data-type="mText" class="sti-item" style="display: block; top: 106px; color: rgb(0, 0, 0);">INSERISCI PAZIENTE</strong>
						<p data-type="sText" class="sti-item" style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci un paziente nel sistema.</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-education sti-item" style="display: inline-block; top: 1px; background-position: left top;"></span>
					</a>
				</li>
				<li data-hovercolor="#fff" class="">
					<a href="#">
						<strong data-type="mText" class="sti-item" style="display: block; top: 106px; color: rgb(0, 0, 0);">INSERISCI PRENOTAZIONE</strong>
						<p data-type="sText" class="sti-item" style="display: block; top: 135px; color: rgb(0, 0, 0);">Inserisci una prenotazione nel sistema.</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-apple sti-item" style="display: inline-block; top: 1px; background-position: left top;"></span>
					</a>
				</li>
				
				<script type="text/javascript" src="js/jquery.iconmenu.js"></script>
				<script type="text/javascript">
					$(function() {
						$('#sti-menu').iconmenu({
							animMouseenter	: {
								'mText' : {speed : 400, easing : 'easeOutExpo', delay : 140, dir : 1},
								'sText' : {speed : 400, easing : 'easeOutExpo', delay : 0, dir : 1},
								'icon'  : {speed : 800, easing : 'easeOutBounce', delay : 280, dir : 1}
							},
							animMouseleave	: {
								'mText' : {speed : 400, easing : 'easeInExpo', delay : 140, dir : 1},
								'sText' : {speed : 400, easing : 'easeInExpo', delay : 280, dir : 1},
								'icon'  : {speed : 400, easing : 'easeInExpo', delay : 0, dir : 1}
							}
						});
					});
				</script>
		</ul>
	</div>
</div>
<div id="es" class="bs-docs-example" style="display:none";>
            <table class="table">
              <thead>
                <tr>
                  <th>#</th>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Username</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                </tr>
                <tr>
                  <td>2</td>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>@fat</td>
                </tr>
                <tr>
                  <td>3</td>
                  <td>Larry</td>
                  <td>the Bird</td>
                  <td>@twitter</td>
                </tr>
              </tbody>
            </table>
          </div>
</body>
</html>