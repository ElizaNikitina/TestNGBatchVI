package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;
import com.utils.ExcelUtility;

public class HWTask01 extends CommonMethods{
	/*
	 * 1.Open chrome browser
	 * 2.Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	 * 3.Login into the application
	 * 4.Add 5 different Employees and create login credentials by providing:
	 *  First Name
	 *  Last Name
	 *  Username
	 *  Password
	 *  5.Provide Employee First and Last Name
	 *  6.Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
	 *  7.Close the browser
	 */

	@Test(dataProvider = "userDataFromExcel")
	public void create5NewEmp( String name, String lastname, String userName, String paswd ) {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.addEmp();
		wait(7);
		
		String expectedEmpId = addEmp.employeeId.getAttribute("value");
		
		addEmp.createNewEmp(name, lastname, userName, paswd);
		wait(5);
		
		addEmp.clickSave();
		wait(5);
		
		waitForVisibility(pdetails.lblPersonalDetails);
		
		String actualEmpId = pdetails.employeeId.getAttribute("value");
		Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");
		
		//take screenshot
		takeScreenshot(name + "_" + lastname);
		
		
	}
	
	@DataProvider
	public Object[][] getData() {

		
		Object[][] data = { 
				{ "Lena", "Antonova", "Lena_Antonova", "Password!234"  } ,
				{ "Katya", "Antonova1!", "Katya_Antonova", "Password!234" },
				{ "Olga", "Antonova2!", "Lena_Antonova", "Password!234"  } ,
				{ "Yula", "Antonova3" , "Yula_Antonova", "Password!234" } ,
				{ "eliza", "Antonova4!", "eliza_Antonova", "Password!234" },
		};
		return data;
	}
	
	@DataProvider(name = "userDataFromExcel")
	public Object[][] getData2() {
		return ExcelUtility.excelIntoArray(System.getProperty("user.dir") + "/testdata/Excel.xlsx", "Employee");
	}
}
