package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a = new Actions(driver);
		//WebElement input = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//input.sendKeys("tops",Keys.ENTER);
		WebElement btn = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.contextClick(btn).build().perform();
		a.doubleClick(btn).build().perform();
	}

}
