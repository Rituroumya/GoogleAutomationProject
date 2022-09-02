package testngtest;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtendReportsTesting {
	public static int i;
	public static ChromeDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	@BeforeSuite
	public void begin() {
		report = new ExtentReports(".//report//OrangeHRMReport.html", true);
		report.addSystemInfo("environment", "QA");
		report.addSystemInfo("userstory1","sprint1" );
		report.addSystemInfo("Author", "Ritu");	
		test= report.startTest("User is able to login on Orange HRM webpage");
		
	}
	@Test
	public void orangeloginhrm() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "Opened Website"+test.addScreenCapture(snap()));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");
		test.log(LogStatus.PASS, "Entered Username"+test.addScreenCapture(snap()));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		test.log(LogStatus.PASS, "Entered password"+test.addScreenCapture(snap()));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		test.log(LogStatus.PASS, "User is able to see home page"+test.addScreenCapture(snap()));
		}
		
	
	
	@AfterSuite
	public void finish() {
		report.endTest(test);
		report.flush();
	}
		
	public String snap() throws IOException {
		Random r = new Random();
	String dummy="";
		if (r.nextInt()!=0)
		{
			i=i+1;
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File(".//pics//img"+i+".png");
		FileUtils.copyFile(src, dest);
		dummy=dest.getAbsolutePath();
					
		}
		return dummy;
	}
	}
	
	


