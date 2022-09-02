package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeLogin {
    @Test(groups={"regression"}) 
	public void login() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver= new ChromeDriver(); 
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	user.sendKeys("Admin");
	
	WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	pass.sendKeys("admin123");

	WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));

	login.click();
	}
		
	}

