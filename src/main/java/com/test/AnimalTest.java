package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnimalTest {
	@Test
	public void lion()
	{
	System.out.println("This is a Lion");
    }
	@Test
	public void giraffe()
	{
	System.out.println("This is a Giraffe");
    }
     @AfterMethod
     public void tiger()
     {
     System.out.println("This is a Tiger");
     }
       @BeforeMethod
	   public void monkey()
	  {
	    System.out.println("This is a Monkey");
      }
	    @AfterClass 
	    public void cat()
		{
		System.out.println("This is a Cat");
	    }
         @BeforeClass
	     public void dog()
	     {
	     System.out.println("This is a Dog");
	     }
           @AfterTest
		   public void elephant()
		   {
		   System.out.println("This is an Elephant ");
	
	       }
		   @BeforeTest
		   public void horse()
			{
			System.out.println("This is a Horse");
		    }
             @AfterSuite
		     public void pig()
		     {
		     System.out.println("This is a Pig");
		     }
             @BeforeSuite
			 public void zebra()
			{
			System.out.println("This is a Zebra");
		     }

}


