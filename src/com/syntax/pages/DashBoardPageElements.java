package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods{

		@FindBy(id = "welcome")
		public WebElement welcome;
		
		@FindBy(xpath = "//div[@id='branding']/a[1]/img")
		public WebElement logo;
		
		@FindBy(id = "firstName")
		public WebElement firstName;
		
		@FindBy(id = "lastName")
		public WebElement lastName;
		
		@FindBy(xpath = "//li[@class='line nameContainer']//label")
		public WebElement fullName;
		
		@FindBy(xpath = "//label[text()='Employee Id']")
		public WebElement empID;
		
		@FindBy(xpath = "//label[text()='Photograph']")
		public WebElement photo;
		
		public DashBoardPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy(id = "menu_pim_viewPimModule")
		public WebElement pim;
		
		@FindBy(id = "menu_pim_addEmployee")
		public WebElement pimAddEmp;
	
		
	
		
		@FindBy(xpath = "//*[@id=\"photofile\"]")
		public WebElement photofile;
		
		
		@FindBy(id = "btnSave")
		public WebElement btnSave;
		
		public void addEmp() {
			jsClick(pim);
			jsClick(pimAddEmp);
		}
	}

