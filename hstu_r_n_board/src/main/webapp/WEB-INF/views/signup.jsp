<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="security"  uri="http://www.springframework.org/security/tags" %>
<div class="container">
<c:if test="${not empty message}">
<div class="row">
<!-- this is for message  -->
<div class="col-md-offset-2 col-md-8">
<div class="alert alert-danger fade in">${message}</div>
</div>
</div>
</c:if>

<div class="row">
<div class="col-md-offset-2 col-md-8">
<div class="panel panel-primary">
<div class="panel-heading">
<h4>Registration Form</h4>

</div>
<div class="panel-body">
<sf:form class="form-horizontal"
 modelAttribute="registration" 
 action="${contextRoot}/signup/signup"
  method="POST"
  id="signupForm"
  >
<div class="form-group">
<label class="control-label col-md-4">First Name</label>
<div class="col-md-8">
<sf:input type="text" path="first_name" class="form-control" placeholder="First Name" />
<sf:errors path="first_name" cssClass="help-block" element="em"/>

</div>
</div>

<div class="form-group">
<label class="control-label col-md-4"> Last Name</label>
<div class="col-md-8">
<sf:input type="text"  path="last_name" class="form-control" placeholder="Last Name" />
<sf:errors path="last_name" cssClass="help-block" element="em"/>

</div>

</div>




<div class="form-group">
<label class="control-label col-md-4">Phone</label>
<div class="col-md-8">
<sf:input type="text" path="phone" class="form-control" placeholder="Phone" />
<sf:errors path="phone" cssClass="help-block" element="em"/>
</div>

</div>


<div class="form-group">
<label class="control-label col-md-4">Email</label>

<div class="col-md-8">
<sf:input type="email" path="email" class="form-control" placeholder="Email"/>
<sf:errors path="email" cssClass="help-block" element="em"/>
</div>


</div>

<div class="form-group">
<label class="control-label col-md-4">Password</label>

<div class="col-md-8">
<sf:input type="password" path="password" class="form-control" placeholder="Password"/>
<sf:errors path="password" cssClass="help-block" element="em"/>
</div>


</div>



<div class="form-group">
<label class="control-label col-md-4">Confirm Password</label>

<div class="col-md-8">
<sf:input type="password" path="confirm_password" class="form-control" placeholder="Confirm Password"/>
<sf:errors path="confirm_password" cssClass="help-block" element="em"/>
</div>


</div>


<div class="form-group">
<label class="control-label col-md-4"> Select Role</label>
<div class="col-md-8">
<label class="radio-inline">
<sf:radiobutton path="role" value="STUDENT" checked="checked"/>Student</label>

<label class="radio-inline"><sf:radiobutton path="role" value="ADMIN"/>Admin</label>


</div>


</div>

<div class="form-group"> 
<div class="col-offset-4 col-md-4">

<button type="submit" class="btn btn-primary">Sign Up</button>


</div>


</div>

</sf:form>


</div>

</div>




</div>




</div>
</div>













