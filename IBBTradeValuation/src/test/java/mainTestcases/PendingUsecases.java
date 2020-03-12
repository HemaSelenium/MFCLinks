/**
 * 
 */
package mainTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import Pages.Documents;
import Pages.Pending;
import common.AppiumHelper;
import common.BaseClass;

/**
 * @author Hema Sumanjali
 *
 */
public class PendingUsecases extends BaseClass {

	@Test
	public void pendingcases() throws Exception {
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pending.Make(driver);
		pending.ModelYear(driver);
		pending.ModelName(driver);
		pending.Variant(driver);
		String regnumber = pending.RegNumber(driver);
		pending.City(driver);
		pending.ManfYear(driver);
		pending.KMS(driver);
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (AppiumHelper.FindElementById(driver, Documents.Documents).isDisplayed()) {
			System.out.println(
					"When clicked on Completed report in Pending section, page is navigated to dashboard which is as expected.");

		} else {
			System.err.println(
					"When clicked on Completed report in Pending section, page is not navigated to dashboard which is not as expected.");
		}

		helper.clickOnElementByXpath(driver, HomePage.Hambergermenu);
		helper.clickOnElementByXpath(driver, HomePage.logout);
		helper.login(driver, Username, Password);
		helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			
			AppiumHelper.FindElementByXpath(driver, "//com.mahindra.ibbtrade_pro:id/pending_Lead_ListView//following-sibling::android.view.ViewGroup");
			String regnumber2 = Pending.RegNumber(driver);

			if (regnumber.equalsIgnoreCase(regnumber2)) {
				System.out.println(
						"the lead in pending section of one valuator is geting displayed in other valuator login");
			} else {
				System.out.println(
						"the lead in pending section of one valuator is not geting displaed in other valuator login");
			}

		} catch (NoSuchElementException e) {

			System.out.println("there are no Pending Reports in the second valuator");
		}

	}

}
