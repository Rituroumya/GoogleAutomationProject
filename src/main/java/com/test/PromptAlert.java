package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement framealpha = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(framealpha);
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
		Alert at = driver.switchTo().alert();
		Thread.sleep(3000);
		at.sendKeys("ritu das");
		at.accept();
		
	}

}
