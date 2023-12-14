<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Example - Register an Employee</title>
</head>
<body>
	<h3>Enter The Invoice Details</h3>

	<form:form method="POST" action="/spring-mvc-basics/addInvoice" modelAttribute="invoice">
		<table>
			<tr>
				<td><form:label path="concept">Concept name:</form:label></td>
				<td><form:input path="concept" /></td>
			</tr>
			<tr>
				<td><form:label path="amount">Amount:</form:label></td>
				<td><form:input path="amount" /></td>
			</tr>
			<tr>
				<td><form:label path="retention_percentage">Retention (%):</form:label></td>
				<td><form:input path="retention_percentage" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Send" /></td>
			</tr>
		</table>
	</form:form>

</body>

</html>