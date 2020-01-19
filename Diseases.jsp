<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false"%>
<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Landing Page - Start Bootstrap Theme</title>

  <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template -->
  <link href="${pageContext.request.contextPath}/css/landing-page.min.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<spring:url value="/disease/add" var="ActionUrl" />
<form:form class="form-horizontal" method="post"  modelAttribute="diseasesTypes" action="${ActionUrl}">

<table class="table table-striped" id= "dynamictable">	
		
		<thead>
				<tr>
					<th></th>
					<th>Name_Of_Disease</th>
					
				</tr>
		</thead>
	
		<tbody>
		<% for(int i=0;i<5;i++){ %>
		<tr>
		
		<td>
		<form:hidden path="id" />
		</td>
		<td>
		<spring:bind path="name_Of_Disease">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				
				
				<div class="col-sm-10">
					<form:input path="name_Of_Disease" type="text" class="form-control " id="name_Of_Disease{i.index}" placeholder="name_Of_Disease " />
					<form:errors path="name_Of_Disease" class="control-label" />
				</div>
			</div>
		</spring:bind>
		</td>
		
		</tr>
		<% } %>

	</tbody>
	
</table>	
<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				
				<button type="submit" class="btn-lg btn-primary pull-right" >Add</button>
					
			</div>
		</div>	
</form:form>	

	
<script src="${pageContext.request.contextPath}/js/itemManagement.js"></script>



</body>
</html>
