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
  <form name='loginForm'
		  action="<c:url value="j_spring_security_check"/>" method='POST'>

		  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
  </div>
  </div>
</body>
</html>
