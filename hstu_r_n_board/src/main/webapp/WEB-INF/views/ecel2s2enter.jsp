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
<h4>Manage Electronics & Communication Engineering  Results For L2 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel2s2add"
 method="POST"
 action="${contextRoot}/manageEce/eceL2S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Digital Communications--ECE 211</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ece211" class="form-control" placeholder=""/>
<sf:errors path="ece211" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Digital Communications Sessional--ECE 212</label>
<div class="col-md-4">
<sf:input path="ece212" class="form-control" placeholder=""/>
<sf:errors path="ece212" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Principles of Telecommunication Networks--ECE 207</label>
<div class="col-md-4">
<sf:input path="ece207" class="form-control" placeholder=""/>
<sf:errors path="ece207" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Principles of Telecommunication Networks Sessional --ECE 208</label>
<div class="col-md-4">
<sf:input path="ece208" class="form-control" placeholder=""/>
<sf:errors path="ece208" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Signal and Systems--ECE 209</label>
<div class="col-md-4">
<sf:input path="ece209" class="form-control" placeholder=""/>
<sf:errors path="ece209" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Signal and Systems Sessional--ECE 210</label>
<div class="col-md-4">
<sf:input path="ece210" class="form-control" placeholder=""/>
<sf:errors path="ece210" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Electrical Machines and Measurements--EEE 207</label>
<div class="col-md-4">
<sf:input path="eee207" class="form-control" placeholder=""/>
<sf:errors path="eee207" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Electrical Machines and Measurements Sessional--EEE 208</label>
<div class="col-md-4">
<sf:input path="eee208" class="form-control" placeholder=""/>
<sf:errors path="eee208" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Visual Programming--CSE 261</label>
<div class="col-md-4">
<sf:input path="cse261" class="form-control" placeholder=""/>
<sf:errors path="cse261" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Visual Programming Sessional--CSE 262</label>
<div class="col-md-4">
<sf:input path="cse262" class="form-control" placeholder=""/>
<sf:errors path="cse262" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Mathematics-IV--MAT 207</label>
<div class="col-md-4">
<sf:input path="mat207" class="form-control" placeholder=""/>
<sf:errors path="mat207" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">Industrial Tour  Sessional--ECE 200</label>
<div class="col-md-4">
<sf:input path="ece200" class="form-control" placeholder=""/>
<sf:errors path="ece200" cssClass="help-block" element="em" />
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




