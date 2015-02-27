$(document).ready(function() {
	init();
});

function init() {
	initGrid();
	initValidations();
}

function initGrid() {
	$("#dataTables-users").DataTable({
		responsive : true
	});
}

function initValidations() {
	 $('#userMgrForm').formValidation();
}

