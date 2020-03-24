/**
 * 
 */
package mainTestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import Pages.Pending;
import common.BaseClass;
import io.appium.java_client.MobileElement;

/**
 * @author Hema Sumanjali
 *
 */
public class viewReportUsecases extends BaseClass {
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

		// MobileElement el4 = (MobileElement)
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[5]");
		// el4.click();
		System.out.println(" ");
		System.out.println("****Vehicle Details ****");
		System.out.println("==========================");
		helper.ScrollToViewElement(driver, "Registration Number");
		
		try {
		MobileElement el5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]");
		// el5.click();
		System.out.println("Ownership number : " + el5.getText());
		}
		catch(NoSuchElementException e) {
			helper.scrollUp(driver);
			MobileElement el5 = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]");
			// el5.click();
			System.out.println("Ownership number : " + el5.getText());
		}
		MobileElement el6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]");
		// el6.click();
		System.out.println("Fuel : " + el6.getText());
		MobileElement el7 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]");
		// el7.click();
		System.out.println("Transmission : " + el7.getText());
		MobileElement el8 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]");
		// el8.click();
		System.out.println("BodyType : " + el8.getText());
		MobileElement el9 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[2]");
		// el9.click();
		System.out.println("Colour : " + el9.getText());
		MobileElement el10 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View[2]");
		// el10.click();
		System.out.println("Kilometer : " + el10.getText());
		MobileElement el11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View[2]");
		// el11.click();
		System.out.println("General Remarks: " + el11.getText());

		System.out.println(" ");
		System.out.println("**** Features ****");
		System.out.println("==========================");

		MobileElement el12 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		// el12.click();
		System.out.println("Sunroof : " + el12.getText());
		MobileElement el13 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el13.click();
		System.out.println("Tubeless Tyres : " + el13.getText());
		MobileElement el14 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el14.click();
		System.out.println("FM radio:" + el14.getText());
		MobileElement el15 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el15.click();
		System.out.println("Air conditioner: " + el15.getText());
		MobileElement el16 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[5]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el16.click();
		System.out.println("Seat material : " + el16.getText());
		MobileElement el17 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[6]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el17.click();
		System.out.println("GPS Navigation : " + el17.getText());
		MobileElement el18 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.view.View[2]");
		// el18.click();
		System.out.println("Rear defogger : " + el18.getText());
		MobileElement el19 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[8]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el19.click();
		System.out.println("Bluetooth integrated Audio system: " + el19.getText());
		MobileElement el20 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[9]/android.view.View[2]");
		// el20.click();
		System.out.println("AlloyWheels: " + el20.getText());
		MobileElement el21 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[10]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el21.click();
		System.out.println("Transmission Type: " + el21.getText());
		MobileElement el22 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View[11]/android.view.View[2]/android.widget.ListView/android.view.View");
		// el22.click();
		System.out.println("Rear Parking sensor: " + el22.getText());

		MobileElement el23 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]");
		// el23.click();
		System.out.println("Rear wiper : " + el23.getText());
		MobileElement el24 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]");
		// el24.click();
		System.out.println("Stereo : " + el24.getText());
		MobileElement el25 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[4]/android.view.View");
		// el25.click();
		System.out.println("General remarks: " + el25.getText());
		if (el25.getText().isEmpty()) {
			System.out.println("General remarks are empty");
		}

		System.out.println(" ");
		System.out.println("**** Documents ****");
		System.out.println("==========================");
		MobileElement el1 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]");
		System.out.println(" RC : " + el1.getText());
		MobileElement el2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]");
		System.out.println(" Insurance : " + el2.getText());
		MobileElement el3 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]");
		System.out.println("Hypothecation : " + el3.getText());
		MobileElement el4 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]");
		System.out.println("Duplicate Key : " + el4.getText());

		System.out.println(" ");
		System.out.println("**** Exterior ****");
		System.out.println("==========================");

		MobileElement ell5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Headlamp support: " + ell5.getText());
		MobileElement ell6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Firewall : " + ell6.getText());
		MobileElement ell7 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Frontbumper : " + ell7.getText());
		MobileElement ell8 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" front grill : " + ell8.getText());
		MobileElement ell9 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[5]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" bonnet hood :" + ell9.getText());
		MobileElement ell10 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[6]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Head lights :" + ell10.getText());
		MobileElement ell11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[7]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Fog lamps :" + ell11.getText());
		MobileElement ell12 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[8]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" RH Indicator :" + ell12.getText());
		MobileElement ell13 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[9]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" RH Fender :  " + ell13.getText());
		MobileElement ell14 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[10]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Rh Rear View Mirror : " + ell14.getText());
		MobileElement ell15 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[11]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" wheel /RIm (front RH) :" + ell15.getText());
		MobileElement ell16 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[12]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Front RH door : " + ell16.getText());
		MobileElement ell17 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[13]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("RH Sill panel : " + ell17.getText());
		MobileElement ell18 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[14]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Rear RH door : " + ell18.getText());
		MobileElement ell19 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[15]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" wheel rim Rear rh :" + ell19.getText());
		MobileElement ell20 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[16]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Quarter panel Rh :" + ell20.getText());
		MobileElement ell21 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[17]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Tail light RH" + ell21.getText());
		MobileElement ell22 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[18]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Rear bumper : " + ell22.getText());
		MobileElement ell23 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[19]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Rear windshield : " + ell23.getText());
		MobileElement ell24 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[20]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Trunk :" + ell24.getText());
		MobileElement ell25 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[21]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Dicky :" + ell25.getText());
		MobileElement el26 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[22]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Toolkit :" + el26.getText());
		MobileElement el27 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[23]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" quarter panel lh :" + el27.getText());
		MobileElement el28 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[24]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" wheel /rim (rear lh)" + el28.getText());
		MobileElement el29 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[25]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Rear LH door : " + el29.getText());
		MobileElement el30 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[26]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("LH Sill panel " + el30.getText());

		MobileElement el33 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[27]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Front lh door :" + el33.getText());
		MobileElement el34 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[28]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("wheel /rim(front lh" + el34.getText());
		MobileElement el35 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[29]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("lh rear view mirror :  " + el35.getText());
		MobileElement el36 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[30]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("LH fender " + el36.getText());
		MobileElement el37 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[31]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("LH Indicator :" + el37.getText());
		MobileElement el38 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.widget.GridView/android.view.View[32]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" roof :  " + el38.getText());
		MobileElement el39 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]");
		System.out.println(" tyre front rh: " + el39.getText());
		MobileElement el40 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]");
		System.out.println("tyre rear rh :" + el40.getText());
		MobileElement el41 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]");
		System.out.println(" spare wheel :  " + el41.getText());
		MobileElement el42 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]");
		System.out.println("tyre rear lh: " + el42.getText());
		MobileElement el43 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[6]/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View[2]");
		System.out.println(" tyre frontlh: " + el43.getText());

		System.out.println(" ");
		System.out.println("**** Under the hood ****");
		System.out.println("==========================");

		MobileElement elll10 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Apron:  " + elll10.getText());
		MobileElement elll11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Bateery : " + elll11.getText());
		MobileElement elll12 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Radiator: " + elll12.getText());
		MobileElement elll13 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("AC Condenser : " + elll13.getText());
		MobileElement elll14 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" cooling fan :" + elll14.getText());
		MobileElement elll15 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Engine oil :" + elll15.getText());

		MobileElement elll17 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Master: " + elll17.getText());
		MobileElement elll16 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" others: " + elll16.getText());

		System.out.println(" ");
		System.out.println("**** interior ****");
		System.out.println("==========================");
		MobileElement p1 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("dashboard condition: " + p1.getText());
		MobileElement pl2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" window central control :" + pl2.getText());
		MobileElement pl3 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("window lock -central: " + pl3.getText());
		MobileElement pl4 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("handbrake: " + pl4.getText());
		MobileElement pl5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Seat movement: " + pl5.getText());
		MobileElement pl6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" key :" + pl6.getText());
		MobileElement pl7 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" combination switch:" + pl7.getText());
		MobileElement pl8 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Steering wheel movement: " + pl8.getText());
		MobileElement pl9 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[9]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" outside rear view:" + pl9.getText());
		MobileElement p10 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[10]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("internal rear view : " + p10.getText());
		MobileElement p11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[11]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" others : " + p11.getText());
		MobileElement p12 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[8]/android.view.View[2]/android.view.View/android.view.View[12]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Seat condition: " + p12.getText());

		System.out.println(" ");
		System.out.println("**** Underbody ****");
		System.out.println("==========================");

		MobileElement K1 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" underbody flooring: " + K1.getText());
		MobileElement K2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Steering system: " + K2.getText());
		MobileElement K3 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Suspension system: " + K3.getText());
		MobileElement K4 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" transmission &brakes :" + K4.getText());
		MobileElement K5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" Fuel &Emission :" + K5.getText());
		MobileElement K6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Mufler : " + K6.getText());

		System.out.println(" ");
		System.out.println("**** TestDrive ****");
		System.out.println("==========================");

		MobileElement L1 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[10]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println("Clutch : " + L1.getText());
		MobileElement L2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[10]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]");
		System.out.println(" transmission :" + L2.getText());
		MobileElement L3 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[10]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]");
		System.out.println("Engine : " + L3.getText());

		String AllimagesCount = driver.findElementByXPath(
				"//android.view.View[@resource-id='filter']//android.view.View//android.widget.Button[@index='0']")
				.getText();
		String ExteriorImageCount = driver.findElementByXPath(
				"//android.view.View[@resource-id='filter']//android.view.View//android.widget.Button[@index='1']")
				.getText();
		String InteriorCount = driver.findElementByXPath(
				"//android.view.View[@resource-id='filter']//android.view.View//android.widget.Button[@index='2']")
				.getText();
		String OthersCount = driver.findElementByXPath(
				"//android.view.View[@resource-id='filter']//android.view.View//android.widget.Button[@index='3']")
				.getText();
		String DamagesCount = driver.findElementByXPath(
				"//android.view.View[@resource-id='filter']//android.view.View//android.widget.Button[@index='4']")
				.getText();

		System.out.println(" ");
		System.out.println("**** General images ****");
		System.out.println("==========================");

		MobileElement t1 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[11]/android.view.View[1]/android.view.View[3]");
		t1.click();
		if (t1.getText().equalsIgnoreCase("General Images")) {
			System.out.println("General images section is there in report");
		} else {
			System.out.println("General images section is not there in report");
		}

		System.out.println("Under General images section below sections are there: ");

		if (AllimagesCount.contains("All Images")) {
			System.out.println("All images section is there under General images section");
		} else {
			System.out.println("All images section is not there under General images section");
		}
		if (ExteriorImageCount.contains("Exterior")) {
			System.out.println("Exterior section is there under General images section");
		} else {
			System.out.println("Exterior section is not there under General images section");
		}
		if (InteriorCount.contains("Interior")) {
			System.out.println("Interior section is there under General images section");
		} else {
			System.out.println("Interior section is not there under General images section");
		}
		if (OthersCount.contains("Others")) {
			System.out.println("Others section is there under General images section");
		} else {
			System.out.println("Others section is not there under General images section");
		}
		if (DamagesCount.contains("Damages")) {
			System.out.println("Damages section is there under General images section");
		} else {
			System.out.println("Damages  section is not there under General images section");
		}
		/*
		 * List<MobileElement> imagesList = driver.findElements(By.tagName("img"));
		 * System.out.println("images in page: " + imagesList);
		 */
		// String answer = str.substring(str.indexOf("(")+1,str.indexOf(")"));
		System.out.println("All images count is displaying as : "
				+ AllimagesCount.substring(AllimagesCount.indexOf("(") + 1, AllimagesCount.indexOf(")")));
		System.out.println("Exterior Images Count is displaying as : "
				+ ExteriorImageCount.substring(ExteriorImageCount.indexOf("(") + 1, ExteriorImageCount.indexOf(")")));
		System.out.println("Interior images Count is displaying as : "
				+ InteriorCount.substring(InteriorCount.indexOf("(") + 1, InteriorCount.indexOf(")")));
		System.out.println("Other images Count is displaying as : "
				+ OthersCount.substring(OthersCount.indexOf("(") + 1, OthersCount.indexOf(")")));
		System.out.println("Damage images Count  is displaying as : "
				+ DamagesCount.substring(DamagesCount.indexOf("(") + 1, DamagesCount.indexOf(")")));

		
		try {
		driver.findElementByXPath("//android.view.View[@resource-id='all']//android.view.View[@index='0']").click();
		}
		catch(NoSuchElementException e){
			System.out.println("No Image available to click ");
		}
	/*	// System.out.println(driver.findElementByXPath("//android.view.View[@resource-id='filter']//android.view.View//android.widget.Button[@index='0']").getText());
		MobileElement image = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[11]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]");
		image.click();*/

		/*
		 * MobileElement image = (MobileElement) driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Image"
		 * ); image.click();
		 */

		MobileElement Headingoftheimage = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View[4]/android.view.View");
		if (Headingoftheimage.isDisplayed()) {
			System.out.println("after click on image in report section, gallery opened");

			MobileElement forwardimages = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View[3]/android.widget.Button[2]");
			forwardimages.click();
			MobileElement forwardimages_Headingoftheimage = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View[4]/android.view.View");
			if (forwardimages_Headingoftheimage.equals(Headingoftheimage)) {
				System.out.println("even after forawrded images are not scrolled");
			} else {
				System.out.println("After click on forawrd arrow, images are scrolled Successfully");
			}
			MobileElement BackwardImages = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View[3]/android.widget.Button[1]");
			BackwardImages.click();
			MobileElement BackwardImages_Headingoftheimage = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View[4]/android.view.View");
			if (BackwardImages_Headingoftheimage.equals(Headingoftheimage)) {
				System.out.println("even after click on back arrow  images are not scrolled");
			} else {
				System.out.println("After click on back arrow  images are scrolled sucessfully ");
			}

			driver.findElementById("lg-share").click();
			if (driver.findElementById("lg-share-facebook").isDisplayed()) {
				System.out.println("when click on share button, facebook button is available");
			} else {
				System.out.println("when click on share button, facebook button is available");
			}
			if (driver.findElementById("lg-share-twitter").isDisplayed()) {
				System.out.println("when click on share button, twitter button is available");
			} else {
				System.out.println("when click on share button, twitter button is not available");
			}
			if (driver.findElementById("lg-share-googleplus").isDisplayed()) {
				System.out.println("when click on share button, googleplus button is available");
			} else {
				System.out.println("when click on share button, googleplus button is not available");
			}
			if (driver.findElementById("lg-share-pinterest").isDisplayed()) {
				System.out.println("when click on share button, pinterest button is available");
			} else {
				System.out.println("when click on share button, pinterest button is not available");
			}

			MobileElement Closebutton = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[1]");
			Closebutton.click();

			if (t1.isDisplayed()) {
				System.out
						.println("after click on close button,page is redirected to report section which is expected");
			} else {
				System.out.println("after click on close button,page is not redirected to report section");
			}

		} else {
			System.out.println("after click on image in report section, gallery is not opened");
		}

		MobileElement ReportID = (MobileElement) driver.findElementByXPath(
				"//android.webkit.WebView[@text='Evaluation Report']//following-sibling::android.view.View[@index='2']");
		System.out.println("Report ID: " + ReportID.getText());

	}

}
