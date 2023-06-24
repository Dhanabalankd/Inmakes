package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbnewAccount extends BaseClass {
	
	public FbnewAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Create new account')]")
	private WebElement CreateAcnt;
	
	@FindBy(xpath = "(//input[contains(@class,'inputtext _58mg')])[1]")
	private WebElement Firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(xpath = "(//input[contains(@class,'inputtext _58mg')])[3]")
	private WebElement Mobileno;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password;

	public WebElement getCreateAcnt() {
		return CreateAcnt;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobileno() {
		return Mobileno;
	}

	public WebElement getPassword() {
		return password;
	}

	
}
