function loadMenu() {
	var link = document.querySelector('link[rel="import"]');
	var content = link.import;
	var el = content.querySelector('.mandrin-menu');
	var navigationMenu = document.getElementById("navigationMenu");
	navigationMenu.appendChild(el.cloneNode(true));
}
loadMenu();