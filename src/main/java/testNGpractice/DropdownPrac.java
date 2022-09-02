package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownPrac {
	@Test(groups={"regression","sanity"}) 
	public void facebook() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
    WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
    Select s= new Select(country);
    //s.selectByIndex(3);
    s.selectByValue("BE");
    driver.close();
	}

}
