package serenitybdd.appiumtest.features;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.poc.questions.factory.MenuBarWebUI;
import net.poc.tasks.factory.Navigate;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

@RunWith(SerenityRunner.class)
public class WhenTraderExploreMenuStory extends Hook {

	@Test
	public void the_apps_menu_is_displayed_fully() {

		theActorCalled(jacob).can(BrowseTheWeb.with(hisMobileDevice));

		theActorInTheSpotlight().attemptsTo(Navigate.menuPanel());

		theActorInTheSpotlight().should(seeThat(MenuBarWebUI.numberOfItems(), is(11)),
				seeThat(MenuBarWebUI.displayedWithStrictOrder(), contains("Quotes", "Charts", "Trade", "History",
						"Mailbox", "News", "Economic calendar", "Messages", "Settings", "Journal", "About")));
	}

}