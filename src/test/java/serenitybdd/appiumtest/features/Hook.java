/**
 * 
 */
package serenitybdd.appiumtest.features;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

/**
 * @author vuthelinh@gmail.com
 */
public class Hook {
	@Managed(driver = "Appium")
	public WebDriver hisMobileDevice;

	String jacob = "Trader";
	
	@Before
	public void annaCanBrowseTheMobileApp(){
		OnStage.setTheStage(new OnlineCast());
	}
}