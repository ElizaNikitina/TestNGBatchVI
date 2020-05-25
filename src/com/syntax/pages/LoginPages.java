package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class LoginPages extends CommonMethods{

	public WebElement username=driver.findElement(By.id("txtUsername"));

	public WebElement password=driver.findElement(By.id("txtPassword"));

	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));

	public WebElement logo = driver.findElement(By.id("divLogo"));	
	

}


