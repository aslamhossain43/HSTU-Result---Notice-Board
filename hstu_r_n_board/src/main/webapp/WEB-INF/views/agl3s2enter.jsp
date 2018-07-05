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
<h4>Manage Agriculture  Results For L3 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl3s2add"
 method="POST"
 action="${contextRoot}/manageAg/agL3S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Crop Husbandry--AGN 301</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="agn301" class="form-control" placeholder=""/>
<sf:errors path="agn301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Crop Husbandry--AGN 302</label>
<div class="col-md-4">
<sf:input path="agn302" class="form-control" placeholder=""/>
<sf:errors path="agn302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Soil physics and soil chemistry--SSC 301</label>
<div class="col-md-4">
<sf:input path="ssc301" class="form-control" placeholder=""/>
<sf:errors path="ssc301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Soil physics and soil chemistry--SSC 302</label>
<div class="col-md-4">
<sf:input path="ssc302" class="form-control" placeholder=""/>
<sf:errors path="ssc302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Agricultural chemistry--ACH 301</label>
<div class="col-md-4">
<sf:input path="ach301" class="form-control" placeholder=""/>
<sf:errors path="ach301" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Agricultural chemistry--ACH 302</label>
<div class="col-md-4">
<sf:input path="ach302" class="form-control" placeholder=""/>
<sf:errors path="ach302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Olericulture--HRT 301</label>
<div class="col-md-4">
<sf:input path="hrt301" class="form-control" placeholder=""/>
<sf:errors path="hrt301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Olericulture--HRT 302</label>
<div class="col-md-4">
<sf:input path="hrt302" class="form-control" placeholder=""/>
<sf:errors path="hrt302" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Plant Physiology--CBT 301</label>
<div class="col-md-4">
<sf:input path="cbt301" class="form-control" placeholder=""/>
<sf:errors path="cbt301" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Plant Physiology--CBT 302</label>
<div class="col-md-4">
<sf:input path="cbt302" class="form-control" placeholder=""/>
<sf:errors path="cbt302" cssClass="help-block" element="em" />
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




