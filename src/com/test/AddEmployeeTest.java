package com.test;

import org.testng.annotations.*;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {

//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void addEmployeePage() {

	login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

	dashboard.addEmp();
	wait(7);

		
		
		
//		sendText(addEmp.empFirstName, ConfigsReader.getProperty("firstName"));
//		sendText(addEmp.empLastName, ConfigsReader.getProperty("lastName"));
//		sendText(addEmp.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(emp1.saveEmp);

	}

}