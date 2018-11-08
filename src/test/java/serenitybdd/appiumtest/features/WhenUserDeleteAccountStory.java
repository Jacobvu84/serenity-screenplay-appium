package serenitybdd.appiumtest.features;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.poc.questions.SelectedAccount;
import net.poc.tasks.DeleteAccount;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

@RunWith(SerenityRunner.class)
public class WhenUserDeleteAccountStory extends Hook {

	@Test
	public void delete_selected_account() {

		theActorCalled(jacob).can(BrowseTheWeb.with(hisMobileDevice));

		theActorInTheSpotlight().attemptsTo(DeleteAccount.currently());

		theActorInTheSpotlight().should(seeThat(SelectedAccount.disappear(), is(true)));
	}

}