package Task5;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Task5.listAllLinlk;

public class main {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		// Maximize the browser
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//WebDriverWait wait = new WebDriverWait(driver, 30);

		// obj.clickRegister(btn);
		listAllLinlk obj=new listAllLinlk();
		obj.main(driver);
		

	}

	// Scroll down the webpage by 5000 pixels
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("scrollBy(0, 5000)");

	// Click on the Search button
	// driver.findElement(By.linkText("Core Java")).click();


}