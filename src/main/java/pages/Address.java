package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class Address extends Driver {
	private Logger logger;

	@FindBy(name = "processAddress")
	WebElement btnchkout;

	// constructor of the class
	public Address() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void proceedToAddressCheckOut() {
		CommonFunctionsLib.scrollDownAndClick(btnchkout);

	}

}
