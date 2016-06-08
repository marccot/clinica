<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
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
</head>
<body>

  <div class="wrapper">
  <div class='col-md-12'>
    <form class="form-signin" action = "userLogin" method = "post">       
      <h2 class="form-signin-heading">Please login</h2>
      <br/>
      <input type="text" class="form-control" name="username" placeholder="Username" required autofocus />
      <br/>
      <input type="password" class="form-control" name="password" placeholder="Password" required/>      
   <!--   <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label> -->
      <br/>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
   <!--    <a href="userSignUp" class="button btn-block btn-success btn-lg btn">Sign Up</a>  -->
    </form>
  </div>
  </div>
</body>
</html>
