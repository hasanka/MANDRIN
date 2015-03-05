var userGridData = [];

$(document).ready(function() {
	init();
});

function init() {
	initGrid();
	initValidations();
//	testPost();
}

function initGrid() {
	var table = $("#dataTables-users").DataTable({
		responsive : true,
		processing: true,
        serverSide: false,
        ajax: 'controller/searchGridData',
        columns: [
            { "data": "firstName" },
            { "data": "lastName" },
            { "data": "phoneNumber" },
            { "data": "email" },
            { "data": "status" },
            { "data": "userName" },
            {
              "data": null,
              "defaultContent": '<span class="glyphicon glyphicon-pencil aria-hidden="false"></span>',
              "orderable": false,
              "searchable": false,
            }
        ],
        createdRow: function ( row, data, index ) {
        	userGridData.push(data);
        },
        
	});
	
	$('#dataTables-users tbody').on( 'click', 'tr', function () {
		 $(this).toggleClass('selected');
    } );
	
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