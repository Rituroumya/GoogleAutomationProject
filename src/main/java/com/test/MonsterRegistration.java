package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonsterRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement name = driver.findElement(By.name("fullname"));
		name.sendKeys("Ritu Das");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("ritu123@abc.com");
		WebElement pass = driver.findElement(By.name("Password"));
		pass.sendKeys("ritu1234");
		
		
		//WebElement loc = driver.findElement(By.xpath("//input[@name='location']"));
		//loc.click();
		//loc.sendKeys("USA");
		WebElement country = driver.findElement(By.xpath("//select[@class='countryCodes']"));
        Select s= new Select(country);
       
        s.selectByValue("1");
        //WebElement num = driver.findElement(By.xpath("//input[@name='Mobile Number']"));
		//num.sendKeys("123456789");
        driver.findElement(By.xpath("//div[@class='multiselect__select modal-ref-class']")).click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='multiselect__content ddn-scrollable modal-ref-class']//li/span/span/span"));
		
		for(WebElement each:all)
		{
			if(each.getText().equals("1 Year"))
			{
				each.click();
				
        }
		
        
			driver.findElement(By.xpath("//div[@class='multiselect__select modal-ref-class']")).click();
			List<WebElement> all1 = driver.findElements(By.xpath("//ul[@class='multiselect__content ddn-scrollable modal-ref-class']//li/span/span/span"));
			
			for(WebElement each1:all1)
			{
				if(each1.getText().equals("6 Month"))
				{
					each1.click();
					
	        }
			}
			
		}
		driver.findElement(By.xpath("//label[@class='checkbox']/input/../i")).click();
	}
	
	
	
}
	
