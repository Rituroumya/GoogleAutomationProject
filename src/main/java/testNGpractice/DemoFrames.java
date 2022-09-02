package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFrames {
	
	@Test(groups={"smoke","sanity"}) 
	public void frames()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().frame("singleframe");
		WebElement text = driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']/input"));
		
		text.sendKeys("ritu");

	}


}
