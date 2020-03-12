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
public class UnderTheHood {
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
			helper.selectMulti(driver, strings);
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, Battery_tick).isDisplayed()) {
				System.out.println("After filled Battery, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled Battery, Tick mark didnt display");
		}
	}

	
	public void ApronLHImage(AndroidDriver<MobileElement> driver) throws Exception {
			helper.clickOnElementByXpath(driver, ApronLHImage);
			
		
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, ApronLHImage_tick).isDisplayed()) {
				System.out.println("After filled ApronLHImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled ApronLHImage, Tick mark didnt display");
		}
	}
	public void ApronRHImage(AndroidDriver<MobileElement> driver) throws Exception {

	
			helper.clickOnElementByXpath(driver, ApronRHImage);
	
		try {
			if (AppiumHelper.FindElementByXpath(driver, ApronRHImage_tick).isDisplayed()) {
				System.out.println("After filled ApronRHImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled ApronRHImage, Tick mark didnt display");
		}
	}
	
	
	
	
	
	
	public void EngineCompartmentImage(AndroidDriver<MobileElement> driver) throws Exception {

	
			helper.clickOnElementByXpath(driver, EngineCompartment);
	
		try {
			if (AppiumHelper.FindElementByXpath(driver, EngineCompartment_tick).isDisplayed()) {
				System.out.println("After filled EngineCompartmentImage, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled EngineCompartmentImage, Tick mark didnt display");
		}
	}

	public void RadiatorEngineCoolant(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, Radiator);
		
		helper.selectMulti(driver, strings);
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, Radiator_tick).isDisplayed()) {
				System.out.println("After filled RadiatorEngineCoolant, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled RadiatorEngineCoolant, Tick mark didnt display");
		}

	}

	public void ACCondenser(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, ACCondenser);
		
		helper.selectMulti(driver, strings);
		
		
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, ACCondenser_tick).isDisplayed()) {
				System.out.println("After filled ACCondenser, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled ACCondenser, Tick mark didnt display");
		}

	}

	public void CoolingFan(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, Coolingfan);
		
		helper.selectMulti(driver, strings);
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, Coolingfan_tick).isDisplayed()) {
				System.out.println("After filled CoolingFan, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled CoolingFan, Tick mark didnt display");
		}

	}

	public void EngineOil(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, Engineoil);
		
		helper.selectMulti(driver, strings);
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, Engineoil_tick).isDisplayed()) {
				System.out.println("After filled EngineOil, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled EngineOil, Tick mark didnt display");
		}
	}

	public void MasterCylinder(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, MasterCylinder);
		
		helper.selectMulti(driver, strings);
		
		
		
		try {
			if (AppiumHelper.FindElementByXpath(driver, MasterCylinder_tick).isDisplayed()) {
				System.out.println("After filled MasterCylinder, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled MasterCylinder, Tick mark didnt display");
		}

	}

	public void others(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, Others);
		
		helper.selectMulti(driver, strings);
		
		
		
				
		try {
			if (AppiumHelper.FindElementByXpath(driver, Others_tick).isDisplayed()) {
				System.out.println("After filled others, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled others, Tick mark didnt display");
		}

	}

	public void video(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, EngineTappet);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"DONE\"));")
		.click();
		helper.GetToastMessage(driver);		
	
	}

	public void VideoRecordButton_validation(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/record_video");
			helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/btnCapture");
			Thread.sleep(32000);
						
			}
			catch(NoSuchElementException e) {
				System.out.println("unable to find Record / capture video button");
			}
	}
	
	public void progressbar_validation(AndroidDriver<MobileElement> driver) {
		try {
			if(AppiumHelper.FindElementById(driver, "android:id/progress").isDisplayed()) {
				System.out.println("After captured video , progress bar is displayed");
						
			}		}
			catch(NoSuchElementException e) {
			System.out.println("After uploaded captured video , progress bar is not displayed");
			}
	}
	
	
	
	public void playbutton_validation(AndroidDriver<MobileElement> driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/play_video").isDisplayed()) {
				System.out.println("After captured video, play video button is displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After captured video, play video button is not displayed");
		}

	}
	
	
	
	
	
	
	
	
	
	
}
