package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonCartTest extends AmazonShoppingCart{
	@Test(dependsOnMethods= {"shoppingcart"})
	public void carttest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement itemsrch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		itemsrch.sendKeys("Samsung Tab" );
		
		WebElement srch  = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		srch.click();
		Thread.sleep(3000);
		WebElement item = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
		String itemname = item.getText();
			System.out.println(itemname);
			item.click();
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']/../input")).click();
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		
		WebElement cart = driver.findElement(By.xpath("//span[@id='attachSiNoCoverage']/span/input"));
		a.moveToElement(cart).click().build().perform();*/
		WebElement cartitem = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")); //cart webelement
		Actions a =new Actions(driver);
		a.moveToElement(cartitem).click().build().perform();


		WebElement result = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		String actualitem = result.getText();
		System.out.println("Actual cart item:" +actualitem);



		if(actualitem.contains(itemname))
		{
		System.out.println("matched");
		}
		else
		{
		System.out.println("didnt match");
		}


		}

		

		
	}


