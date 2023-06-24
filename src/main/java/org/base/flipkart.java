package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flipkart {
	public flipkart() {

	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public WebElement cancel;

	@FindBy(xpath = "//a[contains(text(),'Login')]")

	public WebElement loginbtn;

	

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")

	public WebElement email;

	@FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2HKlqd')]")

	public WebElement reqotp;
	
	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getReqotp() {
		return reqotp;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getEmail() {
		return email;
	}

}
