/**
 * 
 */
package mainTestcases;

import org.testng.annotations.Test;

import Pages.Documents;
import Pages.Documents_PrefillAndEdit;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class DirectValuation_Documents extends BaseClass{
	Valuatelead BDetails=new Valuatelead();
	Documents_PrefillAndEdit documents=new Documents_PrefillAndEdit();
	@Test(priority = 1,dataProvider = "BasicDetails", dataProviderClass = DataProviders.class)
	public void basicDetails(String InspectiionType,String Newcardelaership,String Selectnewcardealership,String Newcardealershiifothers,String Newcarexecutive,String CustomerName,String Customermobilenumber,String Customeraddress,String customeremailid,String Manufacturingyear,String Make,String Model,String Variant,String Registered,String Registeredyear,String Ownershipnumber,String registrationstate,String Regcity, String Fuel,String Transmisssion,String BodyType,String Vehicleusage,String vehlelength,String customerprice,String Enginecc,String ccclass, String enginenumber,String chassinumber,String seat,String color,String odometerworking,String odometerreading,String accidental,String warrantyremaining,String numberofmonthsremaining,String numberofkmsremaining,String generalremarks) throws Exception {
		BDetails.BasicDetails(InspectiionType, Newcardelaership, Selectnewcardealership, Newcardealershiifothers, Newcarexecutive, CustomerName, Customermobilenumber, Customeraddress, customeremailid, Manufacturingyear, Make, Model, Variant, Registered, Registeredyear, Ownershipnumber, registrationstate, Regcity, Fuel, Transmisssion, BodyType, Vehicleusage, vehlelength, customerprice, Enginecc, ccclass, enginenumber, chassinumber, seat, color, odometerworking, odometerreading, accidental, warrantyremaining, numberofmonthsremaining, numberofkmsremaining, generalremarks);
	}
	
	
	

	@Test(priority = 2, dataProvider = "Documents", dataProviderClass = DataProviders.class)
	public void document(String rc, String insurance, String Insurancecompany, String hypothecation,
			String hypothecatedbank, String hypothecationclosed, String nocAvailable, String form35available,
			String duplicatekey) throws Exception {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.Documents);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.RC(driver, rc);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.Insurance(driver, insurance, Insurancecompany);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.Hypothecation(driver, hypothecation, hypothecatedbank, hypothecationclosed, nocAvailable,
				form35available);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// document.Form35Available(driver, form35available);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.Duplicatekey(driver, duplicatekey);
		basicDetails.Submit(driver);

	}
	@Test(priority = 3, dataProvider = "Documents", dataProviderClass = DataProviders.class)
	public void AfterSubmitdocumentDetails(String rc, String insurance, String Insurancecompany, String hypothecation,
			String hypothecatedbank, String hypothecationclosed, String nocAvailable, String form35available,
			String duplicatekey) throws Exception {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.Documents);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		documents.RC(driver, rc);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		documents.Insurance(driver, insurance, Insurancecompany);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		documents.Hypothecation(driver, hypothecation, hypothecatedbank, hypothecationclosed, nocAvailable,
				form35available);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// document.Form35Available(driver, form35available);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		documents.Duplicatekey(driver, duplicatekey);
		basicDetails.Submit(driver);

	}}
