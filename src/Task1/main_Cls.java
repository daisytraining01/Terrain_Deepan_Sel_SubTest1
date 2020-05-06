package Task1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.pathStoreClass;

public class main_Cls {

	public static void main(String a[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement txt_Fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		WebElement txt_Lname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName")));
		WebElement txt_Phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phone")));
		WebElement txt_Email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		WebElement txt_Address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("address1")));
		WebElement txt_City = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("city")));
		WebElement txt_State = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("state")));
		WebElement txt_postal_code = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("postalCode")));
		WebElement txt_country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("country")));
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));

		pathStoreClass obj = new pathStoreClass();

		obj.settxt_Fname("Test", txt_Fname);
		obj.setLname("Ltest", txt_Lname);
		obj.setPhone("9991119991", txt_Phone);
		obj.setEmail("Test@)g", txt_Email);
		obj.setAddress("ADD@123", txt_Address);
		obj.setCity("TestCity", txt_City);
		obj.setState("TestState", txt_State);
		obj.setPostalCode("PC001", txt_postal_code);
		obj.setCountry("AUSTRALIA", txt_country);
		//Thread.sleep(100);
		takeSnapShot(driver, "resources//test.png");
		
		Thread.sleep(1000);
		 obj.clickRegister(btn);
		 Thread.sleep(100);
		 takeSnapShot(driver, "c://test1.png"); 
         Thread.sleep(100);
         driver.quit();
	}

	// Scroll down the webpage by 5000 pixels
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("scrollBy(0, 5000)");

	// Click on the Search button
	// driver.findElement(By.linkText("Core Java")).click();
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);



}