package testngtest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHrmExcelTest {
	@Test(dataProvider="logininfo")
	public void ihgLogin(String username,String password) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys(username);
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@DataProvider(name="logininfo")
	public static Object[][] getSheet() {

	Object[][] data = null ;

	try {
	XSSFWorkbook workbook = new XSSFWorkbook(".//EXCEL//RituTest.xlsx");
	XSSFSheet sheet = workbook.getSheetAt(0);

	// get the number of rows
	int rowCount = sheet.getLastRowNum();
	// get the number of columns
	int columnCount = sheet.getRow(0).getLastCellNum();

	data = new String[rowCount][columnCount];

	// loop through the rows
	for(int i=1; i <rowCount+1; i++){
	try {
	XSSFRow row = sheet.getRow(i);
	for(int j=0; j <columnCount; j++){ // loop through the columns
	try {
	String cellValue = "";
	try{
	cellValue = row.getCell(j).getStringCellValue();
	}catch(NullPointerException e){

	}
	data[i-1][j] = cellValue; // add to the data array
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	workbook.close();
	} catch (Exception e) {
	e.printStackTrace();
	}

	return data;
	}
	}


