<%@ page session="true" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file='../header.jsp'%>


<body>
	<script>
		function submitAll() {
			for (var i = 0, n = document.forms.length; i < n; i++) {
				var nome = "f" + i;
				document.getElementById(nome).submit();
			}
		}
		function get_action(form) {
			//form.action = "addRisultati";
			form.submit(function(ev) {
				$.ajax({
					type : form.attr('method'),
					url : form.attr('action'),
					data : form.serialize(),
					success : function(data) {
						alert('ok');
					}
				});
				ev.preventDefault();
			})
		}
	</script>
	<div class='container-clinica'>
		<h3 class='tittle'>Step 2: Specificare i dettagli dei risultati</h3>
		<a href='<c:url value="/inserisciRisultatiEsame" />'><span
			class="label label-danger annullabutton">Torna Indietro</span></a>
		<c:if test='${!empty messaggioErrore }'><div class='error'><p>${messaggioErrore }</p></div></c:if>
		<form:form class='multiform-clinica' name='form' method="post"
			action='addRisultati'>
			<c:forEach begin='1' end='${nRes }' varStatus='loop'>
				<table>
					<tr>
						<td><h4>
								<b>Risultato #${loop.count }</b>
							</h4></td>
					</tr>
					<tr>
						<td><label>Nome risultato</label></td>
						<td><input type='text' name='nome${loop.index }' /></td>
					</tr>
					<tr>
						<td><label>Valore risultato</label></td>
						<td><input type='text' name='valore${loop.index }' /></td>
					</tr>
				</table>
			</c:forEach>
			<input type='hidden' name='nRes' value='${nRes }' />
			<input type='hidden' name='esameScelto' value='${esame.id }' />

			<input type='submit' name='submit' value='Inserisci risultati' />
		</form:form>
		<a href='<c:url value="/inserisciRisultatiEsame" />'><span
			class="label label-danger annullabutton">Torna Indietro</span></a>
		<!-- <button class='label-success' onclick="submitAll();">Inserisci risultati</button> -->
	</div>


	<%@ include file='../footer.html'%>
</body>
</html>