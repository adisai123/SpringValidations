<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: #f8f9fa;
	color: #007bff;
	text-align: center;
}
.error{
	color:red;
}
</style>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

first Name: <form:input class="form-control" path="firstName"/>
<form:errors path="firstName" cssClass="error"/>

<br><br>
Last Name: (*)<form:input class="form-control" path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br>
Free passes: <form:input class="form-control" path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>

<br><br>
Postal Code: <form:input class="form-control" path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br><br>
<form:select path="country">
	<form:options items="${theCountryOptions}"/>
</form:select>
<br><br>
Java <form:radiobutton class="form-control" path="favourateLanguage" value="Java"/>
 C#<form:radiobutton  class="form-control" path="favourateLanguage" value="C#"/>
 
 <br><br>
 
 Windows <form:checkbox path="os" value="Windows"/>
 
 Linux <form:checkbox path="os" value="Linux"/>
 

<br><br>
<button type="submit" class="btn btn-primary">Submit</button>

</form:form>

<jsp:include page="footer.jsp"/>
</body>
</html>
