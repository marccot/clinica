<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method='post' action='addPrerequisito' modelAttribute='prerequisito' name='form'>
<label>Nome prerequisito </label><form:input type='text' path='nome'/><br/>
<label>Descrizione prerequisito</label><form:input type='text' path='valore' /><br/>
<input type='submit' name='submit' value='Aggiungi prerequisito' />
</form:form>
</body>
</html>