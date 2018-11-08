package net.poc.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.poc.ui.DashboardPage;

/**
 * @author vuthelinh@gmail.com
 *
 */

public class NumberOfMenuInDashboard implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return DashboardPage.MENU_ITEMS.resolveAllFor(actor).size();
    }
}
