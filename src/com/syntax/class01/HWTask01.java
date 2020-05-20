package com.syntax.class01;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HWTask01 extends CommonMethods{

	// HW
	// Validate that Welcome Admin is displayed
	// Check the reports in test-output folder
	
	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
		WebElement userName = driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.id("btnLogin")));
		
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	
	@Test
	public void welcomeDisplayed() {
		
	WebElement welcomeDisplayed = driver.findElement(By.id("welcome"));
	String text = welcomeDisplayed.getText();
	boolean isDisplayed = welcomeDisplayed.isDisplayed();
		if(isDisplayed) {
			System.out.println(text + " is displayed. Test case passed");
		}else {
			System.out.println(text + " is NOT displayed. Test case failed");
		}
	}

}
