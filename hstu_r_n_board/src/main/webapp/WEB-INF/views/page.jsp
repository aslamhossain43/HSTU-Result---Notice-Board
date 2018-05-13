<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/assets/css" />
<spring:url var="js" value="/assets/js" />
<spring:url var="images" value="/assets/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>HSTU ${title}</title>


<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- css readable theme for font style -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">


</head>

<body>

	<!-- navbar -->
	<%@include file="./shared/navbar.jsp"%>
	<!-- home page -->
	<c:if test="${userClickHome==true}">
	<%@include file="home.jsp"%>
	</c:if>
	<!--footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- core js -->
	<script src="${js}/jquery.js"></script>
	<!-- Bootstrap core js -->
	<script src="${js}/bootstrap.js"></script>


</body>

</html>




