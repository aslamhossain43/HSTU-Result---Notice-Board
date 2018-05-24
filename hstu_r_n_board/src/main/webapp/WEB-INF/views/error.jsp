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

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- css readable theme for font style -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">


</head>

<body>
       <div class="wrapper">
       <!-- navigation bar -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
	<div class="navbar-header">
	
	<a class="navbar-brand" href="${contextRoot}/home">HOME</a>
	</div>
	</div>
	
	</nav>

<!-- page content -->
<div class="content">
<div class="container">
<div class="row">
<div class="col-xs-12">
<div class="jumbotron">
<h4>${errorTitle}</h4>
<hr>
<blockquote style="word-wrap:break-word">
${errorDescription}
</blockquote>
</div>


</div>


</div>

</div>


</div>

	<!--footer -->
	<%@include file="./shared/footer.jsp"%>
    <!-- core js -->
	<script src="${js}/jquery.js"></script>
	
	<!-- Bootstrap core js -->
	<script src="${js}/bootstrap.js"></script>
    
    <!-- custom js -->
	<script src="${js}/myapp.js"></script>
	</div>

</body>

</html>




