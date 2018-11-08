package net.poc.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author vuthelinh@gmail.com
 *
 */

public class DashboardPage {

	public static final Target MAIN_TITLE = Target.the("Open Demo Account")
			.located(By.id("net.metaquotes.metatrader5:id/main_title"));
	public static final Target MAIN_NAVIGATE_BUTTON = Target.the("hamburger button")
			.located(By.id("net.metaquotes.metatrader5:id/actionbar_back_icon"));
	public static final Target MENU_ITEMS = Target.the("sub menu")
			.located(By.id("net.metaquotes.metatrader5:id/drawer_name"));

	public static final String MENU_LABEL = "net.metaquotes.metatrader5:id/drawer_name";

	public static final Target getMenuByLabel(String label) {
		return Target.the("menu item: " + label)
				.located(By.xpath(String.format("//android.widget.TextView[@text='%s']", label)));
	}

}
