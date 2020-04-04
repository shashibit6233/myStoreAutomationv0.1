package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctionsLib;
import utils.Driver;

public class Tshirts extends Driver {

	private Logger logger;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]")
	WebElement tshirts;

	@FindBy(xpath = "//a[@title= 'View my customer account']")
	WebElement username;

	@FindBy(xpath = "//div[@id='center_column']/div/div[1]/ul/li[4]/a")
	WebElement pinfo;

	// constructor of the class
	public Tshirts() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	public void userLoggedIn() {
		String custname = username.getText();
		if (custname != null) {
			logger.info(Driver.class.getName() + "User Successfully Logged In myStore ");
		} else {
			logger.info("User not Successfully Logged in...Please try again.");
		}
	}

	public void clickTshirts() {
		CommonFunctionsLib.clickButton(tshirts);

	}

	public void clickPersonalInformation() {
		CommonFunctionsLib.clickButton(pinfo);
	}

}
