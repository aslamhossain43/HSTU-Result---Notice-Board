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
<h4>Manage Agriculture  Results For L4 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl4s1add"
 method="POST"
 action="${contextRoot}/manageAg/agL4S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Economic Entomology--ENT 401</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ent401" class="form-control" placeholder=""/>
<sf:errors path="ent401" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Economic Entomology--ENT 402</label>
<div class="col-md-4">
<sf:input path="ent402" class="form-control" placeholder=""/>
<sf:errors path="ent402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Plant Ecology--CBT 401</label>
<div class="col-md-4">
<sf:input path="cbt401" class="form-control" placeholder=""/>
<sf:errors path="cbt401" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Plant Ecology--CBT 402</label>
<div class="col-md-4">
<sf:input path="cbt402" class="form-control" placeholder=""/>
<sf:errors path="cbt402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Extension Organization and Management--AEX 401</label>
<div class="col-md-4">
<sf:input path="aex401" class="form-control" placeholder=""/>
<sf:errors path="aex401" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Extension Organization and Management--AEX 402</label>
<div class="col-md-4">
<sf:input path="aex402" class="form-control" placeholder=""/>
<sf:errors path="aex402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Pomology--HRT 401</label>
<div class="col-md-4">
<sf:input path="hrt401" class="form-control" placeholder=""/>
<sf:errors path="hrt401" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Pomology--HRT 402</label>
<div class="col-md-4">
<sf:input path="hrt402" class="form-control" placeholder=""/>
<sf:errors path="hrt402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Effective Theory</label>
<div class="col-md-4">
<sf:input path="effectivet" class="form-control" placeholder=""/>
<sf:errors path="effectivet" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Effective Sessional</label>
<div class="col-md-4">
<sf:input path="effectives" class="form-control" placeholder=""/>
<sf:errors path="effectives" cssClass="help-block" element="em" />
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




