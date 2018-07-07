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
<h4>Manage Computer Science & Engineering  Results For L4 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel4s1add"
 method="POST"
 action="${contextRoot}/manageCse/cseL4S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">CSE 403 Artificial Intelligence </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse403" class="form-control" placeholder=""/>
<sf:errors path="cse403" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 404 Artificial Intelligence Sessional </label>
<div class="col-md-4">
<sf:input path="cse404" class="form-control" placeholder=""/>
<sf:errors path="cse404" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 405 Computer Graphics and Image Processing</label>
<div class="col-md-4">
<sf:input path="cse405" class="form-control" placeholder=""/>
<sf:errors path="cse405" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 406 Computer Graphics and Image Processing Sessional</label>
<div class="col-md-4">
<sf:input path="cse406" class="form-control" placeholder=""/>
<sf:errors path="cse406" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option I</label>
<div class="col-md-4">
<sf:input path="cseop1" class="form-control" placeholder=""/>
<sf:errors path="cseop1" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option I Sessional</label>
<div class="col-md-4">
<sf:input path="cseop1s" class="form-control" placeholder=""/>
<sf:errors path="cseop1s" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option II</label>
<div class="col-md-4">
<sf:input path="cseop2" class="form-control" placeholder=""/>
<sf:errors path="cseop2" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 4** Option II Sessional</label>
<div class="col-md-4">
<sf:input path="cseop2s" class="form-control" placeholder=""/>
<sf:errors path="cseop2s" cssClass="help-block" element="em" />
</div>
</div>



<div class="form-group">
<label class="control-label col-md-8">CSE 408 Technical Writing and Presentation Skill Development Sessional</label>
<div class="col-md-4">
<sf:input path="cse408" class="form-control" placeholder=""/>
<sf:errors path="cse408" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 402 Project and Thesis Sessional</label>
<div class="col-md-4">
<sf:input path="cse402" class="form-control" placeholder=""/>
<sf:errors path="cse402" cssClass="help-block" element="em" />
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




