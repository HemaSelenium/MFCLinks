/**
 * 
 */
package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import common.AppiumHelper;
import common.DataProviders;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import mainTestcases.HomePage;

/**
 * @author Hema Sumanjali
 *
 */
public class Underthehood_prefillAndEdit {
	protected static AppiumHelper helper = new AppiumHelper();
	public static String ApronLHImage = "//android.widget.TextView[@text='Apron LH Image']";
	public static String ApronRHImage = "//android.widget.TextView[@text='Apron RH Image']";
	public static String Battery = "//android.widget.TextView[@text='Battery*']";
	public static String EngineCompartment = "//android.widget.TextView[@text='Engine compartment image']";
	public static String Radiator = "//android.widget.TextView[@text='Radiator/Engine coolant*']";
	public static String ACCondenser = "//android.widget.TextView[@text='AC condenser*']";
	public static String Coolingfan = "//android.widget.TextView[@text='Cooling fan*']";
	public static String Engineoil = "//android.widget.TextView[@text='Engine oil*']";
	public static String MasterCylinder = "//android.widget.TextView[@text='Master Cylinder/Booster*']";
	public static String Others = "//android.widget.TextView[@text='Others*']";
	public static String EngineTappet = "//android.widget.TextView[@text='Engine Tappet Video']";
	
	public static String ApronLHImage_tick = "//android.widget.TextView[@text='Apron LH Image']//following-sibling::android.widget.ImageView";
	public static String ApronRHImage_tick = "//android.widget.TextView[@text='Apron RH Image']//following-sibling::android.widget.ImageView";
	public static String Battery_tick = "//android.widget.TextView[@text='Battery*']//following-sibling::android.widget.ImageView";
	public static String EngineCompartment_tick = "//android.widget.TextView[@text='Engine compartment image']//following-sibling::android.widget.ImageView";
	public static String Radiator_tick = "//android.widget.TextView[@text='Radiator/Engine coolant*']//following-sibling::android.widget.ImageView";
	public static String ACCondenser_tick = "//android.widget.TextView[@text='AC condenser*']//following-sibling::android.widget.ImageView";
	public static String Coolingfan_tick = "//android.widget.TextView[@text='Cooling fan*']//following-sibling::android.widget.ImageView";
	public static String Engineoil_tick = "//android.widget.TextView[@text='Engine oil*']//following-sibling::android.widget.ImageView";
	public static String MasterCylinder_tick = "//android.widget.TextView[@text='Master Cylinder/Booster*']//following-sibling::android.widget.ImageView";
	public static String Others_tick = "//android.widget.TextView[@text='Others*']//following-sibling::android.widget.ImageView";
	public static String EngineTappet_tick = "//android.widget.TextView[@text='Engine Tappet Video']//following-sibling::android.widget.ImageView";
	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";

	public void Battery(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, Battery);
			
		helper.selectMulti_aftersubmit(driver, strings);
	//	helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		//helper.captureimageTwo(driver);
		//helper.captureimageThree(driver);
		//helper.captureimageFour(driver);

		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Battery_tick).isDisplayed()) {
				System.out.println("After Edited Battery, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited Battery, Tick mark didnt display");
		}
	}

	
	public void ApronLHImage(AndroidDriver<MobileElement> driver) throws Exception {

	
			helper.clickOnElementByXpath(driver, ApronLHImage);
	

		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, ApronLHImage_tick).isDisplayed()) {
				System.out.println("After Edited ApronLHImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited ApronLHImage, Tick mark didnt display");
		}
	}
	public void ApronRHImage(AndroidDriver<MobileElement> driver) throws Exception {

		
			helper.clickOnElementByXpath(driver, ApronRHImage);
		
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, ApronRHImage_tick).isDisplayed()) {
				System.out.println("After Edited ApronRHImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited ApronRHImage, Tick mark didnt display");
		}
	}
	
	
	
	
	
	
	public void EngineCompartmentImage(AndroidDriver<MobileElement> driver) throws Exception {

					helper.clickOnElementByXpath(driver, EngineCompartment);
		
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, EngineCompartment_tick).isDisplayed()) {
				System.out.println("After Edited EngineCompartmentImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited EngineCompartmentImage, Tick mark didnt display");
		}
	}

	public void RadiatorEngineCoolant(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, Radiator);
		
		helper.selectMulti_aftersubmit(driver, strings);
		//helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Radiator_tick).isDisplayed()) {
				System.out.println("After Edited RadiatorEngineCoolant, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited RadiatorEngineCoolant, Tick mark didnt display");
		}

	}

	public void ACCondenser(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
		helper.clickOnElementByXpath(driver, ACCondenser);
		helper.selectMulti_aftersubmit(driver, strings);
		//helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, ACCondenser_tick).isDisplayed()) {
				System.out.println("After Edited ACCondenser, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited ACCondenser, Tick mark didnt display");
		}

	}

	public void CoolingFan(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
		helper.clickOnElementByXpath(driver, Coolingfan);
		helper.selectMulti_aftersubmit(driver, strings);
		//helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Coolingfan_tick).isDisplayed()) {
				System.out.println("After Edited CoolingFan, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited CoolingFan, Tick mark didnt display");
		}

	}

	public void EngineOil(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
		helper.clickOnElementByXpath(driver, Engineoil);
		helper.selectMulti_aftersubmit(driver, strings);
		//helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Engineoil_tick).isDisplayed()) {
				System.out.println("After Edited EngineOil, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited EngineOil, Tick mark didnt display");
		}
	}

	public void MasterCylinder(AndroidDriver<MobileElement> driver, String strings) throws Exception {
					helper.clickOnElementByXpath(driver, MasterCylinder);
		
		helper.selectMulti_aftersubmit(driver, strings);
		//helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, MasterCylinder_tick).isDisplayed()) {
				System.out.println("After Edited MasterCylinder, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited MasterCylinder, Tick mark didnt display");
		}

	}

	public void others(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, Others);
		
		helper.selectMulti_aftersubmit(driver, strings);
	//	helper.selectMulti(driver, strings);
		helper.captureimageone(driver);
		helper.Remarks(driver);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
		try {
			if (AppiumHelper.FindElementByXpath(driver, Others_tick).isDisplayed()) {
				System.out.println("After Edited others, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After Edited others, Tick mark didnt display");
		}

	}

	
	public void video_afteredit(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/play_video").isDisplayed()) {
				System.out.println("after submitted video, play video button is displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("after submitted video, play video button is displayed");
		}
		
        helper.clickOnElementByXpath(driver, EngineTappet);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"DONE\"));")
		.click();
		helper.GetToastMessage(driver);		
		

	}
	
	
	
}

