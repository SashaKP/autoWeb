package pagesAT;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import utilitiesAT.DriverSetUp;

public class ATHomePage extends BasePageAT{
	@FindBy (xpath = "//a[@aria-label='Sign In']")
	public WebElement signInButton;
		
	@FindBy   (xpath = "//button[@title ='Browse by Make']") // (xpath = "//button[contains (text(), 'Browse by Make')]")
	public WebElement browseByMake;
	
	@FindBy  (xpath = "//button[@title='Browse by Style']") //(xpath = "//button[contains (text(), 'Browse by Style')]")
	public WebElement browseByStyle;
	
	@FindBy (xpath = "//a[@data-qaid='adv_srch']") // (xpath ="//a[contains(text(),'Advanced Search')]")
	public WebElement advancedSearch;
	
	@FindBy (xpath = "//option[text()='Any Make']")
	public WebElement anyMake;
	
	@FindBy (xpath = "//option[text()='Any Model']")
	public WebElement anyModel;
	
	@FindBy (xpath = "//input[@name='zipcode']")
	public WebElement zipCode;
	
	@FindBy (id="search")
	public WebElement searchButton;
	
	
	
	//PAGE METHODS
	
	//Verifying the make,style and advance search elements visibility.
		public void verification(String expected) {


			if (expected.equals(browseByMake.getText())) {
				String actual = browseByMake.getText();
				System.out.println("1 "+actual);
				Assert.assertEquals(expected, actual);

			} else if (expected.equals(browseByStyle.getText())) {
				String actual = browseByStyle.getText();
				System.out.println("2 "+actual);
				Assert.assertEquals(expected, actual);

			} else {
				String actual = advancedSearch.getText();
				System.out.println("3 "+actual);
				Assert.assertEquals(expected, actual);

			}

		}

		//Verifying the Search Button is enabled.
//		public void verifyButton() {
//
//			Assert.assertTrue(searchButton.isEnabled());
//
//		}

		//Verifying the Make and Model dropdowns are visible.
	public void verifyMakeAndModel(String expected) {
		
		String actual="";
		if(expected.equals(anyModel.getText())) {
			actual=anyModel.getText();
			System.out.println(actual);
			Assert.assertTrue(anyModel.isDisplayed());
			
		}else if(expected.equals(anyMake.getText())) {
			actual=anyMake.getText();
			System.out.println(actual);
			Assert.assertTrue(anyMake.isDisplayed());
		}
		Assert.assertEquals(actual,expected);

}
//
//		public void multiplechoice(String model){
//
//			makeElement.sendKeys(model);
//		}
		public void ZipCodeField() {
			zipCode.clear();
			Assert.assertTrue(zipCode.isEnabled());
		}
}
