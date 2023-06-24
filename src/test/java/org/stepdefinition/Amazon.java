package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.Amazonsignin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 

public class Amazon extends BaseClass {
	Amazonsignin a = new Amazonsignin();
	@Given("To launch browser and maximize")
	public void to_launch_browser_and_maximize() {
		launchBrowser();
		windowMaximize();
	}
	
	@When("To launch Amazon url")
	public void to_launch_Amazon_url() {
		launchUrl("https://www.amazon.com/");
	   
	}

	@When("Click signin tab")
	public void click_signin_tab() {
		a = new Amazonsignin();
		clickBtn(a.getSignintab());
	   
	}

	

	@When("To pass email or ph no in text box")
	public void to_pass_email_or_ph_no_in_text_box() {
		a = new Amazonsignin();
		passText("9360090651", a.getEmailormob());

	   
	}

	@When("To click countinue button")
	public void to_click_countinue_button() {
		a = new Amazonsignin();
		clickBtn(a.getCountinue());

	}

	@When("To pass password in password text box")
	public void to_pass_password_in_password_text_box() {
		a = new Amazonsignin();
		passText("1234567890", a.getPassword());

	}

	@When("To Click submit button")
	public void to_Click_submit_button() {
		a = new Amazonsignin();
		clickBtn(a.getSubmit());

	}

	@Then("close the Browser")
	public void close_the_Browser() {
		closeEntireBrowser();

	}

}
