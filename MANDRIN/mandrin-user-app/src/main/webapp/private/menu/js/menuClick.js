var currentPage = null;

$(document).ready(function() {
	cacheScripts();
	menuItemClick();
});

function menuItemClick() {
	$("#menuLinks").on("click", "li", function() {
		var isPageLoaded = false;
		var pageName = $(this).attr("data-page");
		var jsName = $(this).attr("data-js");
		if (pageName != null && pageName != "" && currentPage != pageName) {
			isPageLoaded = true;
			currentPage = pageName;
			$("#dynamicPageContent").empty();
			$("#dynamicPageContent").load(pageName);
		}

		if (jsName != null && jsName != "" && isPageLoaded) {
			getScript(jsName);
		}

	});
}


function getScript(path) {
	jQuery.ajax({
        crossDomain: true,
        dataType: "script",
        url: path,
        success: function(){
           // _success(_slot);
        },
        error: function(){
           // _fail(_slot);
        }
    });
}

function cacheScripts() {
	$.ajaxSetup({
		  cache: true
		});
}