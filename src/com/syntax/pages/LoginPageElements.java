package com.syntax.pages;

import org.openqa.selenium.By;
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
		
		@FindBy(id = "user_name")
		public WebElement user_name;
		
		@FindBy(id = "user_password")
		public WebElement user_password;
		
		@FindBy(id = "re_password")
		public WebElement re_password;
		
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
		
		public void createLoginDetails(String usName, String paswd ) {
			sendText(user_name, usName);
			sendText(user_password, paswd);
			sendText(re_password, paswd);
			
		}
		
		public void fullName(String name, String lastName) {
			driver.findElement(By.id("firstName")).sendKeys(name);
			driver.findElement(By.id("lastName")).sendKeys(lastName);
		}
		
		public void clickSave() {
			click(btnSave);
		}

		public String getText() {
		WebElement text = driver.findElement(By.xpath("//span[text()='Required']"));
		String expectedText = text.getText();	
			return expectedText;
		}
		
		public void createNewEmp(String name, String lastname, String usName, String paswd) {
			sendText(firstName,name);
			sendText(lastName,lastname);
		
			WebElement radioB = driver.findElement(By.id("chkLogin"));
			radioB.click();
			sendText(user_name, usName);
			sendText(user_password, paswd);
			sendText(re_password, paswd);
			
		}

		
}