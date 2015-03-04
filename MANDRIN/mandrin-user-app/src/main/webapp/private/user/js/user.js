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
	var url = "controller/test";	
	$.ajax( url )
	  .done(function(response) {
	    alert( "success" );
	  })
	  .fail(function(error) {
	    alert( error.responseText );
	  })
	  .always(function() {
//	    alert( "complete" );
	  });
}