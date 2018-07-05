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
<h4>Manage Electrical & Electronics Engineering  Results For L4 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel4s1add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL4S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 400 Project/Thesis</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee400" class="form-control" placeholder=""/>
<sf:errors path="eee400" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 403 Solid State Devices & VLSI</label>
<div class="col-md-4">
<sf:input path="eee403" class="form-control" placeholder=""/>
<sf:errors path="eee403" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 405 Control System</label>
<div class="col-md-4">
<sf:input path="eee405" class="form-control" placeholder=""/>
<sf:errors path="eee405" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 406 Control System Sessional </label>
<div class="col-md-4">
<sf:input path="eee406" class="form-control" placeholder=""/>
<sf:errors path="eee406" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Elective l One course from  Elective l</label>
<div class="col-md-4">
<sf:input path="effective1" class="form-control" placeholder=""/>
<sf:errors path="effective1" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Elective ll One course from  Elective ll ( Theory+ Sessional) </label>
<div class="col-md-4">
<sf:input path="effective2" class="form-control" placeholder=""/>
<sf:errors path="effective2" cssClass="help-block" element="em" />
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




