<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<head>
<title>Medi Cure a Medical hospital Category Flat Bootstrap | Home</title>
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

</head>
<%@include file='header.html' %>
<!-- slide-toggle-menu -->
<body class="cbp-spmenu-push">
 
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
<!-- banner -->
<div class="banner">

	<script src=" <c:url value="/bootstrap/js/jquery.magnific-popup.js" /> " type="text/javascript"></script>
		<div id="small-dialog" class="mfp-hide">
			<div class="search-top">
				 <div class="login">
					<input type="submit" value="">
					<input type="text" value="Type something..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">		
				</div>	
			</div>
			<script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
			</script>				
		</div>
	<div class="banner-info">
		<script src="<c:url value="/bootstrap/js/responsiveslides.min.js"/>"></script>
		<!-- 	<script>
									// You can also use "$(window).load(function() {"
									$(function () {
									 // Slideshow 4
									$("#slider3").responsiveSlides({
										auto: true,
										pager: false,
										nav: true,
										speed: 500,
										namespace: "callbacks",
										before: function () {
									$('.events').append("<li>before event fired.</li>");
									},
									after: function () {
										$('.events').append("<li>after event fired.</li>");
										}
										});
										});
			</script>-->
			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<div class="banner-text">

<!-- 							<h3>MAKE YOUR LIFE MORE<span> HEALTHY AND SAFE</span></h3> -->
<!-- 							<p> Neque porro quisquam est, qui dolorem ipsum quia  -->
<!-- 							dolor sit amet, consectetur, adipisci velit, sed  -->
<!-- 							quia non numquam eius modi tempora incidunt ut  -->
<!-- 							labore et dolore magnam aliquam quaerat voluptatem. </p> -->
<!-- 							<div class="read text-center"><a href="single.html" class="hvr-outline-out button2">READ MORE</a></div> -->
						</div>
					</li>
					<li>
						<div class="banner-text">
<!-- 							<h3>BETTER HEALTH CARE IS CLOSER<span> THAN YOU THINK</span></h3> -->
<!-- 							<p> Neque porro quisquam est, qui dolorem ipsum quia  -->
<!-- 							dolor sit amet, consectetur, adipisci velit, sed  -->
<!-- 							quia non numquam eius modi tempora incidunt ut  -->
<!-- 							labore et dolore magnam aliquam quaerat voluptatem. </p> -->
<!-- 							<div class="read text-center"><a href="single.html" class="hvr-outline-out button2">READ MORE</a></div> -->
						</div>
					</li>
				</ul>
			</div>
<!-- 			<div class="down-arrow text-center"><a class="scroll" href="#banner-bottom"><span class="glyphicon glyphicon-chevron-down" aria-hidden="true"></span></a></div> -->
	</div>
</div>
<div id="banner-bottom" class="banner-bottom">
	<div class="container">
		<h3 class="tittle">THE BEST MEDICINE IS PREVENTION</h3>
			
		<ul id="sti-menu" class="sti-menu">
				<li data-hovercolor="#fff">
					<a href="<c:url value="tipologiaEsame/addTipologiaEsame"/>">
						<h4 data-type="mText" class="sti-item">ESAMI</h4>
						<p data-type="sText" class="sti-item">Qui potrai vedere gli esami offerti dalla nostra clinica</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-plus sti-item"></span>
					</a>
				</li>	
				
				<li data-hovercolor="#fff">
					<a href="<c:url value = "pageLogIn"/>">
						<h4 data-type="mText" class="sti-item">AREA PAZIENTE</h4>
						<p data-type="sText" class="sti-item">Accedi alla tua area riservata per visionare i tuoi esami</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-apple sti-item"></span>
					</a>
				</li>
				
				<li data-hovercolor="#fff">
					<a href='<c:url value="/areaAmministrazione" />'>
						<h4 data-type="mText" class="sti-item">AMMINISTRAZIONE</h4>
						<p data-type="sText" class="sti-item">Accedi all'area riservata all'amministrazione</p>
						<span data-type="icon" class="sti-icon glyphicon glyphicon-scissors sti-item"></span>
					</a>
				</li>
				<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery.iconmenu.js"/>"></script>
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
		<!--  <div class="col-md-3 welcome-grid text-center">
				<div class="ih-item circle effect9 left_to_right"><a href="#">
					<div class="img"><img src="images/3.jpg" alt="" /></div>
					<div class="info">
					  <h4>ESAMI</h4>
					 <p>Qui potrai vedere gli esami offerti dalla nostra clinica</p>
					</div></a>
				</div>
			</div>
			<div class="col-md-3 welcome-grid text-center">
				<div class="ih-item circle effect9 left_to_right"><a href="#">
					<div class="img"><img src="images/2.jpg" alt="" /></div>
					<div class="info">
					  <h4>AREA PAZIENTE</h4>
					  <p>Accedi alla tua area riservata per vedere i tuoi esami</p>
					</div></a>
				</div>
			</div>
			<div class="col-md-3 welcome-grid text-center">
				<div class="ih-item circle effect9 left_to_right"><a href="#">
					<div class="img"><img src="images/111.jpg" alt="" /></div>
					<div class="info">
					  <h4>AREA AMMINISTRAZIONE</h4>
					 <p>Accedi all'area riservata all'amministrazione</p>
					</div></a>
				</div>
			</div>
			<div class="clearfix"></div>
	</div>
</div> -->
<!-- //qualified -->
<!-- contact -->
<!-- <div class="contact-home">
	<div class="map-home">
		<iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d2482.432383990807!2d0.028213999961443994!3d51.52362882484525!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1423469959819"></iframe>
		<div class="map-pos">
			<div class="login-pad">
				<h2>MAKE AN APPOINTMENT</h2>
					<form>
						<input type="text" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" required="">
						<input type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
						<input type="text" value="Mobile" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Mobile';}" required="">
						<label class="checkbox"><input type="checkbox" name="checkbox" checked><i> </i>Subscribe in your Newsletter</label>
						<textarea placeholder="Message" required=""></textarea>
						<input type="submit" value="SEND">
					</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>  -->
<!-- //contact -->
<!-- copy-right -->
<div class="copy-right">
	<div class="container">
		<p> &copy; 2016 Clinica Progetto Siw<!-- design by e bla bla bla --></a></p>
	</div>
</div>
<!-- //copy-right -->
<!-- Bootstrap core JavaScript-->
    <!-- Placed at the end of the document so the pages load faster -->
	<!-- js -->
		 <script src="<c:url value="/bootstrap/js/bootstrap.js"/>"></script>
	<!-- js -->
<!-- smooth scrolling -->
	<script type="text/javascript">
		$(document).ready(function() {
		/*
			var defaults = {
			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			};
		*/								
		$().UItoTop({ easingType: 'easeOutQuart' });
		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
</body>
</html>
