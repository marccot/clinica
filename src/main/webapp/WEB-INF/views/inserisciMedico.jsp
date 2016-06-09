<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci nuovo medico</title>
</head>
<body>
<form:form action = 'addMedico' method='post' modelAttribute="medico" name = 'form'>
<label>Nome</label>
<form:input type='text' path='nome' required='true'/>
<br/>
<label>Cognome</label>
<form:input type='text' path = 'cognome' reuqired='true'/>
<br />
<input type='submit' name = 'submit' value = 'aggiungi' />
</form:form>
</body>
</html>