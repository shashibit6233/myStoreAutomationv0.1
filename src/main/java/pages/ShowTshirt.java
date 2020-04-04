package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ShowTshirt extends Driver {
	private Logger logger;

	@FindBy(xpath = "//a[@title= 'Faded Short Sleeve T-shirts']")
	WebElement imgtshirt;

	// constructor of the class
	public ShowTshirt() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void clickFadedTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", imgtshirt);

	}

}
