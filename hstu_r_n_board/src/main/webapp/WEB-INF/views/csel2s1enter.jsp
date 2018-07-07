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
<h4>Manage Computer Science & Engineering  Results For L2 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel2s1add"
 method="POST"
 action="${contextRoot}/manageCse/cseL2S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8"> CSE 201 Object Oriented Programming  </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse201" class="form-control" placeholder=""/>
<sf:errors path="cse201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 202 Object Oriented Programming (C++) Sessional </label>
<div class="col-md-4">
<sf:input path="cse202" class="form-control" placeholder=""/>
<sf:errors path="cse202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 203 Data Structures</label>
<div class="col-md-4">
<sf:input path="cse203" class="form-control" placeholder=""/>
<sf:errors path="cse203" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 204 Data Structures Sessional</label>
<div class="col-md-4">
<sf:input path="cse204" class="form-control" placeholder=""/>
<sf:errors path="cse204" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 205 Numerical Methods</label>
<div class="col-md-4">
<sf:input path="cse205" class="form-control" placeholder=""/>
<sf:errors path="cse205" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CSE 206 Numerical Methods Sessional </label>
<div class="col-md-4">
<sf:input path="cse206" class="form-control" placeholder=""/>
<sf:errors path="cse206" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 209 Electronic Devices and Circuits</label>
<div class="col-md-4">
<sf:input path="eee209" class="form-control" placeholder=""/>
<sf:errors path="eee209" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 210 Electronic Devices and Circuits Sessional</label>
<div class="col-md-4">
<sf:input path="eee210" class="form-control" placeholder=""/>
<sf:errors path="eee210" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAT 201 Mathematics III (Vector, Complex Variable, Fourier Analysis and Laplace Transformation) </label>
<div class="col-md-4">
<sf:input path="mat201" class="form-control" placeholder=""/>
<sf:errors path="mat201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">STT 227 Statistics (Introduction to Statistics and Probability)</label>
<div class="col-md-4">
<sf:input path="stt227" class="form-control" placeholder=""/>
<sf:errors path="stt227" cssClass="help-block" element="em" />
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




