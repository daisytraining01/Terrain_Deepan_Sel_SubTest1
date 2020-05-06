package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pathStoreClass {
	// private WebDriverWait wait;
	public pathStoreClass() {

	}

	public void settxt_Fname(String strFname, WebElement txt_Fname) throws InterruptedException {
		//
		txt_Fname.sendKeys(strFname);
		// Thread.sleep(100);
		

		System.out.println(strFname);

	}

	public void setLname(String strLname, WebElement txt_Lname) throws InterruptedException {

		txt_Lname.sendKeys(strLname);
		// Thread.sleep(3000);
		System.out.println(strLname);

	}

	public void setPhone(String strPhone, WebElement txt_Phone) throws InterruptedException {

		txt_Phone.sendKeys(strPhone);
		// Thread.sleep(5000);

		// System.out.println(txt_Phone.getText());
		System.out.println(strPhone);
	}

	public void setEmail(String strEmail, WebElement txt_Email) throws InterruptedException {

		txt_Email.sendKeys(strEmail);
		// Thread.sleep(1000);
		System.out.println(strEmail);

	}

	public void setAddress(String strAddress, WebElement txt_Address) throws InterruptedException {

		txt_Address.sendKeys(strAddress);
		// Thread.sleep(100);
		System.out.println(strAddress);

	}

	public void setCity(String strCity, WebElement txt_City) throws InterruptedException {

		txt_City.sendKeys(strCity);
		// Thread.sleep(1000);
		System.out.println(strCity);

	}

	public void setState(String strState, WebElement txt_State) throws InterruptedException {

		txt_State.sendKeys(strState);
		// Thread.sleep(100);
		System.out.println(strState);

	}

	public void setPostalCode(String strPostalCode, WebElement txt_postal_code) throws InterruptedException {

		txt_postal_code.sendKeys(strPostalCode);
		// Thread.sleep(100);
		System.out.println(strPostalCode);

	}

	public void setCountry(String strCountry, WebElement txt_country) {

		// txt_country.sendKeys(strCountry);
		Select s1 = new Select(txt_country);
		s1.selectByVisibleText(strCountry);
		System.out.println(strCountry);

	}

	public void clickRegister(WebElement btn) {

		btn.click();

	}

}