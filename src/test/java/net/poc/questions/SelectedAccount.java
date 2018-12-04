package net.poc.questions;

import net.poc.ui.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.converters.StringConverter;

/**
 * @author  vuthelinh@gmail.com
 *
 */

public class SelectedAccount implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		new StringConverter().convert("true");
		if (AccountPage.SELECTED_ACCOUNT.resolveFor(actor).isVisible())
			return false;
		else
			return true;
	}
	
	public static Question<Boolean> disappear() {
        return new SelectedAccount();
    }
}
