package stepsAT;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pagesAT.BasePageAT;
import utilitiesAT.ConfigurationReaderAT;
//import utilitiesAT.DriverSetUp;

import utilitiesAT.MyDriverMultiThreader;

public class HooksAT extends BasePageAT {
	@Before

	public void setup() {

		System.out.println("#### setup! start d######\n");

		MyDriverMultiThreader.get().manage().window().maximize();
		clearCookies();
		MyDriverMultiThreader.get().get(ConfigurationReaderAT.getProperty("url"));
		
		//DriverSetUp.setUp();
	}

	@After
	public void teardown(Scenario scenario) {
		//if test failed - do this
		if (scenario.isFailed()) {
			System.out.println("Test failed! Check your ScreenShot");
			byte[] screenshot = ((TakesScreenshot) MyDriverMultiThreader.get()).getScreenshotAs(OutputType.BYTES);
			//byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} else {
			System.out.println("Cleanup!");
			System.out.println("Test completed! Thumbs Up");
		}
		System.out.println("###########-THE END-###################");
		//after every test, we gonna close browser
		MyDriverMultiThreader.close();
		
		//DriverSetUp.tearDown();
	}
}
