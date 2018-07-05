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
<h4>Manage Electrical & Electronics Engineering  Results For L3 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel3s1add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL3S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 307  Optoelectronics</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee307" class="form-control" placeholder=""/>
<sf:errors path="eee307" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 309 Digital Electronics</label>
<div class="col-md-4">
<sf:input path="eee309" class="form-control" placeholder=""/>
<sf:errors path="eee309" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 310 Digital Electronics  Sessional</label>
<div class="col-md-4">
<sf:input path="eee310" class="form-control" placeholder=""/>
<sf:errors path="eee310" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 311 Transmission & Distribution of Electrical Power </label>
<div class="col-md-4">
<sf:input path="eee311" class="form-control" placeholder=""/>
<sf:errors path="eee311" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 351 Communication Theory</label>
<div class="col-md-4">
<sf:input path="ece351" class="form-control" placeholder=""/>
<sf:errors path="ece351" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 352 Communication Theory  Sessional</label>
<div class="col-md-4">
<sf:input path="ece352" class="form-control" placeholder=""/>
<sf:errors path="ece352" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 300 Electrical Services Desing</label>
<div class="col-md-4">
<sf:input path="eee300" class="form-control" placeholder=""/>
<sf:errors path="eee300" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 315 Electrical Properties of Material</label>
<div class="col-md-4">
<sf:input path="eee315" class="form-control" placeholder=""/>
<sf:errors path="eee315" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8"> ACT 305 Financial and Managerial Accounting</label>
<div class="col-md-4">
<sf:input path="act305" class="form-control" placeholder=""/>
<sf:errors path="act305" cssClass="help-block" element="em" />
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




