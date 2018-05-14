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
	
	<!-- ag result  -->
	<c:if test="${userClickAgResults==true}">
	<%@include file="ag-results.jsp"%>
	</c:if>
	<!-- ag notices  -->
	<c:if test="${userClickAgNotices==true}">
	<%@include file="ag-notices.jsp"%>
	</c:if>
	
	<!-- bba results -->
	<c:if test="${userClickBbaResults==true}">
	<%@include file="bba-results.jsp" %>
	</c:if>
	<!-- bba notices -->
	<c:if test="${userClickBbaNotices==true}">
	<%@include file="bba-notices.jsp" %>
	</c:if>
	
	<!-- cse results -->
	<c:if test="${userClickCseResults==true}">
	<%@include file="cse-results.jsp" %>
	</c:if>
	<!-- cse notices -->
	<c:if test="${userClickCseNotices==true}">
	<%@include file="cse-notices.jsp" %>
	</c:if>
	
	<!-- dvm results -->
	<c:if test="${userClickDvmResults==true}">
	<%@include file="dvm-results.jsp" %>
	</c:if>
	<!-- dvm notices -->
	<c:if test="${userClickDvmNotices==true}">
	<%@include file="dvm-notices.jsp" %>
	</c:if>
	<!-- eng results -->
	<c:if test="${userClickEngResults==true}">
	<%@include file="eng-results.jsp" %>
	</c:if>
	<!-- eng notices -->
	<c:if test="${userClickEngNotices==true}">
	<%@include file="eng-notices.jsp" %>
	</c:if>
	
	<!-- fis results -->
	<c:if test="${userClickFisResults==true}">
	<%@include file="fis-results.jsp" %>
	</c:if>
	<!-- dvm notices -->
	<c:if test="${userClickFisNotices==true}">
	<%@include file="fis-notices.jsp" %>
	</c:if>
	
	<!-- sc results -->
	<c:if test="${userClickScResults==true}">
	<%@include file="sc-results.jsp" %>
    </c:if>
	<!-- sc notices -->
	<c:if test="${userClickScNotices==true}">
	<%@include file="sc-notices.jsp" %>
    </c:if>
	<!-- so results -->
	<c:if test="${userClickSoResults==true}">
	<%@include file="soc-results.jsp" %>
	</c:if>
	
	<!-- so notices -->
	<c:if test="${userClickSoNotices==true}">
	<%@include file="soc-notices.jsp" %>
	</c:if>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<!--footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- core js -->
	<script src="${js}/jquery.js"></script>
	<!-- Bootstrap core js -->
	<script src="${js}/bootstrap.js"></script>


</body>

</html>




