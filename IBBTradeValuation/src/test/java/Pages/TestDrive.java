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
public class TestDrive {

	protected static AppiumHelper helper = new AppiumHelper();
	
	public static String Engine="//android.widget.TextView[@text='Engine*']";
	public static String clutchSystem="//android.widget.TextView[@text='Clutch system*']";
	public static String transmission="//android.widget.TextView[@text='Transmission *']";
	
	public static String Engine_tick="//android.widget.TextView[@text='Engine*']//following-sibling::android.widget.ImageView";
	public static String clutchSystem_tick="//android.widget.TextView[@text='Clutch system*']//following-sibling::android.widget.ImageView";
	public static String transmission_tick="//android.widget.TextView[@text='Transmission *']//following-sibling::android.widget.ImageView";
	
	
	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";
	public void Engine(AndroidDriver<MobileElement> driver, String engine) throws Exception {
			helper.clickOnElementByXpath(driver, Engine);
			helper.selectMulti(driver, engine);
			try {
			if (AppiumHelper.FindElementByXpath(driver, Engine_tick).isDisplayed()) {
				System.out.println("After filled Engine, Tick mark  displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After filled Engine, Tick mark didnt display");
		}
	}
public void clutchSystem(AndroidDriver<MobileElement> driver, String clutchsystem) throws Exception {
	
		helper.clickOnElementByXpath(driver, clutchSystem);
		helper.selectMulti(driver, clutchsystem);
	 		try {
		if (AppiumHelper.FindElementByXpath(driver, clutchSystem_tick).isDisplayed()) {
			System.out.println("After filled clutchSystem, Tick mark  displayed");
		}
	} catch (NoSuchElementException e) {
		System.out.println("After filled clutchSystem, Tick mark didnt display");
	}
	}
public void Transmission(AndroidDriver<MobileElement> driver, String Transmission) throws Exception {
	helper.clickOnElementByXpath(driver, transmission);
	helper.selectMulti(driver, Transmission);
	try {
		if (AppiumHelper.FindElementByXpath(driver, transmission_tick).isDisplayed()) {
			System.out.println("After filled transmission, Tick mark  displayed");
		}
	} catch (NoSuchElementException e) {
		System.out.println("After filled transmission, Tick mark didnt display");
	}
}
	

}
