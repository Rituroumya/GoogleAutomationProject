package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TargetStore {
	@Test(groups={"smoke"}) 
	public void target() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.target.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//span[text()='Backpacks']")).click();
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='addToCartButtonOrTextIdFor87051720']")).click();
	}
}
