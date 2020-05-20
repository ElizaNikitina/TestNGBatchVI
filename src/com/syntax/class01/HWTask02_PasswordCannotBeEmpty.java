package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HWTask02_PasswordCannotBeEmpty extends CommonMethods{
/*
 * 1.Open chrome browser
 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * 3.Enter valid username
 * 4.Leave password field empty
 * 5.Verify error message with text “Password cannot be empty” is displayed.
 */
	
	@BeforeMethod
	public void openAndNavigate1() throws InterruptedException {
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
	public void passwordEmpty() {
		WebElement infoText = driver.findElement(By.id("spanMessage"));
		String text = infoText.getText();
		boolean isDisplayed= infoText.isDisplayed();
		if(isDisplayed) {
			System.out.println(text + " is displayed. Test case passed");
		}else {
			System.out.println(text + " is displayed. Test case failed");
		}
	}
}
