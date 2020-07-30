package stepsAT;

import java.util.List;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pagesAT.ATAdvancedSearchPage;
import pagesAT.ATHomePage;
import pagesAT.BasePageAT;
import utilitiesAT.MyDriverMultiThreader;

public class ATHomePageSteps extends BasePageAT {
	// obj of the page
	ATHomePage homePage = new ATHomePage();
	ATAdvancedSearchPage advancedSearchPg = new ATAdvancedSearchPage();

	@Given("User opens Autotraders Website and verifies Title")
	public void user_opens_Autotraders_Website_and_verifies_Title() {

		String expectedTitle = "Used and New Car Sales, Review - Autotrader";

		String title = MyDriverMultiThreader.get().getTitle();
		System.out.println(title);

		Assert.assertEquals(expectedTitle, title);
	}
	/*
	 * Verifying Make, Style, Search links
	 */
	@Then("User verifies link {string} is present")
	public void user_verifies_link_is_present(String string) {
		// method inside pages
		homePage.verification(string);
	}
	/*
	 * verifying MAKE and MODEL dropDowns
	 */
	@Then("User verifies dropDown {string} is present")
	public void user_verifies_dropDown_is_present(String string) {

		homePage.verifyMakeAndModel(string);
	}
	//verifying Zip Field
	@Then("User verifies {string} window is present")
	public void user_verifies_window_is_present(String string) {
	
		// clears the field and checks if Enabled
		homePage.ZipCodeField();

	}
	@Then("User verifies Search button is present")
	public void user_verifies_Search_button_is_present() {

		homePage.verifySearchButton();
	}
	@Given("User clicks on Advanced Search Link on the Home Page")
	public void user_clicks_on_Advanced_Search_Link_on_the_Home_Page() throws InterruptedException {
				
		advancedSearchPg.advancedSearchClick(advancedSearchPg.advancedSearch);
	
	}
	@Then("User enters {string} into ZipCode box")
	public void user_enters_into_ZipCode_box(String string) {
		//obj of advancedSearchPage
		advancedSearchPg.enterZipcode(string);
		
	}
//select ceritified and covertible
	@Then("User selects {string} Check box under {string} section")
	public void user_selects_Check_box_under_section(String string, String string2) {
		advancedSearchPg.selectCheckbox(string);
	}
//price
	@Then("User selects {string} in Minimum dDown and {string} Maximum dDown")
	public void user_selects_in_Minimum_dDown_and_Maximum_dDown(String string, String string2) {
		
		advancedSearchPg.selectPrice(string, string2);
	}
//year
	@Then("User updates {string} in From dDown and {string} in To dDown")
	public void user_updates_in_From_dDown_and_in_To_dDown(String string, String string2) {
		
		advancedSearchPg.selectYear(string, string2);
	}
//make
	@Then("User selects {string} in Any Make dDown under Make, Model&Trim section")
	public void user_selects_in_Any_Make_dDown_under_Make_Model_Trim_section(String string) {
		Select select = new Select(advancedSearchPg.make);
		select.selectByVisibleText(string);
	}
//milage
	@Then("User selects {string} in the Mileage section")
	public void user_selects_in_the_Mileage_section(String string) {
		Select select = new Select(advancedSearchPg.milage);
		select.selectByVisibleText(string);
	}
//color
	@Then("User clicks on {string} link and checks {string} Check box under Specifications section")
	public void user_clicks_on_link_and_checks_Check_box_under_Specifications_section(String string, String string2) throws InterruptedException {
		advancedSearchPg.selectExteriorColor(string2);
	}
//search click
	@Then("User clicks Search button")
	public void user_clicks_Search_button() throws InterruptedException {
		
//		System.out.println("about to click");
//		waitForClickability(advancedSearchPg.bttnSearch);
//		JavascriptExecutor js = (JavascriptExecutor) MyDriverMultiThreader.get();
//		js.executeScript("arguments[0].click();", advancedSearchPg.bttnSearch);
//		advancedSearchPg.bttnSearch.click();
		
		 
		//scrollDown(advancedSearchPg.bttnSearch);
		//getWaitObject().until(ExpectedConditions.elementToBeClickable(link)).click();
		boolean enabled =advancedSearchPg.bttnSearch.isEnabled();
		System.out.println(enabled);
		System.out.println(advancedSearchPg.bttnSearch.getText());
		Thread.sleep(2000);
		advancedSearchPg.bttnSearch.click();
	}

	@Then("User verifies he is in the result page")
	public void user_verifies_he_is_in_the_result_page() {

	}

	@Then("User verifies he sees only {string} make cars")
	public void user_verifies_he_sees_only_make_cars(String string) {

	}

	@Then("User verifies the number of listings")
	public void user_verifies_the_number_of_listings() {

	}

	@Given("User chooses make as {string}")
	public void user_chooses_make_as(String string) {

	}
}
