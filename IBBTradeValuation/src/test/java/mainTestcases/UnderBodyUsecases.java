/**
 * 
 */
package mainTestcases;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Pages.Documents;
import Pages.UnderBody_PrefillAndEdit;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class UnderBodyUsecases extends BaseClass{
	UnderBody_PrefillAndEdit UnderBody_afterEdit=new UnderBody_PrefillAndEdit();
	@Test(priority = 1, dataProvider = "UnderBody", dataProviderClass = DataProviders.class)
	public void underBody(String underBodyFlooring, String SteeringSystem, String suspensionsystem,
			String transmissionAndBrakes, String FuelAndEmission, String Muffler) throws Exception {
		
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.UnderBody);

		underbody.underBodyFlooring(driver, underBodyFlooring);
		underbody.steeringSystem(driver, SteeringSystem);
		underbody.underBodyfrontimage(driver);
		underbody.underBodyrearimage(driver);
		underbody.suspensionSystem(driver, suspensionsystem);
		underbody.transmissionAndBrakes(driver, transmissionAndBrakes);
		underbody.fuelAndemission(driver, FuelAndEmission);
		underbody.mufler(driver, Muffler);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	@Test(priority = 2, dataProvider = "UnderBody", dataProviderClass = DataProviders.class)
	public void underBody_afterEdit(String underBodyFlooring, String SteeringSystem, String suspensionsystem,
			String transmissionAndBrakes, String FuelAndEmission, String Muffler) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.UnderBody);

		UnderBody_afterEdit.underBodyFlooring(driver, underBodyFlooring);
		UnderBody_afterEdit.steeringSystem(driver, SteeringSystem);
		UnderBody_afterEdit.underBodyfrontimage(driver);
		UnderBody_afterEdit.underBodyrearimage(driver);
		UnderBody_afterEdit.suspensionSystem(driver, suspensionsystem);
		UnderBody_afterEdit.transmissionAndBrakes(driver, transmissionAndBrakes);
		UnderBody_afterEdit.fuelAndemission(driver, FuelAndEmission);
		UnderBody_afterEdit.mufler(driver, Muffler);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);
	}
	
	
}
