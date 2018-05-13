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
	<!--  ag home page -->
	<c:if test="${userClickAgeHome==true}">
	<%@include file="ag-home.jsp"%>
	</c:if>
	<!-- cse home page -->
	<c:if test="${userClickCseHome==true}">
	<%@include file="cse-home.jsp"%>
	</c:if>
	<!--  bba home page -->
	<c:if test="${userClickBbaHome==true}">
	<%@include file="bba-home.jsp"%>
	</c:if>
	<!-- fis home page -->
	<c:if test="${userClickFisHome==true}">
	<%@include file="fis-home.jsp"%>
	</c:if>
	<!-- dvm home page -->
	<c:if test="${userClickDvmHome==true}">
	<%@include file="dvm-home.jsp"%>
	</c:if>
	<!-- eng home page -->
	<c:if test="${userClickEngHome==true}">
	<%@include file="eng-home.jsp"%>
	</c:if>
	<!-- sc home page -->
	<c:if test="${userClickScHome==true}">
	<%@include file="sc-home.jsp"%>
	</c:if>
	<!-- soc home page -->
	<c:if test="${userClickSocHome==true}">
	<%@include file="soc-home.jsp"%>
	</c:if>
	<!--footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- core js -->
	<script src="${js}/jquery.js"></script>
	<!-- Bootstrap core js -->
	<script src="${js}/bootstrap.js"></script>


</body>

</html>




