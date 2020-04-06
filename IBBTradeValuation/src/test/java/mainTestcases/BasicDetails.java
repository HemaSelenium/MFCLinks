/**
 * 
 */
package mainTestcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import Pages.Documents;
import common.AppiumHelper;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class BasicDetails extends BaseClass{
	@Test(priority = 1,dataProvider = "BasicDetails", dataProviderClass = DataProviders.class)
	public void basicDetails(String InspectiionType,String Newcardelaership,String Selectnewcardealership,String Newcardealershiifothers,String Newcarexecutive,String CustomerName,String Customermobilenumber,String Customeraddress,String customeremailid,String Manufacturingyear,String Make,String Model,String Variant,String Registered,String Registeredyear,String Ownershipnumber,String registrationstate,String Regcity, String Fuel,String Transmisssion,String BodyType,String Vehicleusage,String vehlelength,String customerprice,String Enginecc,String ccclass, String enginenumber,String chassinumber,String seat,String color,String odometerworking,String odometerreading,String accidental,String warrantyremaining,String numberofmonthsremaining,String numberofkmsremaining,String generalremarks) throws Exception {

		
		int mfgYear=Integer.parseInt(Manufacturingyear);
	//	System.err.println(mfgYear);
		try {
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/mainBut1");
		}
		catch(NoSuchElementException e) {
			System.out.println("Assigned button is not present in active screen");
		}
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/valuateNow");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		basicDetails.inspectionType(driver, InspectiionType);
		basicDetails.sjdfkjsj(driver, Newcardelaership, Selectnewcardealership, Newcardealershiifothers, Newcarexecutive);
		//basicDetails.NewCarDealership(driver, Newcardelaership, Selectnewcardealership, Newcardealershiifothers, Newcarexecutive);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		basicDetails.CustomerName(driver, CustomerName);
		basicDetails.Mobilenumber(driver, Customermobilenumber);
		basicDetails.Address(driver, Customeraddress);
		basicDetails.CustomerEmail(driver, customeremailid);
		basicDetails.Leadcreationdate(driver);
		basicDetails.Manufactureyear(driver, Manufacturingyear);
		basicDetails.Make(driver, Make);
		basicDetails.Model(driver, Model);
		basicDetails.Variant(driver, Variant);
		basicDetails.Registered(driver, Registered);
		basicDetails.Registeredyear(driver,Integer.toString(mfgYear-2));
		basicDetails.RegNumber(driver);
		basicDetails.Ownership(driver, Ownershipnumber);
		basicDetails.Regstate(driver, registrationstate);
		basicDetails.Regcity(driver, Regcity);
		basicDetails.Fuel(driver, Fuel);
		basicDetails.Transmission(driver, Transmisssion);
		basicDetails.BodyType(driver, BodyType);
		basicDetails.VehicleUsage(driver, Vehicleusage);
		basicDetails.Vehiclelength(driver, vehlelength);
		basicDetails.CustomerPrice(driver, customerprice);
		basicDetails.EngineCC(driver, Enginecc);
		basicDetails.CCclass(driver, ccclass);
		basicDetails.EngineNumber(driver, enginenumber);
		basicDetails.ChassisNumber(driver, chassinumber);
		basicDetails.Seat(driver, seat);
		basicDetails.Color(driver, color);
		basicDetails.Odometer(driver, odometerworking);
		basicDetails.OdometerReading(driver, odometerreading);
		basicDetails.Accidental(driver, accidental);
		basicDetails.WarrantyRemaining(driver, warrantyremaining,numberofmonthsremaining,numberofkmsremaining);
		basicDetails.GeneralRemarks(driver, generalremarks);
		basicDetails.Submit(driver);
		
		try {
		if (AppiumHelper.FindElementById(driver, Documents.Documents).isDisplayed()) {
			System.out.println("After submit the Basic Details, page is not redirected dashboard");
				
		}
		}
		catch(NoSuchElementException e) {
			System.err.println("After submit the Basic Details, page is not redirected dashboard");
		}
	}

}
