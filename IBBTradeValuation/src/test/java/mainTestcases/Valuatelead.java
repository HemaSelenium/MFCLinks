/**
 * 
 */
package mainTestcases;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Pages.Documents;
import common.AppiumHelper;
import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
@Listeners(common.Listeners.class)
public class Valuatelead extends BaseClass {
	
	@Test(priority = 1,dataProvider = "BasicDetails", dataProviderClass = DataProviders.class)
public void basicDetails(String InspectiionType,String Newcardelaership,String Selectnewcardealership,String Newcardealershiifothers,String Newcarexecutive,String CustomerName,String Customermobilenumber,String Customeraddress,String customeremailid,String Manufacturingyear,String Make,String Model,String Variant,String Registered,String Registeredyear,String Ownershipnumber,String registrationstate,String Regcity, String Fuel,String Transmisssion,String BodyType,String Vehicleusage,String vehlelength,String customerprice,String Enginecc,String ccclass, String enginenumber,String chassinumber,String seat,String color,String odometerworking,String odometerreading,String accidental,String warrantyremaining,String numberofmonthsremaining,String numberofkmsremaining,String generalremarks) throws Exception {

		
		int mfgYear=Integer.parseInt(Manufacturingyear);
	//	System.err.println(mfgYear);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/mainBut1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/valuateNow");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		basicDetails.inspectionType(driver, InspectiionType);
		basicDetails.NewCarDealership(driver, Newcardelaership, Selectnewcardealership, Newcardealershiifothers, Newcarexecutive);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		
		
		
		if (AppiumHelper.FindElementById(driver, Documents.Documents).isDisplayed()) {
			System.err.println("When Registration year is given lessthan the Manfacture year , basic details got submitted and allowed the user to next step");
				
		}else {
			System.out.println("When Registration year is given lessthan the Manfacture year , not allowed the user to next step");
		}

	

	}

	@Test(priority = 4, dataProvider = "Documents", dataProviderClass = DataProviders.class)
	public void Documents(String rc, String insurance, String Insurancecompany, String hypothecation,
			String hypothecatedbank, String hypothecationclosed, String nocAvailable, String form35available,
			String duplicatekey) throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.Documents);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.RC(driver, rc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.Insurance(driver, insurance, Insurancecompany);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.Hypothecation(driver, hypothecation, hypothecatedbank, hypothecationclosed, nocAvailable,
				form35available);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// document.Form35Available(driver, form35available);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		document.Duplicatekey(driver, duplicatekey);
		basicDetails.Submit(driver);

	}

	@Test(priority = 3, dataProvider = "Testdrive", dataProviderClass = DataProviders.class)
	public void TestDrive(String engine, String clutchsystem, String Transmission) throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.testDrive);

		testdrive.Engine(driver, engine);
		testdrive.clutchSystem(driver, clutchsystem);
		testdrive.Transmission(driver, Transmission);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}

	@Test(priority = 2, dataProvider = "UnderBody", dataProviderClass = DataProviders.class)
	public void underBody(String underBodyFlooring, String SteeringSystem, String suspensionsystem,
			String transmissionAndBrakes, String FuelAndEmission, String Muffler) throws Exception {
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

	@Test(priority = 5, dataProvider = "UnderTheHood", dataProviderClass = DataProviders.class)
	public void Underhood(String ApronValue, String battery, String Radiator, String Accondenser, String coolingfan,
			String engineoil, String mastercylinder, String Others) throws Exception {
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

	@Test(priority = 6, dataProvider = "VehicleFeatures", dataProviderClass = DataProviders.class)
	public void VehFeatures(String tubelesstyres, String rearwiper, String stereo, String fmradio,
			String airConditioner, String rearParkingSensor, String Sunsroof, String SeatMaterial, String gpsNavigation,
			String rearDefogger, String bluetoothIntegratedAudioSystem, String alloyWheels, String transmission)
			throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.testDrive);

		vehfeatures.tubelesstyres(driver, tubelesstyres);
		vehfeatures.rearwiper(driver, rearwiper);
		vehfeatures.stereo(driver, stereo);
		vehfeatures.fmradio(driver, fmradio);
		vehfeatures.airConditioner(driver, airConditioner);
		vehfeatures.rearParkingSensor(driver, rearParkingSensor);
		vehfeatures.Sunsroof(driver, Sunsroof);
		vehfeatures.SeatMaterial(driver, SeatMaterial);
		vehfeatures.gpsNavigation(driver, gpsNavigation);
		vehfeatures.rearDefogger(driver, rearDefogger);
		vehfeatures.bluetoothIntegratedAudioSystem(driver, bluetoothIntegratedAudioSystem);
		vehfeatures.alloyWheels(driver, alloyWheels);
		vehfeatures.transmission(driver, transmission);
		vehfeatures.Remarks(driver);
		basicDetails.Submit(driver);

		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}

	@Test(priority = 7, dataProvider = "Interior", dataProviderClass = DataProviders.class)
	public void Interior(String dashboardcondition, String windowcentralcontrol, String windowlockcentral,
			String handbrake, String seatMovement, String key, String combinationSwitch, String steeringwheelMovement,
			String outsiderearviewmirrors, String internalrearviewmirrors, String others, String seatcondition)
			throws Exception {
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

	@Test(priority = 8, dataProvider = "Exterior", dataProviderClass = DataProviders.class)
	public void EXteriors(String HeadLamp, String firewall, String frontbumper, String frontGrill, String bonnet,
			String headlights, String foglamps, String rHIndicator, String rHFender, String rHRear, String wheel,
			String tyreFrontRH, String frontRHDoor, String rHSillPanel, String rear_RH_Door, String wheel_Rear_RH,
			String tyre_Rear_RH, String quarterPanelRH, String tailLightRH, String rearbumper, String rear_Windshield,
			String trunk, String dicky, String spareWheel, String toolKit, String quarterPanelLH, String wheel_Rear_LH,
			String tyreRearLH, String rearLHDoor, String lhSillPanel, String front_LH_Door, String wheel_front_lh,
			String tyre_Front_LH, String lh_Rear_View_Mirror, String LhFender, String LhIndicator, String roof)
			throws Exception {
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
		Exteriors.RoofImage(driver);
		basicDetails.Submit(driver);
		// helper.clickOnElementByXpath(driver, Documents.Submit);

	}

}
