<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheer -->
	<link 	type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<%@ include file = "navbar.jsp" %>

<div id="wrapper">
	<div id="header">
		<h2>Portfolio</h2>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		<input type="button" value="Add Screenshot"
				onclick="window.location.href='showFormForAdd'; return false;"
				class ="add-button"
				/>
		
			<table>
				<tr>
					<th>Date</th>
					<th>Total Value</th>
					<th>Day Gain</th>
					<th>Day Gain Percent</th>
					<th>Total Gain</th>
					<th>Total Gain Percent</th>
				</tr>
				
				<!-- loop over sand print our data -->
				<c:forEach var="tempPortfolio" items="${portfolio}">
				
					<tr>
						<td>${tempPortfolio.date}</td>
						<td>${tempPortfolio.totalValue}</td>
						<td>${tempPortfolio.dayGain}</td>
						<td>${tempPortfolio.dayGainPercent}</td>
						<td>${tempPortfolio.totalGain}</td>
						<td>${tempPortfolio.totalGainPercent}</td> 
					</tr>
		
				</c:forEach>
			
			</table>
		
		</div>
	
	</div>
	
</div>

</body>

</html>