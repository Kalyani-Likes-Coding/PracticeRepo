package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");

		WebElement newAccBtn = driver
				.findElement(By.xpath("//a[@href='#' and @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		newAccBtn.click();

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

//		Select select = new Select(day);
//		select.selectByVisibleText("8");
//
//		Thread.sleep(5000);
//
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Aug");
//
//		Thread.sleep(5000);
//
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("2000");

//		selectValueFromDropDown(day, "12");
//		selectValueFromDropDown(month, "Oct");
//		selectValueFromDropDown(year, "2000");
//		
		String dob = "10-May-1990";
		String dobArray[] = dob.split("-");
		selectValueFromDropDown(day, dobArray[0]);
		selectValueFromDropDown(month, dobArray[1]);
		selectValueFromDropDown(year, dobArray[2]);

	}

	public static void selectValueFromDropDown(WebElement webElement, String value) {
		Select select = new Select(webElement);
		select.selectByVisibleText(value);
	}

}
