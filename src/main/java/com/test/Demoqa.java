package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class Demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));		
		name.sendKeys("Ritu");
        WebElement lastname = driver.findElement(By.xpath("//input[@placeholder ='Last Name']"));
        lastname.sendKeys("Das");
        WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();
       // WebElement hobby = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        //hobby.click();
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("");
        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select s= new Select(month);
        //s.selectByIndex(3);
        s.selectByValue("3");
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select s1= new Select(year);
        //s.selectByIndex(3);
        s1.selectByValue("1980");
        driver.findElement(By.xpath("(//div[text()='7'])[1]")).click();
	}

	
}
