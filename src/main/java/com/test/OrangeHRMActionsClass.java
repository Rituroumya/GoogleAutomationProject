package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Actions a = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement org = driver.findElement(By.xpath("//a[text()='Organization']"));
		WebElement loc = driver.findElement(By.xpath("//a[text()='Locations']"));
		a.moveToElement(admin).moveToElement(org).moveToElement(loc).click().build().perform();

		

	}

}
