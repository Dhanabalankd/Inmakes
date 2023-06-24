package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class fblogin {
	
	public fblogin() {

	}
	@FindBy(id="ap_email")
	
	public  WebElement email;
	
	@FindBy(name="pass")
	
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(@class,'_42ft _4jy0')]")
	
	public WebElement loginbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
