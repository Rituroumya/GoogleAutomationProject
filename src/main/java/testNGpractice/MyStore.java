package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyStore {
	
	@Test(groups={"sanity"}) 
	public void cart()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		 WebElement search = driver.findElement(By.id("search_query_top"));
		 search.sendKeys("dress");
		 WebElement submit = driver.findElement(By.xpath("//button[@name='submit_search']"));
		 submit.click();
		 driver.findElement(By.partialLinkText("Summer Dress")).click(); 
		 driver.findElement(By.xpath("//a[@id='color_14']")).click();
		 WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		 Select s = new Select(size);
		 s.selectByValue("2");
		 driver.findElement(By.name("Submit")).click();
		 driver.findElement(By.linkText("Proceed to checkout")).click();
	}

}
