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
<h4>Manage Computer Science & Engineering  Results For L2 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel2s2add"
 method="POST"
 action="${contextRoot}/manageCse/cseL2S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8"> CSE 254 Object Oriented Programming (Java) Sessional </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse254" class="form-control" placeholder=""/>
<sf:errors path="cse254" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 255 Algorithms Analysis and Design</label>
<div class="col-md-4">
<sf:input path="cse255" class="form-control" placeholder=""/>
<sf:errors path="cse255" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 256 Algorithms Analysis and Design Sessional</label>
<div class="col-md-4">
<sf:input path="cse256" class="form-control" placeholder=""/>
<sf:errors path="cse256" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 257 Theory of Computation and Concrete Mathematics</label>
<div class="col-md-4">
<sf:input path="cse257" class="form-control" placeholder=""/>
<sf:errors path="cse257" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 258 Theory of Computation and Concrete Mathematics Sessional</label>
<div class="col-md-4">
<sf:input path="cse258" class="form-control" placeholder=""/>
<sf:errors path="cse258" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CSE 259 Computer Architecture and Organization</label>
<div class="col-md-4">
<sf:input path="cse259" class="form-control" placeholder=""/>
<sf:errors path="cse259" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 259 Digital Electronics and Pulse Techniques</label>
<div class="col-md-4">
<sf:input path="ece259" class="form-control" placeholder=""/>
<sf:errors path="ece259" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 260 Digital Electronics and Pulse Techniques Sessional</label>
<div class="col-md-4">
<sf:input path="ece260" class="form-control" placeholder=""/>
<sf:errors path="ece260" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ACT 205 Financial and Managerial Accounting </label>
<div class="col-md-4">
<sf:input path="act205" class="form-control" placeholder=""/>
<sf:errors path="act205" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 252 Application Development Sessional</label>
<div class="col-md-4">
<sf:input path="cse252" class="form-control" placeholder=""/>
<sf:errors path="cse252" cssClass="help-block" element="em" />
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




