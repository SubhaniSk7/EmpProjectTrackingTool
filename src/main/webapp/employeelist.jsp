<jsp:include page="header.jsp" />

<div class="container" style="width: 100%;">
	<div class="row">
<!-- 		<div class="col-xs-12 col-xs-12 col-xs-6 col-xs-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad"> -->
			<div class="panel panel-primary">
				<div class="panel-heading text-center">
					<h3 class="panel-title ">Employers</h3>
				</div>
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table table-striped table table-hover" id="employersListTable"
							data-page-list="[5, 10, 20, 50, 100, 200]"
							data-query-params="queryParams">
<!-- 							<thead> -->
<!-- 								<tr> -->
<!-- 									<th>Emp Id</th> -->
<!-- 									<th>Name</th> -->
<!-- 									<th>Gender</th> -->
<!-- 									<th>Department</th> -->
<!-- 									<th>Designation</th> -->
<!-- 									<th>Mobile</th> -->
<!-- 								</tr> -->
<!-- 							</thead> -->
<!-- 							<tbody> -->
<!-- 								<tr> -->
<!-- 									<td>AL184</td> -->
<!-- 									<td>Subhani</td> -->
<!-- 									<td>Male</td> -->
<!-- 									<td>Developer</td> -->
<!-- 									<td>Jr.Developer</td> -->
<!-- 									<td>9948199100</td> -->
<!-- 								</tr> -->
<!-- 								<tr> -->
<!-- 									<td>AL184</td> -->
<!-- 									<td>Subhani</td> -->
<!-- 									<td>Male</td> -->
<!-- 									<td>Developer</td> -->
<!-- 									<td>Jr.Developer</td> -->
<!-- 									<td>9948199100</td> -->
<!-- 								</tr> -->
<!-- 								<tr> -->
<!-- 									<td>AL184</td> -->
<!-- 									<td>Subhani</td> -->
<!-- 									<td>Male</td> -->
<!-- 									<td>Developer</td> -->
<!-- 									<td>Jr.Developer</td> -->
<!-- 									<td>9948199100</td> -->
<!-- 								</tr> -->
<!-- 								<tr> -->
<!-- 									<td>AL184</td> -->
<!-- 									<td>Subhani</td> -->
<!-- 									<td>Male</td> -->
<!-- 									<td>Developer</td> -->
<!-- 									<td>Jr.Developer</td> -->
<!-- 									<td>9948199100</td> -->
<!-- 								</tr> -->
<!-- 							</tbody> -->
						</table>
					</div>
					<div class="panel-footer clearfix">
						<ul class="pagination pagination-panel pull-right">
							<li><a href="#">«</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">»</a></li>
						</ul>
					</div>
				</div>
			</div>
<!-- 		</div> -->
	</div>
</div>

<script>
	function queryParams(params) {
		return {
			limit : params.pageSize,
			offset : params.pageSize * (params.pageNumber - 1),
			search : params.searchText,
			name : params.sortName,
			order : params.sortOrder
		};
	}
</script>
<script type="text/javascript" src="js/employerslist.js"></script>
</body>
</html>