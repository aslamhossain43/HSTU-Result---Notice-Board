<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/assets/css" />
<spring:url var="js" value="/assets/js" />
<spring:url var="images" value="/assets/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!-- ///////////////////////////////////////////////////// -->
<!-- THIS PAGE IS TAKEN FOR FILLING UP 65535 BYTES OF PAGE  -->
<!-- ///////////////////////////////////////////////////// -->
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1,shrink-to-fit=no">

<title>HSTU ${title}</title>
<script>
<!--pass contextRoot to myapp  js-->
window.contextRoot='${contextRoot}';

<!-- pass json url to myapp.js for img ,results notices -->

window.filejsonURL='${contextRoot}/${jsonURL}';

<!--pass json url to myapp js -->
window.jsonURLag='${contextRoot}/${AgjsonURL}';



<!--pass heading to muapp js file-->
window.heading='${heading}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- css readable theme for font style -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- dataTables bootstrap css -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">


</head>

<body>

 <!-- preLoader -->

<div class="preLoader">	</div>

 
<div class="wrapper">

	<!-- navbar -->
	<%@include file="./shared/navbar.jsp"%>
	
	
	<!--/////////// ag form and results ////////////-->
	
	<!-- ag l1s1 form-->
	<c:if test="${agL1S1Form==true}">
	<%@include file="agl1s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ag l1s2 form -->
	<c:if test="${agL1S2Form==true}">
	<%@include file="agl1s2enter.jsp" %>
	
	
	</c:if>
	<!-- ag l2s1 form-->
	<c:if test="${agL2S1Form==true}">
	<%@include file="agl2s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ag l2s2 form -->
	 
	<c:if test="${agL2S2Form==true}">
	<%@include file="agl2s2enter.jsp" %>
	
	
	</c:if>
	
	<!-- ag l3s1 form-->
	<c:if test="${agL3S1Form==true}">
	<%@include file="agl3s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ag l3s2 form -->
	<c:if test="${agL3S2Form==true}">
	<%@include file="agl3s2enter.jsp" %>
	
	
	</c:if>
	<!-- ag l4s1 form-->
	<c:if test="${agL4S1Form==true}">
	<%@include file="agl4s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ag l4s2 form -->
	<c:if test="${agL4S2Form==true}">
	<%@include file="agl4s2enter.jsp" %>
	</c:if>
	
	<!-- ag l1s1 results -->
	<c:if test="${agAllResultsl1s1==true}">
	<%@include file="agallresultsl1s1.jsp" %>
	</c:if>
	<!-- ag l1s2 results -->
	<c:if test="${agAllResultsl1s2==true}">
	<%@include file="agallresultsl1s2.jsp" %>
	</c:if>
	<!-- ag l2s1 results -->
	<c:if test="${agAllResultsl2s1==true}">
	<%@include file="agallresultsl2s1.jsp" %>
	</c:if>
	<!-- ag l2s2 results -->
	
	<c:if test="${agAllResultsl2s2==true}">
	<%@include file="agallresultsl2s2.jsp" %>
	</c:if>
	
	
	
	<!-- ag l3s1 results -->
	<c:if test="${agAllResultsl3s1==true}">
	<%@include file="agallresultsl3s1.jsp" %>
	</c:if>
	<!-- ag l3s2 results -->
	<c:if test="${agAllResultsl3s2==true}">
	<%@include file="agallresultsl3s2.jsp" %>
	</c:if>
	<!-- ag l4s1 results -->
	<c:if test="${agAllResultsl4s1==true}">
	<%@include file="agallresultsl4s1.jsp" %>
	</c:if>
	<!-- ag l4s2 results -->
	<c:if test="${agAllResultsl4s2==true}">
	<%@include file="agallresultsl4s2.jsp" %>
	</c:if>
	
	
	
	<!--///////////  form and results ////////////-->
	
	
	
	
	
	
	
	
	
	

	<!--footer -->
	<%@include file="./shared/footer.jsp"%>






	<!-- core js -->
	<script src="${js}/jquery.js"></script>
	
	<!-- Bootstrap core js -->
	<script src="${js}/bootstrap.js"></script>
    
    <!-- dataTable js -->
    <!-- these serial must be followed to get actual result -->
     <script  src="${js}/jquery.dataTables.min.js"></script>
    <script src="${js}/dataTables.bootstrap.js"></script>
   
    
    <!-- custom js -->
	<script src="${js}/myapp.js"></script>
	
</div>

</body>

</html>




