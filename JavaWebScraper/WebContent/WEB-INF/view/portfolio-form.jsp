<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>

<head>
	<title>Add Screenshot</title>
	
	<!-- reference our style sheet -->
	<link 	type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
			
	<link 	type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/add-customer.css" />
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Screenshot Page</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Screenshot</h3>
	
		<form:form action="savePortfolio" modelAttribute="portfolio" method="POST"> 
		
			<table>
				<tbody>
					<tr> 
						<td><label>Total Value</label></td>
						<td><form:input path="totalValue" /></td>
					</tr>	

					<tr> 
						<td><label>Day Gain</label></td>
						<td><form:input path="dayGain" /></td>
					</tr>	
					<tr> 
						<td><label>Day Gain %</label></td>
						<td><form:input path="dayGainPercent" /></td>
					</tr>	
					
					<tr> 
						<td><label>Total Gain</label></td>
						<td><form:input path="totalGain" /></td>
					</tr>	

					<tr> 
						<td><label>Total Gain %</label></td>
						<td><form:input path="totalGainPercent" /></td>
					</tr>	
					
					<tr> 
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>	
								
				</tbody>
			</table>
		</form:form>
	
		<div style="clear"; both; ></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/portfolio/list">Back to List</a>
		</p>
	
	</div>

</body>



</html>
