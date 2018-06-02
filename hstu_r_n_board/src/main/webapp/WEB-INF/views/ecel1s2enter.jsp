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
<h4>Manage Electronics & Communication Engineering  Results For L1 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel1s2add"
 method="POST"
 action="${contextRoot}/manageEce/eceL1S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Engineering Drawing and AutoCAD Sessional--AIE 110</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="aie110" class="form-control" placeholder=""/>
<sf:errors path="aie110" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Mathematics-II--MAT 113</label>
<div class="col-md-4">
<sf:input path="mat113" class="form-control" placeholder=""/>
<sf:errors path="mat113" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Electronics--ECE 101</label>
<div class="col-md-4">
<sf:input path="ece101" class="form-control" placeholder=""/>
<sf:errors path="ece101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Electronics Sessional--ECE 102</label>
<div class="col-md-4">
<sf:input path="ece102" class="form-control" placeholder=""/>
<sf:errors path="ece102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Electrical Engineering--EEE 103</label>
<div class="col-md-4">
<sf:input path="eee103" class="form-control" placeholder=""/>
<sf:errors path="eee103" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Basic Electrical Engineering Sessional--EEE 104</label>
<div class="col-md-4">
<sf:input path="eee104" class="form-control" placeholder=""/>
<sf:errors path="eee104" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Sociology & Government--SOC 105</label>
<div class="col-md-4">
<sf:input path="soc105" class="form-control" placeholder=""/>
<sf:errors path="soc105" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Computer Programming--CSE 159</label>
<div class="col-md-4">
<sf:input path="cse159" class="form-control" placeholder=""/>
<sf:errors path="cse159" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Computer Programming Sessional--CSE 160</label>
<div class="col-md-4">
<sf:input path="cse160" class="form-control" placeholder=""/>
<sf:errors path="cse160" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Discrete Mathematics and Numerical Analysis --CSE 161</label>
<div class="col-md-4">
<sf:input path="cse161" class="form-control" placeholder=""/>
<sf:errors path="cse161" cssClass="help-block" element="em" />
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




