package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import net.poc.tasks.factory.GoTo;
import net.poc.ui.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

/**
 * @author datdc@gearinc.com
 *
 */

public class DeleteAccount implements Task {

	@Step("{0} delete the slected account")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(GoTo.accountProfile(),
				WaitUntil.the(AccountPage.OPTIONS_BUTTON, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Click.on(AccountPage.OPTIONS_BUTTON),
				WaitUntil.the(AccountPage.DELETE_BUTTON, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Click.on(AccountPage.DELETE_BUTTON),
				WaitUntil.the(AccountPage.DELETE_ACCOUNT_POPUP, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Click.on(AccountPage.YES_BUTTON));

	}

	public static DeleteAccount currently() {
		return instrumented(DeleteAccount.class);
	}

}
