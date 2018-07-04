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
<h4>Manage Agriculture  Results For L1 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl1s1add"
 method="POST"
 action="${contextRoot}/manageAg/agL1S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Fundamentals of Agronomy--AGN 101</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="agn101" class="form-control" placeholder=""/>
<sf:errors path="agn101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Fundamentals of Agronomy--AGN 102</label>
<div class="col-md-4">
<sf:input path="agn102" class="form-control" placeholder=""/>
<sf:errors path="agn102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Physical and analytical chemistry--ACH 101</label>
<div class="col-md-4">
<sf:input path="ach101" class="form-control" placeholder=""/>
<sf:errors path="ach101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Physical and analytical chemistry--ACH 102</label>
<div class="col-md-4">
<sf:input path="ach102" class="form-control" placeholder=""/>
<sf:errors path="ach102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Introductory soil science--SSC 101</label>
<div class="col-md-4">
<sf:input path="ssc101" class="form-control" placeholder=""/>
<sf:errors path="ssc101" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Introductory soil science--SSC 102</label>
<div class="col-md-4">
<sf:input path="ssc102" class="form-control" placeholder=""/>
<sf:errors path="ssc102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Food biochemistry and nutrition--ACH 103</label>
<div class="col-md-4">
<sf:input path="ach103" class="form-control" placeholder=""/>
<sf:errors path="ach103" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Rural sociology--SSL 103</label>
<div class="col-md-4">
<sf:input path="ssl103" class="form-control" placeholder=""/>
<sf:errors path="ssl103" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Optional</label>
<div class="col-md-4">
<sf:input path="optional103" class="form-control" placeholder=""/>
<sf:errors path="optional103" cssClass="help-block" element="em" />
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




