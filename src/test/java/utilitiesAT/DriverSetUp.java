package utilitiesAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilitiesAT.ConfigurationReaderAT;

///////JUST MY THING DON"T PAY ATTENTION////////////////////////////////////////
public class DriverSetUp {
	public static WebDriver driver;

	public static void setUp() {
		
		//ConfigurationReaderAT.readProperties (System.getProperty("user.dir")
		//		+ "/src/test/resources/docs/configurationAT.properties");
		
		switch (ConfigurationReaderAT.getProperty("browser").toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ConfigurationReaderAT.getProperty("url"));
		
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
