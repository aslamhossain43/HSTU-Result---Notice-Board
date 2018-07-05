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
<h4>Manage Agriculture  Results For L3 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl3s1add"
 method="POST"
 action="${contextRoot}/manageAg/agL3S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Insect Ecology and pest management--ENT 301</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="ent301" class="form-control" placeholder=""/>
<sf:errors path="ent301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Insect Ecology and pest management--ENT 302</label>
<div class="col-md-4">
<sf:input path="ent302" class="form-control" placeholder=""/>
<sf:errors path="ent302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Principle of plant pathology and disease of field crops--PLP 301</label>
<div class="col-md-4">
<sf:input path="plp301" class="form-control" placeholder=""/>
<sf:errors path="plp301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Principle of plant pathology and disease of field crops--PLP 302</label>
<div class="col-md-4">
<sf:input path="plp302" class="form-control" placeholder=""/>
<sf:errors path="plp302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Cytogenetics and Genetics--GPB 301</label>
<div class="col-md-4">
<sf:input path="gpb301" class="form-control" placeholder=""/>
<sf:errors path="gpb301" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Cytogenetics and Genetics--GPB 302</label>
<div class="col-md-4">
<sf:input path="gpb302" class="form-control" placeholder=""/>
<sf:errors path="gpb302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Agro forestry--AGF 301</label>
<div class="col-md-4">
<sf:input path="agf301" class="form-control" placeholder=""/>
<sf:errors path="agf301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Agro forestry--AGF 302</label>
<div class="col-md-4">
<sf:input path="agf302" class="form-control" placeholder=""/>
<sf:errors path="agf302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Diffusion process and group approach--AEX 301</label>
<div class="col-md-4">
<sf:input path="aex301" class="form-control" placeholder=""/>
<sf:errors path="aex301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Diffusion process and group approach--AEX 302</label>
<div class="col-md-4">
<sf:input path="aex302" class="form-control" placeholder=""/>
<sf:errors path="aex302" cssClass="help-block" element="em" />
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




