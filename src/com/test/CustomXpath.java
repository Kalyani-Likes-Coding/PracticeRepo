package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");

//		WebElement searchBar = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
//		searchBar.sendKeys("Java");

//		WebElement searchBar = driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]"));
//		searchBar.sendKeys("Java Books");

		WebElement searchBar = driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb')]"));
		searchBar.sendKeys("Java Books");
//
//		WebElement searchButton = driver
//				.findElement(By.xpath("//input[@type='submit' and @class='btn btn-prim gh-spr']"));
//		searchButton.click();

		WebElement myEbayDropDwn = driver.findElement(By.xpath("//a[text()='My eBay']"));
		myEbayDropDwn.click();

	}

}
