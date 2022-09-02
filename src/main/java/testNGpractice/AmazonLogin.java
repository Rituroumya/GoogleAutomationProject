package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin {
    @Test(groups={"regression"}) 
	public void amazon()
	
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a = new Actions(driver);
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.contextClick(btn).build().perform();
		a.doubleClick(btn).build().perform();
		driver.close();
	}

	
}

