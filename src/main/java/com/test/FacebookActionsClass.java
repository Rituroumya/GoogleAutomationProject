package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//a.moveToElement(email).sendKeys("ritu").build().perform();
		a.sendKeys(email, "ritu").build().perform();
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		a.moveToElement(login).click().build().perform();
		//a.click(login).build().perform();
		
		
	}

}
