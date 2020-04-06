package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class OrderConfirmationPage extends Driver {
	private Logger logger;

	@FindBy(xpath = "//*[@id='center_column']/div")
	WebElement txtorderinfo;

	@FindBy(xpath = "//a[@title= 'My orders']")
	WebElement lnkmyorder;

	// constructor of the class
	public OrderConfirmationPage() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public String myOrderInfo() {
		String orderdet = txtorderinfo.getAttribute("textContent");
		return orderdet;

	}

	public void myOrderDetails() {
		CommonFunctionsLib.clickButton(lnkmyorder);

	}

}
