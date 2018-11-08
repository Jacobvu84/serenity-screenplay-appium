package net.poc.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @author vuthelinh@gmail.com
 *
 */

public class LeftMenuBarPage {
	public static final Target QUOTES_LINK = Target.the("Quotes menu link")
			.located(By.xpath("//android.widget.TextView[@text='Quotes']"));

	public static final Target CANCEL_ADD_NOTE_BUTTON = Target.the("Cancel button")
			.located(MobileBy.AccessibilityId("Navigate up")); // Navigate up is value of content-desc

	public static final Target MANAGE_ACCOUNTS_PANEL = Target.the("Manage accounts panel")
			.located(By.id("net.metaquotes.metatrader5:id/login"));
}
