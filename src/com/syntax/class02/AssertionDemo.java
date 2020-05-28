package com.syntax.class02;

import org.testng.Assert;
import org.testng.annotations.*;

import com.syntax.pages.LoginPageElements;
import com.utils.CommonMethods;

public class AssertionDemo extends CommonMethods{

//	@BeforeMethod
//	public void openAndNavigate1(){
//		setUp();
//	}
//	
	
//	@AfterMethod
//	public void quitBrowser() {
//		tearDown();
//	}
	
	@Test
	public void titleValidation() {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		//1st way
		//Assert.assertEquals(actualTitle, expectedTitle);
		//2nd way
		Assert.assertEquals(actualTitle, expectedTitle, "Title does NOT match");
		System.out.println("Text after assertion");
	}
	
	@Test
	public void logiValidation() {
		LoginPageElements login = new LoginPageElements();
		
		boolean logoDisplayed = login.logo.isDisplayed();		
	}
}
