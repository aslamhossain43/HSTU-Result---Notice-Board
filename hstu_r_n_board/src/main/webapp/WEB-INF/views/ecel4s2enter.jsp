<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
<div class="row">

<c:if test="${not empty message}">
<div class="row">
<div class="col-md-8 col-md-offset-2">
<div class="alert alert-info fade in">${message}</div>
</div>
</div>
</c:if>

<div class="col-md-10 col-md-offset-1">


<div class="panel panel-primary">
<div class="panel-heading">
<h4>Manage Electronics & Communication Engineering  Results For L4 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel4s2add"
 method="POST"
 action="${contextRoot}/manageEce/eceL4S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">ECE 475 Bio-medical Signal Processing</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ece475" class="form-control" placeholder=""/>
<sf:errors path="ece475" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 476 Bio-medical Signal Processing Sessional</label>
<div class="col-md-4">
<sf:input path="ece476" class="form-control" placeholder=""/>
<sf:errors path="ece476" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 437 Wireless & Mobile Communication</label>
<div class="col-md-4">
<sf:input path="ece437" class="form-control" placeholder=""/>
<sf:errors path="ece437" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 438 Wireless & Mobile Communication Sessional </label>
<div class="col-md-4">
<sf:input path="ece438" class="form-control" placeholder=""/>
<sf:errors path="ece438" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 477 Modern Radio & TV System</label>
<div class="col-md-4">
<sf:input path="ece477" class="form-control" placeholder=""/>
<sf:errors path="ece477" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 478 Modern Radio & TV System Sessional</label>
<div class="col-md-4">
<sf:input path="ece478" class="form-control" placeholder=""/>
<sf:errors path="ece478" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 439 Telecom Business and Management</label>
<div class="col-md-4">
<sf:input path="ece439" class="form-control" placeholder=""/>
<sf:errors path="ece439" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 435 Teletrafic Engineering</label>
<div class="col-md-4">
<sf:input path="ece435" class="form-control" placeholder=""/>
<sf:errors path="ece435" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 404 Project/ Thesis Sessional</label>
<div class="col-md-4">
<sf:input path="ece404" class="form-control" placeholder=""/>
<sf:errors path="ece404" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 400 Internship/ Proect </label>
<div class="col-md-4">
<sf:input path="ece400" class="form-control" placeholder=""/>
<sf:errors path="ece400" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<div class="col-md-6 col-md-offset-3">
<input type="submit" value="Submit" class="btn btn-primary" >
</div>

</div>


</sf:form>


</div>
</div>
</div>
</div>
</div>




