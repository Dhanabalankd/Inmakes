package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.FbnewAccount;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegitration extends BaseClass {

	FbnewAccount f = new FbnewAccount();

	@Given("To launch browser and maximize")
	public void to_launch_browser_and_maximize() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch facebook url")
	public void to_launch_facebook_url() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To  click create new account")
	public void to_click_create_new_account() {
		f = new FbnewAccount();
		clickBtn(f.getCreateAcnt());

	}

	@When("To pass first name in firstname text box")
	public void to_pass_first_name_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);

		List<String> onedimenl = d.asList();
		f = new FbnewAccount();
		passText(onedimenl.get(2), f.getFirstname());

	}

	@When("To pass lastname in lastname text box")
	public void to_pass_lastname_in_lastname_text_box(DataTable d) {
		Map<String, String> onedimenm = d.asMap(String.class, String.class);
		f = new FbnewAccount();
		passText(onedimenm.get("lastname3"), f.getLastname());
	}

	@When("to pass mobileno or email in that text box")
	public void to_pass_mobileno_or_email_in_that_text_box(DataTable d) {
		List<List<String>> twodimenl = d.asLists();
		f = new FbnewAccount();

		passText(twodimenl.get(1).get(2), f.getMobileno());

	}

	@When("To create new password in password")
	public void to_create_new_password_in_password(DataTable d) {
		List<Map<String, String>> twodimenm = d.asMaps();
		f = new FbnewAccount();
		passText(twodimenm.get(1).get("password1"), f.getPassword());

	}

	@Then("Close the Browser")
	public void close_the_Browser() {
	}

}
