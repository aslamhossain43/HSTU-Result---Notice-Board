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
<h4>Manage Computer Science & Engineering  Results For L3 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel3s2add"
 method="POST"
 action="${contextRoot}/manageCse/cseL3S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">CSE 353 Operating System</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse353" class="form-control" placeholder=""/>
<sf:errors path="cse353" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 354 Operating System Sessional </label>
<div class="col-md-4">
<sf:input path="cse354" class="form-control" placeholder=""/>
<sf:errors path="cse354" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 355 Web Engineering </label>
<div class="col-md-4">
<sf:input path="cse355" class="form-control" placeholder=""/>
<sf:errors path="cse355" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 356 Web Engineering Sessional</label>
<div class="col-md-4">
<sf:input path="cse356" class="form-control" placeholder=""/>
<sf:errors path="cse356" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 357 Computer Networks</label>
<div class="col-md-4">
<sf:input path="cse357" class="form-control" placeholder=""/>
<sf:errors path="cse357" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CSE 358 Computer Networks Sessional</label>
<div class="col-md-4">
<sf:input path="cse358" class="form-control" placeholder=""/>
<sf:errors path="cse358" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 359 Compiler Design</label>
<div class="col-md-4">
<sf:input path="cse359" class="form-control" placeholder=""/>
<sf:errors path="cse359" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 360 Compiler Design Sessional</label>
<div class="col-md-4">
<sf:input path="cse360" class="form-control" placeholder=""/>
<sf:errors path="cse360" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 361 Mathematical Analysis for Computer Science </label>
<div class="col-md-4">
<sf:input path="cse361" class="form-control" placeholder=""/>
<sf:errors path="cse361" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 352 Web and Mobile Application Development Sessional</label>
<div class="col-md-4">
<sf:input path="cse352" class="form-control" placeholder=""/>
<sf:errors path="cse352" cssClass="help-block" element="em" />
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




