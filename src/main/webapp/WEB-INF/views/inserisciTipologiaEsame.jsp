<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method='post' action='addTipologiaEsame' modelAttribute='esame' name='form'>
<label>Nome esame</label><form:input type='text' path='nome' /> <br />
<label>Descrizione</label><form:input type='text' path='descrizione' /> <br />
<label>Costo € </label><form:input path='costo' /> <br />
<input type="submit" name="submit" value="aggiungi tipologia" />
</form:form>
</body>
</html>