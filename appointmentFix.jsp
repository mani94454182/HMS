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
<!-- <center></center> -->
<spring:form action="/HMS/save" modelAttribute="appfix">
	Coupon Number: <spring:input type="text" path="couponNumber"/>  <br> <br>
	Date: <spring:input type="text" path="date"/>  <br> <br>
	Slot: <spring:input type="text" path="slot"/>  <br> <br>
	Patient Name: <spring:input type="text" path="patientName"/>  <br> <br>
	Patient Age: <spring:input type="text" path="age"/>  <br> <br>
	Patient gender: <spring:input type="text" path="gender"/>  <br> <br>
	Patient Address: <spring:input type="text" path="address"/>  <br> <br>
	Patient PhoneNumber: <spring:input type="text" path="phoneNumber"/>  <br> <br>
	Patient Illness: <spring:input type="text" path="illness"/>  <br> <br>
	
	<input type="submit" value="Submit"/> 
	</spring:form>

</body>
</html>