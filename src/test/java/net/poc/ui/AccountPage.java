package net.poc.ui;

/**
 * @author datdc@gearinc.com
 *
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {

	public static final Target ACCOUNT_PAGE_TITLE = Target.the("screen title")
			.located(By.id("net.metaquotes.metatrader5:id/left_title"));
	public static final Target OTP_BUTTON = Target.the("OTP button")
			.located(By.id("net.metaquotes.metatrader5:id/menu_account_otp"));
	public static final Target CERTIFICATES_BUTTON = Target.the("certificates button")
			.located(By.id("net.metaquotes.metatrader5:id/menu_account_certificates"));
	public static final Target ADD_ACCOUNT_BUTTON = Target.the("add account button")
			.located(By.id("net.metaquotes.metatrader5:id/menu_account_add"));
	public static final Target OPTIONS_BUTTON = Target.the("options button")
			.located(By.id("net.metaquotes.metatrader5:id/menu_other_left_button"));
	public static final Target SELECTED_ACCOUNT = Target.the("user name of selected account")
			.located(By.id("net.metaquotes.metatrader5:id/user_name"));
	public static final Target UNSELECTED_ACCOUNT = Target.the("account name of unselected account")
			.located(By.id("net.metaquotes.metatrader5:id/account_name"));
	public static final Target CONNECT_TO = Target.the("connect to label")
			.located(By.id("net.metaquotes.metatrader5:id/connect_to_cation"));
	public static final Target DELETE_BUTTON = Target.the("delete button")
			.located(By.xpath("//android.widget.TextView[@text='Delete account']"));
	public static final Target DELETE_ACCOUNT_POPUP = Target.the("the Delete account popup")
			.located(By.id("android:id/alertTitle"));
	public static final Target YES_BUTTON = Target.the("yes button of the Delete account popup")
			.located(By.id("android:id/button1"));
	public static final Target NO_ACCOUNTS_PANEL = Target.the("add icon and message")
			.located((By.id("net.metaquotes.metatrader5:id/no_accounts")));

	public static final Target getAlertMsg(String label) {
		return Target.the("message").located(By.xpath(String.format("//android.widget.TextView[contains(@text,'%s')]", label)));
	}
}
