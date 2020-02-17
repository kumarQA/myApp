package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static WebDriver driver;

	@Test
	public void launchBrowser() {
		System.out.println(">>> Launching CHROME browser >>>");
		System.setProperty("webdriver.chrome.driver", "//home/sunil/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://elementary.io/");
		System.out.println("Chrome lauched successsfully");
		driver.quit();
	}

}
