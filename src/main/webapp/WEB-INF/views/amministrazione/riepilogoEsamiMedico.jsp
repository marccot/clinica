<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file='../header.jsp'%>
<body class='form-clinica'>
<script type="text/javascript">
$("document").ready(function () {
$.each($(".wrapper > .content-block"), function(index, value){
    var num = index + 1;
    $(value).attr("id","post"+ num);
});
$("document").ready(function () {
	$.each($(".wrappa > .p-block"), function(index, value){
	    var num = index + 1;
	    $(value).attr("id", num);
	});
$('.targetDiv').hide();
$('.show').click(function () {
    $('.targetDiv').hide();
    $('#post' + $(this).attr('id')).show();
});

$('.hide').click(function () {
    $('#post' + $(this).attr('id')).hide();
  
});
});
});
</script>
	<h3 class='tittle'>Lista completa degli esami di ${medico.nome }
		${medico.cognome }</h3>
	<c:forEach items='${esami}' var='esame'>
		<div class='elenco-esami'>
			<span class="label  label-success esamebutton">${esame.tipologia}</span>
			<div class="wrappa">
				<p class="show p-block didascalia label-info">Mostra Dettagli
					Esame</p>
			</div>
			<div class="wrapper">
				<div class="content-block targetDiv esame-riepilogo">
					<table class='full-table'>
						<tr>
							<td><label>Paziente</label></td>
							<td><p>${esame.paziente }</p></td>
						</tr>
						<tr>
							<td><label>Prenotato il:</label></td>
							<td><p>${esame.dataPrenotazione }</p></td>
						</tr>
						<tr>
							<td><label>Effettuato il:</label></td>
							<td><p>${esame.dataEsame }</p></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</c:forEach>

	<%-- <c:forEach items='${esami }' var='esame'> --%>
	<!-- <div> -->
	<%-- <p><b>${esame.tipologia }</b></p> --%>
	<%-- <p>Paziente: <b>${esame.paziente }</b></p> --%>
	<%-- <p>Prenotato il: <b>${esame.dataPrenotazione }</b></p> --%>
	<%-- <p>Effettutato il: <b>${esame.dataEsame }</b></p> --%>
	<!-- </div> -->
	<%-- </c:forEach> --%>
</body>
</html>