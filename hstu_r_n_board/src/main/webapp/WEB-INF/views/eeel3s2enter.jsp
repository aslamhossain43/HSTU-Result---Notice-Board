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
<h4>Manage Electrical & Electronics Engineering  Results For L3 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel3s2add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL3S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 317 Industrial and Power Electronics</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee317" class="form-control" placeholder=""/>
<sf:errors path="eee317" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 318 Industrial and Power Electronics Sessional</label>
<div class="col-md-4">
<sf:input path="eee318" class="form-control" placeholder=""/>
<sf:errors path="eee318" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 353 Digital Signal Processing</label>
<div class="col-md-4">
<sf:input path="ece353" class="form-control" placeholder=""/>
<sf:errors path="ece353" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 354 Digital Signal Processing Sessional </label>
<div class="col-md-4">
<sf:input path="ece354" class="form-control" placeholder=""/>
<sf:errors path="ece354" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CEN 331 Microprocessor and Interfacing</label>
<div class="col-md-4">
<sf:input path="cen331" class="form-control" placeholder=""/>
<sf:errors path="cen331" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">CEN 332 Microprocessor and Interfacing  Sessional</label>
<div class="col-md-4">
<sf:input path="cen332" class="form-control" placeholder=""/>
<sf:errors path="cen332" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 323 Power System-l</label>
<div class="col-md-4">
<sf:input path="eee323" class="form-control" placeholder=""/>
<sf:errors path="eee323" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 324 Power System-l  Sessional</label>
<div class="col-md-4">
<sf:input path="eee324" class="form-control" placeholder=""/>
<sf:errors path="eee324" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8"> MGT 309 Industrial Management</label>
<div class="col-md-4">
<sf:input path="mgt309" class="form-control" placeholder=""/>
<sf:errors path="mgt309" cssClass="help-block" element="em" />
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




