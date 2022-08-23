package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
        WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        outer:
        for(int i=1;i<rows.size();i++)
        {
        	List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));	
        	for (int j=0;j<columns.size();j++)
        	{
        		String value =columns.get(j).getText();
        		if (value.equals("Facebook"))
        		{
        			System.out.println(columns.get(2).getText());
        			break outer;
        		}
        	}
        	
        }
        

	}

}
