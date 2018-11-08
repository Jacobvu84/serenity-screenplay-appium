package net.poc.tasks.factory;

import net.poc.tasks.AccountProfile;
import net.poc.tasks.DeleteAccount;
import net.serenitybdd.screenplay.Task;

/**
 * @author datdc@gearinc.com
 *
 */

public class GoTo {

	public static Task accountProfile() {
		return new AccountProfile();
	}

	public static Task guestProfile() {
		return new DeleteAccount();
	}

}
