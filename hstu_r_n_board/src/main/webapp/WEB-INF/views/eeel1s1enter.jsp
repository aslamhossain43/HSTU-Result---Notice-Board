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
<h4>Manage Electrical & Electronics Engineering  Results For L1 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel1s1add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL1S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 105--Electrical Circuit-l</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee105" class="form-control" placeholder=""/>
<sf:errors path="eee105" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 106--Electrical Circuit-l Sessional</label>
<div class="col-md-4">
<sf:input path="eee106" class="form-control" placeholder=""/>
<sf:errors path="eee106" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ACH 117--General Chemistry</label>
<div class="col-md-4">
<sf:input path="ach117" class="form-control" placeholder=""/>
<sf:errors path="ach117" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ACH 118 General Chemistry Sessional</label>
<div class="col-md-4">
<sf:input path="ach118" class="form-control" placeholder=""/>
<sf:errors path="ach118" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAP 115--Mechanics,Waves and Oscillations,Optics and Thermal Physics</label>
<div class="col-md-4">
<sf:input path="map115" class="form-control" placeholder=""/>
<sf:errors path="map115" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">MAP 116--Mechanics,Waves and Oscillations,Optics and Thermal Physics Sessional </label>
<div class="col-md-4">
<sf:input path="map116" class="form-control" placeholder=""/>
<sf:errors path="map116" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAP 129--Calculas-l</label>
<div class="col-md-4">
<sf:input path="map129" class="form-control" placeholder=""/>
<sf:errors path="map129" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAP 131--Calculas-ll</label>
<div class="col-md-4">
<sf:input path="map131" class="form-control" placeholder=""/>
<sf:errors path="map131" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">AIE 124--Engineering Drawing</label>
<div class="col-md-4">
<sf:input path="aie124" class="form-control" placeholder=""/>
<sf:errors path="aie124" cssClass="help-block" element="em" />
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




