package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import utils.CommonFunctionsLib;
import utils.Driver;

public class LoginPage extends Driver {

	private Logger logger;

	@FindBy(id = "email")
	WebElement txtuserid;

	@FindBy(id = "passwd")
	WebElement txtpwd;

	@FindBy(id = "SubmitLogin")
	WebElement btnsignin;

	// constructor of the class
	public LoginPage() {
		logger = Logger.getLogger(this.getClass());
		PageFactory.initElements(driver, this);
	}

	// enter user sign in credentials
	public void enterSignInDetails(String userid, String password) {
		CommonFunctionsLib.enterTextInTextBox(txtuserid, userid);
		CommonFunctionsLib.enterTextInTextBox(txtpwd, password);

	}

	public void clickSignIn() {
		CommonFunctionsLib.clickButton(btnsignin);

	}

}
