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
<%@include file ='../header.jsp' %>

<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<script>
$(document).ready(function(){
	$("#newpost").toggle();
	});
$(document).ready(function(){
    $("p3").click(function(){
        $("#newpost").toggle();
    });
});
</script>

<body>
<form:form class='form-clinica' method='post' action='addTipologiaEsame' modelAttribute='esame' name='form'>
<table>
<c:if test='${!empty messaggioSuccesso }'><div class='success'>${messaggioSuccesso }</div></c:if>
<tr><td><h3 class='tittle'>Aggiungi una nuova tipologia</h3></td></tr>
<tr>
<td>
<label>Nome esame</label>
</td>
<td>
<form:input type='text' path='nome' required='true'/></td>
<td><form:errors path='nome' /></td> </tr>
<tr><td><label>Descrizione</label></td><td><form:input type='text' path='descrizione' required='true'/></td>
<td><form:errors path="descrizione" /></td> </tr>
<tr><td><label>Costo &euro; </label></td><td><form:input path='costo' /></td><td>${messaggioErroreCosto } </tr>
<tr><td><label>Prerequisiti:</label></td>
<td><fieldset>
<div class='DivToScroll DivWithScroll'>
<c:forEach items='${prerequisitiEsistenti }' var='prerequisito'>
<input type='checkbox' name="${prerequisito.id }" value="${ prerequisito.id}" /> ${prerequisito.nome }<br/>
 
 </c:forEach>
 </div>
 </fieldset></td></tr>
 <tr><td><p3 class="label label-info" id='button'>Aggiungi nuovo prerequisito</p3></td></tr>
<tr><td><input type="submit" class='label-success' name="submit" value="aggiungi tipologia" /></td></tr>
<tr><td><a href='<c:url value="/areaAmministrazione" />'><span class="label label-danger annullabutton">Annulla Operazione</span></a></td></tr>
</table>
 </form:form>
 <div id="newpost">
 <form:form class='form-clinica' method='post' action='addPrerequisito' modelAttribute='prerequisito' name='form' style='hidden'>
<h3 class="tittle">Aggiungi qui un nuovo prerequisito</h3>
<label>Nome prerequisito </label><form:input type='text' path='nome'/><br/>
<label>Descrizione prerequisito</label><form:input type='text' path='valore' /><br/>
<button type='submit' name='submit' class="btn btn-success">Aggiungi prerequisito</button>
</form:form></div>

<%@include file ='../footer.html' %>

</body>
</html>