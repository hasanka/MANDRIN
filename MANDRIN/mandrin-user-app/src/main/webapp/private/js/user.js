$(document).ready(function() {
	init();
});

function init() {
	initGrid();
	initValidations();
	testPost();
}

function initGrid() {
	$("#dataTables-users").DataTable({
		responsive : true
	});
}

function initValidations() {
	$('#userMgrForm').formValidation();
}

function testPost() {
	var url = "../../controller/test"
	$.ajax({
		type : "GET",
		url : url,
		success : function() {
			alert("success");
		}
	});
}