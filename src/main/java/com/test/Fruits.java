package com.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Fruits {
	@BeforeSuite
	public void sopota() {
		System.out.println("Hello, I am Sapota");
		
	}
	@Test
	public void mango()
	{
		System.out.println("Hello, I am Mango");
	}

}
