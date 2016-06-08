<%@ page 
import = "it.uniroma3.clinica.model.Medico, it.uniroma3.clinica.model.Paziente,it.uniroma3.clinica.facade.Facade, java.util.*, it.uniroma3.clinica.model.TipologiaEsame"
language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserimento Prenotazione</title>
</head>
<body>

<form method='post' action='addPrenotazione'>
<label>data esame </label><input type='date' name='data' />
<label>Seleziona un esame </label><select name='esame'>

								
								</select>
<label>Seleziona un medico </label><select name='medico'>

								</select>
<label>Seleziona il paziente </label><select name='paziente'>
					
									</select>
<input type='submit' name='submit' value='aggiungi prenotazione' />
</form>
</body>
</html>