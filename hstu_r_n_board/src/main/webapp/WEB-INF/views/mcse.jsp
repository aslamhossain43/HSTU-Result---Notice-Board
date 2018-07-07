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

window.jsonURLcse='${contextRoot}/${CsejsonURL}';

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
	
	

	
	
	<!--/////////// cse form and results ////////////-->
	<!-- cse l1s1 form-->
	<c:if test="${cseL1S1Form==true}">
	<%@include file="csel1s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- cse l1s2 form -->
	<c:if test="${cseL1S2Form==true}">
	<%@include file="csel1s2enter.jsp" %>
	
	
	</c:if>
	<!-- cse l2s1 form-->
	<c:if test="${cseL2S1Form==true}">
	<%@include file="csel2s1enter.jsp" %>
	
	
	</c:if>
	
	<!--  cse l2s2 form -->
	<c:if test="${cseL2S2Form==true}">
	<%@include file="csel2s2enter.jsp" %>
	
	
	</c:if>
	
	<!-- cse l3s1 form-->
	<c:if test="${cseL3S1Form==true}">
	<%@include file="csel3s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- cse l3s2 form -->
	<c:if test="${cseL3S2Form==true}">
	<%@include file="csel3s2enter.jsp" %>
	
	
	</c:if>
	<!-- cse l4s1 form-->
	<c:if test="${cseL4S1Form==true}">
	<%@include file="csel4s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- cse l4s2 form -->
	<c:if test="${cseL4S2Form==true}">
	<%@include file="csel4s2enter.jsp" %>
	</c:if>
	
	<!-- cse l1s1 results -->
	<c:if test="${cseAllResultsl1s1==true}">
	<%@include file="cseallresultsl1s1.jsp" %>
	</c:if>
	<!-- cse l1s2 results -->
	<c:if test="${cseAllResultsl1s2==true}">
	<%@include file="cseallresultsl1s2.jsp" %>
	</c:if>
	<!-- cse l2s1 results -->
	<c:if test="${cseAllResultsl2s1==true}">
	<%@include file="cseallresultsl2s1.jsp" %>
	</c:if>
	<!-- cse l2s2 results -->
	<c:if test="${cseAllResultsl2s2==true}">
	<%@include file="cseallresultsl2s2.jsp" %>
	</c:if>
	
	
	
	<!-- cse l3s1 results -->
	<c:if test="${cseAllResultsl3s1==true}">
	<%@include file="cseallresultsl3s1.jsp" %>
	</c:if>
	<!-- cse l3s2 results -->
	<c:if test="${cseAllResultsl3s2==true}">
	<%@include file="cseallresultsl3s2.jsp" %>
	</c:if>
	<!-- cse l4s1 results -->
	<c:if test="${cseAllResultsl4s1==true}">
	<%@include file="cseallresultsl4s1.jsp" %>
	</c:if>
	<!-- cse l4s2 results -->
	<c:if test="${cseAllResultsl4s2==true}">
	<%@include file="cseallresultsl4s2.jsp" %>
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
	<script src="${js}/myappcse.js"></script>
	
</div>

</body>

</html>




