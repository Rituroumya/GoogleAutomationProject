package com.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Friuts {
	public class Fruits {
		@Test(priority=5)
		public void sopota() {
			System.out.println("Hello, I am Sapota");
			
		}
		@Test(priority=6)
		public void mango()
		{
			System.out.println("Hello, I am Mango");
		}
		@Test(priority=4)
		public void apple() {
			System.out.println("Hello, I am Apple");
			
		}
		@Test(priority=2)
		public void orange()
		{
			System.out.println("Hello, I am Orange");
		
		}
		@Test(priority=3)
		public void grapes() {
			System.out.println("Hello, I am Grapes");
			
		}
		@Test(priority=1)
		      
		public void melon()
		{
			System.out.println("Hello, I am Melon");
		}


}
}
