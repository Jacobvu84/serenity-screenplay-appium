/**
 * 
 */
package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import net.poc.ui.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

/**
 * @author vuthelinh@gmail.com
 *
 */
public class Access implements Task {
	
	String label = "";

	public Access(String label) {
		this.label = label;
	}

	@Step("{0} navigates to #label ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(DashboardPage.getMenuByLabel(label), isCurrentlyEnabled()).forNoMoreThan(80).seconds(),
				Click.on(DashboardPage.getMenuByLabel(label))

		);
	}

	public static Access menuWithLabel(String label) {
		return instrumented(Access.class, label);
	}


}
