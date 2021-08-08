package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckMouseHover {

	public class CheckTitle {

		@Test
		public void setUpBrowser() {
			System.out.println("Let us set up a browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebElement elecComponents = driver
					.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/child::li[3]/child::a"));

			Actions action = new Actions(driver);
			action.moveToElement(elecComponents).perform();
			// driver.quit();

		}

	}

}
