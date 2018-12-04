package net.poc.driver;

import io.appium.java_client.TouchAction;

/**
 * @author vuthelinh@gmail.com
 *
 */

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class AndroidObject {

	// Android Command Actions

	public void HideKeyboard(Actor actor) {
		androidDriver(actor).hideKeyboard();
	}


	public void SwipeToElement(Actor actor, String label) {
		androidDriver(actor).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\""+label+"\"));").click();
	}

	public AndroidDriver<AndroidElement> getAndroidDriver(Actor actor) {
		return androidDriver(actor);
	}

	@SuppressWarnings("unchecked")
	private static AndroidDriver<AndroidElement> androidDriver(Actor actor) {
		return (AndroidDriver<AndroidElement>) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();

	}

	private static WebDriverFacade getDriver(Actor actor) {
		return ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver());
	}
	
	public TouchAction withAction(Actor actor) {
		return new TouchAction(androidDriver(actor));

	}
	
	public void SwitchtoFrame(Actor actor, int id) {
		androidDriver(actor).switchTo().frame(id);

	}	

}
