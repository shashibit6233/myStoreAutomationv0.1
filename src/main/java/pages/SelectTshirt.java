package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class SelectTshirt extends Driver {
	private Logger logger;

	@FindBy(id = "quantity_wanted")
	WebElement txtQuantity;

	@FindBy(id = "group_1")
	WebElement ddSize;

	@FindBy(id = "color_13")
	WebElement imgorangecolor;

	@FindBy(id = "color_14")
	WebElement imgbluecolor;

	@FindBy(id = "add_to_cart")
	WebElement btnAddToCart;

	// constructor of the class
	public SelectTshirt() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	// add to cart
	public void addToCart(String quantity, String size, String color) {
		CommonFunctionsLib.enterTextInTextBox(txtQuantity, quantity);
		CommonFunctionsLib.selectDDByValue(ddSize, size);
		if (color.equals("Blue")) {
			CommonFunctionsLib.clickButton(imgbluecolor);
			logger.info("Selected T-shirt color is Blue");
		} else {
			CommonFunctionsLib.clickButton(imgorangecolor);
			logger.info("Selected T-shirt color is Orange");
		}
		CommonFunctionsLib.clickButton(btnAddToCart);

	}

}
