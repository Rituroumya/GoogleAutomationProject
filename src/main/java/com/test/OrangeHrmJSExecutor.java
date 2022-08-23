package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.MoreObjects.ToStringHelper;

public class OrangeHrmJSExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		String scrpt = "window.location = \'"+s+"\'";
		js.executeScript(scrpt);
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Admin';",user);
		js.executeScript("document.getElementById('btnLogin').click()");
		js.executeScript("history.go(0)");
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)");
	      Thread.sleep(5000);

		WebElement link = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", link);
	      
		
		 


	}

}
