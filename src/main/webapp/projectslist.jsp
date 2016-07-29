<jsp:include page="header.jsp"/>

<div class="container" style="width: 100%;">
	<div class="row">
<!-- 		<div class="col-xs-12 col-xs-12 col-xs-6 col-xs-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad"> -->
		<div class="toppad">
			<div class="panel panel-primary">
				<div class="panel-heading text-center">
					<h3 class="panel-title ">Projects</h3>
				</div>
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table table-striped table table-hover"
							data-page-list="[5, 10, 20, 50, 100, 200]"
							data-query-params="queryParams">
							<thead>
								<tr>
									<th>Project Id</th>
									<th>Name</th>
									<th>Description</th>
									<th>Project Manager</th>
									<th>Start Date</th>
									<th>End Date</th>
									<th>Skills Required</th>
									<th>Status</th>
									<th>Client Name</th>
									<th>Client Contacts</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
								<tr>
									<td>1</td>
									<td>EmpProjectTrackingTool</td>
									<td>Project Assigning and Tracking Portal</td>
									<td>Subhani</td>
									<td>25/07/2016</td>
									<td>05/08/2016</td>
									<td>Developer</td>
									<td>Live</td>
									<td>Alacriti</td>
									<td>9948199100</td>
								</tr>
							</tbody>
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
