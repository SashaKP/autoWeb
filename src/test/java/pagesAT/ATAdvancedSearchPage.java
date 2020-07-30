package pagesAT;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ATAdvancedSearchPage extends BasePageAT {
	// This element is actually located on Homepage
	@FindBy(xpath = "//a[contains(text(),'Advanced Search')]")
	public WebElement advancedSearch;

	
	
	@FindBy(xpath = "//h1[text() = 'Search Cars for Sale']")
	public WebElement headerSearch;

	@FindBy(name = "zip")
	public WebElement zipCode;
	// checkbox Options
	@FindBy(xpath = "//div[@data-qaid='chkGrp-condition'] //div[@class='checkbox-group']")
	public WebElement chkboxOptions;

	@FindBy(xpath = "//div[contains(text(),'Certified')]")
	public WebElement chkboxCertified;

	@FindBy(name = "minPrice")
	public WebElement minPrice;

	@FindBy(name = "maxPrice")
	public WebElement maxPrice;

	@FindBy(xpath = "//div[contains(text(),'Convertible')]")
	public WebElement chkboxConvertible;

	@FindBy(name = "startYear")
	public WebElement yearFrom;

	@FindBy(name = "endYear")
	public WebElement yearTo;

	// Any Make dropDown
	@FindBy(xpath = "//select[starts-with(@name, 'makeFilter')]")
	public WebElement make;
	
	@FindBy (name = "maxMileage")
	public WebElement milage;
	
	@FindBy (xpath = "//strong[contains(text(), 'Exterior Color')]")
	public WebElement exteriorColor;
	
	@FindBy(xpath="//div[@data-qaid='chkGrp-spec-Exterior Color-']//div[contains(text(),'Silver')]")
	public WebElement silverExterior;
	
	@FindBy (xpath="//div[@data-qaid='chkGrp-spec-Exterior Color-']//div[@class='input-label']")//(xpath="//div[@data-qaid='chkGrp-spec-Exterior Color-']//input[@type='checkbox']")
	public List<WebElement> chckBoxOptionsExterior;
	
	@FindBy (xpath = "//button[@class='btn btn-primary btn-block']")
	public WebElement bttnSearch;
	
	@FindBy (xpath ="//div[contains (text(), 'Your Search Results')]")
	public WebElement results;
	
	@FindBy (xpath = "//div[contains (text(), 'Results')]")
	public WebElement listingQty;
	
//	@FindBy(xpath)
//	public WebElement verifyTitle;

	// METHODS

	public void clearZipField(WebElement element) {

		Assert.assertTrue(element.isDisplayed());
		element.clear();
		Assert.assertTrue(element.isEnabled());
	}

	public void advancedSearchClick(WebElement element) {
//		ATAdvancedSearchPage.waitForClickability(homePage.advancedSearch);
		BasePageAT.clearCookies();
		element.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// verifying that I am on correct page
		String expected = "Search Cars for Sale";
		String actual = headerSearch.getText();
		System.out.println(actual);

		Assert.assertEquals(expected, actual);
	}

	public void enterZipcode(String zip) {
		clearZipField(zipCode);
		zipCode.sendKeys(zip);

	}

	// selecting Checkboxes
	public void selectCheckbox(String string) {

		if (string.equals(chkboxCertified.getText())) {
			if (!chkboxCertified.isSelected()) {
				chkboxCertified.click();
			}
		} else if (string.equals(chkboxConvertible.getText())) {
			if (!chkboxConvertible.isSelected()) {
				chkboxConvertible.click();
			}
		}
	}
	//select year
		public void selectYear(String string, String string2) {
		Select select = new Select(yearFrom);
		select.selectByVisibleText(string);
		Select select2 = new Select(yearTo);
		select2.selectByVisibleText(string2);
	}
	
	//selectingPrice
	public void selectPrice(String string, String string2) {
		Select select = new Select(minPrice);
		select.selectByVisibleText(string);
		Select select1 = new Select(maxPrice);
		select1.selectByVisibleText(string2);
	}
	
	public void selectExteriorColor(String string2) throws InterruptedException {
		exteriorColor.click();
		List<WebElement> groupCheckBox = chckBoxOptionsExterior;
				for(WebElement checkBox: groupCheckBox) {
			
			String actual=checkBox.getText();
			if(string2.equalsIgnoreCase(actual)){
				System.out.println("you're on the right path");
				checkBox.click();
				break;
			}
		}
			Thread.sleep(1000);
//		if(string2.equals(advancedSearchPg.silverExterior.getText())){
//		advancedSearchPg.silverExterior.click();
		}
	}
