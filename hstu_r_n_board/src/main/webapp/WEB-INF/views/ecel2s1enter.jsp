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
<h4>Manage Electronics & Communication Engineering  Results For L2 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel2s1add"
 method="POST"
 action="${contextRoot}/manageEce/eceL2S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Analog Communications--ECE 205</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ece205" class="form-control" placeholder=""/>
<sf:errors path="ece205" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Analog Communications Sessional--ECE 206</label>
<div class="col-md-4">
<sf:input path="ece206" class="form-control" placeholder=""/>
<sf:errors path="ece206" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Data Structure and Algorithms--CSE 211</label>
<div class="col-md-4">
<sf:input path="cse211" class="form-control" placeholder=""/>
<sf:errors path="cse211" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Electronic Circuits & Devices--ECE 203</label>
<div class="col-md-4">
<sf:input path="ece203" class="form-control" placeholder=""/>
<sf:errors path="ece203" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Electronic Circuits & Devices Sessional--ECE 204</label>
<div class="col-md-4">
<sf:input path="ece204" class="form-control" placeholder=""/>
<sf:errors path="ece204" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Digital Electronic & Logic Design--CSE 213</label>
<div class="col-md-4">
<sf:input path="cse213" class="form-control" placeholder=""/>
<sf:errors path="cse213" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Digital Electronic & Logic Design Sessional--CSE 214</label>
<div class="col-md-4">
<sf:input path="cse214" class="form-control" placeholder=""/>
<sf:errors path="cse214" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Basic Statistics and Probability Theory--STT 211</label>
<div class="col-md-4">
<sf:input path="stt211" class="form-control" placeholder=""/>
<sf:errors path="stt211" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Basic Statistics and Probability Theory Sessional--STT 212</label>
<div class="col-md-4">
<sf:input path="stt212" class="form-control" placeholder=""/>
<sf:errors path="stt212" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Mathematics-III--MAT 205</label>
<div class="col-md-4">
<sf:input path="mat205" class="form-control" placeholder=""/>
<sf:errors path="mat205" cssClass="help-block" element="em" />
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




