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
<h4>Manage Electronics & Communication Engineering  Results For L4 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel4s1add"
 method="POST"
 action="${contextRoot}/manageEce/eceL4S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 423 Industrial and Power Electronics</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee423" class="form-control" placeholder=""/>
<sf:errors path="eee423" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 424 Industrial and Power Electronics Sessional</label>
<div class="col-md-4">
<sf:input path="eee424" class="form-control" placeholder=""/>
<sf:errors path="eee424" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 425 Digital Signal Processing & Filter Design</label>
<div class="col-md-4">
<sf:input path="ece425" class="form-control" placeholder=""/>
<sf:errors path="ece425" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 426 Digital Signal Processing & Filter Design Sessional </label>
<div class="col-md-4">
<sf:input path="ece426" class="form-control" placeholder=""/>
<sf:errors path="ece426" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 451 Optoelectronic Devices</label>
<div class="col-md-4">
<sf:input path="ece451" class="form-control" placeholder=""/>
<sf:errors path="ece451" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 452 Optoelectronic Devices Sessional</label>
<div class="col-md-4">
<sf:input path="ece452" class="form-control" placeholder=""/>
<sf:errors path="ece452" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 427 Telecommunication Engineering</label>
<div class="col-md-4">
<sf:input path="ece427" class="form-control" placeholder=""/>
<sf:errors path="ece427" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 428 Telecommunication Engineering Sessional</label>
<div class="col-md-4">
<sf:input path="ece428" class="form-control" placeholder=""/>
<sf:errors path="ece428" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 431 Research Methodology</label>
<div class="col-md-4">
<sf:input path="ece431" class="form-control" placeholder=""/>
<sf:errors path="ece431" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 429 Cryptography & Network Security</label>
<div class="col-md-4">
<sf:input path="ece429" class="form-control" placeholder=""/>
<sf:errors path="ece429" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 471 Information Theory & Error Coding</label>
<div class="col-md-4">
<sf:input path="ece471" class="form-control" placeholder=""/>
<sf:errors path="ece471" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 402 Project/ Thesis Sessional</label>
<div class="col-md-4">
<sf:input path="ece402" class="form-control" placeholder=""/>
<sf:errors path="ece402" cssClass="help-block" element="em" />
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




