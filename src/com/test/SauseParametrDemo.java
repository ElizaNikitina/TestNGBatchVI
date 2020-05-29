package com.test;

import org.junit.*;
import org.testng.annotations.Parameters;

import com.utils.CommonMethods;

public class SauseParametrDemo extends CommonMethods{

	@Parameters({"userName", "paswrd"})
	
	@Test
	public void login(String userName, String paswrd) {
		sendText(sauseDemoLogin.username, userName);
		sendText(sauseDemoLogin.password, paswrd);
		click(sauseDemoLogin.loginBtn);
		
		wait(3);
	}
}
