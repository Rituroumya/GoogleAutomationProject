package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement button = driver.findElement(By.xpath("//input[@name='alert']"));
		button.click();
		
		Alert at = driver.switchTo().alert();
		Thread.sleep(3000);
		at.accept();
		WebElement button1 = driver.findElement(By.xpath("//input[@name='confirmation']"));
		button1.click();
		Thread.sleep(3000);
		at.dismiss();
		WebElement button2 = driver.findElement(By.xpath("//input[@name='prompt']"));
		button2.click();
		Thread.sleep(2000);
		at.sendKeys("ritu das");
		at.accept();
		

		
	}
	
}
