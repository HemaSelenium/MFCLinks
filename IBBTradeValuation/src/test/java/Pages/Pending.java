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
public class Pending {
	public static String Brand="com.mahindra.ibbtrade_pro:id/CarName";
	public static String RegNumber="com.mahindra.ibbtrade_pro:id/pendingregno";
	public static String ModelYear="com.mahindra.ibbtrade_pro:id/model_year";
	public static String Model="com.mahindra.ibbtrade_pro:id/model_name";
	public static String Variant="com.mahindra.ibbtrade_pro:id/car_varient";
	public static String City="com.mahindra.ibbtrade_pro:id/cityName";
	public static String ManfYear="com.mahindra.ibbtrade_pro:id/year";
	public static String KMS="com.mahindra.ibbtrade_pro:id/distance_covered";

	
	public void Make(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("Brand is displayed as: "+AppiumHelper.FindElementById(driver, Brand).getText());
		}catch(NoSuchElementException e){
			System.out.println("Brand is not displayed");
		}
	}
	
	
	public static String RegNumber(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("RegNumber is displayed as: "+AppiumHelper.FindElementById(driver, RegNumber).getText().split(":")[1]);
		
		}catch(NoSuchElementException e){
			System.out.println("RegNumber is not displayed");
		}
		return AppiumHelper.FindElementById(driver, RegNumber).getText().split(":")[1];
	}
	public void ModelYear(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("ModelYear is displayed as: "+AppiumHelper.FindElementById(driver, ModelYear).getText());
		}catch(NoSuchElementException e){
			System.out.println("ModelYear is not displayed");
		}
	}
	
	public void ModelName(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("Model is displayed as: "+AppiumHelper.FindElementById(driver, Model).getText());
		}catch(NoSuchElementException e){
			System.out.println("Model is not displayed");
		}
	}
	public void Variant(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("Variant is displayed as: "+AppiumHelper.FindElementById(driver, Variant).getText());
		}catch(NoSuchElementException e){
			System.out.println("Variant is not displayed");
		}
	}
	public void City(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("City is displayed as: "+AppiumHelper.FindElementById(driver, City).getText());
		}catch(NoSuchElementException e){
			System.out.println("City is not displayed");
		}
	}
	public void ManfYear(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("ManfYear is displayed as: "+AppiumHelper.FindElementById(driver, ManfYear).getText());
		}catch(NoSuchElementException e){
			System.out.println("ManfYear is not displayed");
		}
	}
	public void KMS(AndroidDriver<MobileElement> driver) {
		try {
			System.out.println("KMS is displayed as: "+AppiumHelper.FindElementById(driver, KMS).getText());
		}catch(NoSuchElementException e){
			System.out.println("KMS is not displayed");
		}
	}
	
}
