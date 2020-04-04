package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class CommonFunctionsLib extends Driver {
	public static String propvalue = null;

	public CommonFunctionsLib() {

	}

	// retrieve value from default properties file
	public static String readDefaultProperties(String key) {

		String defaultproPath = "config\\default.properties";

		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(defaultproPath);
			prop.load(fis);
			propvalue = prop.getProperty(key);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return propvalue;
	}

	// retrieve value from data properties file
	public static String readTestDataProperties(String key) {

		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(readDefaultProperties("testDataPath"));
			prop.load(fis);
			propvalue = prop.getProperty(key);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return propvalue;
	}

	// retrieve extent report configuration path
	public static String getReportConfigPath() throws IOException {
		String reportConfigPath = CommonFunctionsLib.readDefaultProperties("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file");
	}

	// enter text in text box
	public static void enterTextInTextBox(WebElement element, String txt) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		if (element.isEnabled()) {
			element.clear();
			element.click();
			element.sendKeys(txt);
		}
	}

	// select checkbox
	public static void selectCheckBox(WebElement element) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (!element.isSelected()) {
			element.click();
		}
	}

	// click button
	public static void clickButton(WebElement element) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	// select radio button
	public static void selectRadio(WebElement element) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		if (!element.isSelected()) {
			element.click();
		}
	}

	// select dropdown by value
	public static void selectDDByValue(WebElement element, String val) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select select = new Select(element);
		select.selectByValue(val);
	}

	// select drop down by text
	public static void selectDDByText(WebElement element, String txt) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select select = new Select(element);
		select.selectByVisibleText(txt);
	}

	// generate random number
	public static int generateRandomNumber() {
		Random r = new Random();
		int random_no = r.nextInt(100000);
		return random_no;
	}

}


