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
<h4>Manage Electrical & Electronics Engineering  Results For L1 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel1s2add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL1S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 107 Electrical Circuit-ll</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee107" class="form-control" placeholder=""/>
<sf:errors path="eee107" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 108 Electrical Circuit-ll Sessional</label>
<div class="col-md-4">
<sf:input path="eee108" class="form-control" placeholder=""/>
<sf:errors path="eee108" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 110 Electrical Circuit Simulation Laboratory</label>
<div class="col-md-4">
<sf:input path="eee110" class="form-control" placeholder=""/>
<sf:errors path="eee110" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAP 133 Modern Physics,Electricity and Magnetism</label>
<div class="col-md-4">
<sf:input path="map133" class="form-control" placeholder=""/>
<sf:errors path="map133" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAP 134 Physics Sessional</label>
<div class="col-md-4">
<sf:input path="map134" class="form-control" placeholder=""/>
<sf:errors path="map134" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CIT 117 Computer programming </label>
<div class="col-md-4">
<sf:input path="cit117" class="form-control" placeholder=""/>
<sf:errors path="cit117" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CIT 118 Computer programming sessional</label>
<div class="col-md-4">
<sf:input path="cit118" class="form-control" placeholder=""/>
<sf:errors path="cit118" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAP 135 Ordinary and partial Differential Equations</label>
<div class="col-md-4">
<sf:input path="map135" class="form-control" placeholder=""/>
<sf:errors path="map135" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">SSL 121 Sociology</label>
<div class="col-md-4">
<sf:input path="ssl121" class="form-control" placeholder=""/>
<sf:errors path="ssl121" cssClass="help-block" element="em" />
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




