package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class TitleLogoAndLoginValidation extends CommonMethods{
	
	
	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}
	
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void titleValidation() throws Exception {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("titleValidation passed");
		}else {
			System.out.println("titleValidation failed");
			throw new Exception();
		}
		Thread.sleep(2000);
	}
	
	@Test
	public void logoValidation() throws InterruptedException {
		String logoPath = "//div[@id='divLogo']/img";
		WebElement logo = driver.findElement(By.xpath(logoPath));
		boolean isDisplayed = logo.isDisplayed();
		if(isDisplayed) {
			System.out.println("logoValidation passed");
		}else {
			System.out.println("logoValidation failed");
		}
		Thread.sleep(2000);
	}
	
	@Test
	public void validLogin() throws InterruptedException {
		WebElement userName = driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.id("btnLogin")));
		
		Thread.sleep(2000);
	}
	

}
