package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class Payment extends Driver {
	private Logger logger;

	@FindBy(xpath = "//a[@title= 'Pay by bank wire']")
	WebElement btnpay;

	// constructor of the class
	public Payment() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void selectpaymentType() {
		CommonFunctionsLib.clickButton(btnpay);
	}

}
