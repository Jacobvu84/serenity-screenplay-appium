package net.poc.questions.factory;

import java.util.List;

import net.poc.questions.NumberOfMenuInDashboard;
import net.poc.questions.PresentMenusInDashboard;
import net.serenitybdd.screenplay.Question;

/**
 * @author vuthelinh@gmail.com
 *
 */

public class MenuBarWebUI {
    public static Question<Integer> numberOfItems() {
        return new NumberOfMenuInDashboard();
    }

    public static Question<List<String>> displayedWithStrictOrder() {
        return new PresentMenusInDashboard();
    }


}
