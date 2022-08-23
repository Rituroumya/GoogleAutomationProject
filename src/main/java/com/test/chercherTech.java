package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chercherTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
		Select s= new Select(product);
		s.selectByIndex(3);
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select p =new Select(animal);
		p.selectByValue("babycat");
		WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
		Select f =new Select(food);
		f.selectByValue("pizza");		
		f.selectByValue("donut");
		f.selectByVisibleText("Burger");
		f.selectByVisibleText("Bonda");
		f.deselectByVisibleText("Bonda");
		f.deselectAll();
		WebElement dropdown = driver.findElement(By.xpath("//button[@id='custom']"));
		dropdown.click();
		java.util.List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']/li/b"));
		for (WebElement e:all)
		{
			if(e.getText().equals("li"));
			{
			e.click();
		}

		}
	

		
		
		




		
		
		
		


	}

}
