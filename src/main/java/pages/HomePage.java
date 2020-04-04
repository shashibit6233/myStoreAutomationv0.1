package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import utils.CommonFunctionsLib;
import utils.Driver;

public class HomePage extends Driver {
	private Logger logger;

	@FindBy(xpath = "//a[@title= 'Log in to your customer account']")
	WebElement btnsignin;

	// constructor of the class
	public HomePage() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void clickSignIn() {
		CommonFunctionsLib.clickButton(btnsignin);

	}

}
