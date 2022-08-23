package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableGuru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		 WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        for (int i=1; i<rows.size(); i++)
	        {
	           String value = rows.get(i).getText();
	            System.out.println(value);       
	          
	        		  
	        }           
	}
}
       