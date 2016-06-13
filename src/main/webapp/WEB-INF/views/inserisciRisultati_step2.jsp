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
<div class='container-clinica'>
<h3 class='tittle'>Step 2: Specificare i dettagli dei risultati</h3>
<a href='<c:url value="/inserisciRisultatiEsame" />'><span class="label label-danger annullabutton">Torna Indietro</span></a>
<c:forEach begin='0' end='${nRes }' varStatus='loop'>
<form:form onSubmit="get_action(this)" class='f${loop.index } multiform-clinica' id='f${loop.index }' method="post" 
modelAttribute='risultato${loop.index }' action='addRisultati'>
<table>
<tr><td><h4><b>Risultato #${loop.count }</b></h4>
</td></tr>
<tr>
<td><label>Nome risultato</label></td>
<td><form:input  type='text' path='nome'/></td></tr>
<tr><td><label>Valore risultato</label></td>
<td><form:input type='text' path='valore'/></td></tr>
<tr><td><input type='hidden' name='esameScelto' value='${esame.id }' /></td></tr> 
</table>
</form:form>
</c:forEach>
<a href='<c:url value="/inserisciRisultatiEsame" />'><span class="label label-danger annullabutton">Torna Indietro</span></a></td></tr>
<button class='label-success' onclick="submitAll();">Inserisci risultati</button>
</div>


<%@ include file='footer.html' %>
</body>
</html>