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
<h4>Manage Electronics & Communication Engineering  Results For L3 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel3s2add"
 method="POST"
 action="${contextRoot}/manageEce/eceL3S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">ECE 317 Optical Fiber Communication System</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ece317" class="form-control" placeholder=""/>
<sf:errors path="ece317" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 318 Optical Fiber Communication System Sessional </label>
<div class="col-md-4">
<sf:input path="ece318" class="form-control" placeholder=""/>
<sf:errors path="ece318" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 319 Microwave Engineering</label>
<div class="col-md-4">
<sf:input path="ece319" class="form-control" placeholder=""/>
<sf:errors path="ece319" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 320 Microwave Engineering Sessional</label>
<div class="col-md-4">
<sf:input path="ece320" class="form-control" placeholder=""/>
<sf:errors path="ece320" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 321 Network Analysis and Internetwork Design</label>
<div class="col-md-4">
<sf:input path="ece321" class="form-control" placeholder=""/>
<sf:errors path="ece321" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 322 Network Analysis and Internetwork Design Sessional </label>
<div class="col-md-4">
<sf:input path="ece322" class="form-control" placeholder=""/>
<sf:errors path="ece322" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 377 Internet & Multimedia Communication</label>
<div class="col-md-4">
<sf:input path="cse377" class="form-control" placeholder=""/>
<sf:errors path="cse377" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 378 Internet & Multimedia Communication Sessional </label>
<div class="col-md-4">
<sf:input path="cse378" class="form-control" placeholder=""/>
<sf:errors path="cse378" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">CSE 371 Microelectronics & VLSI Design</label>
<div class="col-md-4">
<sf:input path="cse371" class="form-control" placeholder=""/>
<sf:errors path="cse371" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">CSE 372 Microelectronics & VLSI Design Sessional</label>
<div class="col-md-4">
<sf:input path="cse372" class="form-control" placeholder=""/>
<sf:errors path="cse372" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECN 307 Economics</label>
<div class="col-md-4">
<sf:input path="ecn307" class="form-control" placeholder=""/>
<sf:errors path="ecn307" cssClass="help-block" element="em" />
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




