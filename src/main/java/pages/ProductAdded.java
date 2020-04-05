package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class ProductAdded extends Driver {

	private Logger logger;

	@FindBy(xpath = "//a[@title= 'Proceed to checkout']")
	WebElement btnchkout;

	// constructor of the class
	public ProductAdded() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void productAddedToShoppingKart() {
		CommonFunctionsLib.clickButton(btnchkout);

	}

}
