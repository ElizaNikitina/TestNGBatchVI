package com.syntax.pages;

import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class AddEmployeePageElements {

	
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
}
