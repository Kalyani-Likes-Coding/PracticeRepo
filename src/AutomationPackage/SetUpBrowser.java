package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SetUpBrowser {
//	public void setUpChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	}
//	
	@Test
	public void setUpBrowser() {
		System.out.println("Let us set up abrowser");
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailSearchBox = driver.findElement(By.id("identifierId"));
		emailSearchBox.sendKeys("kchdhr12@gmail.com");
		//emailSearchBox.sendKeys(Keys.RETURN); //helps you to click enter
		WebElement nextButton = driver.findElement(By.className("VfPpkd-dgl2Hf-ppHlrf-sM5MNb"));
		nextButton.click();
		}
	}
