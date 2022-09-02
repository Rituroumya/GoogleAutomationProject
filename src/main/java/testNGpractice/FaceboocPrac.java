package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceboocPrac {
	@Test(groups={"regression","smoke"}) 
	public void facebook() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement name = driver.findElement(By.xpath("//input[@name='lastname']/preceding::input[1]"));
		name.sendKeys("Ritu");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='firstname']/following::input[1]"));
		lastname.sendKeys("Das");
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("ritu123");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@name='firstname']/following::input[2]"));
        mobile.sendKeys("248 252 8315");
        WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
        sex.click();
        WebElement year = driver.findElement(By.xpath("//select[@id='day']/following::option[25]"));
        year.click();
        WebElement button = driver.findElement(By.xpath("//button[@name='websubmit']"));
   
        button.click();
		// TODO Auto-generated method stub
        driver.close();
	}

}
