package com.syntax.class01;

import org.testng.annotations.*;

public class Task01 {
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("This is before Class");
	}
	
	@AfterClass
	public void afterClass1() {
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@Test
	public void test1() {
		System.out.println("I am a test one");
	}
	
	@Test
	public void test2() {
		System.out.println("I am a test two");
	}

	@Test
	public void test3() {
		System.out.println("I am a test three");
	}

}
