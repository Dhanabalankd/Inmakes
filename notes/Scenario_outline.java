package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario_outline extends BaseClass {
	
	@Given("User launch the browser and maximize the window")
	public void user_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	  
	}

	@When("User launch the url of gmail website")
	public void user_launch_the_url_of_gmail_website() {
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S1376301016%3A1686062318074170&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ffgf=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneEKJJAznHYxFdyWRvkycuEJ65lVV6C3DhL3ZhJPmuoZFigolyXOU2SY-koexDhMWnWVoZ4H&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox");
	   
	}

	@When("user give the email in {string} username field")
	public void user_give_the_email_in_username_field(String email) {
		WebElement Username = driver.findElement(By.xpath("//input[@type='email']"));
		Username.sendKeys(email);
		   
	}



	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement nextbtn = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		nextbtn.click();
	    
	}

	@Then("user check whether status")
	public void user_check_whether_status() {
		
		System.out.println("All mails check");
		closeEntireBrowser();
	    
	}
	
	


}