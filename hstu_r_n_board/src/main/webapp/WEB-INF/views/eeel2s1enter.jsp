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
<h4>Manage Electrical & Electronics Engineering  Results For L2 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel2s1add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL2S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 211 Electronics-l</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee211" class="form-control" placeholder=""/>
<sf:errors path="eee211" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 212 Electronics-l Sessional</label>
<div class="col-md-4">
<sf:input path="eee212" class="form-control" placeholder=""/>
<sf:errors path="eee212" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 213 Electrical Machine-l</label>
<div class="col-md-4">
<sf:input path="eee213" class="form-control" placeholder=""/>
<sf:errors path="eee213" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 214 Electrical Machine-l Sessional</label>
<div class="col-md-4">
<sf:input path="eee214" class="form-control" placeholder=""/>
<sf:errors path="eee214" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 215 Electromagnetic Fields and Waves</label>
<div class="col-md-4">
<sf:input path="eee215" class="form-control" placeholder=""/>
<sf:errors path="eee215" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">MAP 213 Linear Algebra </label>
<div class="col-md-4">
<sf:input path="map213" class="form-control" placeholder=""/>
<sf:errors path="map213" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">SSL 223 English</label>
<div class="col-md-4">
<sf:input path="ssl223" class="form-control" placeholder=""/>
<sf:errors path="ssl223" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECN 277 Fundamentals of Economics</label>
<div class="col-md-4">
<sf:input path="ecn277" class="form-control" placeholder=""/>
<sf:errors path="ecn277" cssClass="help-block" element="em" />
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




