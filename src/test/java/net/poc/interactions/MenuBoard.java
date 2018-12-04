package net.poc.interactions;

import static net.poc.ui.DashboardPage.MAIN_NAVIGATE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class MenuBoard implements Interaction {
	@Override
	@Step("{0} show the menu dashboard")
	public <T extends Actor> void performAs(T actor) {

			WaitUntil.the(MAIN_NAVIGATE_BUTTON, isCurrentlyEnabled()).forNoMoreThan(60).seconds();
			Click.on(MAIN_NAVIGATE_BUTTON);

	}

	public static MenuBoard show() {
		return instrumented(MenuBoard.class);
	}
}
