package com.syntax.class02;

import java.util.List;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HWHRMSAddEmployee extends CommonMethods{
/*
 * 1.Open chrome browser
 * 2. Go to http://166.62.36.207/humanresources/symfony/web/index.php/auth
 * 3. Login into the application
 * 4. Click on Add Employee
 * 5. Verify labels: Full Name, Employee Id, Photograph are displayed
 * 6. Provide Employee First and Last Name
 * 7. Add a picture to the profile
 * 8. Verify Employee has been added successfully
 * 9. Close the browser
 */
//	
//	@BeforeMethod
//	public void openAndNavigate() {
//		setUp();
//	}
//	
//	@AfterMethod
//	public void quitBrowser() {
//		tearDown();
//	}
	
	@Test
	public void loginValid() {
		LoginPageElements login = new LoginPageElements();
	
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		
		waitForClickability(login.pim);
		click(login.pim);
		waitForClickability(login.pimAddEmp);
		click(login.pimAddEmp);
			
		
		
		DashBoardPageElements dashboard = new DashBoardPageElements();
		boolean fullName = dashboard.fullName.isDisplayed();
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(fullName, "FullName is not displayed");
	
		boolean empID = dashboard.empID.isDisplayed();
		soft.assertTrue(empID, "Emp Id is not displayed");
		
		boolean photo = dashboard.photo.isDisplayed();
		soft.assertTrue(photo, "Photo is not displayed");
		
		soft.assertAll();
	}

	
	@Test
	public void addEmployee() {
		LoginPageElements login = new LoginPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		waitForClickability(login.pim);
		click(login.pim);
		waitForClickability(login.pimAddEmp);
		click(login.pimAddEmp);
		
		sendText(login.firstName, ConfigsReader.getProperty("firstName"));
		sendText(login.lastName, ConfigsReader.getProperty("lastName"));
		
		String photoPath = "C:/Users/Ёлиза/Desktop/€.jpg";
		
		login.photofile.sendKeys(photoPath);
		
		click(login.btnSave);
		
	}
}
