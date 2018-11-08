/**
 * 
 */
package net.poc.tasks.factory;

import net.poc.tasks.Access;
import net.poc.tasks.ShowMenuPanel;
import net.serenitybdd.screenplay.Task;

/**
 * @author vuthelinh@gmail.com
 *
 */
public class Navigate {

	public static Task menuPanel() {
		return new ShowMenuPanel();
	}

	public static Task menuWithLabel(String label) {
		return new Access(label);
	}

}
