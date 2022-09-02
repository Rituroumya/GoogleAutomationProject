package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung Tab" );
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//span[@class='rush-component']/a)[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']/../input")).click();
		driver.findElement(By.xpath("//input[@class='a-button-input']"));

	}

}
