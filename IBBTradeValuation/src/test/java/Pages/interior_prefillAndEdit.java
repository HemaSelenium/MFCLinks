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
public class interior_prefillAndEdit {
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

	
	
	public static String Odometerimage_tick = "//android.widget.TextView[@text='Odometer Image*']//following-sibling::android.widget.ImageView";
	public static String DashBoardcondition_tick = "//android.widget.TextView[@text='Dash Board condition*']//following-sibling::android.widget.ImageView";
	public static String dashboardimage_tick = "//android.widget.TextView[@text='Dashboard Image*']//following-sibling::android.widget.ImageView";
	public static String windowcentralControl_tick = "//android.widget.TextView[@text='Window – Central control*']//following-sibling::android.widget.ImageView";
	public static String windowLockCentral_tick = "//android.widget.TextView[@text='Window lock - central*']//following-sibling::android.widget.ImageView";
	public static String handBrake_tick = "//android.widget.TextView[@text='Hand brake*']//following-sibling::android.widget.ImageView";
	public static String HandBrakeAndgearLever_tick = "//android.widget.TextView[@text='Handbrake & Gear lever/Boot image']//following-sibling::android.widget.ImageView";
	public static String upholsteryfrontImage_tick = "//android.widget.TextView[@text='Upholstery Front image*']//following-sibling::android.widget.ImageView";
	public static String upholsteryrearImage_tick = "//android.widget.TextView[@text='Upholstery Rear image*']//following-sibling::android.widget.ImageView";
	public static String seatMovement_tick = "//android.widget.TextView[@text='Seat movement*']//following-sibling::android.widget.ImageView";
	public static String Key_tick = "//android.widget.TextView[@text='Key*']//following-sibling::android.widget.ImageView";
	public static String combinationSwitch_tick = "//android.widget.TextView[@text='Combination switch*']//following-sibling::android.widget.ImageView";
	public static String steeringwheelmovement_tick = "//android.widget.TextView[@text='Steering Wheel movement*']//following-sibling::android.widget.ImageView";
	public static String outsiderearviewmirrors_tick = "//android.widget.TextView[@text='Outside Rear View Mirrors – functional*']//following-sibling::android.widget.ImageView";
	public static String internalrearviewmirror_tick = "//android.widget.TextView[@text='Internal Rear View Mirrors*']//following-sibling::android.widget.ImageView";
	public static String others_tick = "//android.widget.TextView[@text='Others*']//following-sibling::android.widget.ImageView";
	public static String Seatcondition_tick = "//android.widget.TextView[@text='Seat condition*']//following-sibling::android.widget.ImageView";
	
	
	
	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";

	public void dashboardCondition(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, DashBoardcondition);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, DashBoardcondition_tick).isDisplayed()) {
				System.out.println("After Edited DashBoardcondition, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited DashBoardcondition, Tick mark didnt display");
		}
	}

	public void seatcondition(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, Seatcondition);
		helper.selectMulti_aftersubmit(driver, strings);
		helper.captureimageone(driver);
		try {
			if (AppiumHelper.FindElementByXpath(driver, Seatcondition_tick).isDisplayed()) {
				System.out.println("After Edited Seatcondition, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited Seatcondition, Tick mark didnt display");
		}
	}

	public void windowcentralcontrol(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, windowcentralControl);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, windowcentralControl_tick).isDisplayed()) {
				System.out.println("After Edited windowcentralControl, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited windowcentralControl, Tick mark didnt display");
		}
	}

	public void windowlockcentral(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, windowLockCentral);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, windowLockCentral_tick).isDisplayed()) {
				System.out.println("After Edited windowLockCentral, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited windowLockCentral, Tick mark didnt display");
		}
	}

	public void handbrake(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, handBrake);
		helper.selectMulti_aftersubmit(driver, strings);
		// helper.captureimageone(driver);
		try {
			if (AppiumHelper.FindElementByXpath(driver, handBrake_tick).isDisplayed()) {
				System.out.println("After Edited handBrake, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited handBrake, Tick mark didnt display");
		}
	}

	public void seatMovement(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, seatMovement);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, seatMovement_tick).isDisplayed()) {
				System.out.println("After Edited seatMovement, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited seatMovement, Tick mark didnt display");
		}
	}

	public void key(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, Key);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, Key_tick).isDisplayed()) {
				System.out.println("After Edited Key, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited Key, Tick mark didnt display");
		}
	}

	public void combinationSwitch(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, combinationSwitch);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, combinationSwitch_tick).isDisplayed()) {
				System.out.println("After Edited combinationSwitch, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited combinationSwitch, Tick mark didnt display");
		}
	}

	public void steeringwheelMovement(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, steeringwheelmovement);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, steeringwheelmovement_tick).isDisplayed()) {
				System.out.println("After Edited steeringwheelmovement, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited steeringwheelmovement, Tick mark didnt display");
		}
	}

	public void outsiderearviewmirrors(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, outsiderearviewmirrors);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, outsiderearviewmirrors_tick).isDisplayed()) {
				System.out.println("After Edited outsiderearviewmirrors, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited outsiderearviewmirrors, Tick mark didnt display");
		}
	}

	public void internalrearviewmirrors(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, internalrearviewmirror);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, internalrearviewmirror_tick).isDisplayed()) {
				System.out.println("After Edited internalrearviewmirror, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited internalrearviewmirror, Tick mark didnt display");
		}
	}

	public void others(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, others);
		helper.selectMulti_aftersubmit(driver, strings);
		try {
			if (AppiumHelper.FindElementByXpath(driver, others_tick).isDisplayed()) {
				System.out.println("After Edited others, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited others, Tick mark didnt display");
		}
	}

	public void Dashboardimage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, dashboardimage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, dashboardimage_tick).isDisplayed()) {
				System.out.println("After Edited dashboardimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited dashboardimage, Tick mark didnt display");
		}
	}

	public void Odometerimage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, Odometerimage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, Odometerimage_tick).isDisplayed()) {
				System.out.println("After Edited Odometerimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited Odometerimage, Tick mark didnt display");
		}
	}

	public void handbrakeAndgearlever(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, HandBrakeAndgearLever);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, HandBrakeAndgearLever_tick).isDisplayed()) {
				System.out.println("After Edited HandBrakeAndgearLever, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited HandBrakeAndgearLever, Tick mark didnt display");
		}
	}

	public void upholsteryfrontImage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, upholsteryfrontImage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, upholsteryfrontImage_tick).isDisplayed()) {
				System.out.println("After Edited upholsteryfrontImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited upholsteryfrontImage, Tick mark didnt display");
		}
	}

	public void upholsteryrearImage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, upholsteryrearImage);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		helper.clickOnElementByID(driver, Done);
		try {
			if (AppiumHelper.FindElementByXpath(driver, upholsteryrearImage_tick).isDisplayed()) {
				System.out.println("After Edited upholsteryrearImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited upholsteryrearImage, Tick mark didnt display");
		}

	}

}
