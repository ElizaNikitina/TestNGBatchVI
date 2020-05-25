package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethods;

public class LoginPageElements extends CommonMethods{

	// Not using PageFactory, You have to extend CommonMethods or BaseClass
		// public WebElement username2=driver.findElement(By.id("txtUsername"));

		// Using PageFactory and @FindBy Annotation
		@FindBy(id = "txtUsername")
		public WebElement username;

		@FindBy(name = "txtPassword")
		public WebElement password;

		@FindBy(css = "input#btnLogin")
		public WebElement loginBtn;

		@FindBy(xpath = "//div[@id='divLogo']/img")
		public WebElement logo;

		@FindBy(id = "spanMessage")
		public WebElement errorMsg;
		
		@FindBy(id = "menu_pim_viewPimModule")
		public WebElement pim;
		
		@FindBy(id = "menu_pim_addEmployee")
		public WebElement pimAddEmp;
		
		@FindBy(id = "firstName")
		public WebElement firstName;
		
		@FindBy(id = "lastName")
		public WebElement lastName;
		
		@FindBy(xpath = "//*[@id=\"photofile\"]")
		public WebElement photofile;
		
		
		@FindBy(id = "btnSave")
		public WebElement btnSave;
		
		public LoginPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
			
		}
		/*
		 * if we would be kepping elements as private
		 * then we will need to create public getters and setters
		 * so we can access page elements from test classes
		 */
		
		//setter
		public void sendUsername(String uid) {
			sendText(username, uid);	
		}
		
		//getter
		public WebElement getUsername() {
			return username;
		}
		
		public void login(String uid, String pwd) {
			sendText(username, uid);
			sendText(password, pwd);
			click(loginBtn);
		}
}