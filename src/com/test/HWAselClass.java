package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HWAselClass extends CommonMethods {

	/*
	 * US 12678 As an Admin I should be able to create login credentials while adding employee
	 * 
	 * US 67789 As an admin while adding employee if I leave required fields empty I
	 * should see “Required” message Note: first name and last name are required
	 * fields
	 * 
	 */

	@Test
	public static void valid() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.addEmp();
		wait(7);
		
		login.fullName("Karl", "Lagerfeld"); //create full name
		
		WebElement radioB = driver.findElement(By.id("chkLogin"));
		boolean radioIsEnabled = radioB.isEnabled();
		Assert.assertTrue(radioIsEnabled, "Test case didn`t pass");
		radioB.click();
		
		login.createLoginDetails("Karl123", "Password123!"); //create login and password
		wait(5);
		login.clickSave();
	
	}
	
	@Test
	public static void requiredMassage() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.addEmp();
		wait(7);
		
		login.fullName("Karl", "");
		login.clickSave();
		wait(5);
		
		String expected = "Required";
		String actualText = login.getText();
		
		Assert.assertEquals(actualText, expected);
		
		
	}
}
