package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JquerySelectmultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
	WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	
	WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	a.keyDown(Keys.CONTROL).moveToElement(item1).click().moveToElement(item2).click().moveToElement(item3).click().moveToElement(item4).click().keyUp(Keys.CONTROL).build().perform();
	//a.moveToElement(item1).click().keyDown(Keys.SHIFT).moveToElement(item4).click().keyUp(Keys.SHIFT).build().perform();

	}

}
