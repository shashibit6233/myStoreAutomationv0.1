package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Address;
import pages.BackToMyOrder;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderConfirmationPage;
import pages.OrderSummary;
import pages.Payment;
import pages.PersonalInfoPage;
import pages.ProductAdded;
import pages.SelectTshirt;
import pages.Shipping;
import pages.ShoppingCartSumPage;
import pages.ShowTshirt;
import pages.Tshirts;
import utils.CommonFunctionsLib;

public class Steps {

	Address adr = new Address();
	BackToMyOrder myord = new BackToMyOrder();
	OrderSummary ordSum = new OrderSummary();
	HomePage hp = new HomePage();
	LoginPage login = new LoginPage();
	OrderConfirmationPage ordconf = new OrderConfirmationPage();
	Payment pay = new Payment();
	ProductAdded proadd = new ProductAdded();
	SelectTshirt sel = new SelectTshirt();
	Shipping ship = new Shipping();
	ShoppingCartSumPage shopsumpage = new ShoppingCartSumPage();
	ShowTshirt showts = new ShowTshirt();
	Tshirts tshirt = new Tshirts();
	PersonalInfoPage perinfo = new PersonalInfoPage();

	public static String orderdet = null;
	public static String newname = null;

	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() {
		hp.clickSignIn();

	}

	@When("^User submits username and password$")
	public void user_submits_username_and_password() {
		login.enterSignInDetails(CommonFunctionsLib.readTestDataProperties("userid"),
				CommonFunctionsLib.readTestDataProperties("password"));
		login.clickSignIn();
	}

	@Then("^User is able to login$")
	public void user_is_able_to_login() {
		tshirt.userLoggedIn();

	}

	@Given("^User search for Tshirt$")
	public void user_search_for_Tshirt() {
		tshirt.clickTshirts();
		showts.clickFadedTshirt();

	}

	@When("^User adds T-Shirts to cart$")
	public void user_adds_T_Shirts_to_cart() {
		sel.addToCart(CommonFunctionsLib.readTestDataProperties("Quantity"),
				CommonFunctionsLib.readTestDataProperties("Size"), CommonFunctionsLib.readTestDataProperties("Color"));
		proadd.productAddedToShoppingKart();
		shopsumpage.proceedToShopCheckOut();
		adr.proceedToAddressCheckOut();
		ship.proceedToShippingCheckOut();

	}

	@When("^place order after making payment$")
	public void place_order_after_making_payment() {
		pay.selectpaymentType();
		ordSum.orderSummary();

	}

	@Then("^user is able to verify order in order history$")
	public void user_is_able_to_verify_order_in_order_history() {
		ordconf.myOrderInfo();
		ordconf.myOrderDetails();
		myord.verifyMyOrder(ordconf.myOrderInfo());

	}

	@Given("^User navigate to personal info$")
	public void user_navigate_to_personal_info() {
		tshirt.userLoggedIn();
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
		perinfo.verifyName(newname);

	}

}
