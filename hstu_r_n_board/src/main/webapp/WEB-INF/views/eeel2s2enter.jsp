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
<h4>Manage Electrical & Electronics Engineering  Results For L2 S2</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="eeel2s2add"
 method="POST"
 action="${contextRoot}/manageEee/eeeL2S2Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8">EEE 217 Electrical Machine-ll</label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="eee217" class="form-control" placeholder=""/>
<sf:errors path="eee217" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 218 Electrical Machine-ll Sessional</label>
<div class="col-md-4">
<sf:input path="eee218" class="form-control" placeholder=""/>
<sf:errors path="eee218" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 219 Electronics-ll</label>
<div class="col-md-4">
<sf:input path="eee219" class="form-control" placeholder=""/>
<sf:errors path="eee219" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">EEE 220 Electronics-ll Sessional</label>
<div class="col-md-4">
<sf:input path="eee220" class="form-control" placeholder=""/>
<sf:errors path="eee220" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ECE 215 Signals and Systems</label>
<div class="col-md-4">
<sf:input path="ece215" class="form-control" placeholder=""/>
<sf:errors path="ece215" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">AIE 227 Mechanical Engineering Fundamentals</label>
<div class="col-md-4">
<sf:input path="aie227" class="form-control" placeholder=""/>
<sf:errors path="aie227" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">AIE 228 Mechanical Engineering Fundamentals  Sessional </label>
<div class="col-md-4">
<sf:input path="aie228" class="form-control" placeholder=""/>
<sf:errors path="aie228" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">STT 223 Basic statistics and probability</label>
<div class="col-md-4">
<sf:input path="stt223" class="form-control" placeholder=""/>
<sf:errors path="stt223" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">STT 224 Basic statistics and probability  Sessional</label>
<div class="col-md-4">
<sf:input path="stt224" class="form-control" placeholder=""/>
<sf:errors path="stt224" cssClass="help-block" element="em" />
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




