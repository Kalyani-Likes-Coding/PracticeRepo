package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestionDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		WebElement searchBar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBar.sendKeys("Ahmedabad");

		List<WebElement> listValues = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
//		int i = 0;
//		for (WebElement webElement : listValues) {
//			System.out.println(i + "=" + webElement.getText());
//			System.out.println("  ");
//			i++;
//		}

		Actions act = new Actions(driver);
		act.sendKeys(searchBar, Keys.ARROW_DOWN).sendKeys(searchBar, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
				.perform();

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the index of the wutosuggestion you want to select:");
//		int index = sc.nextInt();

		// listValues.get(index).click();

	}

}
