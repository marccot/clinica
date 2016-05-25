<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci nuovo paziente</title>
</head>
<body>
<!-- va creato il controller per questo form -->
<form method='post' action='addPaziente'>
<label>nome</label><input type='text' name='nome' /><br />
<label>cognome</label><input type='text' name='cognome' /><br />
<label>CodiceFiscale</label><input type='text' name='codFiscale' /><br />
<label>Codice</label><input type='text' name='cod' /><br />
<input type='submit' name='submit' value='aggiungi paziente' />
</form>
</body>
</html>