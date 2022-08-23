package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GuruDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement button =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        a.doubleClick(button).build().perform();
        Thread.sleep(2000);
		Alert abc =driver.switchTo().alert();
		abc.accept();
		Thread.sleep(2000);
		WebElement button2 = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(button2).build().perform();
	}

}
