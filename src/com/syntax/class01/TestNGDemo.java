package com.syntax.class01;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test
	public void testOne() {
		System.out.println("Step one");
		System.out.println("Step two");
		System.out.println("Step three");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test two");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test three");
	}
}
