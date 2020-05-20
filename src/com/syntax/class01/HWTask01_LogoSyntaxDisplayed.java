package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HWTask01_LogoSyntaxDisplayed extends CommonMethods{
/*
 * 1.Open chrome browser
 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * 3.Enter valid username and password
 * 4.Click on login button
 * 5.Then verify Syntax Logo is displayed
 * 6.Close the browser
 */
	
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
	public void quiteBrowser() {
		tearDown();
	}
	
	@Test
	public void logoSyntaxDisplayed() {
		WebElement logoSyntax = driver.findElement(By.xpath("//div[@id='branding']/a/img"));

		boolean isDisplayed = logoSyntax.isDisplayed();
		if(isDisplayed) {
			System.out.println("Syntax img is displayed. Test case passed");
		}else
			System.out.println("Syntax img is NOT displayed. Test case failed");
	}
}
