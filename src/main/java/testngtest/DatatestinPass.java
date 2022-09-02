package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatatestinPass {
	 @Test (dataProvider = "goodperson")
		public void login(String data1, String data2) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		user.sendKeys(data1);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.sendKeys(data2);

		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));

		login.click();
		}
	 @DataProvider(name="goodperson")
	 public static Object[][] usPeople()
	 {
		 return new Object[][]{{"Admin","admin123"},{"rama","krishna"}};
	 }

}
