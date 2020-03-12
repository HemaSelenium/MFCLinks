/**
 * 
 */
package mainTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Documents;
import Pages.Documents_PrefillAndEdit;
import Pages.Exteriors_prefillAndEdit;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class ExteriersUsecases extends BaseClass{
	Valuatelead BDetails=new Valuatelead();
	Documents_PrefillAndEdit documents=new Documents_PrefillAndEdit();
	Exteriors_prefillAndEdit exteriors=new Exteriors_prefillAndEdit();
	
	@Test(priority = 1, dataProvider = "Exterior", dataProviderClass = DataProviders.class)
	public void EXteriors(String HeadLamp, String firewall, String frontbumper, String frontGrill, String bonnet,
			String headlights, String foglamps, String rHIndicator, String rHFender, String rHRear, String wheel,
			String tyreFrontRH, String frontRHDoor, String rHSillPanel, String rear_RH_Door, String wheel_Rear_RH,
			String tyre_Rear_RH, String quarterPanelRH, String tailLightRH, String rearbumper, String rear_Windshield,
			String trunk, String dicky, String spareWheel, String toolKit, String quarterPanelLH, String wheel_Rear_LH,
			String tyreRearLH, String rearLHDoor, String lhSillPanel, String front_LH_Door, String wheel_front_lh,
			String tyre_Front_LH, String lh_Rear_View_Mirror, String LhFender, String LhIndicator, String roof)
			throws Exception {
		
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// helper.selectMulti(driver,ApronValue);
		helper.clickOnElementByID(driver, Documents.Exterior);
		//
		// Exteriors.odometerimagecapture(driver);
		Exteriors.Headlamp(driver, HeadLamp);
		Exteriors.Firewall(driver, firewall);
		Exteriors.Frontbumper(driver, frontbumper);
		Exteriors.FrontGrill(driver, frontGrill);
		Exteriors.Frontsideimage(driver);
		Exteriors.Bonnet(driver, bonnet);
		Exteriors.Headlights(driver, headlights);
		Exteriors.Foglamps(driver, foglamps);
		Exteriors.RHIndicator(driver, rHIndicator);
		Exteriors.RHFender(driver, rHFender);
		Exteriors.RHRear(driver, rHRear);
		Exteriors.Wheel(driver, wheel);
		Exteriors.TyreFrontRH(driver, tyreFrontRH);
		Exteriors.Tyre_Front_RH_image(driver);
		Exteriors.FrontRHDoor(driver, frontRHDoor);
		Exteriors.RHSillPanel(driver, rHSillPanel);
		Exteriors.RHSideimage(driver);
		Exteriors.Rear_RH_Door(driver, rear_RH_Door);
		Exteriors.Wheel_Rear_RH(driver, wheel_Rear_RH);
		Exteriors.Tyre_Rear_RH(driver, tyre_Rear_RH);
		Exteriors.Tyre_RearRHimage(driver);
		Exteriors.QuarterPanelRH(driver, quarterPanelRH);
		Exteriors.TailLightRH(driver, tailLightRH);
		Exteriors.Rearbumper(driver, rearbumper);
		Exteriors.RearSideimage(driver);
		Exteriors.Rear_Windshield(driver, rear_Windshield);
		Exteriors.Trunk(driver, trunk);
		Exteriors.Dicky(driver, dicky);
		Exteriors.SpareWheel(driver, spareWheel);
		Exteriors.Sparewheelimage(driver);
		Exteriors.ToolKit(driver, toolKit);
		Exteriors.QuarterPanelLH(driver, quarterPanelLH);
		Exteriors.Wheel_Rear_LH(driver, wheel_Rear_LH);
		Exteriors.TyreRearLH(driver, tyreRearLH);
		Exteriors.TyreRearLHimage(driver);
		Exteriors.RearLHDoor(driver, rearLHDoor);
		Exteriors.LHSideimage(driver);
		Exteriors.LHSillPanel(driver, lhSillPanel);
		Exteriors.Front_LH_Door(driver, front_LH_Door);
		Exteriors.Wheel_front_lh(driver, wheel_front_lh);
		Exteriors.Tyre_Front_LH(driver, tyre_Front_LH);
		Exteriors.Tyre_Front_LH_image(driver);
		Exteriors.LH_Rear_View_Mirror(driver, lh_Rear_View_Mirror);
		Exteriors.LHFender(driver, LhFender);
		Exteriors.LHIndicator(driver, LhIndicator);
		Exteriors.Roof(driver, roof);
		
	//	Exteriors.RHFender(driver, rHFender);
		Exteriors.RoofImage(driver);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	@Test(priority = 2, dataProvider = "Exterior", dataProviderClass = DataProviders.class)
	public void EXteriors_aftersubmitted(String HeadLamp, String firewall, String frontbumper, String frontGrill, String bonnet,
			String headlights, String foglamps, String rHIndicator, String rHFender, String rHRear, String wheel,
			String tyreFrontRH, String frontRHDoor, String rHSillPanel, String rear_RH_Door, String wheel_Rear_RH,
			String tyre_Rear_RH, String quarterPanelRH, String tailLightRH, String rearbumper, String rear_Windshield,
			String trunk, String dicky, String spareWheel, String toolKit, String quarterPanelLH, String wheel_Rear_LH,
			String tyreRearLH, String rearLHDoor, String lhSillPanel, String front_LH_Door, String wheel_front_lh,
			String tyre_Front_LH, String lh_Rear_View_Mirror, String LhFender, String LhIndicator, String roof)
			throws Exception {
		
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// helper.selectMulti(driver,ApronValue);
		helper.clickOnElementByID(driver, Documents.Exterior);
		//
		// Exteriors.odometerimagecapture(driver);
		exteriors.Headlamp(driver, HeadLamp);
		exteriors.Firewall(driver, firewall);
		exteriors.Frontbumper(driver, frontbumper);
		exteriors.FrontGrill(driver, frontGrill);
		exteriors.Frontsideimage(driver);
		exteriors.Bonnet(driver, bonnet);
		exteriors.Headlights(driver, headlights);
		exteriors.Foglamps(driver, foglamps);
		exteriors.RHIndicator(driver, rHIndicator);
		exteriors.RHFender(driver, rHFender);
		exteriors.RHRear(driver, rHRear);
		exteriors.Wheel(driver, wheel);
		exteriors.TyreFrontRH(driver, tyreFrontRH);
		exteriors.Tyre_Front_RH_image(driver);
		exteriors.FrontRHDoor(driver, frontRHDoor);
		exteriors.RHSillPanel(driver, rHSillPanel);
		exteriors.RHSideimage(driver);
		exteriors.Rear_RH_Door(driver, rear_RH_Door);
		exteriors.Wheel_Rear_RH(driver, wheel_Rear_RH);
		exteriors.Tyre_Rear_RH(driver, tyre_Rear_RH);
		exteriors.Tyre_RearRHimage(driver);
		exteriors.QuarterPanelRH(driver, quarterPanelRH);
		exteriors.TailLightRH(driver, tailLightRH);
		exteriors.Rearbumper(driver, rearbumper);
		exteriors.RearSideimage(driver);
		exteriors.Rear_Windshield(driver, rear_Windshield);
		exteriors.Trunk(driver, trunk);
		exteriors.Dicky(driver, dicky);
		exteriors.SpareWheel(driver, spareWheel);
		exteriors.Sparewheelimage(driver);
		exteriors.ToolKit(driver, toolKit);
		exteriors.QuarterPanelLH(driver, quarterPanelLH);
		exteriors.Wheel_Rear_LH(driver, wheel_Rear_LH);
		exteriors.TyreRearLH(driver, tyreRearLH);
		exteriors.TyreRearLHimage(driver);
		exteriors.RearLHDoor(driver, rearLHDoor);
		exteriors.LHSideimage(driver);
		exteriors.LHSillPanel(driver, lhSillPanel);
		exteriors.Front_LH_Door(driver, front_LH_Door);
		exteriors.Wheel_front_lh(driver, wheel_front_lh);
		exteriors.Tyre_Front_LH(driver, tyre_Front_LH);
		exteriors.Tyre_Front_LH_image(driver);
		exteriors.LH_Rear_View_Mirror(driver, lh_Rear_View_Mirror);
		exteriors.LHFender(driver, LhFender);
		exteriors.LHIndicator(driver, LhIndicator);
		exteriors.Roof(driver, roof);
		
	//	exteriors.RHFender(driver, rHFender);
		exteriors.RoofImage(driver);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}
	
}
