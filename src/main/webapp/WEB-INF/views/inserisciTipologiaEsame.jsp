<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- <head> -->

<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<<<<<<< HEAD
<%@include file ='header.html' %>
<script>
function showPrerequisito() {
   document.getElementById('prerequisito').style.display = "block";
}
</script>
=======
<%@include file ='header.jsp' %>

>>>>>>> branch 'master' of https://github.com/marccot/clinica
<body>
<form:form class='form-clinica' method='post' action='addTipologiaEsame' modelAttribute='esame' name='form'>
<table>
<tr><td><h3 class='tittle'>Aggiungi una nuova tipologia</h3></td></tr>
<tr>
<td>
<label>Nome esame</label>
</td>
<td>
<form:input type='text' path='nome' /></td> </tr>
<tr><td><label>Descrizione</label></td><td><form:input type='text' path='descrizione' /></td> </tr>
<tr><td><label>Costo € </label></td><td><form:input path='costo' /></td> </tr>
<tr><td><label>Prerequisiti:</label></td>
<td><fieldset>
<div class='DivToScroll DivWithScroll'>
<c:forEach items='${prerequisitiEsistenti }' var='prerequisito'>
<input type='checkbox' name="${prerequisito.id }" value="${ prerequisito.id}" /> ${prerequisito.nome }<br/>
 
 </c:forEach>
 </div>
 </fieldset></td></tr>
 <tr><td><input type="button" class="labe-info" onClick="showPrerequisito()">Aggiungi nuovo prerequisito</input></td></tr>
<tr><td><input type="submit" class='label-success' name="submit" value="aggiungi tipologia" /></td></tr>
</table>
</form:form>
 <form:form id="prerequisito" class='form-clinica' method='post' action='addPrerequisito' modelAttribute='prerequisito' name='form' style="display:none">
<h2>Aggiungi qui un nuovo prerequisito</h2>
<label>Nome prerequisito </label><form:input type='text' path='nome'/><br/>
<label>Descrizione prerequisito</label><form:input type='text' path='valore' /><br/>
<input type='submit' name='submit' class='label-success' value='Aggiungi prerequisito' />
</form:form>
<%@include file ='footer.html' %>

</body>
</html>