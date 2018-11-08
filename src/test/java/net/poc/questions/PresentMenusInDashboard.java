package net.poc.questions;

import java.util.List;

import net.poc.ui.builder.MenuBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * @author vuthelinh@gmail.com
 *
 */

public class PresentMenusInDashboard implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return  MenuBuilder.getMenuListInUI(actor);
    }
}
