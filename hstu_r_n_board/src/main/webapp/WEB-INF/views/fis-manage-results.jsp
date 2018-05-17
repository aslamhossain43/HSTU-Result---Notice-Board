<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
<div class="row">
<div class="col-md-10 col-md-offset-1">


<div class="panel panel-primary">
<div class="panel-heading">
<h4>Manage Fisheries Results</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="fismanageresults"
 method="POST"
 action="${contextRoot}/fis/fisManageResults"
  enctype="multipart/form-data">
<div class="form-group">
<label class="control-label col-md-2">Description</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-10">
<sf:textarea path="description" class="form-control" placeholder="Enter any Description here !"/>
<sf:errors path="description" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-2">Select a file</label>
<div class="col-md-10">
<sf:input path="img_url" type="file" class="form-control" placeholder="Select a File !"/>
<sf:errors path="description" cssClass="help-block" element="em" />
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




