package com.syntax.Review01;

import org.junit.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class SauseDemoLogin extends CommonMethods{
	
	
	@Test(dataProvider = "dataProvider", groups = "smoke")
	public void login(String userName, String passwd) {
		
		sauseDemoLogin.login(userName ,passwd);	
		
		wait(3);
		// take screeshot
		//		takeScreenshot(userName + "_" + passwd);
		
		if(userName.equals("locked_out_user")) {
			Assert.assertTrue(sauseDemoLogin.errorMessage.isDisplayed());
		}else {
			Assert.assertTrue(sauseDemoLogin.productText.isDisplayed());	
		}
				
		
				
	}

	
	@DataProvider(name = "dataProvider")
	public Object[][] getData() {
		Object[][] data = { 
				{ "standard_user", "secret_sauce" }, 
				{ "locked_out_user", "secret_sauce"},
				{ "performance_glitch_user", "secret_sauce"},
				{ "problem_user", "secret_sauce" } 
		};
		return data;
	}
	
	
}
