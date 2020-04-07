package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class OrderSummary extends Driver {
	private Logger logger;

	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	WebElement btnconford;

	// constructor of the class
	public OrderSummary() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void orderSummary() {
		CommonFunctionsLib.clickButton(btnconford);

	}

}
