<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Landing Page - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/vendor/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">

<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/css/landing-page.min.css"
	rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>

	<form class="form-horizontal" id="myform">
	
		<label>Stuff</label>
		<div class="multi-field-wrapper">
			<div class="multi-fields">
				<div class="multi-field">
					<div class="form-group ${status.error ? 'has-error' : ''}">
						<div class="col-sm-10">
							<input type="text" class="form-control " name="diseases[]" id="name_Of_Disease"
								placeholder="name_Of_Disease " />
							<%-- <form:errors path="name_Of_Disease" class="control-label" /> --%>
						</div>
					</div>


					<button type="button" class="remove-field">Remove</button>
				</div>
			</div>
			<button type="button" class="add-field">Add field</button>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
			 	<button type="button" class="btn-lg btn-primary pull-right"
					id="deseaseSubmit">Add</button>
			</div>
		</div>
	</form>
	<script src="${pageContext.request.contextPath}/js/itemManagement.js"></script>
</body>
</html>
