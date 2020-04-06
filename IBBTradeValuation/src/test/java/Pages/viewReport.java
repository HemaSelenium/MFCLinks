/**
 * 
 */
package Pages;

import common.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class viewReport extends BaseClass{
	protected static Pending pending= new Pending();
	public void report(AndroidDriver<MobileElement> driver) {
			
	
	pending.Make(driver);
	pending.ModelYear(driver);
	pending.ModelName(driver);
	pending.Variant(driver);
	String regnumber = Pending.RegNumber(driver);
	pending.City(driver);
	pending.ManfYear(driver);
	pending.KMS(driver);
	
	
	}
	
}
