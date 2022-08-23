package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TargetStore {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement catagory = driver.findElement(By.linkText("Categories"));
		catagory.click();
		driver.findElement(By.xpath("//div[@id='overlay-3']")).click();
		//for(WebElement each:all)
		//{if (each.getText().equals("Grocery"))
		//{
			//each.click();
		//}
		//}
		}
		
	}
