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
<h4>Manage Electronics & Communication Engineering  Results For L3 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="ecel3s1add"
 method="POST"
 action="${contextRoot}/manageEce/eceL3S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">CSE 315 Database Management System</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse315" class="form-control" placeholder=""/>
<sf:errors path="cse315" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 316 Database Management System Sessional</label>
<div class="col-md-4">
<sf:input path="cse316" class="form-control" placeholder=""/>
<sf:errors path="cse316" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 313 Electronic Field Wave and Antenna</label>
<div class="col-md-4">
<sf:input path="ece313" class="form-control" placeholder=""/>
<sf:errors path="ece313" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 314 Electronic Field Wave and Antenna Sessional </label>
<div class="col-md-4">
<sf:input path="ece314" class="form-control" placeholder=""/>
<sf:errors path="ece314" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 315 LAN,WAN & Routing Principles</label>
<div class="col-md-4">
<sf:input path="ece315" class="form-control" placeholder=""/>
<sf:errors path="ece315" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 316 LAN,WAN & Routing Principles Sessional</label>
<div class="col-md-4">
<sf:input path="ece316" class="form-control" placeholder=""/>
<sf:errors path="ece316" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 329 Telecommunication Hardware & Interfacing </label>
<div class="col-md-4">
<sf:input path="ece329" class="form-control" placeholder=""/>
<sf:errors path="ece329" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ECE 330 Telecommunication Hardware & Interfacing Sessional </label>
<div class="col-md-4">
<sf:input path="ece330" class="form-control" placeholder=""/>
<sf:errors path="ece330" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">ACT 307 Financial & Managerial Accounting</label>
<div class="col-md-4">
<sf:input path="act307" class="form-control" placeholder=""/>
<sf:errors path="act307" cssClass="help-block" element="em" />
</div>
</div>



<div class="form-group">
<label class="control-label col-md-8">CSE 317 Microprocessor & Embeded System Design </label>
<div class="col-md-4">
<sf:input path="cse317" class="form-control" placeholder=""/>
<sf:errors path="cse317" cssClass="help-block" element="em" />
</div>
</div>
<div class="form-group">
<label class="control-label col-md-8">CSE 318 Microprocessor & Embeded System Design Sessional</label>
<div class="col-md-4">
<sf:input path="cse318" class="form-control" placeholder=""/>
<sf:errors path="cse318" cssClass="help-block" element="em" />
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




