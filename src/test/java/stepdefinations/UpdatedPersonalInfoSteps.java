package stepdefinations;

import org.apache.log4j.Logger;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PersonalInfoPage;
import pages.Tshirts;
import utils.CommonFunctionsLib;

public class UpdatedPersonalInfoSteps {

	public static String newname = null;
	private Logger logger = Logger.getLogger(this.getClass());

	Tshirts tshirt = new Tshirts();
	PersonalInfoPage perinfo = new PersonalInfoPage();

	@Given("^User navigate to personal info$")
	public void user_navigate_to_personal_info() {
		String custname = tshirt.getCustomerName();
		Assert.assertNotNull(custname);
		logger.info("--------------User logged in successfully--------------");
		tshirt.clickPersonalInformation();

	}

	@When("^User changes first name as \"([^\"]*)\"$")
	public void user_changes_first_name_as(String fname) {
		newname = perinfo.editFirstName(fname);
		perinfo.enterCurrentPassword(CommonFunctionsLib.readTestDataProperties("password"));
		perinfo.clickSaveButton();

	}

	@Then("^User should be able to validate updated information$")
	public void user_should_be_able_to_validate_updated_information() {
		String getname = perinfo.verifyName();
		Assert.assertTrue("Updated information is verified", getname.equalsIgnoreCase(newname));
		logger.info("Updated information is verified");

	}

}
