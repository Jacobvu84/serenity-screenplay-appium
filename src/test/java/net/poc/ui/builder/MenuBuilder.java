package net.poc.ui.builder;

/**
 * @author vuthelinh@gmail.com
 *
 */

import java.util.ArrayList;
import java.util.List;

import net.poc.ui.DashboardPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;

public class MenuBuilder {
	public static List<String> getMenuListInUI(Actor actor) {
		List<String> allMenu = new ArrayList<>();
		List<WebElementFacade> menuItems = DashboardPage.MENU_ITEMS.resolveAllFor(actor);

		for (WebElementFacade menuItem : menuItems) {
			String menuLabel = menuItem.getText();
			allMenu.add(menuLabel);
		}
		return allMenu;
	}
}
