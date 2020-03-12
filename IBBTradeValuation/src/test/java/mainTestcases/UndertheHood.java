/**
 * 
 */
package mainTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Documents;
import Pages.Underthehood_prefillAndEdit;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class UndertheHood extends BaseClass{
	Underthehood_prefillAndEdit underhood_edit=new Underthehood_prefillAndEdit();
	@Test(priority = 1, dataProvider = "UnderTheHood", dataProviderClass = DataProviders.class)
	public void Underhood(String ApronValue, String battery, String Radiator, String Accondenser, String coolingfan,
			String engineoil, String mastercylinder, String Others) throws Exception {
		
		
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		
		
		// helper.selectMulti(driver,ApronValue);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// underhood
		helper.clickOnElementByID(driver, Documents.Underthehood);
		Exteriors.apron(driver, ApronValue);
		UndertheHood.ApronLHImage(driver);
		UndertheHood.ApronRHImage(driver);

		UndertheHood.Battery(driver, battery);
		UndertheHood.EngineCompartmentImage(driver);
		UndertheHood.RadiatorEngineCoolant(driver, Radiator);
		UndertheHood.ACCondenser(driver, Accondenser);
		UndertheHood.CoolingFan(driver, coolingfan);
		UndertheHood.EngineOil(driver, engineoil);
		UndertheHood.MasterCylinder(driver, mastercylinder);
		UndertheHood.others(driver, Others);
		UndertheHood.video(driver);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	@Test(priority = 2, dataProvider = "UnderTheHood", dataProviderClass = DataProviders.class)
	public void Underhood_afterEdited(String ApronValue, String battery, String Radiator, String Accondenser, String coolingfan,
			String engineoil, String mastercylinder, String Others) throws Exception {
		
		
	//	helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
	//	helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// helper.selectMulti(driver,ApronValue);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// underhood
		helper.clickOnElementByID(driver, Documents.Underthehood);
		Exteriors.apron_aftersubmit(driver, ApronValue);
		underhood_edit.ApronLHImage(driver);
		underhood_edit.ApronRHImage(driver);

		underhood_edit.Battery(driver, battery);
		underhood_edit.EngineCompartmentImage(driver);
		underhood_edit.RadiatorEngineCoolant(driver, Radiator);
		underhood_edit.ACCondenser(driver, Accondenser);
		underhood_edit.CoolingFan(driver, coolingfan);
		underhood_edit.EngineOil(driver, engineoil);
		underhood_edit.MasterCylinder(driver, mastercylinder);
		underhood_edit.others(driver, Others);
		underhood_edit.video_afteredit(driver);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	
	
}
