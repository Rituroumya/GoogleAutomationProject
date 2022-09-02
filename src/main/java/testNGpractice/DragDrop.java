package testNGpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	 @Test(groups={"smoke"}) 
		public void drdp()
		
	 {
			// TODO Auto-generated method stub
			
		 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			Actions a = new Actions(driver);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement trg = driver.findElement(By.xpath("//div[@id='droppable']"));
			a.dragAndDrop(src, trg).build().perform();
			driver.close();


	}

}
