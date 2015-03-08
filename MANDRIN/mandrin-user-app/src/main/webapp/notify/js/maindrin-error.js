$.notifyDefaults({ allow_dismiss: false});
function maindrinPopUp(type, title, message) {
	var messageType = "pastel-info";

	if (type == "info") {
		messageType = "pastel-info";
	} else if (type == "success") {
		messageType = "pastel-success";
	} else if (type == "warning") {
		messageType = "pastel-warning";
	} else {
		messageType = "pastel-danger";
	}

	showMandrinPopUp(messageType, title, message);

};

function showMandrinPopUp(mType, mTitle, mMessage) {
	$.notify(
					{
						icon : 'glyphicon glyphicon-warning-sign',
						title : mTitle,
						message : mMessage
					},
					{
						type : mType,
						delay : 5000,
						offset: {x: 30,y: 55},
						spacing: 10,
						allow_dismiss : true,
						newest_on_top : true,
						icon_type: 'class',
						template : '<div data-notify="container" class="col-xs-11 col-sm-3 alert alert-{0}" role="alert">'
								+ '<span data-notify="title">{1}</span>'
								+ '<span data-notify="message">{2}</span>'
								+ '</div>'
					});
};

function hideMandrinPopUps() {
	$.notifyClose();
}