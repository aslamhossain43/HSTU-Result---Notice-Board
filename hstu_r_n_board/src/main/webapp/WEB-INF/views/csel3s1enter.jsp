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
<h4>Manage Computer Science & Engineering  Results For L3 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel3s1add"
 method="POST"
 action="${contextRoot}/manageCse/cseL3S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">CSE 303 Database</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse303" class="form-control" placeholder=""/>
<sf:errors path="cse303" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 304 Database Sessional </label>
<div class="col-md-4">
<sf:input path="cse304" class="form-control" placeholder=""/>
<sf:errors path="cse304" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 305 Software Engineering</label>
<div class="col-md-4">
<sf:input path="cse305" class="form-control" placeholder=""/>
<sf:errors path="cse305" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 307 Microprocessor and Interfacing </label>
<div class="col-md-4">
<sf:input path="cse307" class="form-control" placeholder=""/>
<sf:errors path="cse307" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 308 Microprocessor and Interfacing Sessional</label>
<div class="col-md-4">
<sf:input path="cse308" class="form-control" placeholder=""/>
<sf:errors path="cse308" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">ECE 311  Data Communication </label>
<div class="col-md-4">
<sf:input path="ece311" class="form-control" placeholder=""/>
<sf:errors path="ece311" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECN 305 Economics </label>
<div class="col-md-4">
<sf:input path="ecn305" class="form-control" placeholder=""/>
<sf:errors path="ecn305" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 302 Software Development Sessional</label>
<div class="col-md-4">
<sf:input path="cse302" class="form-control" placeholder=""/>
<sf:errors path="cse302" cssClass="help-block" element="em" />
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




