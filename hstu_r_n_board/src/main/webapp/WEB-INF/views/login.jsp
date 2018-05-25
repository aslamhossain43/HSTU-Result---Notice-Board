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

 <!-- this will be displayed if the credentials are wrong -->
   	<c:if test="${not empty message}">
		<div class="row">
			<div class="col-xs-12 col-md-offset-3 col-md-6">
				<div class="alert alert-danger">${message}</div>
			</div>
		</div>
	</c:if>
 

       
<div class="row">

<div class="col-md-offset-3 col-md-6">
<div class="panel panel-primary">
<div class="panel-heading">
<h4>Login</h4>

</div>
<div class="panel-body">
<!-- this action url must be same as below -->
<form id="loginForm" action="${contextRoot}/login" method="POST" class="form-horizontal">

<div class="form-group">
<label for="username" class=" col-md-4 control-label">Email</label>
<div class="col-md-8">
<input type="text" name="username" id="username" class="form-control">

</div>
</div>
<div class="form-group">
<label for="password" class="col-md-4 control-label">Password</label>
<div class="col-md-8">
<input type="password" name="password" id="password" class="form-control">
</div>


</div>
<div class="form-group">
<div class="col-md-offset-4 col-md-8">

<input type="submit" value="Login" class="btn btn-primary">
 <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
</div>
</div>
</form>



</div>
<div class="panel-footer">
<div class="text-right">

New : <a href="${contextRoot}/signup">Sign up</a>
</div>
</div>




</div>


</div>

</div>



</div>


</div>









	<!--footer -->
	<%@include file="./shared/footer.jsp"%>
    <!-- core js -->
	<script src="${js}/jquery.js"></script>
	<!-- jquery validate -->
	
	<script src="${js}/jquery.validate.js"></script>
	<!-- Bootstrap core js -->
	<script src="${js}/bootstrap.js"></script>
    
    <!-- custom js -->
	<script src="${js}/myapp.js"></script>
	</div>

</body>

</html>




