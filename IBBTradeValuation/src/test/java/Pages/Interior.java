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
public class Interior {
	protected static AppiumHelper helper = new AppiumHelper();
	public static String Odometerimage = "//android.widget.TextView[@text='Odometer Image*']";
	public static String DashBoardcondition = "//android.widget.TextView[@text='Dash Board condition*']";
	public static String dashboardimage = "//android.widget.TextView[@text='Dashboard Image*']";
	public static String windowcentralControl = "//android.widget.TextView[@text='Window – Central control*']";
	public static String windowLockCentral = "//android.widget.TextView[@text='Window lock - central*']";
	public static String handBrake = "//android.widget.TextView[@text='Hand brake*']";
	public static String HandBrakeAndgearLever = "//android.widget.TextView[@text='Handbrake & Gear lever/Boot image']";
	public static String upholsteryfrontImage = "//android.widget.TextView[@text='Upholstery Front image*']";
	public static String upholsteryrearImage = "//android.widget.TextView[@text='Upholstery Rear image*']";
	public static String seatMovement = "//android.widget.TextView[@text='Seat movement*']";
	public static String Key = "//android.widget.TextView[@text='Key*']";
	public static String combinationSwitch = "//android.widget.TextView[@text='Combination switch*']";
	public static String steeringwheelmovement = "//android.widget.TextView[@text='Steering Wheel movement*']";
	public static String outsiderearviewmirrors = "//android.widget.TextView[@text='Outside Rear View Mirrors – functional*']";
	public static String internalrearviewmirror = "//android.widget.TextView[@text='Internal Rear View Mirrors*']";
	public static String others = "//android.widget.TextView[@text='Others*']";
	public static String Seatcondition = "//android.widget.TextView[@text='Seat condition*']";

	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";

	public void dashboardCondition(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, DashBoardcondition);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, DashBoardcondition).isDisplayed()) {
				System.out.println("After filled DashBoardcondition, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled DashBoardcondition, Tick mark didnt display");
		}
	}

	public void seatcondition(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, Seatcondition);
		helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		try {
			if (AppiumHelper.FindElementByXpath(driver, Seatcondition).isDisplayed()) {
				System.out.println("After filled Seatcondition, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled Seatcondition, Tick mark didnt display");
		}
	}

	public void windowcentralcontrol(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, windowcentralControl);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, windowcentralControl).isDisplayed()) {
				System.out.println("After filled windowcentralControl, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled windowcentralControl, Tick mark didnt display");
		}
	}

	public void windowlockcentral(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, windowLockCentral);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, windowLockCentral).isDisplayed()) {
				System.out.println("After filled windowLockCentral, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled windowLockCentral, Tick mark didnt display");
		}
	}

	public void handbrake(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, handBrake);
		helper.selectMulti(driver, strings);
		// helper.captureimageone(driver);
		try {
			if (AppiumHelper.FindElementByXpath(driver, handBrake).isDisplayed()) {
				System.out.println("After filled handBrake, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled handBrake, Tick mark didnt display");
		}
	}

	public void seatMovement(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, seatMovement);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, seatMovement).isDisplayed()) {
				System.out.println("After filled seatMovement, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled seatMovement, Tick mark didnt display");
		}
	}

	public void key(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, Key);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, Key).isDisplayed()) {
				System.out.println("After filled Key, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled Key, Tick mark didnt display");
		}
	}

	public void combinationSwitch(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, combinationSwitch);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, combinationSwitch).isDisplayed()) {
				System.out.println("After filled combinationSwitch, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled combinationSwitch, Tick mark didnt display");
		}
	}

	public void steeringwheelMovement(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, steeringwheelmovement);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, steeringwheelmovement).isDisplayed()) {
				System.out.println("After filled steeringwheelmovement, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled steeringwheelmovement, Tick mark didnt display");
		}
	}

	public void outsiderearviewmirrors(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, outsiderearviewmirrors);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, outsiderearviewmirrors).isDisplayed()) {
				System.out.println("After filled outsiderearviewmirrors, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled outsiderearviewmirrors, Tick mark didnt display");
		}
	}

	public void internalrearviewmirrors(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, internalrearviewmirror);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, internalrearviewmirror).isDisplayed()) {
				System.out.println("After filled internalrearviewmirror, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled internalrearviewmirror, Tick mark didnt display");
		}
	}

	public void others(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, others);
		helper.selectMulti(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, others).isDisplayed()) {
				System.out.println("After filled others, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled others, Tick mark didnt display");
		}
	}

	public void Dashboardimage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, dashboardimage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, dashboardimage).isDisplayed()) {
				System.out.println("After filled dashboardimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled dashboardimage, Tick mark didnt display");
		}
	}

	public void Odometerimage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, Odometerimage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, Odometerimage).isDisplayed()) {
				System.out.println("After filled Odometerimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled Odometerimage, Tick mark didnt display");
		}
	}

	public void handbrakeAndgearlever(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, HandBrakeAndgearLever);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, HandBrakeAndgearLever).isDisplayed()) {
				System.out.println("After filled HandBrakeAndgearLever, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled HandBrakeAndgearLever, Tick mark didnt display");
		}
	}

	public void upholsteryfrontImage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, upholsteryfrontImage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, upholsteryfrontImage).isDisplayed()) {
				System.out.println("After filled upholsteryfrontImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled upholsteryfrontImage, Tick mark didnt display");
		}
	}

	public void upholsteryrearImage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, upholsteryrearImage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, upholsteryrearImage).isDisplayed()) {
				System.out.println("After filled upholsteryrearImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled upholsteryrearImage, Tick mark didnt display");
		}

	}

}
