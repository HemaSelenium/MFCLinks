/**
 * 
 */
package mainTestcases;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Pages.Documents;
import Pages.interior_prefillAndEdit;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class InterioruseCases extends BaseClass{
	interior_prefillAndEdit Interior_afterEdit=new interior_prefillAndEdit();
	
	@Test(priority = 1, dataProvider = "Interior", dataProviderClass = DataProviders.class)
	public void Interior(String dashboardcondition, String windowcentralcontrol, String windowlockcentral,
			String handbrake, String seatMovement, String key, String combinationSwitch, String steeringwheelMovement,
			String outsiderearviewmirrors, String internalrearviewmirrors, String others, String seatcondition)
			throws Exception {
		
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.Interior);
		interiors.Odometerimage(driver);
		interiors.dashboardCondition(driver, dashboardcondition);
		interiors.Dashboardimage(driver);
		interiors.windowcentralcontrol(driver, windowcentralcontrol);
		interiors.windowlockcentral(driver, windowlockcentral);
		interiors.handbrake(driver, handbrake);
		interiors.handbrakeAndgearlever(driver);
		interiors.upholsteryfrontImage(driver);
		interiors.upholsteryrearImage(driver);
		interiors.seatMovement(driver, seatMovement);
		interiors.key(driver, key);
		interiors.combinationSwitch(driver, combinationSwitch);
		interiors.steeringwheelMovement(driver, steeringwheelMovement);
		interiors.outsiderearviewmirrors(driver, outsiderearviewmirrors);
		interiors.internalrearviewmirrors(driver, internalrearviewmirrors);
		interiors.others(driver, others);
		interiors.seatcondition(driver, seatcondition);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	@Test(priority = 2, dataProvider = "Interior", dataProviderClass = DataProviders.class)
	public void Interior_AfterSubmit(String dashboardcondition, String windowcentralcontrol, String windowlockcentral,
			String handbrake, String seatMovement, String key, String combinationSwitch, String steeringwheelMovement,
			String outsiderearviewmirrors, String internalrearviewmirrors, String others, String seatcondition)
			throws Exception {
		
		//helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		//helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.Interior);
		Interior_afterEdit.Odometerimage(driver);
		Interior_afterEdit.dashboardCondition(driver, dashboardcondition);
		Interior_afterEdit.Dashboardimage(driver);
		Interior_afterEdit.windowcentralcontrol(driver, windowcentralcontrol);
		Interior_afterEdit.windowlockcentral(driver, windowlockcentral);
		Interior_afterEdit.handbrake(driver, handbrake);
		Interior_afterEdit.handbrakeAndgearlever(driver);
		Interior_afterEdit.upholsteryfrontImage(driver);
		Interior_afterEdit.upholsteryrearImage(driver);
		Interior_afterEdit.seatMovement(driver, seatMovement);
		Interior_afterEdit.key(driver, key);
		Interior_afterEdit.combinationSwitch(driver, combinationSwitch);
		Interior_afterEdit.steeringwheelMovement(driver, steeringwheelMovement);
		Interior_afterEdit.outsiderearviewmirrors(driver, outsiderearviewmirrors);
		Interior_afterEdit.internalrearviewmirrors(driver, internalrearviewmirrors);
		Interior_afterEdit.others(driver, others);
		Interior_afterEdit.seatcondition(driver, seatcondition);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	
	
	
	
	
	
	
}
