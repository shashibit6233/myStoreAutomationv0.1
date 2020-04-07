package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctionsLib;
import utils.Driver;

public class Shipping extends Driver {
	private Logger logger;

	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement btnchkout;

	@FindBy(id = "uniform-cgv")
	WebElement chkterms;

	// constructor of the class
	public Shipping() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void proceedToShippingCheckOut() {
		CommonFunctionsLib.selectCheckBox(chkterms);
		CommonFunctionsLib.clickButton(btnchkout);

	}

}
