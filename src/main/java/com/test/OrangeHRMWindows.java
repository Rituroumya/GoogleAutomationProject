package com.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindows {
	public static Set<String> all;
	public static Iterator<String> it;
	public static String parent, Linkedin, Facebook, Twitter, Youtube;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while (it.hasNext())
		{
			Linkedin=it.next();
			if(!parent.equals(Linkedin))
			{
				driver.switchTo().window(Linkedin);
			}
		}
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//input[@id='email-address']")).sendKeys("ritu@abc.com");
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
				all = driver.getWindowHandles();
				it = all.iterator();
				while (it.hasNext())
				{
					Facebook=it.next();
					if(!parent.equals(Facebook))
					{
						driver.switchTo().window(Facebook);
					}
				}
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@abc.com");
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
				all = driver.getWindowHandles();
				it = all.iterator();
				while (it.hasNext())
				{
					Twitter=it.next();
					if(!parent.equals(Twitter))
					{
						driver.switchTo().window(Twitter);
					}
				}
				System.out.println(driver.getTitle());
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
				all = driver.getWindowHandles();
				it = all.iterator();
				while (it.hasNext())
				{
					Youtube=it.next();
					if(!parent.equals(Youtube))
					{
						driver.switchTo().window(Youtube);
					}
				}
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a")).click();
				driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
				driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/div[3]")).click();
				List<WebElement> all =driver.findElements(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]"));

				
				for(WebElement each:all)
				{
					if(each.getText().equals("For myself"))
					{
						each.click();
						
					}
				}
	}
	}


