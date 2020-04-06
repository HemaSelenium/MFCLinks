/**
 * 
 */
package Pages;

import java.awt.List;
import java.io.PrintWriter;
import java.util.Arrays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.google.common.collect.ImmutableMap;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class BasicDetails {

	protected static AppiumHelper helper = new AppiumHelper();

	public void inspectionType(AndroidDriver<MobileElement> driver, String InspectioType) throws Exception {
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Inspection Type*']");
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + InspectioType + "']");

	}

	public void NewCarDealership(AndroidDriver<MobileElement> driver, String Newcardelaership,
			String Selectnewcardealership, String Newcardealershiifothers, String Newcarexecutive) throws Exception {

		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='New Car Dealership*']");
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Newcardelaership + "']");
		if (Newcardelaership.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Select New Car Dealership']//following-sibling::android.widget.TextView");

			try {
				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='NO DATA']")
						.isDisplayed()) {
					System.out.println("No NCD Details are avialble to select");
					driver.navigate().back();
					//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					helper.clickOnElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Dealership(if others)']//following-sibling::android.widget.EditText");
					AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Dealership(if others)']//following-sibling::android.widget.EditText")
							.sendKeys(Newcardealershiifothers);
					AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Executive']//following-sibling::android.widget.EditText")
							.sendKeys(Newcarexecutive);

					// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='New Car
					// Dealership(if others)']//following-sibling::android.widget.EditText",
					// Newcardealershiifothers);
					// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='New Car
					// Executive']//following-sibling::android.widget.EditText", Newcarexecutive);
				} else {
					helper.clickOnElementByXpath(driver,
							"//android.widget.TextView[@text='" + Selectnewcardealership + "']");
					AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Dealership(if others)']//following-sibling::android.widget.EditText")
							.sendKeys(Newcardealershiifothers);
					AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Executive']//following-sibling::android.widget.EditText")
							.sendKeys(Newcarexecutive);
				}

			} catch (NoSuchElementException e) {

				java.util.List<MobileElement> listofNCDDealers = driver
						.findElementById("com.mahindra.ibbtrade_pro:id/list_view")
						.findElementsByClassName("android.widget.LinearLayout");

				System.out.println(listofNCDDealers.size());

				System.out.println("Selected NCD dealer : " + listofNCDDealers.get(0)
						.findElementById("com.mahindra.ibbtrade_pro:id/list_item_text").getText());

				listofNCDDealers.get(0).findElementById("com.mahindra.ibbtrade_pro:id/list_item_text").click();

			}

		} else {

		}

	}
	
	
	public void sjdfkjsj(AndroidDriver<MobileElement> driver, String Newcardelaership,
			String Selectnewcardealership, String Newcardealershiifothers, String Newcarexecutive) throws Exception {
try {
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='New Car Dealership*']");
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Newcardelaership + "']");
			
			
				if(Newcardelaership.equalsIgnoreCase("Yes")) {
					helper.clickOnElementByXpath(driver,
							"//android.widget.TextView[@text='Select New Car Dealership']//following-sibling::android.widget.TextView");
					try {
					if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='NO DATA']")
							.isDisplayed()) {
						System.out.println("No NCD Details are avialble to select");
						driver.navigate().back();
						
					}}
					catch (NoSuchElementException e) {

						java.util.List<MobileElement> listofNCDDealers = driver
								.findElementById("com.mahindra.ibbtrade_pro:id/list_view")
								.findElementsByClassName("android.widget.LinearLayout");

						System.out.println(listofNCDDealers.size());

						System.out.println("Selected NCD dealer : " + listofNCDDealers.get(0)
								.findElementById("com.mahindra.ibbtrade_pro:id/list_item_text").getText());

						listofNCDDealers.get(0).findElementById("com.mahindra.ibbtrade_pro:id/list_item_text").click();

					}

					helper.clickOnElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Dealership(if others)']//following-sibling::android.widget.EditText");
					AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Dealership(if others)']//following-sibling::android.widget.EditText")
							.sendKeys(Newcardealershiifothers);
					AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='New Car Executive']//following-sibling::android.widget.EditText")
							.sendKeys(Newcarexecutive);
				}
				else {
					helper.clickOnElementByXpath(driver,
							"//android.widget.TextView[@text='Select New Car Dealership']//following-sibling::android.widget.TextView");
					helper.clickOnElementByXpath(driver,
							"//android.widget.TextView[@text='" + Selectnewcardealership + "']");
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("");
			}
			
			
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void CustomerName(AndroidDriver<MobileElement> driver, String CustomerName) throws Exception {
		// Customer name
		try {
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Customer Name*']");
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Name*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Customer name field is not prefilled");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Customer Name*']//following-sibling::android.widget.EditText")
						.sendKeys(CustomerName);
				/*
				 * helper.SendkeysByXpath(driver,
				 * "//android.widget.TextView[@text='Customer Name*']//following-sibling::android.widget.EditText"
				 * , CustomerName);
				 */
			} else {
				System.out.println("Customer name field is prefilled");
			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Customer Name*']");
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Name*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Customer name field is not prefilled");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Customer Name*']//following-sibling::android.widget.EditText")
						.sendKeys(CustomerName);

			} else {
				System.out.println("Customer name field is prefilled");

			}
		}

	}

	public void Mobilenumber(AndroidDriver<MobileElement> driver, String Mobilenumber) throws Exception {
		// Mobilenumber
		try {
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Customer Mobile No*']");
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Mobile No*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("MobileNumber field is not prefilled");
				AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='Customer Mobile No*']//following-sibling::android.widget.EditText")
						.sendKeys(Mobilenumber);
				// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Customer
				// Mobile No*']", Mobilenumber);
			} else {
				System.out.println("MobileNumber field is prefilled");
			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Customer Mobile No*']");
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Mobile No*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("MobileNumber field is not prefilled");
				AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='Customer Mobile No*']//following-sibling::android.widget.EditText")
						.sendKeys(Mobilenumber);
			} else {
				System.out.println("MobileNumber field is prefilled");
			}
		}
	}

	public void Address(AndroidDriver<MobileElement> driver, String Customeraddress) throws Exception {
		// Customer Address
		try {
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Address']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Address']//following-sibling::android.widget.EditText")
					.sendKeys(Customeraddress);

		}

		catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Address']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Address']//following-sibling::android.widget.EditText")
					.sendKeys(Customeraddress);
		}
	}

	public void CustomerEmail(AndroidDriver<MobileElement> driver, String customeremailid) throws Exception {
		// customer email id
		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Email Id']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Email Id']//following-sibling::android.widget.EditText")
					.clear();
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Email Id']//following-sibling::android.widget.EditText")
					.sendKeys(customeremailid);
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Email Id']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Email Id']//following-sibling::android.widget.EditText")
					.clear();
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Email Id']//following-sibling::android.widget.EditText")
					.sendKeys(customeremailid);
		}
	}

	public void Leadcreationdate(AndroidDriver<MobileElement> driver) throws Exception {
		// Leadcreationdate
		try {

			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Lead Creation']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Lead creation date field is not prefilled");
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Lead Creation']");
				helper.clickOnElementByID(driver, "android:id/button1");
			} else {
				System.out.println("Lead creation date field is prefilled");
			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Lead Creation']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Lead creation date field is not prefilled");
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Lead Creation']");
				helper.clickOnElementByID(driver, "android:id/button1");
			} else {
				System.out.println("Lead creation date field is prefilled");
			}
		}
	}

	public void Manufactureyear(AndroidDriver<MobileElement> driver, String Manufacturingyear) throws Exception {
		// Manufactureyear
		try {

			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Manufacturing Year*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()) {
				System.out.println("Manufacture year field is not prefilled");
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Manufacturing Year*']");
				helper.ScrollToViewElement(driver, Manufacturingyear);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Manufacturingyear + "']");
			} else {
				System.out.println("Manufacture year field is prefilled");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Manufacturing Year*']//following-sibling::android.widget.TextView")
						.click();
				// helper.clickOnElementByXpath(driver,
				// "//android.widget.TextView[@text='Manufacturing Year*']");
				helper.ScrollToViewElement(driver, Manufacturingyear);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Manufacturingyear + "']");

			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Manufacturing Year*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()) {
				System.out.println("Manufacture year field is not prefilled");
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Manufacturing Year*']");
				helper.ScrollToViewElement(driver, Manufacturingyear);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Manufacturingyear + "']");
			} else {
				System.out.println("Manufacture year field is prefilled");
			}
		}
	}

	public void Make(AndroidDriver<MobileElement> driver, String Make) throws Exception {
		// Make
		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView")
							.getText().equals("select Make")) {
				System.out.println("Make field is not prefilled / field value is resetted");
				AppiumHelper
						.FindElementByXpath(driver,
								"//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView")
						.click();

				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").click();
				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Make);
				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='" + Make + "']")
						.isDisplayed()) {
					System.out.println("Searched value is displayed");
				} else {
					System.out.println("Searched value is not displayed");
				}

				helper.ScrollToViewElement(driver, Make);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Make + "']");

			} else {
				System.out.println("Make field is prefilled");

				/*
				 * AppiumHelper .FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView"
				 * ).click();
				 * 
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").click();
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Make);
				 * if(AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Make+"']").isDisplayed()){
				 * System.out.println("Searched value is displayed"); } else {
				 * System.out.println("Searched value is not displayed"); }
				 * 
				 * helper.ScrollToViewElement(driver, Make);
				 * helper.clickOnElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Make+"']");
				 */

			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView")
							.getText().equals("select Make")) {
				System.out.println("Make field is not prefilled / field value is resetted\"");
				AppiumHelper
						.FindElementByXpath(driver,
								"//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView")
						.click();
				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='" + Make + "']")
						.isDisplayed()) {
					System.out.println("Searched value is displayed");
				} else {
					System.out.println("Searched value is not displayed");
				}
				helper.ScrollToViewElement(driver, Make);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Make + "']");

			} else {
				System.out.println("Make field is prefilled");

				/*
				 * AppiumHelper .FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='Make*']//following-sibling::android.widget.TextView"
				 * ).click();
				 * 
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").click();
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Make);
				 * if(AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Make+"']").isDisplayed()){
				 * System.out.println("Searched value is displayed"); } else {
				 * System.out.println("Searched value is not displayed "); }
				 * 
				 * helper.ScrollToViewElement(driver, Make);
				 * helper.clickOnElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Make+"']");
				 */

			}
		}
	}

	public void Model(AndroidDriver<MobileElement> driver, String Model) throws Exception {

		// Model
		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView")
							.getText().equals("select Model")) {
				System.out.println("Model field is not prefilled / field value is resetted\"");
				AppiumHelper
						.FindElementByXpath(driver,
								"//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView")
						.click();

				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").click();
				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Model);
				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='" + Model + "']")
						.isDisplayed()) {
					System.out.println("Searched value is displayed");
				} else {
					System.out.println("Searched value is not displayed");
				}
				helper.ScrollToViewElement(driver, Model);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Model + "']");

			} else {
				System.out.println("Model field is prefilled");

				/*
				 * AppiumHelper .FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView"
				 * ).click(); AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").click();
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Model);
				 * if(AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Model+"']").isDisplayed()){
				 * System.out.println("Searched value is displayed"); } else {
				 * System.out.println("Searched value is not displayed"); }
				 * helper.ScrollToViewElement(driver, Model);
				 * helper.clickOnElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Model+"']");
				 */
			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView")
							.getText().equals("select Model")) {
				System.out.println("Model field is not prefilled / field value is resetted\"");
				AppiumHelper
						.FindElementByXpath(driver,
								"//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView")
						.click();

				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").click();
				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Model);
				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='" + Model + "']")
						.isDisplayed()) {
					System.out.println("Searched value is displayed");
				} else {
					System.out.println("Searched value is not displayed");
				}
				helper.ScrollToViewElement(driver, Model);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Model + "']");

			} else {
				System.out.println("Model field is prefilled");

				/*
				 * AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='Model*']//following-sibling::android.widget.TextView"
				 * ).click();
				 * 
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").click();
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Model);
				 * if(AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Model+"']").isDisplayed()){
				 * System.out.println("Searched value is displayed"); } else {
				 * System.out.println("Searched value is not displayed"); }
				 * helper.ScrollToViewElement(driver, Model);
				 * helper.clickOnElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Model+"']");
				 */

			}
		}
	}

	public void Variant(AndroidDriver<MobileElement> driver, String Variant) throws Exception {
		// Variant

		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView")
							.getText().contains("select")) {
				System.out.println("Variant field is not prefilled / field value is resetted\"");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView")
						.click();

				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").click();
				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Variant);
				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='" + Variant + "']")
						.isDisplayed()) {
					System.out.println("Searched value is displayed");
				} else {
					System.out.println("Searched value is not displayed");
				}
				helper.ScrollToViewElement(driver, Variant);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Variant + "']");

			} else {
				System.out.println("Variant field is prefilled");
				/*
				 * AppiumHelper .FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView"
				 * ).click();
				 * 
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").click();
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Variant);
				 * if(AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Variant+"']").isDisplayed()){
				 * System.out.println("Searched value is displayed"); } else {
				 * System.out.println("Searched value is not displayed"); }
				 * helper.ScrollToViewElement(driver, Variant);
				 * helper.clickOnElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Variant+"']");
				 */

			}

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView")
							.getText().equals("select Varient")) {
				System.out.println("Variant field is not prefilled / field value is resetted");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView")
						.click();
				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").click();
				AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Variant);

				if (AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='" + Variant + "']")
						.isDisplayed()) {
					System.out.println("Searched value is displayed");
				} else {
					System.out.println("Searched value is not displayed");
				}
				helper.ScrollToViewElement(driver, Variant);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Variant + "']");

			} else {
				System.out.println("Variant field is prefilled");
				/*
				 * AppiumHelper .FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='Variant*']//following-sibling::android.widget.TextView"
				 * ).click(); AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").click();
				 * AppiumHelper.FindElementById(driver,
				 * "com.mahindra.ibbtrade_pro:id/searchBar").sendKeys(Variant);
				 * if(AppiumHelper.FindElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Variant+"']").isDisplayed()){
				 * System.out.println("Searched value is displayed"); } else {
				 * System.out.println("Searched value is not displayed"); }
				 * helper.ScrollToViewElement(driver, Variant);
				 * helper.clickOnElementByXpath(driver,
				 * "//android.widget.TextView[@text='"+Variant+"']");
				 */
			}
		}
	}

	public void Registered(AndroidDriver<MobileElement> driver, String Registered) throws Exception {
		// Registered

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Registered*']");
			helper.ScrollToViewElement(driver, Registered);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Registered + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Registered*']");
			helper.ScrollToViewElement(driver, Registered);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Registered + "']");
		}
	}

	public void Registeredyear(AndroidDriver<MobileElement> driver, String Registeredyear) throws Exception {
		// Registeredyear
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Registered year*']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Registered year*']");
			helper.ScrollToViewElement(driver, Registeredyear);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Registeredyear + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Registered year*']");
			helper.ScrollToViewElement(driver, Registeredyear);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Registeredyear + "']");
		}

	}

	public void RegNumber(AndroidDriver<MobileElement> driver) throws Exception {
		// RegNumber
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Registration Number']");

		try {
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Registration Number']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Registration Number field is not prefilled");

				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Registration Number']");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Registration Number']//following-sibling::android.widget.EditText")
						.sendKeys("AP123456");
				// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Registration
				// Number']//following-sibling::android.widget.EditText", "");

			} else {
				System.out.println("Registration Number field is prefilled");
			}

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Registration Number']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Registration Number field is not prefilled");

				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Registration Number']");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Registration Number']//following-sibling::android.widget.EditText")
						.sendKeys("AP123456");
			} else {
				System.out.println("Registration Number field is prefilled");
			}
		}

	}

	public void Ownership(AndroidDriver<MobileElement> driver, String Ownershipnumber) throws Exception {
		// Ownership
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Ownership Number*']");

		try {
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Ownership Number*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Ownership Number* field is not prefilled");

				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Ownership Number*']");
				helper.SendkeysByXpath(driver,
						"//android.widget.TextView[@text='Ownership Number*']//following-sibling::android.widget.EditText",
						Ownershipnumber);

			} else {
				System.out.println("Ownership Number* field is prefilled");
			}

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Ownership Number*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Ownership Number* field is not prefilled");

				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Ownership Number*']");
				helper.SendkeysByXpath(driver,
						"//android.widget.TextView[@text='Ownership Number*']//following-sibling::android.widget.EditText",
						Ownershipnumber);
			} else {
				System.out.println("Ownership Number* field is prefilled");
			}
		}
	}

	public void Regstate(AndroidDriver<MobileElement> driver, String registrationstate) throws Exception {
		// Regstate

		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Registration State(if not registered enter
		// valuation state and city)*']");
		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Registration State*']//following-sibling::android.widget.TextView");
			helper.ScrollToViewElement(driver, registrationstate);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + registrationstate + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Registration State*']//following-sibling::android.widget.TextView");
			helper.ScrollToViewElement(driver, registrationstate);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + registrationstate + "']");
		}
	}

	public void Regcity(AndroidDriver<MobileElement> driver, String Regcity) throws Exception {
		// Regcity
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Registration City*']");
		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Registration City*']//following-sibling::android.widget.TextView");
			helper.ScrollToViewElement(driver, Regcity);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Regcity + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Registration City*']//following-sibling::android.widget.TextView");
			helper.ScrollToViewElement(driver, Regcity);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Regcity + "']");

		}

	}

	public void Fuel(AndroidDriver<MobileElement> driver, String Fuel) throws Exception {
		// Fuel
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Fuel*']");

		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Fuel*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Fuel);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Fuel + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Fuel*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Fuel);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Fuel + "']");
		}

	}

	public void Transmission(AndroidDriver<MobileElement> driver, String Transmisssion) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Transmission*']");

		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Transmission*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Transmisssion);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Transmisssion + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Transmission*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Transmisssion);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Transmisssion + "']");
		}

	}

	public void BodyType(AndroidDriver<MobileElement> driver, String BodyType) throws Exception {
		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Body
		// Type*']");
		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Body Type*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, BodyType);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + BodyType + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Body Type*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, BodyType);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + BodyType + "']");
		}

	}

	public void VehicleUsage(AndroidDriver<MobileElement> driver, String Vehicleusage) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Vehicle Usage*']");

		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Vehicle Usage*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Vehicleusage);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Vehicleusage + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Vehicle Usage*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Vehicleusage);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Vehicleusage + "']");
		}

	}

	public void Vehiclelength(AndroidDriver<MobileElement> driver, String vehlelength) throws Exception {

		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Vehicle length*']");

		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Vehicle length*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, vehlelength);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + vehlelength + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Vehicle length*']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, vehlelength);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + vehlelength + "']");
		}
	}

	public void CustomerPrice(AndroidDriver<MobileElement> driver, String customerprice) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Customer Price*']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Customer Price*']");
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Price*']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Price*']//following-sibling::android.widget.EditText")
					.clear();
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Price*']//following-sibling::android.widget.EditText")
					.sendKeys(customerprice);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Customer
			// Price*']//following-sibling::android.widget.EditText", "12");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			// helper.clickOnElementByXpath(driver,
			// "//android.widget.TextView[@text='Customer Price*']");
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Price*']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Price*']//following-sibling::android.widget.EditText")
					.clear();
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Customer Price*']//following-sibling::android.widget.EditText")
					.sendKeys(customerprice);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Customer
			// Price*']//following-sibling::android.widget.EditText", "12");

		}
	}

	public void EngineCC(AndroidDriver<MobileElement> driver, String Enginecc) throws Exception {
		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine
		// CC*']");
		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine CC*']");
			AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Engine CC*']//following-sibling::android.widget.EditText")
					.sendKeys(Enginecc);
			// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine
			// CC*']//following-sibling::android.widget.EditText");
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Engine
			// CC*']//following-sibling::android.widget.EditText", "12");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine CC*']");
			AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Engine CC*']//following-sibling::android.widget.EditText")
					.sendKeys(Enginecc);
			// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine
			// CC*']//following-sibling::android.widget.EditText");
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Engine
			// CC*']//following-sibling::android.widget.EditText", "12");
		}
	}

	public void CCclass(AndroidDriver<MobileElement> driver, String ccclass) throws Exception {
		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='CC
		// class']");
		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='CC class']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, ccclass);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + ccclass + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='CC class']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, ccclass);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + ccclass + "']");
		}
	}

	public void EngineNumber(AndroidDriver<MobileElement> driver, String enginenumber) throws Exception {
		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine
		// Number']");
		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine Number']");
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Engine Number']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Engine Number']//following-sibling::android.widget.EditText")
					.sendKeys(enginenumber);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Engine
			// Number']//following-sibling::android.widget.EditText", "12");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Engine Number']");
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Engine Number']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Engine Number']//following-sibling::android.widget.EditText")
					.sendKeys(enginenumber);
		}

	}

	public void ChassisNumber(AndroidDriver<MobileElement> driver, String chassinumber) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Chassis Number']");
		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Chassis Number']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Chassis Number']//following-sibling::android.widget.EditText");

			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Chassis Number']//following-sibling::android.widget.EditText")
					.sendKeys(chassinumber);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Chassis
			// Number']//following-sibling::android.widget.EditText", "12");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Chassis Number']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Chassis Number']//following-sibling::android.widget.EditText");

			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Chassis Number']//following-sibling::android.widget.EditText")
					.sendKeys(chassinumber);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Chassis
			// Number']//following-sibling::android.widget.EditText", "12");
		}
	}

	public void Seat(AndroidDriver<MobileElement> driver, String Seat) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Seat']");

		try {

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Seat']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, Seat);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Seat + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Seat']//following-sibling::android.widget.EditText");
			helper.ScrollToViewElement(driver, "2");
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Seat + "']");
		}
	}

	public void Color(AndroidDriver<MobileElement> driver, String Color) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Color*']");

		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Color*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()| AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Color*']//following-sibling::android.widget.EditText")
					.getText().equalsIgnoreCase("Select color")) {
				System.out.println("Color field is not prefilled");
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Color*']");
				helper.ScrollToViewElement(driver, Color);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Color + "']");

			} else {
				System.out.println("Color field is prefilled");
			}

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Color*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()| AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Color*']//following-sibling::android.widget.EditText")
					.getText().equalsIgnoreCase("Select color")) {
				System.out.println("Color field is not prefilled");
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Color*']");
				helper.ScrollToViewElement(driver, Color);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Color + "']");

			} else {
				System.out.println("Color field is prefilled");
			}
		}

	}

	public void Odometer(AndroidDriver<MobileElement> driver, String Odometer) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Odometer working']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Odometer working']");
			helper.ScrollToViewElement(driver, Odometer);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Odometer + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Odometer working']");
			helper.ScrollToViewElement(driver, Odometer);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Odometer + "']");
		}

	}

	public void OdometerReading(AndroidDriver<MobileElement> driver, String OdometerReading) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Odometer Reading']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Odometer Reading']");
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Odometer Reading']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Odometer Reading field is not prefilled");
				helper.clickOnElementByXpath(driver,
						"//android.widget.TextView[@text='Odometer Reading']//following-sibling::android.widget.EditText");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Odometer Reading']//following-sibling::android.widget.EditText")
						.sendKeys(OdometerReading);
				// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Odometer
				// Reading']//following-sibling::android.widget.EditText", "12");
			} else {
				System.out.println("Odometer Reading field is prefilled");
			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Odometer Reading']");
			if (AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Odometer Reading']//following-sibling::android.widget.EditText")
					.getText().isEmpty()) {
				System.out.println("Odometer Reading field is not prefilled");
				helper.clickOnElementByXpath(driver,
						"//android.widget.TextView[@text='Odometer Reading']//following-sibling::android.widget.EditText");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Odometer Reading']//following-sibling::android.widget.EditText")
						.sendKeys(OdometerReading);
				// helper.SendkeysByXpath(driver, "\"//android.widget.TextView[@text='Odometer
				// Reading']//following-sibling::android.widget.EditText", "12");
			} else {
				System.out.println("Odometer Reading field is prefilled");
			}
		}

	}

	public void Accidental(AndroidDriver<MobileElement> driver, String Accidental) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Accidental']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Accidental']");
			helper.ScrollToViewElement(driver, Accidental);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Accidental + "']");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Accidental']");
			helper.ScrollToViewElement(driver, Accidental);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Accidental + "']");

		}

	}

	public void WarrantyRemaining(AndroidDriver<MobileElement> driver, String WarrantyRemaining,
			String Numberofmonthsremaining, String NumberofKmsRemaining) throws Exception {
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.TextView[@text='Warranty Remaining*']");
		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='OEM Warranty remaining*']");
			helper.ScrollToViewElement(driver, WarrantyRemaining);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + WarrantyRemaining + "']");

			if (WarrantyRemaining.equalsIgnoreCase("Yes")) {
				this.Numberofmonthsremaining(driver, Numberofmonthsremaining);
				this.NumberofKmsRemaining(driver, NumberofKmsRemaining);
			} else {

				try {
					this.Numberofmonthsremaining(driver, Numberofmonthsremaining);
					this.NumberofKmsRemaining(driver, NumberofKmsRemaining);
				} catch (NoSuchElementException e) {
					System.out.println(
							"warranty Remaining value is No so Numberofmonths remaining and Number KMS remining fields are not avaialble ");
				}
			}

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='OEM Warranty remaining*']");
			helper.ScrollToViewElement(driver, WarrantyRemaining);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + WarrantyRemaining + "']");
		}
	}

	public void Numberofmonthsremaining(AndroidDriver<MobileElement> driver, String Numberofmonthsremaining)
			throws Exception {

		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Number
		// of months remaining']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Number of months remaining']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText")
					.sendKeys(Numberofmonthsremaining);
			Thread.sleep(2000);
			System.out.println(AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText")
					.getText());
			

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Number of months remaining']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText")
					.sendKeys(Numberofmonthsremaining);
			Thread.sleep(2000);
			String str = AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText")
					.getText().toString();
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='Number of
			// months remaining']//following-sibling::android.widget.EditText", "12");
			System.out.println(AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of months remaining']//following-sibling::android.widget.EditText")
					.getText());

		}

	}

	public void NumberofKmsRemaining(AndroidDriver<MobileElement> driver, String NumberofKmsRemaining)
			throws Exception {
		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Number
		// of Kms Remaining']");

		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Number of Kms Remaining']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Number of Kms Remaining']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of Kms Remaining']//following-sibling::android.widget.EditText")
					.sendKeys(NumberofKmsRemaining);

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Number of Kms Remaining']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='Number of Kms Remaining']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Number of Kms Remaining']//following-sibling::android.widget.EditText")
					.sendKeys(NumberofKmsRemaining);

		}

	}

	public void GeneralRemarks(AndroidDriver<MobileElement> driver, String GeneralRemarks) throws Exception {
		// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='']");
		try {

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='General Remarks']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='General Remarks']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='General Remarks']//following-sibling::android.widget.EditText")
					.sendKeys(GeneralRemarks);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='General
			// Remarks']//following-sibling::android.widget.EditText", "remarks");

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);

			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='General Remarks']");

			helper.clickOnElementByXpath(driver,
					"//android.widget.TextView[@text='General Remarks']//following-sibling::android.widget.EditText");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='General Remarks']//following-sibling::android.widget.EditText")
					.sendKeys(GeneralRemarks);
			// helper.SendkeysByXpath(driver, "//android.widget.TextView[@text='General
			// Remarks']//following-sibling::android.widget.EditText", "remarks");

		}
	}

	public void Submit(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/submitdata");
	}

	public void cancelbutton(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/cancel_button");
	}

	public void Source(AndroidDriver<MobileElement> driver, String source) throws Exception {
		// Make
		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Source*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Source*']//following-sibling::android.widget.EditText")
							.getText().equals("Select Source")) {
				System.out.println("Source field is not prefilled / field value is resetted");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Source*']//following-sibling::android.widget.EditText")
						.click();

				helper.ScrollToViewElement(driver, source);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + source + "']");

			} else {
				System.out.println("Source field is prefilled");

			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Source*']//following-sibling::android.widget.EditText")
					.getText().isEmpty()
					| AppiumHelper.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Source*']//following-sibling::android.widget.EditText")
							.getText().equals("Select Source")) {
				System.out.println("Source field is not prefilled / field value is resetted");
				AppiumHelper.FindElementByXpath(driver,
						"//android.widget.TextView[@text='Source*']//following-sibling::android.widget.EditText")
						.click();

				helper.ScrollToViewElement(driver, source);
				helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + source + "']");

			} else {
				System.out.println("Source field is prefilled");

			}
		}
	}

}
