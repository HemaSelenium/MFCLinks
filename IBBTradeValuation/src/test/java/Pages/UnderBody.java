/**
 * 
 */
package Pages;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class UnderBody {
	
	protected static AppiumHelper helper = new AppiumHelper();

	public static String underbodyflooring = "//android.widget.TextView[@text='Under body Flooring*']";
	public static String steeringsystem = "//android.widget.TextView[@text='Steering system*']";
	public static String underbodyfrontimage = "//android.widget.TextView[@text='Underbody Front Image']";
	public static String underBodyrearimage = "//android.widget.TextView[@text='Underbody Rear Image']";
	public static String  suspensionSystem= "//android.widget.TextView[@text='Suspension system*']";
	public static String  transmissionandbrakes= "//android.widget.TextView[@text='Transmission & Brakes*']";
	public static String fuelandemission = "//android.widget.TextView[@text='Fuel & Emission*']";
	public static String muffler = "//android.widget.TextView[@text='Muffler/Silencer*']";
	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";

	
	
	public void underBodyFlooring(AndroidDriver<MobileElement> driver, String underBodyFlooring) throws Exception {
		helper.clickOnElementByXpath(driver, underbodyflooring);
		helper.selectMulti(driver, underBodyFlooring);
		try {
			if (AppiumHelper.FindElementByXpath(driver, underbodyflooring).isDisplayed()) {
				System.out.println("After filled underbodyflooring, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled underbodyflooring, Tick mark didnt display");
		}
	}
	
	
	public void steeringSystem(AndroidDriver<MobileElement> driver, String SteeringSystem) throws Exception {
		helper.clickOnElementByXpath(driver, steeringsystem);
		helper.selectMulti(driver, SteeringSystem);
		try {
			if (AppiumHelper.FindElementByXpath(driver, steeringsystem).isDisplayed()) {
				System.out.println("After filled steeringsystem, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled steeringsystem, Tick mark didnt display");
		}
	}
	
	
	public void underBodyfrontimage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, underbodyfrontimage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();;
		try {
			if (AppiumHelper.FindElementByXpath(driver, underbodyfrontimage).isDisplayed()) {
				System.out.println("After filled underbodyfrontimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled underbodyfrontimage, Tick mark didnt display");
		}
	}
	
	public void underBodyrearimage(AndroidDriver<MobileElement> driver) throws Exception {

		helper.clickOnElementByXpath(driver, underBodyrearimage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, underBodyrearimage).isDisplayed()) {
				System.out.println("After filled underBodyrearimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled underBodyrearimage, Tick mark didnt display");
		}
	}
	
	public void suspensionSystem(AndroidDriver<MobileElement> driver, String suspensionsystem) throws Exception {
		
			helper.clickOnElementByXpath(driver, suspensionSystem);
		
		helper.selectMulti(driver, suspensionsystem);
		try {
			if (AppiumHelper.FindElementByXpath(driver, suspensionSystem).isDisplayed()) {
				System.out.println("After filled suspensionSystem, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled suspensionSystem, Tick mark didnt display");
		}
	}
	public void transmissionAndBrakes(AndroidDriver<MobileElement> driver, String transmissionAndBrakes) throws Exception {
		
		helper.clickOnElementByXpath(driver, transmissionandbrakes);
		helper.selectMulti(driver, transmissionAndBrakes);
		try {
			if (AppiumHelper.FindElementByXpath(driver, transmissionandbrakes).isDisplayed()) {
				System.out.println("After filled transmissionandbrakes, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled transmissionandbrakes, Tick mark didnt display");
		}
	}
	public void fuelAndemission(AndroidDriver<MobileElement> driver, String FuelAndEmission) throws Exception {
		
			helper.clickOnElementByXpath(driver, fuelandemission);
				helper.selectMulti(driver, FuelAndEmission);
				try {
					if (AppiumHelper.FindElementByXpath(driver, fuelandemission).isDisplayed()) {
						System.out.println("After filled fuelandemission, Tick mark  displayed");
					}
				} catch (NoSuchElementException e) {
					System.out.println("After filled fuelandemission, Tick mark didnt display");
				}
		}
	public void mufler(AndroidDriver<MobileElement> driver, String Muffler) throws Exception {
		
			helper.clickOnElementByXpath(driver, muffler);
		
		helper.selectMulti(driver, Muffler);
		try {
			if (AppiumHelper.FindElementByXpath(driver, muffler).isDisplayed()) {
				System.out.println("After filled muffler, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled muffler, Tick mark didnt display");
		}
	}
}
