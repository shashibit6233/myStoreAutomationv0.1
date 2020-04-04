package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ShoppingCartSumPage extends Driver {
	private Logger logger;

	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a[1]")
	//@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	WebElement btnchkout;

	// constructor of the class
	public ShoppingCartSumPage() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void proceedToShopCheckOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnchkout);
		

	}

}
