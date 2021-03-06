<!DOCTYPE html>
<html lang="en"> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
  <head>
  
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Untitled Document</title>
    <!-- Bootstrap -->
	<!-- //for-mobile-apps -->
<link href="<c:url value='/bootstrap/css/bootstrap.css'/>" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/bootstrap/css/style.css'/>" rel="stylesheet" type="text/css" media="all" />
<!-- toggle menu links -->
<link href="<c:url value='/bootstrap/css/component.css'/>" rel="stylesheet" type="text/css"  />
<!-- //menu links -->
<link href="<c:url value='/bootstrap/css/popuo-box.css'/>" rel="stylesheet" type="text/css" media="all"/>
<!-- effect9 links -->
<!-- <link href="<c:url value='css/ihover.css'/>" rel="stylesheet" media="all"> -->
<!-- js -->
<script src="<c:url value='/bootstrap/js/jquery-1.11.1.min.js'/>"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
		
  </head>
  <nav class="navbar navbar-default navbar-fixed-top" role="navigation">

  <!--  ��Logo e pulsante per barra ridimensionata -->
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
      <span class="sr-only">Espandi barra di navigazione</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
<%--     <h3>${pageContext.request.userPrincipal.name}</h3> --%>
    <c:choose>
     <c:when test="${pageContext.request.userPrincipal == null}"><a href="<c:url value = "login"/>"><span class="label label-success loginbutton">LOGIN</span></a></c:when>
	 <c:otherwise> <form:form action="logout" method='post' name='form'>
	 <button class='btn btn-danger logout' type='submit'>LOGOUT</button></form:form></c:otherwise>
</c:choose>
    <a class="navbar-brand" href="index.html">Logo</a>
  </div>
  
  <!--  Elementi della barra -->
  <div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="<c:url value='/index'/>">Home</a></li>
      <li><a href="#">About us</a></li>
     
    </ul>
  </div>
  
</nav>

  <!-- <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
  <script src="js/bootstrap.js" type="text/javascript"></script>-->
</html>