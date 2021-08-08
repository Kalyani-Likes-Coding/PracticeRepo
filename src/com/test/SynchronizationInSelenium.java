package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// dynamic waits: if page is loaded after 2 seconds, it will ignore the other 18
		// seconds.
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// implicitly wait is always applied globally.
		// it is available for all the webelements present on the web page
		// throughout the driver instance
		// it will wait for the element to load for 20 seconds.
		// if the element is loaded within 2 seconds, it will ignore the other 18
		// seconds
		//It can be changed anywhere and at any time in your code
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement createNewAccBtn = driver.findElement(
				By.xpath("//a[@role='button' and @class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createNewAccBtn.click();

		WebElement firstName = driver
				.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @placeholder='First name']"));
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobileNum = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));

		sendKeys(driver, firstName, 10, "Kalyani");
		sendKeys(driver, surname, 10, "Chaudhary");
		sendKeys(driver, mobileNum, 5, "9665076619");
		sendKeys(driver, password, 10, "Winwin@123");

		//Implicitly wait can be overridden 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
	}

	//1.Explicit wait : noexplicit keyword or method 
	//2. Available with WebDriverWait
	//3. Specific to element
	//4. Dynamic in nature 
	//5. We should never use implicitlu wait and explicitly wait together
	//because selenium webdriver will wait first for the implicitly wait and then explicitly wait will be applied
	//hence totl synchroniztion wait will be increased for each element
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
		
		public static void clickOn(WebDriver driver,WebElement element, int timeout)
		{
			new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		}
	}

}
