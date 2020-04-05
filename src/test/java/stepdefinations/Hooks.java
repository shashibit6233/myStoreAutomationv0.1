package stepdefinations;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.model.ScreenCapture;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import utils.CommonFunctionsLib;
import utils.Driver;
//import utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static CommonFunctionsLib comfunctions;
	private Logger logger= Logger.getLogger(this.getClass());
	Driver driver = new Driver();

	@Before
	public void initializeDriver() throws IOException { 
		PropertyConfigurator.configure(CommonFunctionsLib.readDefaultProperties("log4jpath"));
		driver.initialiseDriver();
		Driver.loadApplication(CommonFunctionsLib.readDefaultProperties("url"));
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
			if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_")+CommonFunctionsLib.generateTimestamp();
			try {
				File sourcePath = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"+screenshotName +".png");						
				Files.copy(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@After(order = 0)
	public void close() {
		driver.closeDriver();
	}

}
