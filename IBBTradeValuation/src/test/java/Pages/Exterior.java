/**
 * 
 */
package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class Exterior {

	protected static AppiumHelper helper = new AppiumHelper();
	public static String odometerimage = "//android.widget.TextView[@text='Odometer Image*']";
	public static String odometerimage_tick = "//android.widget.TextView[@text='Odometer Image*']//following-sibling::android.widget.ImageView";
	public static String apron = "//android.widget.TextView[@text='Apron*']";
	public static String apron_tick = "//android.widget.TextView[@text='Apron*']//following-sibling::android.widget.ImageView";
	public static String Headlamp = "//android.widget.TextView[@text='Headlamp support*']";
	public static String Headlamp_tick = "//android.widget.TextView[@text='Headlamp support*']//following-sibling::android.widget.ImageView";
	public static String Firewall = "//android.widget.TextView[@text='Firewall*']";
	public static String Firewall_tick = "//android.widget.TextView[@text='Firewall*']//following-sibling::android.widget.ImageView";
	public static String Frontbumper = "//android.widget.TextView[@text='Front bumper*']";
	public static String Frontbumper_tick = "//android.widget.TextView[@text='Front bumper*']//following-sibling::android.widget.ImageView";
	public static String FrontGrill = "//android.widget.TextView[@text='Front Grill*']";
	public static String FrontGrill_tick = "//android.widget.TextView[@text='Front Grill*']//following-sibling::android.widget.ImageView";
	public static String Frontsideimage = "//android.widget.TextView[@text='Front side image*']";
	public static String Frontsideimage_tick = "//android.widget.TextView[@text='Front side image*']//following-sibling::android.widget.ImageView";
	public static String Bonnet = "//android.widget.TextView[@text='Bonnet (Hood)*']";
	public static String Bonnet_tick = "//android.widget.TextView[@text='Bonnet (Hood)*']//following-sibling::android.widget.ImageView";
	public static String Headlights = "//android.widget.TextView[@text='Head lights*']";
	public static String Headlights_tick = "//android.widget.TextView[@text='Head lights*']//following-sibling::android.widget.ImageView";
	public static String Foglamps = "//android.widget.TextView[@text='Fog lamps*']";
	public static String Foglamps_tick = "//android.widget.TextView[@text='Fog lamps*']//following-sibling::android.widget.ImageView";
	public static String RHIndicator = "//android.widget.TextView[@text='RH Indicator/Turn Signal*']";
	public static String RHIndicator_tick = "//android.widget.TextView[@text='RH Indicator/Turn Signal*']//following-sibling::android.widget.ImageView";
	public static String RHFender = "//android.widget.TextView[@text='RH Fender*']";
	public static String RHFender_tick = "//android.widget.TextView[@text='RH Fender*']//following-sibling::android.widget.ImageView";
	public static String RHRear = "//android.widget.TextView[@text='RH Rear View Mirror*']";
	public static String RHRear_tick = "//android.widget.TextView[@text='RH Rear View Mirror*']//following-sibling::android.widget.ImageView";
	public static String Wheel = "//android.widget.TextView[@text='Wheel / Rim (Front RH)*']";
	public static String Wheel_tick = "//android.widget.TextView[@text='Wheel / Rim (Front RH)*']//following-sibling::android.widget.ImageView";
	public static String TyreFrontRH = "//android.widget.TextView[@text='Tyre - Front RH*']";
	public static String TyreFrontRH_tick = "//android.widget.TextView[@text='Tyre - Front RH*']//following-sibling::android.widget.ImageView";
	public static String Tyre_Front_RH_image = "//android.widget.TextView[@text='Tyre - Front RH image*']";
	public static String Tyre_Front_RH_image_tick = "//android.widget.TextView[@text='Tyre - Front RH image*']//following-sibling::android.widget.ImageView";
	public static String FrontRHDoor = "//android.widget.TextView[@text='Front RH Door*']";
	public static String FrontRHDoor_tick = "//android.widget.TextView[@text='Front RH Door*']//following-sibling::android.widget.ImageView";
	public static String RHSillPanel = "//android.widget.TextView[@text='RH Sill Panel/Running board*']";
	public static String RHSillPanel_tick = "//android.widget.TextView[@text='RH Sill Panel/Running board*']//following-sibling::android.widget.ImageView";
	public static String RHSideimage = "//android.widget.TextView[@text='RH Side image*']";
	public static String RHSideimage_tick = "//android.widget.TextView[@text='RH Side image*']//following-sibling::android.widget.ImageView";
	public static String Rear_RH_Door = "//android.widget.TextView[@text='Rear RH Door*']";
	public static String Rear_RH_Door_tick = "//android.widget.TextView[@text='Rear RH Door*']//following-sibling::android.widget.ImageView";
	public static String Wheel_Rear_RH = "//android.widget.TextView[@text='Wheel / Rim (Rear RH)*']";
	public static String Wheel_Rear_RH_tick = "//android.widget.TextView[@text='Wheel / Rim (Rear RH)*']//following-sibling::android.widget.ImageView";
	public static String Tyre_Rear_RH = "//android.widget.TextView[@text='Tyre - Rear RH*']";
	public static String Tyre_Rear_RH_tick = "//android.widget.TextView[@text='Tyre - Rear RH*']//following-sibling::android.widget.ImageView";
	public static String Tyre_RearRHimage = "//android.widget.TextView[@text='Tyre - Rear RH image*']";
	public static String Tyre_RearRHimage_tick = "//android.widget.TextView[@text='Tyre - Rear RH image*']//following-sibling::android.widget.ImageView";
	public static String QuarterPanelRH = "//android.widget.TextView[@text='Quarter Panel RH*']";
	public static String QuarterPanelRH_tick = "//android.widget.TextView[@text='Quarter Panel RH*']//following-sibling::android.widget.ImageView";
	public static String TailLightRH = "//android.widget.TextView[@text='Tail Light RH*']";
	public static String TailLightRH_tick = "//android.widget.TextView[@text='Tail Light RH*']//following-sibling::android.widget.ImageView";
	public static String Rearbumper = "//android.widget.TextView[@text='Rear bumper*']";
	public static String Rearbumper_tick = "//android.widget.TextView[@text='Rear bumper*']//following-sibling::android.widget.ImageView";
	public static String RearSideimage = "//android.widget.TextView[@text='Rear Side image*']";
	public static String RearSideimage_tick = "//android.widget.TextView[@text='Rear Side image*']//following-sibling::android.widget.ImageView";
	public static String Rear_Windshield = "//android.widget.TextView[@text='Rear Windshield & Wiper*']";
	public static String Rear_Windshield_tick = "//android.widget.TextView[@text='Rear Windshield & Wiper*']//following-sibling::android.widget.ImageView";
	public static String Trunk = "//android.widget.TextView[@text='Trunk/Tail Gate*']";
	public static String Trunk_tick = "//android.widget.TextView[@text='Trunk/Tail Gate*']//following-sibling::android.widget.ImageView";
	public static String Dicky = "//android.widget.TextView[@text='Dicky/Boot floor*']";
	public static String Dicky_tick = "//android.widget.TextView[@text='Dicky/Boot floor*']//following-sibling::android.widget.ImageView";
	public static String SpareWheel = "//android.widget.TextView[@text='Spare Wheel / Rim & Tyre*']";
	public static String SpareWheel_tick = "//android.widget.TextView[@text='Spare Wheel / Rim & Tyre*']//following-sibling::android.widget.ImageView";
	public static String Sparewheelimage = "//android.widget.TextView[@text='Spare wheel image']";
	public static String Sparewheelimage_tick = "//android.widget.TextView[@text='Spare wheel image']//following-sibling::android.widget.ImageView";
	public static String ToolKit = "//android.widget.TextView[@text='Tool Kit, Jack + Handle*']";
	public static String ToolKit_tick = "//android.widget.TextView[@text='Tool Kit, Jack + Handle*']//following-sibling::android.widget.ImageView";
	public static String QuarterPanelLH = "//android.widget.TextView[@text='Quarter Panel LH*']";
	public static String QuarterPanelLH_tick = "//android.widget.TextView[@text='Quarter Panel LH*']//following-sibling::android.widget.ImageView";
	public static String Wheel_Rear_LH = "//android.widget.TextView[@text='Wheel / Rim (Rear LH)*']";
	public static String Wheel_Rear_LH_tick = "//android.widget.TextView[@text='Wheel / Rim (Rear LH)*']//following-sibling::android.widget.ImageView";
	public static String TyreRearLH = "//android.widget.TextView[@text='Tyre - Rear LH*']";
	public static String TyreRearLH_tick = "//android.widget.TextView[@text='Tyre - Rear LH*']//following-sibling::android.widget.ImageView";
	public static String TyreRearLHimage = "//android.widget.TextView[@text='Tyre - Rear LH image*']";
	public static String TyreRearLHimage_tick = "//android.widget.TextView[@text='Tyre - Rear LH image*']//following-sibling::android.widget.ImageView";
	public static String RearLHDoor = "//android.widget.TextView[@text='Rear LH Door*']";
	public static String RearLHDoor_tick = "//android.widget.TextView[@text='Rear LH Door*']//following-sibling::android.widget.ImageView";
	public static String LHSideimage = "//android.widget.TextView[@text='LH Side image*']";
	public static String LHSideimage_tick = "//android.widget.TextView[@text='LH Side image*']//following-sibling::android.widget.ImageView";
	public static String LHSillPanel = "//android.widget.TextView[@text='LH Sill Panel/Running board*']";
	public static String LHSillPanel_tick = "//android.widget.TextView[@text='LH Sill Panel/Running board*']//following-sibling::android.widget.ImageView";
	public static String Front_LH_Door = "//android.widget.TextView[@text='Front LH Door*']";
	public static String Front_LH_Door_tick = "//android.widget.TextView[@text='Front LH Door*']//following-sibling::android.widget.ImageView";
	public static String Wheel_front_lh = "//android.widget.TextView[@text='Wheel / Rim (Front LH)*']";
	public static String Wheel_front_lh_tick = "//android.widget.TextView[@text='Wheel / Rim (Front LH)*']//following-sibling::android.widget.ImageView";
	public static String Tyre_Front_LH = "//android.widget.TextView[@text='Tyre - Front LH*']";
	public static String Tyre_Front_LH_tick = "//android.widget.TextView[@text='Tyre - Front LH*']//following-sibling::android.widget.ImageView";
	public static String Tyre_Front_LH_image = "//android.widget.TextView[@text='Tyre - Front LH image*']";
	public static String Tyre_Front_LH_image_tick = "//android.widget.TextView[@text='Tyre - Front LH image*']//following-sibling::android.widget.ImageView";
	public static String LH_Rear_View_Mirror = "//android.widget.TextView[@text='LH Rear View Mirror*']";
	public static String LH_Rear_View_Mirror_tick = "//android.widget.TextView[@text='LH Rear View Mirror*']//following-sibling::android.widget.ImageView";
	public static String LHFender = "//android.widget.TextView[@text='LH Fender*']";
	public static String LHFender_tick = "//android.widget.TextView[@text='LH Fender*']//following-sibling::android.widget.ImageView";
	public static String LHIndicator = "//android.widget.TextView[@text='LH Indicator/Turn Signal*']";
	public static String LHIndicator_tick = "//android.widget.TextView[@text='LH Indicator/Turn Signal*']//following-sibling::android.widget.ImageView";
	public static String Roof = "//android.widget.TextView[@text='Roof*']";
	public static String Roof_tick = "//android.widget.TextView[@text='Roof*']//following-sibling::android.widget.ImageView";
	public static String RoofImage = "//android.widget.TextView[@text='Roof Image']";
	public static String RoofImage_tick = "//android.widget.TextView[@text='Roof Image']//following-sibling::android.widget.ImageView";

	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";

	public void apron(AndroidDriver<MobileElement> driver, String apronValue) throws Exception {
		helper.clickOnElementByXpath(driver, apron);
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.CheckBox[@text='"+ApronValue+"']");
		helper.selectMulti(driver, apronValue);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		;
		try {
			if (AppiumHelper.FindElementByXpath(driver, apron_tick).isDisplayed()) {
				System.out.println("After filled apron, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled apron, Tick mark didnt display");
		}
	}

	
	public void apron_aftersubmit(AndroidDriver<MobileElement> driver, String apronValue) throws Exception {
		helper.clickOnElementByXpath(driver, apron);
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.CheckBox[@text='"+ApronValue+"']");
		//helper.selectMulti(driver, apronValue);
		helper.selectMulti_aftersubmit(driver, apronValue);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		;
		try {
			if (AppiumHelper.FindElementByXpath(driver, apron_tick).isDisplayed()) {
				System.out.println("After filled apron, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled apron, Tick mark didnt display");
		}
	}
	
	
	public void Headlamp(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, Headlamp); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Headlamp); }
		 */
		helper.selectMulti(driver, strings);

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Headlamp_tick).isDisplayed()) {
				System.out.println("After Filled Headlamp, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Headlamp, Tick mark didnt display");
		}
	}

	public void Firewall(AndroidDriver<MobileElement> driver, String firewall) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Firewall*\"));").click();
		;
		/*
		 * try { helper.clickOnElementByXpath(driver, Firewall); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Firewall);
		 * 
		 * }
		 */
		if (AppiumHelper.FindElementByXpath(driver, "//android.widget.CheckBox[@text='All Ok']").isDisplayed()) {
			System.out.println("in Firewall All ok option is there");
		} else {
			System.out.println("in Firewall All ok option is not there");
		}
		helper.selectMulti(driver, firewall);
		//// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		//// Structural damage']");

		helper.captureimageone(driver);
		// helper.captureimageTwo(driver);
		// helper.captureimageThree(driver);
		// helper.captureimageFour(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Firewall_tick).isDisplayed()) {
				System.out.println("After Filled Firewall, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Firewall, Tick mark didnt display");
		}

	}

	public void Frontbumper(AndroidDriver<MobileElement> driver, String frontbumper) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Front bumper*\"));").click();
		;
		/*
		 * try { helper.clickOnElementByXpath(driver, Frontbumper); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Frontbumper);
		 * 
		 * }
		 */
		helper.selectMulti(driver, frontbumper);
		//// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		//// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Frontbumper_tick).isDisplayed()) {
				System.out.println("After Filled Frontbumper, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Frontbumper, Tick mark didnt display");
		}

	}

	public void odometerimagecapture(AndroidDriver<MobileElement> driver) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Odometer Image*\"));").click();
		;
		// helper.clickOnElementByXpath(driver, odometerimage);

		helper.captureimageone(driver);
		helper.Remarks(driver);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, odometerimage_tick).isDisplayed()) {
				System.out.println("After Filled odometerimagecapture, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled odometerimagecapture, Tick mark didnt display");
		}
	}

	public void FrontGrill(AndroidDriver<MobileElement> driver, String frontGrill) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Front Grill*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, FrontGrill); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, FrontGrill);
		 * 
		 * }
		 */
		helper.selectMulti(driver, frontGrill);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, FrontGrill_tick).isDisplayed()) {
				System.out.println("After Filled FrontGrill, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled FrontGrill, Tick mark didnt display");
		}

	}

	public void Frontsideimage(AndroidDriver<MobileElement> driver) throws Exception {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Front side image*\"));").click();
		;
		/*
		 * try { helper.clickOnElementByXpath(driver, Frontsideimage); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Frontsideimage);
		 * 
		 * }
		 */

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Frontsideimage_tick).isDisplayed()) {
				System.out.println("After Filled Frontsideimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Frontsideimage, Tick mark didnt display");
		}

	}

	public void Bonnet(AndroidDriver<MobileElement> driver, String bonnet) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bonnet (Hood)*\"));").click();
		;
		/*
		 * try { helper.clickOnElementByXpath(driver, Bonnet); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Bonnet);
		 * 
		 * }
		 */
		helper.selectMulti(driver, bonnet);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Bonnet_tick).isDisplayed()) {
				System.out.println("After Filled Bonnet, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Bonnet, Tick mark didnt display");
		}

	}

	public void Headlights(AndroidDriver<MobileElement> driver, String headlights) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Head lights*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, Headlights); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Headlights);
		 * 
		 * }
		 */
		helper.selectMulti(driver, headlights);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Headlights_tick).isDisplayed()) {
				System.out.println("After Filled Headlights, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Headlights, Tick mark didnt display");
		}

	}

	public void Foglamps(AndroidDriver<MobileElement> driver, String foglamps) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Fog lamps*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, Foglamps); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Foglamps);
		 * 
		 * }
		 */
		helper.selectMulti(driver, foglamps);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		// helper.captureimageTwo(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Foglamps_tick).isDisplayed()) {
				System.out.println("After Filled Foglamps, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Foglamps, Tick mark didnt display");
		}

	}

	public void RHIndicator(AndroidDriver<MobileElement> driver, String rHIndicator) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"RH Indicator/Turn Signal*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, RHIndicator); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * 
		 * helper.clickOnElementByXpath(driver, RHIndicator); }
		 */
		helper.selectMulti(driver, rHIndicator);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, RHIndicator_tick).isDisplayed()) {
				System.out.println("After Filled RHIndicator, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RHIndicator, Tick mark didnt display");
		}

	}

	public void RHFender(AndroidDriver<MobileElement> driver, String rHFender) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"RH Fender*\"));").click();;
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"RH Fender*\"));");
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"RH Fender*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, RHFender);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, RHFender);

		}
		helper.selectMulti(driver, rHFender);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, RHFender_tick).isDisplayed()) {
				System.out.println("After Filled RHFender, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RHFender, Tick mark didnt display");
		}

	}

	public void RHRear(AndroidDriver<MobileElement> driver, String rHRear) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"RH Rear View Mirror*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, RHRear); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, RHRear); }
		 */
		helper.selectMulti(driver, rHRear);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, RHRear_tick).isDisplayed()) {
				System.out.println("After Filled RHRear, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RHRear, Tick mark didnt display");
		}

	}

	public void Wheel(AndroidDriver<MobileElement> driver, String wheel) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Wheel / Rim (Front RH)*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, Wheel); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Wheel);
		 * 
		 * }
		 */
		helper.selectMulti(driver, wheel);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Wheel_tick).isDisplayed()) {
				System.out.println("After Filled Wheel, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Wheel, Tick mark didnt display");
		}

	}

	public void TyreFrontRH(AndroidDriver<MobileElement> driver, String tyreFrontRH) throws Exception {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tyre - Front RH*\"));").click();
		;
		/*
		 * try { driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * helper.clickOnElementByXpath(driver, TyreFrontRH); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, TyreFrontRH);
		 * 
		 * }
		 */

		if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/bubbleSeekbar").isDisplayed()) {
			System.out.println("Tyre life option with slide is displayed inside TyreFrontRH");
		} else {
			System.out.println("Tyre life option with slide is not displayed inside TyreFrontRH");
		}

		helper.selectMulti(driver, tyreFrontRH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, TyreFrontRH_tick).isDisplayed()) {
				System.out.println("After Filled TyreFrontRH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled TyreFrontRH, Tick mark didnt display");
		}

	}

	public void Tyre_Front_RH_image(AndroidDriver<MobileElement> driver) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tyre - Front RH image*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, Tyre_Front_RH_image); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, Tyre_Front_RH_image);
		 * 
		 * }
		 */
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Tyre_Front_RH_image_tick).isDisplayed()) {
				System.out.println("After Filled Tyre_Front_RH_image, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Tyre_Front_RH_image, Tick mark didnt display");
		}

	}

	public void FrontRHDoor(AndroidDriver<MobileElement> driver, String frontRHDoor) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Front RH Door*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, FrontRHDoor); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, FrontRHDoor); }
		 */
		helper.selectMulti(driver, frontRHDoor);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, FrontRHDoor_tick).isDisplayed()) {
				System.out.println("After Filled FrontRHDoor, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled FrontRHDoor, Tick mark didnt display");
		}

	}

	public void RHSillPanel(AndroidDriver<MobileElement> driver, String rHSillPanel) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"RH Sill Panel/Running board*\"));").click();
		;

		/*
		 * try { helper.clickOnElementByXpath(driver, RHSillPanel); } catch
		 * (NoSuchElementException e) { helper.scrollUp(driver);
		 * helper.clickOnElementByXpath(driver, RHSillPanel);
		 * 
		 * }
		 */
		helper.selectMulti(driver, rHSillPanel);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, RHSillPanel_tick).isDisplayed()) {
				System.out.println("After Filled RHSillPanel, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RHSillPanel, Tick mark didnt display");
		}

	}

	public void RHSideimage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"RH Side image*\"));").click();

		try {

			helper.clickOnElementByXpath(driver, RHSideimage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, RHSideimage);

		}
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);

		try {
			helper.Remarks(driver);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.Remarks(driver);
		}
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, RHSideimage_tick).isDisplayed()) {
				System.out.println("After Filled RHSideimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RHSideimage, Tick mark didnt display");
		}

	}

	public void Rear_RH_Door(AndroidDriver<MobileElement> driver, String rear_RH_Door) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {

			helper.clickOnElementByXpath(driver, Rear_RH_Door);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Rear_RH_Door);

		}
		helper.selectMulti(driver, rear_RH_Door);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Rear_RH_Door_tick).isDisplayed()) {
				System.out.println("After Filled Rear_RH_Door, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Rear_RH_Door, Tick mark didnt display");
		}

	}

	public void Wheel_Rear_RH(AndroidDriver<MobileElement> driver, String wheel_Rear_RH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {

			helper.clickOnElementByXpath(driver, Wheel_Rear_RH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Wheel_Rear_RH);

		}
		helper.selectMulti(driver, wheel_Rear_RH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Wheel_Rear_RH_tick).isDisplayed()) {
				System.out.println("After Filled Wheel_Rear_RH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Wheel_Rear_RH, Tick mark didnt display");
		}

	}

	public void Tyre_Rear_RH(AndroidDriver<MobileElement> driver, String tyre_Rear_RH) throws Exception {

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {

			helper.clickOnElementByXpath(driver, Tyre_Rear_RH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Tyre_Rear_RH);

		}

		if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/bubbleSeekbar").isDisplayed()) {
			System.out.println("Tyre life option with slide is displayed inside TyreRearRH");
		} else {
			System.out.println("Tyre life option with slide is not displayed inside TyreRearRH");
		}

		helper.selectMulti(driver, tyre_Rear_RH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Tyre_Rear_RH_tick).isDisplayed()) {
				System.out.println("After Filled Tyre_Rear_RH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Tyre_Rear_RH, Tick mark didnt display");
		}

	}

	public void Tyre_RearRHimage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, Tyre_RearRHimage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Tyre_RearRHimage);

		}

		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);

		try {
			helper.Remarks(driver);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.Remarks(driver);
		}
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Tyre_RearRHimage_tick).isDisplayed()) {
				System.out.println("After Filled Tyre_RearRHimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Tyre_RearRHimage, Tick mark didnt display");
		}
	}

	public void QuarterPanelRH(AndroidDriver<MobileElement> driver, String quarterPanelRH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, QuarterPanelRH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, QuarterPanelRH);

		}
		helper.selectMulti(driver, quarterPanelRH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, QuarterPanelRH_tick).isDisplayed()) {
				System.out.println("After Filled QuarterPanelRH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled QuarterPanelRH, Tick mark didnt display");
		}

	}

	public void TailLightRH(AndroidDriver<MobileElement> driver, String tailLightRH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, TailLightRH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, TailLightRH);

		}
		helper.selectMulti(driver, tailLightRH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, TailLightRH_tick).isDisplayed()) {
				System.out.println("After Filled TailLightRH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled TailLightRH, Tick mark didnt display");
		}
	}

	public void Rearbumper(AndroidDriver<MobileElement> driver, String rearbumper) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, Rearbumper);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Rearbumper);

		}
		helper.selectMulti(driver, rearbumper);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Rearbumper_tick).isDisplayed()) {
				System.out.println("After Filled Rearbumper, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Rearbumper, Tick mark didnt display");
		}

	}

	public void RearSideimage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, RearSideimage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, RearSideimage);

		}
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/imageOne");
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, RearSideimage_tick).isDisplayed()) {
				System.out.println("After Filled RearSideimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RearSideimage, Tick mark didnt display");
		}

	}

	public void Rear_Windshield(AndroidDriver<MobileElement> driver, String rear_Windshield) throws Exception {

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, Rear_Windshield);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Rear_Windshield);

		}
		helper.selectMulti(driver, rear_Windshield);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Rear_Windshield_tick).isDisplayed()) {
				System.out.println("After Filled Rear_Windshield, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Rear_Windshield, Tick mark didnt display");
		}

	}

	public void Trunk(AndroidDriver<MobileElement> driver, String trunk) throws Exception {

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, Trunk);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Trunk);

		}
		helper.selectMulti(driver, trunk);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Trunk_tick).isDisplayed()) {
				System.out.println("After Filled Trunk, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Trunk, Tick mark didnt display");
		}

	}

	public void Dicky(AndroidDriver<MobileElement> driver, String dicky) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, Dicky);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Dicky);

		}
		helper.selectMulti(driver, dicky);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Dicky_tick).isDisplayed()) {
				System.out.println("After Filled Dicky, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Dicky, Tick mark didnt display");
		}

	}

	public void SpareWheel(AndroidDriver<MobileElement> driver, String spareWheel) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, SpareWheel);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, SpareWheel);

		}
		helper.selectMultispare(driver, spareWheel);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, SpareWheel_tick).isDisplayed()) {
				System.out.println("After Filled SpareWheel, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled SpareWheel, Tick mark didnt display");
		}

	}

	public void Sparewheelimage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, Sparewheelimage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Sparewheelimage);

		}
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Sparewheelimage_tick).isDisplayed()) {
				System.out.println("After Filled Sparewheelimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Sparewheelimage, Tick mark didnt display");
		}
	}

	public void ToolKit(AndroidDriver<MobileElement> driver, String toolKit) throws Exception {

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, ToolKit);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, ToolKit);

		}
		helper.selectMulti(driver, toolKit);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, ToolKit_tick).isDisplayed()) {
				System.out.println("After Filled ToolKit, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled ToolKit, Tick mark didnt display");
		}

	}

	public void QuarterPanelLH(AndroidDriver<MobileElement> driver, String quarterPanelLH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, QuarterPanelLH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, QuarterPanelLH);

		}
		helper.selectMulti(driver, quarterPanelLH);

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, QuarterPanelLH_tick).isDisplayed()) {
				System.out.println("After Filled QuarterPanelLH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled QuarterPanelLH, Tick mark didnt display");
		}
	}

	public void Wheel_Rear_LH(AndroidDriver<MobileElement> driver, String wheel_Rear_LH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, Wheel_Rear_LH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Wheel_Rear_LH);

		}
		helper.selectMulti(driver, wheel_Rear_LH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Wheel_Rear_LH_tick).isDisplayed()) {
				System.out.println("After Filled Wheel_Rear_LH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Wheel_Rear_LH, Tick mark didnt display");
		}
	}

	public void TyreRearLH(AndroidDriver<MobileElement> driver, String tyreRearLH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, TyreRearLH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, TyreRearLH);

		}
		if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/bubbleSeekbar").isDisplayed()) {
			System.out.println("Tyre life option with slide is displayed inside TyreRearLH");
		} else {
			System.out.println("Tyre life option with slide is not displayed inside TyreRearLH");
		}
		helper.selectMulti(driver, tyreRearLH);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, TyreRearLH_tick).isDisplayed()) {
				System.out.println("After Filled RCBackCopyimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RCBackCopyimage, Tick mark didnt display");
		}
	}

	public void TyreRearLHimage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, TyreRearLHimage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, TyreRearLHimage);

		}
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, TyreRearLHimage_tick).isDisplayed()) {
				System.out.println("After Filled RCBackCopyimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RCBackCopyimage, Tick mark didnt display");
		}

	}

	public void RearLHDoor(AndroidDriver<MobileElement> driver, String rearLHDoor) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, RearLHDoor);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, RearLHDoor);

		}
		helper.selectMulti(driver, rearLHDoor);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, RearLHDoor_tick).isDisplayed()) {
				System.out.println("After Filled RearLHDoor, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RearLHDoor, Tick mark didnt display");
		}

	}

	public void LHSideimage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, LHSideimage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, LHSideimage);

		}
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, LHSideimage_tick).isDisplayed()) {
				System.out.println("After Filled LHSideimage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled LHSideimage, Tick mark didnt display");
		}

	}

	public void LHSillPanel(AndroidDriver<MobileElement> driver, String LhSillPanel) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, LHSillPanel);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, LHSillPanel);

		}
		helper.selectMulti(driver, LhSillPanel);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, LHSillPanel_tick).isDisplayed()) {
				System.out.println("After Filled LHSillPanel, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled LHSillPanel, Tick mark didnt display");
		}

	}

	public void Front_LH_Door(AndroidDriver<MobileElement> driver, String front_LH_Door) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, Front_LH_Door);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Front_LH_Door);

		}
		helper.selectMulti(driver, front_LH_Door);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Front_LH_Door_tick).isDisplayed()) {
				System.out.println("After Filled Front_LH_Door, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Front_LH_Door, Tick mark didnt display");
		}

	}

	public void Wheel_front_lh(AndroidDriver<MobileElement> driver, String wheel_front_lh) throws Exception {

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, Wheel_front_lh);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Wheel_front_lh);

		}
		helper.selectMulti(driver, wheel_front_lh);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Wheel_front_lh_tick).isDisplayed()) {
				System.out.println("After Filled Wheel_front_lh, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Wheel_front_lh, Tick mark didnt display");
		}
	}

	public void Tyre_Front_LH(AndroidDriver<MobileElement> driver, String tyre_Front_LH) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, Tyre_Front_LH);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Tyre_Front_LH);

		}

		if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/bubbleSeekbar").isDisplayed()) {
			System.out.println("Tyre life option with slide is displayed inside TyreFrontLH");
		} else {
			System.out.println("Tyre life option with slide is not displayed inside TyreFrontLH");
		}

		helper.selectMulti(driver, tyre_Front_LH);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Tyre_Front_LH_tick).isDisplayed()) {
				System.out.println("After Filled Tyre_Front_LH, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Tyre_Front_LH, Tick mark didnt display");
		}
	}

	public void Tyre_Front_LH_image(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, Tyre_Front_LH_image);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver, Tyre_Front_LH_image);
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, Tyre_Front_LH_image_tick).isDisplayed()) {
				System.out.println("After Filled Tyre_Front_LH_image, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Tyre_Front_LH_image, Tick mark didnt display");
		}
	}

	public void LH_Rear_View_Mirror(AndroidDriver<MobileElement> driver, String lh_Rear_View_Mirror) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, LH_Rear_View_Mirror);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, LH_Rear_View_Mirror);

		}
		helper.selectMulti(driver, lh_Rear_View_Mirror);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, LH_Rear_View_Mirror_tick).isDisplayed()) {
				System.out.println("After Filled LH_Rear_View_Mirror, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled LH_Rear_View_Mirror, Tick mark didnt display");
		}

	}

	public void LHFender(AndroidDriver<MobileElement> driver, String LhFender) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, LHFender);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver, LHFender);
		}
		helper.selectMulti(driver, LhFender);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, LHFender_tick).isDisplayed()) {
				System.out.println("After Filled LHFender, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled LHFender, Tick mark didnt display");
		}
	}

	public void LHIndicator(AndroidDriver<MobileElement> driver, String LhIndicator) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, LHIndicator);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, LHIndicator);

		}
		helper.selectMulti(driver, LhIndicator);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, LHIndicator_tick).isDisplayed()) {
				System.out.println("After Filled LHIndicator, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled LHIndicator, Tick mark didnt display");
		}
	}

	public void Roof(AndroidDriver<MobileElement> driver, String roof) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;
		try {
			helper.clickOnElementByXpath(driver, Roof);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, Roof);

		}
		helper.selectMulti(driver, roof);
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Roof_tick).isDisplayed()) {
				System.out.println("After Filled Roof, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Filled Roof, Tick mark didnt display");
		}
	}

	public void RoofImage(AndroidDriver<MobileElement> driver) throws Exception {
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Headlamp support*\"));").click();;

		try {
			helper.clickOnElementByXpath(driver, RoofImage);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, RoofImage);

		}
		// helper.clickOnElementByXpath(driver, "//android.widget.CheckBox[@text='
		// Structural damage']");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		helper.Remarks(driver);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();

		try {
			if (AppiumHelper.FindElementByXpath(driver, RoofImage_tick).isDisplayed()) {
				System.out.println("After Filled RoofImage, Tick mark  displayed");
			}
			// throw new NoSuchElementException ("After Filled RoofImage, Tick mark didnt
			// display");
		} catch (NoSuchElementException e) {
			System.out.println("After Filled RoofImage, Tick mark didnt display");
		}
	}

}
