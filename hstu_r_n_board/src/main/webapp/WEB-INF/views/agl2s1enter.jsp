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
<h4>Manage Agriculture  Results For L2 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl2s1add"
 method="POST"
 action="${contextRoot}/manageAg/agL2S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Seed Tech and Weed Science--AGN 201</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="agn201" class="form-control" placeholder=""/>
<sf:errors path="agn201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Seed Tech and Weed Science--AGN 202</label>
<div class="col-md-4">
<sf:input path="agn202" class="form-control" placeholder=""/>
<sf:errors path="agn202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Soil Survey Classification and Conservatio--SSC 201</label>
<div class="col-md-4">
<sf:input path="ssc201" class="form-control" placeholder=""/>
<sf:errors path="ssc201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Soil Survey Classification and Conservatio--SSC 202</label>
<div class="col-md-4">
<sf:input path="ssc202" class="form-control" placeholder=""/>
<sf:errors path="ssc202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Spices and Plantation Crops--HRT 201</label>
<div class="col-md-4">
<sf:input path="hrt201" class="form-control" placeholder=""/>
<sf:errors path="hrt201" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Spices and Plantation Crops--HRT 202</label>
<div class="col-md-4">
<sf:input path="hrt202" class="form-control" placeholder=""/>
<sf:errors path="hrt202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Introductory Crop Botany--CPE 201</label>
<div class="col-md-4">
<sf:input path="cpe201" class="form-control" placeholder=""/>
<sf:errors path="cpe201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Introductory Crop Botany--CPE 202</label>
<div class="col-md-4">
<sf:input path="cpe202" class="form-control" placeholder=""/>
<sf:errors path="cpe202" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Biochemistry--BMB 201</label>
<div class="col-md-4">
<sf:input path="bmb201" class="form-control" placeholder=""/>
<sf:errors path="bmb201" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Biochemistry--BMB 202</label>
<div class="col-md-4">
<sf:input path="bmb202" class="form-control" placeholder=""/>
<sf:errors path="bmb202" cssClass="help-block" element="em" />
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




