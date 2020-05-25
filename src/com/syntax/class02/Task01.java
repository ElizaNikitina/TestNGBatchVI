package com.syntax.class02;

import org.testng.annotations.*;

public class Task01 {
/*
 * Create a class TaskOne that has 5 test methods named:
	firstMethod
	firstMethod1
	secondMethod
	thirdMethod
	fourthMethod
	
	And each of them printing the method name
	Run and observe results
	Then, add the needed attributes to print the following result:
	fourthMethod
	thirdMethod
	secondMethod
	firstMethod
 */
	
	@Test(priority = 3)
	public void firstMethod() {
		System.out.println("firstMethod");
	}
	
	@Test(enabled=false)
	public void firstMethod1() {
		System.out.println("first Method1");
	}
	@Test (priority = 2)
	public void secondMethod() {
		System.out.println("secondMethod");
	}
	
	@Test (priority = 1)
	public void thirdMethod() {
		System.out.println("thirdMethod");
	}
	@Test(priority = 0)
	public void fourthMethod() {
		System.out.println("fourthMethod");
	}
}
