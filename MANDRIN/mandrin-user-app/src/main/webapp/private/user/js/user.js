var isEdit = false;
var empty = "";

$(document).ready(function() {
	init();
});

function init() {
	initGrid();
	initValidations();
	initButtonClicks();
	disableUiElement(true);
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
		clearButtonClick();
		setRowValuesToFields(rowValues);
	});

}

function initValidations() {
	$('#userMgrForm').formValidation()
	.on('err.field.fv', function(e, data) {
		$('#save').attr('disabled', true);
    })
    .on('success.field.fv', function(e, data) {
    	if (data.fv.getInvalidFields().length > 0) {
    		$('#save').attr('disabled', false);
        }
    });
}

function initButtonClicks() {
	// $("#home").click();
	 $("#add").click(addButtonClick);
	 $("#edit").click(editButtonClick);
	 $("#clear").click(clearButtonClick);
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
	$('#edit').attr('disabled', false);
}

function saveClick() {
	if(checkValidDataAdded()){
		var url = "controller/saveUser";
		var postData = getPostData();
		$.ajax({
			url : url,
			data : postData
		}).done(function(response) {
			clearButtonClick();
			maindrinPopUp("success","User Account Info","User information saved succesfuly.");
		}).fail(function(error) {
			alert(error.responseText);
		});
	}
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
	var table = $('#userDataTable').DataTable();
	table.ajax.reload();
}

function disableUiElement(status) {
	$('#firstName').attr('disabled', status);
	$('#lastName').attr('disabled', status);
	$('#phoneNumber').attr('disabled', status);
	$('#email').attr('disabled', status);
	$('#comment').attr('disabled', status);
	$('#isActive').attr('disabled', status);
	$('#userName').attr('disabled', status);
	$('#password').attr('disabled', status);
	$('#comment').attr('disabled', status);
	$('#passwordReType').attr('disabled', status);
	
	$('#save').attr('disabled', status);
	$('#edit').attr('disabled', status);
}

function addButtonClick() {
	isEdit = false;
	clearFields();
	disableUiElement(false);
	$('#edit').attr('disabled', true);
	$('#save').attr('disabled', true);
}

function editButtonClick() {
	isEdit = true;
	disableUiElement(false);
	$("#userMgrForm").data('formValidation').validate();
	$('#add').attr('disabled', true);
}

function clearButtonClick() {
	isEdit = false;
	clearFields();
	disableUiElement(true);
	gridReload();
	$('#add').attr('disabled', false);
}

function clearFields() {
	$("#userMgrForm").data('formValidation').resetForm(true);
	$('#firstName').val(empty);
	$('#lastName').val(empty);
	$('#phoneNumber').val(empty);
	$('#email').val(empty);
	$('#comment').val(empty);
	$('#isActive').val("ACT");
	$('#userName').val(empty);
	$('#password').val(empty);
	$('#comment').val(empty);
	$('#passwordReType').val(empty);
}

function checkValidDataAdded() {
	var formValidation = $("#userMgrForm").data('formValidation');
	console.log(formValidation.getInvalidFields());
	if (formValidation.isValid()) {
		return true;
	}
	return false;
}