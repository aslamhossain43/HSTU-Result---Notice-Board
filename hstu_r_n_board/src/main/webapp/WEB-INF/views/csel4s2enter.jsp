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
<h4>Manage Computer Science & Engineering  Results For L4 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel4s2add"
 method="POST"
 action="${contextRoot}/manageCse/cseL4S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">CSE 453 Multimedia System and Animation Techniques</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse453" class="form-control" placeholder=""/>
<sf:errors path="cse453" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 454 Multimedia System and Animation Techniques Sessional </label>
<div class="col-md-4">
<sf:input path="cse454" class="form-control" placeholder=""/>
<sf:errors path="cse454" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 455 Computer Ethics and Cyber Law</label>
<div class="col-md-4">
<sf:input path="cse455" class="form-control" placeholder=""/>
<sf:errors path="cse455" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MGT 405 Industrial Management</label>
<div class="col-md-4">
<sf:input path="mgt405" class="form-control" placeholder=""/>
<sf:errors path="mgt405" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option III</label>
<div class="col-md-4">
<sf:input path="cseop3" class="form-control" placeholder=""/>
<sf:errors path="cseop3" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option III Sessional</label>
<div class="col-md-4">
<sf:input path="cseop3s" class="form-control" placeholder=""/>
<sf:errors path="cseop3s" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option IV</label>
<div class="col-md-4">
<sf:input path="cseop4" class="form-control" placeholder=""/>
<sf:errors path="cseop4" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option IV Sessional</label>
<div class="col-md-4">
<sf:input path="cseop4s" class="form-control" placeholder=""/>
<sf:errors path="cseop4s" cssClass="help-block" element="em" />
</div>
</div>



<div class="form-group">
<label class="control-label col-md-8">CSE 452 Project and Thesis Sessional</label>
<div class="col-md-4">
<sf:input path="cse452" class="form-control" placeholder=""/>
<sf:errors path="cse452" cssClass="help-block" element="em" />
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




