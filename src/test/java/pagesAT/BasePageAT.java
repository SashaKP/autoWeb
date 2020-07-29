package pagesAT;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitiesAT.MyDriverMultiThreader;

public class BasePageAT {

	//When we use @FindBy annotation in this page.
		public BasePageAT() {

			PageFactory.initElements(MyDriverMultiThreader.get(), this);
		}

		//To use for certain wait time we use this method.
		public void waitforelements() throws InterruptedException {
			Thread.sleep(3000);
		}

	    /**
	     * Web site was not allowing the automation browser
	     * And I saw that browser was doing it with cookies and
	     * I cleaned the cookies every page navigation to make sure
	     * my automation works.
	     */
		public static void clearCookies() {

			Set<Cookie> a = MyDriverMultiThreader.get().manage().getCookies();
			System.out.println("Cookies " +a);
			//Delete all the cookies
			MyDriverMultiThreader.get().manage().deleteAllCookies();

		}

		public void scrollDown(WebElement link)  {


			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			JavascriptExecutor js = (JavascriptExecutor) MyDriverMultiThreader.get();
			/**
			 *  this script must scroll, until link element is visible
			 *  once link element visible, it will stop scrolling
			 *  arguments[0] = means first webelement after comma (link)
			 *  arguments it's an array of webelements after comma
			 *  arguments[0] = link web element, it can be any web element
			 */
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			js.executeScript("arguments[0].scrollIntoView(true)", link);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		/**
		 * This method will create an Object of WebDriverWait
		 * 
		 * @return WebDriverWait
		 */
		public static WebDriverWait getWaitObject() {
			WebDriverWait wait = new WebDriverWait(MyDriverMultiThreader.get(), 30);
			return wait;
		}
		/**
		 * This method will wait until element becomes clickable
		 * 
		 * @param element
		 */
		public static void waitForClickability(WebElement element) {
			getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
			
	}
	
}
