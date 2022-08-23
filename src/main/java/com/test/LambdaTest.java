package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("ritu");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ritu@gmail.com");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("ritu123");
		WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys("123456789");
		WebElement ch = driver.findElement(By.xpath("//input[@name='i_agree']/../samp"));
		ch.click();


	}

}
