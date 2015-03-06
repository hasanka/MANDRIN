$(document).ready(function() {
	init();
});

function init() {
	initGrid();
	// initValidations();
	initButtonClicks();
	// testPost();
}

function initGrid() {
	var table = $("#userDataTable")
			.DataTable(
					{
						responsive : true,
						processing : true,
						serverSide : false,
						ajax : 'controller/searchGridData',
						columns : [
								{
									"data" : "firstName"
								},
								{
									"data" : "lastName"
								},
								{
									"data" : "phoneNumber"
								},
								{
									"data" : "email"
								},
								{
									"data" : "status"
								},
								{
									"data" : "userName"
								},
								{
									"data" : null,
									"defaultContent" : '<span text-center class="glyphicon glyphicon-eye-open aria-hidden="false"></span>',
									"orderable" : false,
									"searchable" : false,
								} ],
						createdRow : function(row, data, index) {
						},

					});

	$('#userDataTable tbody').on('click', 'tr', function() {
		var table = $('#userDataTable').DataTable();

		$('#userDataTable tbody').on('click', 'tr', function() {
			if ($(this).hasClass('selected')) {
				$(this).removeClass('selected');
			} else {
				table.$('tr.selected').removeClass('selected');
				$(this).addClass('selected');
			}
		});
	});

	$('#userDataTable tbody').on('click', 'span', function() {
		var table = $('#userDataTable').DataTable();
		var rowValues = table.row(this.parentNode.parentNode).data();
		setRowValuesToFields(rowValues);
	});

}

function initValidations() {
	$('#userMgrForm').formValidation();
}

function initButtonClicks() {
	// $("#home").click();
	// $("#add").click();
	// $("#edit").click();
	// $("#clear").click();
	$("#save").click(saveClick);
}

function setRowValuesToFields(rowData) {
	$("#firstName").val(rowData.firstName);
	$("#lastName").val(rowData.lastName);
	$("#phoneNumber").val(rowData.phoneNumber);
	$("#email").val(rowData.email);
	$("#userName").val(rowData.userName);
	$("#password").val(rowData.password);
	$("#passwordReType").val(rowData.password);
	$("#comment").val(rowData.comment);
	$("#isActive").val(rowData.status);
	$("#hdnUserId").val(rowData.userId);
	$("#hdnVersion").val(rowData.version);
}

function saveClick() {
	var url = "controller/saveUser";
	var postData = getPostData();
	$.ajax({
		url : url,
		data : postData
	}).done(function(response) {
		gridReload();
		alert("success");
	}).fail(function(error) {
		alert(error.responseText);
	});
}

function getPostData() {
	var postData = {};
	postData.firstName = $("#firstName").val();
	postData.lastName = $("#lastName").val();
	postData.phoneNumber = $("#phoneNumber").val();
	postData.email = $("#email").val();
	postData.comment = $("#comment").val();
	postData.status = $("#isActive").val();
	postData.userId = $("#hdnUserId").val();
	postData.userName = $("#userName").val();
	postData.password = $("#password").val();
	postData.comment = $("#comment").val();
	postData.version = $("#hdnVersion").val();
	return postData;
}

function gridReload() {
	// v { ajax: "data.json"}
	var table = $('#userDataTable').DataTable();
	table.ajax.reload();
}
