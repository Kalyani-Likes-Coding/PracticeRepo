package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlePart2 {

	public static void main(String[] args) {

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

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
		select.selectByIndex(11);

		boolean val = select.isMultiple();
		if (val == true)
			System.out.println("It is multiselect");
		else
			System.out.println("it is not multi select");

		List<WebElement> listDays = select.getOptions();
		System.out.println(listDays.size());
		int totalDays = (listDays.size() - 1);
		System.out.println("Total days are :" + totalDays);

		for (int i = 0; i < listDays.size(); i++) {
			String dayValue = listDays.get(i).getText();
			if (dayValue.equals("15")) {
				listDays.get(i).click();
				break;
			}

			System.out.println();
		}

		driver.quit();

	}

}
