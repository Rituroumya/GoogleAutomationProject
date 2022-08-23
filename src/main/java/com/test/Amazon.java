package com.test;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tops");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		//driver.findElement(By.cssSelector(".icp-nav-flag")).click();
        //driver.findElement(By.cssSelector("a.nav-a[aria-label=Women]")).click();
       
		
		//Select s= new Select(null);
		//s.selectByVisibleText("Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toaster");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//WebElement ele = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		//ele.click();
		//List<WebElement> all = driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible']/li/a"));
		
		//for(WebElement each:all)
		//{
			//if(each.getText().equals("Amazon Music"))
			//{
				//each.click();
			//}
			//}
	}
}
