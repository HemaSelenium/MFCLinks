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
public class FeaturesUsecases extends BaseClass{
	@Test(priority = 1, dataProvider = "VehicleFeatures", dataProviderClass = DataProviders.class)
	public void VehFeatures(String tubelesstyres, String rearwiper, String stereo, String fmradio,
			String airConditioner, String rearParkingSensor, String Sunsroof, String SeatMaterial, String gpsNavigation,
			String rearDefogger, String bluetoothIntegratedAudioSystem, String alloyWheels, String transmission)
			throws Exception {
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, Documents.Features);

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
}
