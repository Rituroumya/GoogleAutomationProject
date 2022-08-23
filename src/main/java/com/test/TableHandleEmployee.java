package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableHandleEmployee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		WebElement table=driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
		List<WebElement> rows=table.findElements(By.xpath("//div[@class='oxd-table-body']/div/div"));
		outer:
		for(int i=1;i<rows.size();i++)
		{
			String text = "//div[@class='oxd-table-body']/div[index]/div/div";
			String s=Integer.toString(i);
			String result = text.replaceAll("index", s);
			List<WebElement> columns=rows.get(i).findElements(By.xpath(result));
			for(int j=0;j<columns.size();j++)
			{
			String value=columns.get(j).getText();
			if(value.equals("Dash"))
			{
				System.out.println(columns.get(2).getText());
				columns.get(0).click();
				columns.get(1).click();
				driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("123456");
				//driver.findElement(By.xpath("//button[text()=' Save ']")).click();
				
				break outer;
		}
	}

		}
	}}
