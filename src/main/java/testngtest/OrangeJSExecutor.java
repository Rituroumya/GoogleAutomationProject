package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeJSExecutor {
	@Test(enabled=false)
	public void jspractice() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String scrpt = "window.location = \'"+s+"\'";
		js.executeScript(scrpt);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement user = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='Admin';",user);
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value='admin123';",pass);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		
		 

	}

}
