package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//WebElement search = driver.findElement(By.id("enterval"));
	
		//search.sendKeys("disprin");
		//driver.findElement(By.name("btn"))
		Actions a = new Actions(driver);
		WebElement store = driver.findElement(By.xpath("//a[text()='Health Store']"));
		WebElement baby = driver.findElement(By.xpath("//a[text()='Baby Needs']"));
		
		


	}

}
