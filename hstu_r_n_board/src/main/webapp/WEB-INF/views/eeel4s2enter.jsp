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
<h4>Manage Electrical & Electronics Engineering  Results For L4 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel4s2add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL4S2Add">
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
<label class="control-label col-md-8">EEE 407 Microcontroller Based System Design</label>
<div class="col-md-4">
<sf:input path="eee407" class="form-control" placeholder=""/>
<sf:errors path="eee407" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 408 Microcontroller Based System Design Sessional </label>
<div class="col-md-4">
<sf:input path="eee408" class="form-control" placeholder=""/>
<sf:errors path="eee408" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Elective lll One course from  Elective lll ( Theory+ Sessional)</label>
<div class="col-md-4">
<sf:input path="effective3" class="form-control" placeholder=""/>
<sf:errors path="effective3" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Elective lV One course from  Elective lV</label>
<div class="col-md-4">
<sf:input path="effective4" class="form-control" placeholder=""/>
<sf:errors path="effective4" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Elective V One course from  Elective V </label>
<div class="col-md-4">
<sf:input path="effective5" class="form-control" placeholder=""/>
<sf:errors path="effective5" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 444 Industrial Training</label>
<div class="col-md-4">
<sf:input path="eee444" class="form-control" placeholder=""/>
<sf:errors path="eee444" cssClass="help-block" element="em" />
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




