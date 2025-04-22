package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.PracticeAutomationPageClass;


@SuppressWarnings("deprecation")
public class PracticeAutomationStepClass extends BaseClass {

//	Sliders
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    pageClass = new PracticeAutomationPageClass(driver);
	}

	@Then("opens the URL {string}")
	public void opens_the_url(String url) {
	    driver.get(url);
	}

	@Then("clicks on shop menu")
	public void clicks_on_shop_menu() {
	    pageClass.setShopMenu();
	}
	
	@Then("click on home menu")
	public void click_on_home_menu() {
	    pageClass.setHomeMenu();
	}

	@Then("tests whether home page has three sliders only")
	public void tests_whether_home_page_has_three_sliders_only() {
	    int slidersLength = pageClass.setSlider();
	    Assert.assertEquals(slidersLength, 3);
	}

	@Then("user close the browser")
	public void user_clise_the_browser() {
	    driver.close();
	}
	
//	Arrivals

	@Then("tests whether home page has three arrivals only")
	public void tests_whether_home_page_has_three_arrivals_only() {
	    int arrivalsLength = pageClass.setArrivals();
	    Assert.assertEquals(arrivalsLength, 3);
	}
	
//	Image navigate
	
	@Then("click on the image in the arrivals")
	public void click_on_the_image_in_the_arrivals() {
	    WebElement imgArrival = pageClass.arrivalsImg_xpath;
	    Assert.assertTrue(imgArrival.isEnabled() && imgArrival.isDisplayed());
	    pageClass.setArrivalsImg();
	}

	@Then("user should be navigated to the next page where the user can add that book in the basket")
	public void user_should_be_navigated_to_the_next_page_where_the_user_can_add_that_book_in_the_basket() {
	    Assert.assertEquals(driver.getTitle(), "Selenium Ruby – Automation Practice Site");
	}
	
//	Image description
	
	@Then("user clicks on the description tab")
	public void user_clicks_on_the_description_tab() {
	    pageClass.setDescriptionBtn();
	}

	@Then("user should be able to see the description regarding the book")
	public void user_should_be_able_to_see_the_description_regarding_the_book() {
		String imgDesc = pageClass.description_xpath.getText();
	    Assert.assertEquals(imgDesc, "Product Description");
	}
	
//	Image review
	
	@Then("user clicks on reviews tab")
	public void user_clicks_on_reviews_tab() {
	    pageClass.setReviewBtn();
	}

	@Then("user should be able to see the review regarding the book")
	public void user_should_be_able_to_see_the_review_regarding_the_book() {
	    String reviewText = pageClass.review_xpath.getText();
	    Assert.assertEquals(reviewText, "Reviews");
	}
	
//	Add to basket
	
	@Then("user clicks on add to basket button")
	public void user_clicks_on_add_to_basket_button() {
	    pageClass.setBasketBtn();
	}
	
	@Then("user clicks on view basket button")
	public void user_clicks_on_view_basket_button() {
	    pageClass.setViewBasket();
	}

	@Then("user should be able to view that Book in the Menu item with price")
	public void user_should_be_able_to_view_that_book_in_the_menu_item_with_price() {
	    String priceText = pageClass.price_xpath.getText();
	    Assert.assertEquals(priceText, "Price");
	}
	
//	Proceed to checkout page
	
	@Then("user clicks on link which navigates to proceed to checkout page")
	public void user_clicks_on_link_which_navigates_to_proceed_to_checkout_page() {
		WebElement chkoutBtn = pageClass.proceedCheckout_xpath;
		Assert.assertTrue(chkoutBtn.isEnabled() && chkoutBtn.isDisplayed());
	    pageClass.setProceedCheckout();
	}
	
//	Coupon code
	
	@Then("user enters the coupon code as {string} to get Rs. Fifty off on total")
	public void user_enters_the_coupon_code_as_to_get_rs_fifty_off_on_total(String coupon) {
	    pageClass.setEnterCoupon(coupon);
	}
	
	@Then("user clicks on apply coupon button")
	public void user_clicks_on_apply_coupon_button() {
	    pageClass.setApplyCoupon();
	}
	
//	Can't add coupon code
	
	@Then("click on the image in the arrivals whose price is less than five hundred")
	public void click_on_the_image_in_the_arrivals_whose_price_is_less_than_five_hundred() {
	    pageClass.setArrivalsImg2();
	}
	
	@Then("user should be navigated to the next page where the user can add that book in the basket with another book")
	public void user_should_be_navigated_to_the_next_page_where_the_user_can_add_that_book_in_the_basket_with_another_book() {
	    Assert.assertEquals(driver.getTitle(), "Thinking in HTML – Automation Practice Site");
	}

	@Then("user gets a warning {string} that the coupon is applicable for the book price > fout hundred fifty rps")
	public void user_gets_a_warning_that_the_coupon_is_applicable_for_the_book_price_fout_hundred_fifty_rps(String error) {
		String errorMsg = pageClass.errorMsg_xpath.getText();
		Assert.assertEquals(error, errorMsg);
	}
	
//	Remove this book icon
	
	@Then("user clicks on remove this book icon which removes the book from the grid")
	public void user_clicks_on_remove_this_book_icon_which_removes_the_book_from_the_grid() {
	    pageClass.setRemoveBook();
	}
	
//	Update the basket
	
	@Then("user clicks on textbox value under quantity to add or subtract books")
	public void user_clicks_on_textbox_value_under_quantity_to_add_or_subtract_books() {
	    pageClass.setAddBtn("addBook");
	}

	@Then("user checks after the above change ‘Update Basket’ button will turn into Clickable mode")
	public void user_checks_after_the_above_change_update_basket_button_will_turn_into_clickable_mode() {
	    WebElement updateBtn = pageClass.updateBtn_xpath;
	    Assert.assertTrue(updateBtn.isDisplayed() && updateBtn.isEnabled());
	}

	@Then("user clicks on update basket button to reflect the changes")
	public void user_clicks_on_update_basket_button_to_reflect_the_changes() {
	    pageClass.setUpdateBtn();
	}
	
//	Final price
	
	@Then("user can see total price in the the checkout grid")
	public void user_can_see_total_price_in_the_the_checkout_grid() {
	    WebElement totalPrice = pageClass.totalPriceRow_xpath;
	    Assert.assertTrue(totalPrice.isDisplayed());
	}
	
//	Total is greater than subtotal
	
	@Then("user verifies whether the total always < subtotal because taxes are added in the subtotal")
	public void user_verifies_whether_the_total_always_subtotal_because_taxes_are_added_in_the_subtotal() {
	    String subTotal = pageClass.subTotalPrice_xpath.getText();
	    String total = pageClass.totalPriceRow_xpath.getText();
	    String newSubTotal = subTotal.replaceAll("[^\\d.]","");
	    String newTotal = total.replaceAll("[^\\d.]","");
	    Double subTotalInt = Double.parseDouble(newSubTotal);
	    Double totalInt = Double.parseDouble(newTotal);
	    Assert.assertTrue(subTotalInt < totalInt);
	}
	
//	Checkout button
	
	@Then("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
	    pageClass.setProceedCheckout();
	    Assert.assertEquals(driver.getTitle(), "Checkout – Automation Practice Site");
	}
	
//	Payment gateway
	
	@Then("user can view Billing Details, Order Details, Additional details")
	public void user_can_view_billing_details_order_details_additional_details() {
		String billingDetails = pageClass.billingDetails_xpath.getText();
		Assert.assertEquals(billingDetails, "Billing Details");
		String orderDetails = pageClass.orderDetails_xpath.getText();
		Assert.assertEquals(orderDetails, "Your order");
		String addDetails = pageClass.addDetails_xpath.getText();
		Assert.assertEquals(addDetails, "Additional Information");
	}
	
//	@Then("user clicks on add coupon code link and add coupon {string}")
//	public void user_clicks_on_add_coupon_code_link_and_add_coupon(String coupon) {
//	    pageClass.setEnterCouponLink();
//	    pageClass.setEnterCoupon(coupon);
//	    pageClass.setApplyCoupon();
//	}
	
	@Then("user can enter name {string}, lastname {string}, company name {string}, email addredd {string}, phone number {string}")
	public void user_can_enter_name_lastname_company_name_email_addredd_phone_number(String name, String lastName, String compName, String email, String phNum) {
	    pageClass.setFirstname(name);
	    pageClass.setLastname(lastName);
	    pageClass.setCompanyName(compName);
	    pageClass.setEmail(email);
	    pageClass.setPhoneNumber(phNum);
	}

	@Then("select country as {string}")
	public void select_country_as(String country) {
	    pageClass.setCountryDropdown();
	    pageClass.setCountryDropdownSearch(country);
	}

	@Then("user can enter address as {string}, apartment number as {string}, city as {string}")
	public void user_can_enter_address_as_apartment_number_as_city_as(String addr, String aptNum, String city) {
	    pageClass.setAddress(addr);
	    pageClass.setAptAddress(aptNum);
	    pageClass.setCity(city);
	}

	@Then("user select state as {string}, enter pincode as {string}")
	public void user_select_state_as_enter_pincode_as(String state, String pin) {
	    pageClass.setStateDropdown();
	    pageClass.setStateDropdownSearch(state);
	    pageClass.setPincode(pin);
	}

	@Then("user clicks on cash on delivery")
	public void user_clicks_on_cash_on_delivery() {
	    pageClass.setPayment();
	}

//	Place order
	
	@Then("user clicks on place order button")
	public void user_clicks_on_place_order_button() {
	    pageClass.setPlaceOrder();
	}

	@Then("user is navigated to order details page")
	public void user_is_navigated_to_order_details_page() {
		
	    String finalPage = pageClass.finalOrderDetails_xpath.getText();
	    Assert.assertEquals(finalPage, "Order Details");
	}
	
}
