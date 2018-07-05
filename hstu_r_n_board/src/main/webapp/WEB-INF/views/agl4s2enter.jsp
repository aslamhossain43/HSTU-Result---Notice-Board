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
<h4>Manage Agriculture  Results For L4 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl4s2add"
 method="POST"
 action="${contextRoot}/manageAg/agL4S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Farm Management and crop production--AGN 401</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="agn401" class="form-control" placeholder=""/>
<sf:errors path="agn401" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Farm Management and crop production--AGN 402</label>
<div class="col-md-4">
<sf:input path="agn402" class="form-control" placeholder=""/>
<sf:errors path="agn402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Soil microbiology and soil fertility--SSC 401</label>
<div class="col-md-4">
<sf:input path="ssc401" class="form-control" placeholder=""/>
<sf:errors path="ssc401" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Soil microbiology and soil fertility--SSC 402</label>
<div class="col-md-4">
<sf:input path="ssc402" class="form-control" placeholder=""/>
<sf:errors path="ssc402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Diseases of Horticultural cash crops and seeds--PLP 401</label>
<div class="col-md-4">
<sf:input path="plp401" class="form-control" placeholder=""/>
<sf:errors path="plp401" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Diseases of Horticultural cash crops and seeds--PLP 402</label>
<div class="col-md-4">
<sf:input path="plp402" class="form-control" placeholder=""/>
<sf:errors path="plp402" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Plant Breeding--GPB 401</label>
<div class="col-md-4">
<sf:input path="gpb401" class="form-control" placeholder=""/>
<sf:errors path="gpb401" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Plant Breeding--GPB 402</label>
<div class="col-md-4">
<sf:input path="gpb402" class="form-control" placeholder=""/>
<sf:errors path="gpb402" cssClass="help-block" element="em" />
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




