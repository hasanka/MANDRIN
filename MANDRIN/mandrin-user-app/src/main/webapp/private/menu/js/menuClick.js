var currentPage = null;

$(document).ready(function() {
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
			$.getScript(jsName, function(data, textStatus, jqxhr) {
				console.log(jsName+" load was performed.");
			});
		}

	});
}