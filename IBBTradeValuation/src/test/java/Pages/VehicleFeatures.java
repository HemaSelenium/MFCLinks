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
public class VehicleFeatures {
	protected static AppiumHelper helper = new AppiumHelper();
	
	public static String tubelesstyres="//android.widget.TextView[@text='Tubeless tyres*']";
	public static String rearwiper="//android.widget.TextView[@text='Rear Wiper*']";
	public static String stereo="//android.widget.TextView[@text='Stereo*']";
	public static String fmradio="//android.widget.TextView[@text='FM Radio*']";
	public static String airConditioner="//android.widget.TextView[@text='Air conditioner*']";
	public static String rearParkingSensor="//android.widget.TextView[@text='Rear parking sensor*']";
	public static String sunroof="//android.widget.TextView[@text='Sunroof*']";
	public static String seatmatrial="//android.widget.TextView[@text='Seat material*']";
	public static String gpsnavigation="//android.widget.TextView[@text='GPS navigation*']";
	public static String reardefogger="//android.widget.TextView[@text='Rear defogger*']";
	public static String bluetoothIntegratedAudioSystem="//android.widget.TextView[@text='Bluetooth integrated audio system*']";
	public static String alloyWheels="//android.widget.TextView[@text='Alloy wheels*']";
	public static String transmission="//android.widget.TextView[@text='Transmission *']";
	public static String Remark="//android.widget.TextView[@text='Remarks']//following-sibling::android.widget.EditText";
	
	public static String Done = "com.mahindra.ibbtrade_pro:id/button_done";
	
	public void tubelesstyres(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, tubelesstyres);
			helper.selectMulti_features(driver, strings);
	
	}
	
	
	public void rearwiper(AndroidDriver<MobileElement> driver, String strings) throws Exception {
				helper.clickOnElementByXpath(driver, rearwiper);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void stereo(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, stereo);
	
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void fmradio(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, fmradio);
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void airConditioner(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, airConditioner);
	
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void rearParkingSensor(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, rearParkingSensor);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void Sunsroof(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, sunroof);
		
		helper.selectMulti_features(driver, strings);
	
	}
	
	public void SeatMaterial(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, seatmatrial);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void gpsNavigation(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
		helper.clickOnElementByXpath(driver, gpsnavigation);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void rearDefogger(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, reardefogger);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void bluetoothIntegratedAudioSystem(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		
			helper.clickOnElementByXpath(driver, bluetoothIntegratedAudioSystem);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void alloyWheels(AndroidDriver<MobileElement> driver, String strings) throws Exception {
	
			helper.clickOnElementByXpath(driver, alloyWheels);
		
		helper.selectMulti_features(driver, strings);
		
	}
	
	public void transmission(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		helper.clickOnElementByXpath(driver, transmission);
		helper.selectMulti_features(driver, strings);
		
	}
	
	
public void Remarks(AndroidDriver<MobileElement> driver) throws Exception {
		try {
		AppiumHelper.FindElementByXpath(driver,Remark).click();}
		catch(NoSuchElementException e) {
			helper.scrollUp(driver);
		}
		
		
		AppiumHelper.FindElementByXpath(driver,Remark).sendKeys("Remarks in vehicle feature section");
	}
	
	




}
