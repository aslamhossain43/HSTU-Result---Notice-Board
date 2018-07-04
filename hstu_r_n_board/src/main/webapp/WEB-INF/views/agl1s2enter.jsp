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
<h4>Manage Agriculture  Results For L1 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="agl1s2add"
 method="POST"
 action="${contextRoot}/manageAg/agL1S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder="ID"/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">Ornamental Horticulture--HRT 101</label>
<!-- size of textarea not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="hrt101" class="form-control" placeholder=""/>
<sf:errors path="hrt101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Ornamental Horticulture--HRT 102</label>
<div class="col-md-4">
<sf:input path="hrt102" class="form-control" placeholder=""/>
<sf:errors path="hrt102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Nuclear and Agro Industrial Chemistry--ACH 105</label>
<div class="col-md-4">
<sf:input path="ach105" class="form-control" placeholder=""/>
<sf:errors path="ach105" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Farm Mechanics--AME 101</label>
<div class="col-md-4">
<sf:input path="ame101" class="form-control" placeholder=""/>
<sf:errors path="ame101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Farm Mechanics--AME 102</label>
<div class="col-md-4">
<sf:input path="ame102" class="form-control" placeholder=""/>
<sf:errors path="ame102" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">Animal Husbandry--ANH 101</label>
<div class="col-md-4">
<sf:input path="anh101" class="form-control" placeholder=""/>
<sf:errors path="anh101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Animal Husbandry--ANH 102</label>
<div class="col-md-4">
<sf:input path="anh102" class="form-control" placeholder=""/>
<sf:errors path="anh102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Agricultural Economics--ECN 101</label>
<div class="col-md-4">
<sf:input path="ecn101" class="form-control" placeholder=""/>
<sf:errors path="ecn101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Optional Theory</label>
<div class="col-md-4">
<sf:input path="optionalt" class="form-control" placeholder=""/>
<sf:errors path="optionalt" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">Optional Sessional</label>
<div class="col-md-4">
<sf:input path="optionals" class="form-control" placeholder=""/>
<sf:errors path="optionals" cssClass="help-block" element="em" />
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




