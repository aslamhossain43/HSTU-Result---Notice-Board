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
<h4>Manage Electronics & Communication Engineering  Results For L1 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel1s1add"
 method="POST"
 action="${contextRoot}/manageEce/eceL1S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Basic Information Technologies--CSE 107</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse107" class="form-control" placeholder=""/>
<sf:errors path="cse107" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Information Technology Sessional--CSE 108</label>
<div class="col-md-4">
<sf:input path="cse108" class="form-control" placeholder=""/>
<sf:errors path="cse108" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Mathematics-I--MAT 109</label>
<div class="col-md-4">
<sf:input path="mat109" class="form-control" placeholder=""/>
<sf:errors path="mat109" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Mechanical Engineering--AIE 107</label>
<div class="col-md-4">
<sf:input path="aie107" class="form-control" placeholder=""/>
<sf:errors path="aie107" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Mechanical Engineering Sessional--AIE 108</label>
<div class="col-md-4">
<sf:input path="aie108" class="form-control" placeholder=""/>
<sf:errors path="aie108" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">English--SSL 107</label>
<div class="col-md-4">
<sf:input path="ssl107" class="form-control" placeholder=""/>
<sf:errors path="ssl107" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Electromagnetism, Optics and Modern Physics--PHY 111</label>
<div class="col-md-4">
<sf:input path="phy111" class="form-control" placeholder=""/>
<sf:errors path="phy111" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Electromagnetism, Optics and Modern Physics Sessional--PHY 112</label>
<div class="col-md-4">
<sf:input path="phy112" class="form-control" placeholder=""/>
<sf:errors path="phy112" cssClass="help-block" element="em" />
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




