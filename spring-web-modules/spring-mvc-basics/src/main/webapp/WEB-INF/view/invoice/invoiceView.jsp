<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h3>Invoice summary</h3>

	<table>
		<tr>
			<td>Concept name:</td>
			<td>${concept}</td>
		</tr>
		<tr>
			<td>Amount:</td>
			<td>${amount}</td>
		</tr>
		<tr>
			<td>Retention (%):</td>
			<td>${retention_percentage}</td>
		</tr>
		<tr>
		    <strong>
            <td>Taxes applied:</td>
        	<td>${taxes_applied}</td>
        	</strong>
        </tr>
        <tr>
            <strong>
            <td>Total amount:</td>
            <td>${total_amount}</td>
            </strong>
        </tr>
	</table>
</body>
</html>