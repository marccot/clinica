<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@include file ='header.jsp' %>
<div style="background-color:#d7e3f0">
<h3 class="tittle">EFFETTUA IL LOGIN PER ACCEDERE ALLE AREE PRIVATE</h3>
 <form name='loginForm'
		  action="<c:url value="j_spring_security_check"/>" method='POST' class ="form-clinica">

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
				<td colspan='2'><input name="LogIn" type="submit"
					value="Accedi" class="label-success" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
		</div>
		<div style="background-color:#d7e3f0">
<h3 class="tittle">NON SEI ANCORA REGISTRATO? FALLO ORA!</h3>
		<form:form action = "iniziaRegistrazione" method = "get" class ="form-clinica">
			<input type ="submit" value = "Registrati" class = "label-danger"/>
		</form:form></div>
</body>
<%@include file ='footer.html' %>
</html>
