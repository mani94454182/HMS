<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spring:form action="/HospitalManagementSystem/" modelAttribute="appointmentview">
	Coupon Number: <spring:input type="text" path="couponnumber"/>  <br>
	Date: <spring:input type="text" path="date"/>  <br>
	Slot: <spring:input type="text" path="slot"/>  <br>
	Patient Name: <spring:input type="text" path="patientname"/>  <br>
	Patient Age: <spring:input type="text" path="patientage"/>  <br>
	Patient gender: <spring:input type="text" path="patientgender"/>  <br>
	Patient Address: <spring:input type="text" path="patientaddress"/>  <br>
	Patient PhoneNumber: <spring:input type="text" path="patientphonenumber"/>  <br>
	Patient Illness: <spring:input type="text" path="patientillness"/>  <br>
	
	</spring:form>
	

</body>
</html>