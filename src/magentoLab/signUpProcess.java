package magentoLab;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signUpProcess {
	WebDriver driver = new ChromeDriver();

	Random rand = new Random();

	String URL = "https://magento.softwaretestingboard.com/customer/account/create/";
	String FirstName = "abedalraheem";
	String lastName = "alsaqqa";
	String Email = "asaqa";
	String Domain = "@gmail.com";
	String Password = "ASDasd123!@#";

	@BeforeTest
	public void mySetup() {
		driver.get(URL);

	}

	@Test//(invocationCount = 10)
	public void myTest() {

		int myNewIDForTheEmail = rand.nextInt(10000);
		// define all the webelement that will be used
		WebElement FirstNameInputField = driver.findElement(By.id("firstname"));
		WebElement LastNameInputField = driver.findElement(By.id("lastname"));
		WebElement EmailInputField = driver.findElement(By.id("email_address"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement PasswordConfirmationField = driver.findElement(By.id("password-confirmation"));

		// interact with webelements
		FirstNameInputField.sendKeys(FirstName);
		LastNameInputField.sendKeys(lastName);
		EmailInputField.sendKeys(Email + myNewIDForTheEmail + Domain);
		PasswordInputField.sendKeys(Password);
		PasswordConfirmationField.sendKeys(Password);

	}

	@AfterTest
	public void myAfter() {
	}

}


//package magentoLab;
//
//	import org.testng.annotations.BeforeTest;
//	import org.testng.annotations.Test;
//
//	import com.github.dockerjava.api.model.Driver;
//
//	import org.testng.annotations.AfterTest;
//
//	import java.util.List;
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.firefox.FirefoxDriver;
//	import org.openqa.selenium.edge.EdgeDriver;
//	import org.testng.annotations.BeforeTest;
//
//	public class signUpProcess {
//		WebDriver drive = new ChromeDriver();
//	
//		
//	@BeforeTest 
//		
//		public void myBeforTest () {
//		drive.get("https://magento.softwaretestingboard.com/");
//		drive.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
//		
//		drive.findElement(By.id("firstname")).sendKeys("Marwa");
//		drive.findElement(By.id("lastname")).sendKeys("Alomari");
//		drive.findElement(By.id("email_address")).sendKeys("marwa.alomari2002@gmail.com");
//		drive.findElement(By.id("password")).sendKeys("Marw@123456");
//		drive.findElement(By.id("password-confirmation")).sendKeys("Marw@123456");
//		drive.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//
//		
//
//		}
//		 
//
//		
//		@Test ()
//		public void myTestOne () {}
//		
//		@AfterTest
//		
//		public void myAfterTest () {}
//	}
//
//
