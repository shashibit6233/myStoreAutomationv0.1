package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.CommonFunctionsLib;

public class DriverFactory {

	public static WebDriver driver = null;
	private static Logger logger = Logger.getLogger(DriverFactory.class);

	public static WebDriver getDriver() {

		String browserName = CommonFunctionsLib.readDefaultProperties("browser");
		String chromepath = "drivers\\chromedriver.exe";
		String ffpath = "drivers\\geckodriver.exe";

		logger.info(Class.class.getClass() + "--------------Initialise Driver----------------");

		if (driver == null) {
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", chromepath);
				return new ChromeDriver();
			}

			else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", ffpath);
				return new FirefoxDriver();
			}

		}

		return new FirefoxDriver();

	}

	public static void closeDriver(WebDriver driver) {

		try {
			driver.quit();
			logger.info("---------------Driver Closed--------------");
		} catch (Exception e) {
			logger.info(e.getMessage());
		}

	}

}
