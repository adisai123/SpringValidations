 <jsp:include page="Header.jsp" />
<form action="processForm" method="GET">
	<div class="row">
	<div class="col-md-1">
	</div>
	<div class="col-md-2">
	
		<label for="email">Email address:</label>
	</div>
	<div class="col-md-2">
	 <input type="email"
			class="form-control" id="email" name="email">
	</div>
	</div>
	<div class="row">
	<div class="col-md-1">
	</div>
	<div class="col-md-2">
	
		<label for="email">Password:</label>
	</div>
	<div class="col-md-2">
	 <input type="password"
			class="form-control" id="pwd" name="password">
	</div>
	</div>
	
	<div class="form-group form-check">
		<label class="form-check-label"> <input
			class="form-check-input" type="checkbox"> Remember me
		</label>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="footer.jsp" />