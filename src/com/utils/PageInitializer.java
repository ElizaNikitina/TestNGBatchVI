package com.utils;

import com.syntax.pages.AddEmployeePageElements;
import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.pages.PersonalDetailsPageElements;
import com.syntax.pages.SauseDemoLogin;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	
	public static SauseDemoLogin sauseDemoLogin;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashBoardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		
		sauseDemoLogin = new SauseDemoLogin();
	}
}