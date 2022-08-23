package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktop.click();
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		for (WebElement each:all)
		{
			if (each.getText().equals("Show All Desktops"));
			{
			each.click();
			}
		}

	}

}
