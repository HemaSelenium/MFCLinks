/**
 * 
 */
package mainTestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import Pages.Pending;
import common.BaseClass;
import io.appium.java_client.MobileElement;

/**
 * @author Hema Sumanjali
 *
 */
public class viewreport2 extends BaseClass {
	@Test
	public void ViewReport() throws Exception {
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/mainBut3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pending.Make(driver);
		pending.ModelYear(driver);
		pending.ModelName(driver);
		pending.Variant(driver);
		Pending.RegNumber(driver);
		pending.City(driver);
		pending.KMS(driver);
		pending.completedDate(driver);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			driver.findElementById("android:id/button1").click();
		} catch (NoSuchElementException e) {

		}
		try {
			driver.findElementById("com.mahindra.ibbtrade_pro:id/share").click();
			System.out.println("Inside Report page, Share button is Available");
			if (driver.findElementById("android:id/icon").isDisplayed()) {
				System.out.println("when click on share button,sharing options are avialble");
				driver.navigate().back();
			} else {
				System.out.println("when click on share button,sharing options are not avialble");

			}
		} catch (NoSuchElementException e) {
			System.out.println("Inside Report page, Share button is not there");
		}
		try{
			if(driver.findElementByClassName("android.widget.Image").isDisplayed() ){
				System.out.println("In Report page, image is avialble in top of report.");
			}
		}
			
		 catch(NoSuchElementException e) {
			System.out.println("In Report page, image is not avialble in top of report.");
		}
		try {
			driver.findElementByXPath("//android.view.View[@text='View All Images']").click();
			System.out.println("View all images option is available in report");
			if (driver.findElementByXPath("//android.view.View[@text='General Images']").isDisplayed()) {
				System.out.println("when click on view all images, page is moved to general image section");
			} else {
				System.out.println("when click on view all images, page is not moved to General images section");
			}

		} catch (NoSuchElementException e) {
			System.out.println("View all images option is not available in report");
		}

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()" + ".resourceId(\"accordionExample\")).scrollIntoView("
						+ "new UiSelector().text(\"View All Images\"));");

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"View All Images\"));");

		MobileElement YearAndMake = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]");

		System.out.println("Year and Make in report : " + YearAndMake.getText());
		// el7.click();
		MobileElement ModelAndVariant = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]");
		System.out.println("Model and year in report : " + ModelAndVariant.getText());
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()" + ".resourceId(\"accordionExample\")).scrollIntoView("
						+ "new UiSelector().textContains(\"Vehicle Condition:\"));");

		MobileElement vehicleCondition = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[2]");
		try {
			System.out.println("veh condition in report : " + vehicleCondition.getText().split(":")[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("veh condition in report is empty");
		}
		MobileElement CityandState = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View[2]");
		System.out.println("State and city dispalying in report is: " + CityandState.getText());
		helper.ScrollToViewElement(driver, "Registration Number");
		// MobileElement el4 = (MobileElement)
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[5]");
		// el4.click();
		System.out.println(" ");
		System.out.println("****Vehicle Details ****");
		System.out.println("==========================");
		MobileElement listofdetails = (MobileElement)driver.findElementByXPath("//android.view.View[@text='Vehicle details']//android.view.View");
		List<MobileElement>list=listofdetails.findElementsByClassName("android.view.View");
		for(int i=0;i<list.size();i++) {
			try {
			System.out.println(driver.findElementByXPath("//android.view.View[@text='Vehicle details']//android.view.View//android.view.View[@index='"+i+"']//android.view.View[1]").getText()+" : "  +driver.findElementByXPath("//android.view.View[@text='Vehicle details']//android.view.View//android.view.View[@index='"+i+"']//android.view.View[2]").getText());
			}
			catch(NoSuchElementException e) {
				helper.scrollUp(driver);
				System.out.println(driver.findElementByXPath("//android.view.View[@text='Vehicle details']//android.view.View//android.view.View[@index='"+i+"']//android.view.View[1]").getText()+" : "  +driver.findElementByXPath("//android.view.View[@text='Vehicle details']//android.view.View//android.view.View[@index='"+i+"']//android.view.View[2]").getText());
			}
			}
		
		
		
		
		
	}
}
