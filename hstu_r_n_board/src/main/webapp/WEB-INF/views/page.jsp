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
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1,shrink-to-fit=no">

<title>HSTU ${title}</title>
<script>
<!--pass contextRoot to myapp  js-->
window.contextRoot='${contextRoot}';

<!-- pass json url to myapp.js for img ,results notices -->

window.filejsonURL='${contextRoot}/${jsonURL}';

<!--pass json url to myapp js -->

window.jsonURLece='${contextRoot}/${EcejsonURL}';

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
	
	<!-- file result  -->
	<c:if test="${fileResults==true}">
	<%@include file="fileresults.jsp"%>
	</c:if>
	<!-- file notices  -->
	<c:if test="${fileNotices==true}">
	<%@include file="filenotices.jsp"%>
	</c:if>
	
	
	
	<!-- signup -->
	<c:if test="${clickSignup==true}">
	<%@include file="signup.jsp" %>
     </c:if>
    
	<!-- global manage -->
	<c:if test="${clickGlobalManage==true}">
	<%@include file="global-manage.jsp" %>
	</c:if>
	
	<!-- global ag Manage -->
	<c:if test="${clickGlobalAgManage==true}">
	<%@include file="global-ag-manage.jsp" %>
	</c:if>
	
	<!-- global cse manage -->
	<c:if test="${clickGlobalCseManage==true}">
	<%@include file="global-cse-manage.jsp" %>
	
	</c:if>
	
	<!-- global bba manage -->
	<c:if test="${clickGlobalBbaManage==true}">
	<%@include file="global-bba-manage.jsp" %>
	
	</c:if>
	<!-- global fis manage -->
	<c:if test="${clickGlobalFisManage==true}">
	<%@include file="global-fis-manage.jsp" %>
	
	</c:if>
	
	<!-- global dvm manage -->
	<c:if test="${clickGlobalDvmManage==true}">
	<%@include file="global-dvm-manage.jsp" %>
	
	</c:if>
	
	<!-- global eng manage -->
	<c:if test="${clickGlobalEngManage==true}">
	<%@include file="global-eng-manage.jsp" %>
	
	</c:if>
	
	<!-- global sc manage -->
	<c:if test="${clickGlobalScManage==true}">
	<%@include file="global-sc-manage.jsp" %>
	
	</c:if>
	
	<!-- global soc manage -->
	<c:if test="${clickGlobalSocManage==true}">
	<%@include file="global-soc-manage.jsp" %>
	
	</c:if>
	
	
	<!-- Manage file Result -->
	<c:if test="${manageFileResults==true}">
	<%@include file="manage-results.jsp" %>
	</c:if>
	
	
	<!-- Manage File Notices -->
	<c:if test="${manageFileNotices==true}">
	<%@include file="manage-notices.jsp" %>
	</c:if>
	
	<!--/////////// ece form and results ////////////-->
	<!-- ece l1s1 form-->
	<c:if test="${eceL1S1Form==true}">
	<%@include file="ecel1s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ece l1s2 form -->
	<c:if test="${eceL1S2Form==true}">
	<%@include file="ecel1s2enter.jsp" %>
	
	
	</c:if>
	<!-- ece l2s1 form-->
	<c:if test="${eceL2S1Form==true}">
	<%@include file="ecel2s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ece l2s2 form -->
	<c:if test="${eceL2S2Form==true}">
	<%@include file="ecel2s2enter.jsp" %>
	
	
	</c:if>
	
	<!-- ece l3s1 form-->
	<c:if test="${eceL3S1Form==true}">
	<%@include file="ecel3s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ece l3s2 form -->
	<c:if test="${eceL3S2Form==true}">
	<%@include file="ecel3s2enter.jsp" %>
	
	
	</c:if>
	<!-- ece l4s1 form-->
	<c:if test="${eceL4S1Form==true}">
	<%@include file="ecel4s1enter.jsp" %>
	
	
	</c:if>
	
	<!-- ece l4s2 form -->
	<c:if test="${eceL4S2Form==true}">
	<%@include file="ecel4s2enter.jsp" %>
	</c:if>
	
	<!-- ece l1s1 results -->
	<c:if test="${eceAllResultsl1s1==true}">
	<%@include file="eceallresultsl1s1.jsp" %>
	</c:if>
	<!-- ece l1s2 results -->
	<c:if test="${eceAllResultsl1s2==true}">
	<%@include file="eceallresultsl1s2.jsp" %>
	</c:if>
	<!-- ece l2s1 results -->
	<c:if test="${eceAllResultsl2s1==true}">
	<%@include file="eceallresultsl2s1.jsp" %>
	</c:if>
	<!-- ece l2s2 results -->
	<c:if test="${eceAllResultsl2s2==true}">
	<%@include file="eceallresultsl2s2.jsp" %>
	</c:if>
	
	
	
	<!-- ece l3s1 results -->
	<c:if test="${eceAllResultsl3s1==true}">
	<%@include file="eceallresultsl3s1.jsp" %>
	</c:if>
	<!-- ece l3s2 results -->
	<c:if test="${eceAllResultsl3s2==true}">
	<%@include file="eceallresultsl3s2.jsp" %>
	</c:if>
	<!-- ece l4s1 results -->
	<c:if test="${eceAllResultsl4s1==true}">
	<%@include file="eceallresultsl4s1.jsp" %>
	</c:if>
	<!-- ece l4s2 results -->
	<c:if test="${eceAllResultsl4s2==true}">
	<%@include file="eceallresultsl4s2.jsp" %>
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




