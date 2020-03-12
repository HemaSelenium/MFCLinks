/**
 * 
 */
package mainTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Documents;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class TestDriveUseCases extends BaseClass{
	@Test(priority = 3, dataProvider = "Testdrive", dataProviderClass = DataProviders.class)
	public void TestDrive(String engine, String clutchsystem, String Transmission) throws Exception {
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.testDrive);
		testdrive.Engine(driver, engine);
		testdrive.clutchSystem(driver, clutchsystem);
		testdrive.Transmission(driver, Transmission);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	@Test(priority = 3, dataProvider = "Testdrive", dataProviderClass = DataProviders.class)
	public void TestDrive_afterEdit(String engine, String clutchsystem, String Transmission) throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.testDrive);
		testdrive.Engine(driver, engine);
		testdrive.clutchSystem(driver, clutchsystem);
		testdrive.Transmission(driver, Transmission);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
}
