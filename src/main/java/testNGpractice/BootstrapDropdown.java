package testNGpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown {
	@Test(groups={"sanity"}) 
	public void bootstrap()

	 {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[@id='menu1']"));
		ele.click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		ritu:
		for(WebElement each:all)
		{
			if(each.getText().equals("JavaScript"))
			{
				each.click();
				break ritu;
				
			}
			driver.close();
		}
	 }
}

