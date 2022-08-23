package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeLogin {
	public static ChromeDriver driver;
	public static int i =0;
		public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
driver= new ChromeDriver(); 
OrangeLogin hm =new OrangeLogin();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement user = driver.findElement(By.id("txtUsername"));
user.sendKeys("Admin");
hm.snap();
WebElement pass = driver.findElement(By.xpath("//input[@name='txtUsername']/following::input[1]"));
pass.sendKeys("admin123");
hm.snap();
WebElement login = driver.findElement(By.xpath("//input[@name='txtUsername']/following::input[2]"));

login.click();
hm.snap();
	}
	public void snap() throws IOException
	{
		Random r = new Random();
		if (r.nextInt()!=0)
		{
			i=i+1;
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File(".//pics//img"+i+".png");
			FileUtils.copyFile(src, dest);
			
					
		}




	}

}
