package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://elementary.io/");
		System.out.println("Chrome lauched successsfully");
		driver.quit();
	}

}
