package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsignin extends BaseClass {
	public Amazonsignin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()[normalize-space()='Account & Lists']]")
	private WebElement signintab;
	
	@FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
	private WebElement signin;
	
	@FindBy(xpath = "//input[contains(@class,'a-input-text a-span12')]")
	private WebElement emailormob;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement countinue;
	
	@FindBy(xpath = "//input[contains(@class,'a-input-text a-span12')]")
	private WebElement password;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement submit;
	


	public WebElement getCountinue() {
		return countinue;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSignintab() {
		return signintab;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmailormob() {
		return emailormob;
	}

}
