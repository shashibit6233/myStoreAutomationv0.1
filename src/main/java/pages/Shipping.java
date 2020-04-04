package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class Shipping extends Driver {
	private Logger logger;

	@FindBy(name = "processCarrier")
	WebElement btnchkout;

	@FindBy(id = "cgv")
	WebElement chkterms;

	// constructor of the class
	public Shipping() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void proceedToShippingCheckOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnchkout);
		CommonFunctionsLib.selectCheckBox(chkterms);
		CommonFunctionsLib.clickButton(btnchkout);

	}

}
