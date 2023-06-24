package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		
	
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\K.D\\eclipse-workspace\\Cucumberproject\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 Thread.sleep(3000);
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("dhanabalan");
	
	}

		
}
