package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlePart3 {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com");

		WebElement searchButton = driver.findElement(
				By.xpath("//a[@role='button' and" + " @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy'] "));
		searchButton.click();

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(month);

		String month_xpath = "//select[@id='month']/option";
		String day_xpath = "//select[@id='day']/option";
		String year_xpath = "//select[@id='year']/option";

		selectDropDownValue(month_xpath, "Dec");
		selectDropDownValue(day_xpath, "18");
		selectDropDownValue(year_xpath, "1999");

		// driver.quit();

	}

	public static void selectDropDownValue(String xpath, String value) {

		List<WebElement> monthList = driver.findElements(By.xpath(xpath));
		System.out.println(monthList.size());

		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());

			if (monthList.get(i).getText().equals(value)) {
				monthList.get(i).click();
				break;
			}
		}

	}

}
