<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script>
function submitAll(){
    for(var i=0, n=document.forms.length; i<n; i++){
    	var nome = "f"+i;
        document.getElementById(nome).onsubmit();
    }
}
function get_action(form) {
    form.action = "addRisultati";
    form.submit();
}
</script>
<%@ include file='header.jsp' %>
<body>
<c:forEach begin='0' end='${nRes }' varStatus='loop'>
<form:form onSubmit="get_action(this)" class='f${loop.index } form-clinica' id='f${loop.index }' method="post" 
modelAttribute='risultato${loop.index }' action='addRisultati'>
<label>Nome risultato</label><form:input  type='text' path='nome'/><br/>
<label>Valore risultato</label><form:input type='text' path='valore'/><br/>
<input type='hidden' name='esameScelto' value='${esame.id }' /> 
</form:form>
</c:forEach>
<button onclick="submitAll();">Inserisci risultati</button>


<%@ include file='footer.html' %>
</body>
</html>