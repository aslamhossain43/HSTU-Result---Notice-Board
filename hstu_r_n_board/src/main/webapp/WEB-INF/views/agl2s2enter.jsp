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
<h4>Manage Agriculture  Results For L2 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl2s2add"
 method="POST"
 action="${contextRoot}/manageAg/agL2S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Introductory Entomology--ENT 201</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ent201" class="form-control" placeholder=""/>
<sf:errors path="ent201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Introductory Entomology--ENT 202</label>
<div class="col-md-4">
<sf:input path="ent202" class="form-control" placeholder=""/>
<sf:errors path="ent202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Fundamentals of plant pathology and Microbiology--PLP 201</label>
<div class="col-md-4">
<sf:input path="plp201" class="form-control" placeholder=""/>
<sf:errors path="plp201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Fundamentals of plant pathology and Microbiology--PLP 202</label>
<div class="col-md-4">
<sf:input path="plp202" class="form-control" placeholder=""/>
<sf:errors path="plp202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Cytology--CPB 201</label>
<div class="col-md-4">
<sf:input path="cpb201" class="form-control" placeholder=""/>
<sf:errors path="cpb201" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Cytology--CPB 202</label>
<div class="col-md-4">
<sf:input path="cpb202" class="form-control" placeholder=""/>
<sf:errors path="cpb202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Fundamentals of extension education and communication--AEX 201</label>
<div class="col-md-4">
<sf:input path="aex201" class="form-control" placeholder=""/>
<sf:errors path="aex201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Fundamentals of extension education and communication--AEX 202</label>
<div class="col-md-4">
<sf:input path="aex202" class="form-control" placeholder=""/>
<sf:errors path="aex202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Agricultural Statistics--STT 201</label>
<div class="col-md-4">
<sf:input path="stt201" class="form-control" placeholder=""/>
<sf:errors path="stt201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Agricultural Statistics--STT 202</label>
<div class="col-md-4">
<sf:input path="stt202" class="form-control" placeholder=""/>
<sf:errors path="stt202" cssClass="help-block" element="em" />
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




