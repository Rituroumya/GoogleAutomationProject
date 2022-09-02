package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPrictice {
	// TODO Auto-generated method stub

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement src = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		WebElement trg = driver.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(src, trg).build().perform();
		driver.switchTo().defaultContent();

List<WebElement> all = driver.findElements(By.xpath("//div[@class='newtabs horizontal']/ul/li"));
		
		for(WebElement each:all)
		{
			if(each.getText().equals("Accepted Elements"))
			{
				each.click();
				
			}
		
		System.out.println(driver.getCurrentUrl());
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		
		/*Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();*/

		


	}

}}
