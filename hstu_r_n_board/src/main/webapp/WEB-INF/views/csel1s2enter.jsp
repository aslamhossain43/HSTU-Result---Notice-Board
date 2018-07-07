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
<h4>Manage Computer Science & Engineering  Results For L1 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel1s2add"
 method="POST"
 action="${contextRoot}/manageCse/cseL1S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8"> CSE 151 Structured Programming Language </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse151" class="form-control" placeholder=""/>
<sf:errors path="cse151" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 152 Structured Programming Language Sessional</label>
<div class="col-md-4">
<sf:input path="cse152" class="form-control" placeholder=""/>
<sf:errors path="cse152" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 153 Digital Logic Design  </label>
<div class="col-md-4">
<sf:input path="cse153" class="form-control" placeholder=""/>
<sf:errors path="cse153" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 154 Digital Logic Design Sessional</label>
<div class="col-md-4">
<sf:input path="cse154" class="form-control" placeholder=""/>
<sf:errors path="cse154" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 155 Introduction to Electrical Engineering</label>
<div class="col-md-4">
<sf:input path="eee155" class="form-control" placeholder=""/>
<sf:errors path="eee155" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">EEE 156 Introduction to Electrical Engineering Sessional</label>
<div class="col-md-4">
<sf:input path="eee156" class="form-control" placeholder=""/>
<sf:errors path="eee156" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">AIE 106 Engineering Drawing and Auto CAD Sessional </label>
<div class="col-md-4">
<sf:input path="aie106" class="form-control" placeholder=""/>
<sf:errors path="aie106" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAT 105 Mathematics II (Matrix, Ordinary and Partial Differential Equations, and Series Solutions)</label>
<div class="col-md-4">
<sf:input path="mat105" class="form-control" placeholder=""/>
<sf:errors path="mat105" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">SOC 103 Society and Technology</label>
<div class="col-md-4">
<sf:input path="soc103" class="form-control" placeholder=""/>
<sf:errors path="soc103" cssClass="help-block" element="em" />
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




