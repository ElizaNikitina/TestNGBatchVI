package com.test;

import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void quit() {
//	
//		tearDown();
//	}

	@Test
	public void validAdmonLogin() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.loginBtn);
		
	
		String expectedUser = "Welcome Admin";
		String actualUser=dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is NOT Logged in");
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
		
	}
	
	@Test
	public void invalidPassword() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "qwe");

		click(login.loginBtn);
		
		String expected = "Invalid credentials";
		Assert.assertEquals(login.errorMsg, ConfigsReader.getProperty("password"));
	}
}
