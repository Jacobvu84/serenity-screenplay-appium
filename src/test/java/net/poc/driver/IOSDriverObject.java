package net.poc.driver;


/**
 * @author vuthelinh@gmail.com
 *
 */

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class IOSDriverObject{

	public void hideKeyboard(Actor actor) {
		IOSDriver(actor).hideKeyboard();
	}
	
	
	@SuppressWarnings("unchecked")
	private IOSDriver<IOSElement> IOSDriver(Actor actor) {
		return (IOSDriver<IOSElement>) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();

	}
	
	private static WebDriverFacade getDriver(Actor actor) {
		return ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver());
	}
	

}
