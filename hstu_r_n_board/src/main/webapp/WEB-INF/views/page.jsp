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

window.contextRoot='${contextRoot}';


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
	
	<!-- signup -->
	<c:if test="${clickSignup==true}">
	<%@include file="signup.jsp" %>
     </c:if>
     
	<!-- login -->
	<c:if test="${clickLogin==true}">
	<%@include file="login.jsp" %>	
     </c:if>
	
	<!-- global manage -->
	<c:if test="${clickGlobalManage==true}">
	<%@include file="global-manage.jsp" %>
	</c:if>
	
	<!-- globalAgManage -->
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
	
	
	<!-- agManageResult -->
	<c:if test="${agManageResults==true}">
	<%@include file="ag-manage-results.jsp" %>
	</c:if>
	
	
	<!-- agManageNotices -->
	<c:if test="${agManageNotices==true}">
	<%@include file="ag-manage-notices.jsp" %>
	</c:if>
	
	<!-- cseManageResult -->
	<c:if test="${cseManageResults==true}">
	<%@include file="cse-manage-results.jsp" %>
	</c:if>
	
	
	<!-- cseManageNotices -->
	<c:if test="${cseManageNotices==true}">
	<%@include file="cse-manage-notices.jsp" %>
	</c:if>
	
	<!-- bbaManageResult -->
	<c:if test="${bbaManageResults==true}">
	<%@include file="bba-manage-results.jsp" %>
	</c:if>
	
	
	<!-- bbaManageNotices -->
	<c:if test="${bbaManageNotices==true}">
	<%@include file="bba-manage-notices.jsp" %>
	</c:if>
	
	
	<!-- fisManageResult -->
	<c:if test="${fisManageResults==true}">
	<%@include file="fis-manage-results.jsp" %>
	</c:if>
	
	
	<!-- fisManageNotices -->
	<c:if test="${fisManageNotices==true}">
	<%@include file="fis-manage-notices.jsp" %>
	</c:if>
	
	
	<!-- dvmManageResult -->
	<c:if test="${dvmManageResults==true}">
	<%@include file="dvm-manage-results.jsp" %>
	</c:if>
	
	
	<!-- dvmManageNotices -->
	<c:if test="${dvmManageNotices==true}">
	<%@include file="dvm-manage-notices.jsp" %>
	</c:if>
	
	<!-- engManageResult -->
	<c:if test="${engManageResults==true}">
	<%@include file="eng-manage-results.jsp" %>
	</c:if>
	
	
	<!--engManageNotices -->
	<c:if test="${engManageNotices==true}">
	<%@include file="eng-manage-notices.jsp" %>
	</c:if>
	
	
	<!-- scManageResult -->
	<c:if test="${scManageResults==true}">
	<%@include file="sc-manage-results.jsp" %>
	</c:if>
	
	
	<!-- scManageNotices -->
	<c:if test="${scManageNotices==true}">
	<%@include file="sc-manage-notices.jsp" %>
	</c:if>
	
	<!-- socManageResult -->
	<c:if test="${socManageResults==true}">
	<%@include file="soc-manage-results.jsp" %>
	</c:if>
	
	
	<!-- socManageNotices -->
	<c:if test="${socManageNotices==true}">
	<%@include file="soc-manage-notices.jsp" %>
	</c:if>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

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




