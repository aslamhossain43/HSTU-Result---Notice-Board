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
<h4>Manage Agriculture Results</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agmanageresults"
 method="POST"
 action="${contextRoot}/agManage/agManageResults"
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
<sf:input path="file" type="file" class="form-control" placeholder="Select a File !"/>
<sf:errors path="file" cssClass="help-block" element="em" />
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




