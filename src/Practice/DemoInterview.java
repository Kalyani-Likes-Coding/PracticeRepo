package Practice;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoInterview {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		System.out.println("Launched the browser");

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBox.sendKeys("Ahmedabad");
//		searchBox.sendKeys(Keys.ARROW_DOWN);
//		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> listValues = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Number of element in the list:" + listValues.size());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the element you want to select: ");
		int index = sc.nextInt();

		listValues.get(index).click();

//		for (WebElement webElement : listValues) {
//
////			System.out.println(webElement.getText());
////			System.out.println(" ");
//
//			if (webElement.getText().trim().equals("ahmedabad to mumbai flight")) {
//				webElement.click();
//				break;
//			}

//		}
//
//		Thread.sleep(5000);
//		driver.quit();
		System.out.println("Done");
	}
}
