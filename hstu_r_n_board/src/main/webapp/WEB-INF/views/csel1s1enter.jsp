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
<h4>Manage Computer Science & Engineering  Results For L1 S1</h4>
</div>

<div class="panel-body">
<!-- value of modelAttribute will be always in small letters -->
<sf:form class="form-horizontal" 
modelAttribute="csel1s1add"
 method="POST"
 action="${contextRoot}/manageCse/cseL1S1Add">
 <div class="form-group">
<label class="control-label col-md-8">Student ID </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="sid" class="form-control" placeholder=""/>
<sf:errors path="sid" cssClass="help-block" element="em" />
</div>
</div>
 
<div class="form-group">
<label class="control-label col-md-8"> CSE 101 Fundamentals of Computer and Computing </label>
<!-- size of text area not supported in internet explorer -->
<div class="col-md-4">
<sf:input path="cse101" class="form-control" placeholder=""/>
<sf:errors path="cse101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 102 Fundamentals of Computer and Computing Sessional</label>
<div class="col-md-4">
<sf:input path="cse102" class="form-control" placeholder=""/>
<sf:errors path="cse102" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">CSE 103 Discrete Mathematics </label>
<div class="col-md-4">
<sf:input path="cse103" class="form-control" placeholder=""/>
<sf:errors path="cse103" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">MAT 101 Mathematics 1 (Calculus and Co-ordinate Geometry)</label>
<div class="col-md-4">
<sf:input path="mat101" class="form-control" placeholder=""/>
<sf:errors path="mat101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">PHY 103 Physics (Electricity, Magnetism, Optics, Waves and Oscillations)</label>
<div class="col-md-4">
<sf:input path="phy103" class="form-control" placeholder=""/>
<sf:errors path="phy103" cssClass="help-block" element="em" />
</div>
</div>


<div class="form-group">
<label class="control-label col-md-8">PHY 104 Physics (Electricity, Magnetism, Optics, Waves, and Oscillations) Sessional </label>
<div class="col-md-4">
<sf:input path="phy104" class="form-control" placeholder=""/>
<sf:errors path="phy104" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">AIE 105 Basic Mechanical Engineering</label>
<div class="col-md-4">
<sf:input path="aie105" class="form-control" placeholder=""/>
<sf:errors path="aie105" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ENG 101 Communicative English </label>
<div class="col-md-4">
<sf:input path="eng101" class="form-control" placeholder=""/>
<sf:errors path="eng101" cssClass="help-block" element="em" />
</div>
</div>

<div class="form-group">
<label class="control-label col-md-8">ENG 102 Communicative English Sessional</label>
<div class="col-md-4">
<sf:input path="eng102" class="form-control" placeholder=""/>
<sf:errors path="eng102" cssClass="help-block" element="em" />
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




