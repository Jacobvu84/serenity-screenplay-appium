package net.poc.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import net.poc.ui.LeftMenuBarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

/**
 * @author vuthelinh@gmail.com
 *
 */

public class AccountProfile implements Task {

	@Step("{0} shows the menu panel")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				ShowMenuPanel.openMenuPanel(),
				WaitUntil.the(LeftMenuBarPage.MANAGE_ACCOUNTS_PANEL, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Click.on(LeftMenuBarPage.MANAGE_ACCOUNTS_PANEL)

		);
	}

}
