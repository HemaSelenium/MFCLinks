/**
 * 
 */
package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class Documents_PrefillAndEdit {
	protected static AppiumHelper helper = new AppiumHelper();

	public static String Documents = "com.mahindra.ibbtrade_pro:id/document";
	public static String Exterior = "com.mahindra.ibbtrade_pro:id/exterior";
	public static String Underthehood = "com.mahindra.ibbtrade_pro:id/under_the_hood";
	public static String Interior = "com.mahindra.ibbtrade_pro:id/interior";
	public static String UnderBody = "com.mahindra.ibbtrade_pro:id/under_body";
	public static String testDrive = "com.mahindra.ibbtrade_pro:id/testDrive";
	public static String Features = "com.mahindra.ibbtrade_pro:id/vechiclefeature";

	public static String RC = "//android.widget.TextView[@text='RC*']//following-sibling::android.widget.EditText";
	public static String RCFrontCopy = "//android.widget.TextView[@text='RC FRONT COPY Image*']";
	public static String RCBackcopy = "//android.widget.TextView[@text='RC BACK COPY Image*']";
	public static String Insurance = "//android.widget.TextView[@text='Insurance*']//following-sibling::android.widget.EditText";
	public static String InsuranceCopyImages = "//android.widget.TextView[@text='INSURANCE COPY images*']";
	public static String Hypothecation = "//android.widget.TextView[@text='Hypothecation']//following-sibling::android.widget.EditText";
	public static String NOCImages = "//android.widget.TextView[@text='NOC Images']";
	public static String form35images = "//android.widget.TextView[@text='Form 35 Images']";
	public static String DuplicateKey = "//android.widget.TextView[@text='Dupilcate Key Available']//following-sibling::android.widget.EditText";
	
	
	
	
	public static String Insurancecompany="//android.widget.TextView[@text='Insurance Company']";
	public static String Insurancecompany_tick="//android.widget.TextView[@text='Insurance Company']//following-sibling::android.widget.ImageView";
	public static String InsuranceIDV="//android.widget.TextView[@text='Insurance IDV']";
	public static String InsuranceIDV_tick="//android.widget.TextView[@text='Insurance IDV']//following-sibling::android.widget.ImageView";
	public static String Insurancevalidity="//android.widget.TextView[@text='Insurance Validity']//following-sibling::android.widget.EditText";
	public static String Insurancevalidity_tick="//android.widget.TextView[@text='Insurance Validity']//following-sibling::android.widget.EditText//following-sibling::android.widget.ImageView";
	public static String Hypothecationbank="//android.widget.TextView[@text='Hypothecation Bank ']//following-sibling::android.widget.EditText";
	public static String Hypothecationbank_tick="//android.widget.TextView[@text='Hypothecation Bank ']//following-sibling::android.widget.EditText//following-sibling::android.widget.ImageView";
	public static String hypothecation="//android.widget.TextView[@text='Hypothecation']";
	public static String hypothecation_tick="//android.widget.TextView[@text='Hypothecation']//following-sibling::android.widget.ImageView";
	public static String hypothecationClosed="//android.widget.TextView[@text='Hypothecation Closed']";
	public static String hypothecationClosed_tick="//android.widget.TextView[@text='Hypothecation Closed']//following-sibling::android.widget.ImageView";
	public static String Nocavaialble="//android.widget.TextView[@text='NOC Available']";
	public static String Nocavaialble_tick="//android.widget.TextView[@text='NOC Available']//following-sibling::android.widget.ImageView";
	
		
	

	public static String RC_tick = "//android.widget.TextView[@text='RC*']//following-sibling::android.widget.ImageView";
	public static String RCFrontCopy_tick = "//android.widget.TextView[@text='RC FRONT COPY Image*']//following-sibling::android.widget.ImageView";
	public static String RCBackcopy_tick = "//android.widget.TextView[@text='RC BACK COPY Image*']//following-sibling::android.widget.ImageView";
	public static String Insurance_tick = "//android.widget.TextView[@text='Insurance*']//following-sibling::android.widget.ImageView";
	public static String InsuranceCopyImages_tick = "//android.widget.TextView[@text='INSURANCE COPY images*']//following-sibling::android.widget.ImageView";
	public static String Hypothecation_tick = "//android.widget.TextView[@text='Hypothecation']//following-sibling::android.widget.ImageView";
	public static String NOCImages_tick = "//android.widget.TextView[@text='NOC Images']//following-sibling::android.widget.ImageView";
	public static String form35images_tick = "//android.widget.TextView[@text='Form 35 Images']//following-sibling::android.widget.ImageView";
	public static String DuplicateKey_tick = "//android.widget.TextView[@text='Dupilcate Key Available']//following-sibling::android.widget.ImageView";
	
	
	//following-sibling::android.widget.ImageView
	
	
	
	public static String Submit = "//android.widget.Button[@text='Submit']";

	public void RC(AndroidDriver<MobileElement> driver, String rc) throws Exception {
		
		try {
			
			if (AppiumHelper
					.FindElementByXpath(driver,
							RC)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							RC)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,RC Value is not prefilled");
			
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again, RC Value is prefilled");
			

			helper.clickOnElementByXpath(driver, RC);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + rc + "']");
			
			try {
				if(AppiumHelper.FindElementByXpath(driver, RC_tick).isDisplayed()) {
					System.out.println("After Edited RC field, Tick mark  displayed");
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("After Edited RC field, Tick mark didnt display");
			}
			
			
			
			if (rc.equalsIgnoreCase("Not Applicable")) {

			} else {
				this.RCfrontcopyimage(driver);
				this.RCBackCopyimage(driver);

			}
			}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, RC);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + rc + "']");
			if (rc.equalsIgnoreCase("Not Applicable")) {

			} else {
				this.RCfrontcopyimage(driver);
				this.RCBackCopyimage(driver);

			}
		}
	}

	public void RCfrontcopyimage(AndroidDriver<MobileElement> driver) throws Exception {
		
		
		
		helper.clickOnElementByXpath(driver, RCFrontCopy);
		helper.captureimageone(driver);
		//helper.captureimageTwo(driver);
		helper.clickOnDone(driver);
		
		try {
			if(AppiumHelper.FindElementByXpath(driver, RCFrontCopy_tick).isDisplayed()) {
				System.out.println("After Edited RCfrontcopyimage, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("After Edited RCfrontcopyimage, Tick mark didnt display");
		}
	}

	public void RCBackCopyimage(AndroidDriver<MobileElement> driver) throws Exception {
		helper.clickOnElementByXpath(driver, RCBackcopy);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.captureimageone(driver);
		//helper.captureimageTwo(driver);
		helper.clickOnDone(driver);
		try {
			if(AppiumHelper.FindElementByXpath(driver, RCBackcopy_tick).isDisplayed()) {
				System.out.println("After Edited RCBackCopyimage, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("After Edited RCBackCopyimage, Tick mark didnt display");
		}
	}

	public void Insurance(AndroidDriver<MobileElement> driver, String insurance,String insurancecompany) throws Exception {
		try {
			
			if (AppiumHelper
					.FindElementByXpath(driver,
							Insurance)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Insurance)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Insurance Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Insurance Value is prefilled");
			}
			helper.clickOnElementByXpath(driver, Insurance);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + insurance + "']");
			
			try {
				if(AppiumHelper.FindElementByXpath(driver, Insurance_tick).isDisplayed()) {
					System.out.println("After Edited Insurance field, Tick mark  displayed");
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("After Edited Insurance field, Tick mark didnt display");
			}
			
			
			if (insurance.equalsIgnoreCase("Not Applicable")) {

			}

			else {
				this.Insurancecopyimage(driver);
				this.insuranceCompany(driver, insurancecompany);
				this.InsuranceCompanyName(driver);
				this.InsuranceIDV(driver);
				this.Insurancevalidity(driver);
			}

		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							Insurance)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Insurance)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Insurance Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Insurance Value is prefilled");
			}
			helper.clickOnElementByXpath(driver, Insurance);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + insurance + "']");
			if (insurance.equalsIgnoreCase("Not Applicable")) {

			}

			else {
				this.Insurancecopyimage(driver);
				this.insuranceCompany(driver,insurancecompany);
				this.InsuranceCompanyName(driver);
				this.InsuranceIDV(driver);
				this.Insurancevalidity(driver);
			}
		}

	}

	public void Insurancecopyimage(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			helper.clickOnElementByXpath(driver, InsuranceCopyImages);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			helper.captureimageone(driver);
			//helper.captureimageTwo(driver);
			helper.clickOnDone(driver);
						
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, InsuranceCopyImages);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			helper.captureimageone(driver);
			//helper.captureimageTwo(driver);
			helper.clickOnDone(driver);
			
			try {
				if(AppiumHelper.FindElementByXpath(driver, InsuranceCopyImages_tick).isDisplayed()) {
					System.out.println("After Edited Insurancecopyimage, Tick mark  displayed");
				}
			}
			catch(NoSuchElementException k) {
				System.out.println("After Edited Insurancecopyimage, Tick mark didnt display");
			}
		}
	}

	public void insuranceCompany(AndroidDriver<MobileElement> driver,String insurancecompany) throws Exception {
		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							Insurancecompany)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Insurancecompany)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Insurancecompany Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Insurancecompany Value is prefilled");
			}
			
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Insurance Company']");
			helper.ScrollToViewElement(driver, insurancecompany);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+insurancecompany+"']");
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							Insurancecompany)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Insurancecompany)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Insurancecompany Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Insurancecompany Value is prefilled");
			}
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Insurance Company']");
			helper.ScrollToViewElement(driver, insurancecompany);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+insurancecompany+"']");
			try {
				if(AppiumHelper.FindElementByXpath(driver, Insurancecompany_tick).isDisplayed()) {
					System.out.println("After Edited the  Insurancecompany field, Tick mark  displayed");
				}
			}
			catch(NoSuchElementException k) {
				System.out.println("After Edited the  Insurancecompany field, Tick mark didnt display");
			}
			
		}

	}

	public void InsuranceCompanyName(AndroidDriver<MobileElement> driver) {

	}

	public void InsuranceIDV(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			
			if (AppiumHelper
					.FindElementByXpath(driver,
							InsuranceIDV)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							InsuranceIDV)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,InsuranceIDV Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,InsuranceIDV Value is prefilled");
			}
			
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Insurance IDV']");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Insurance IDV']//following-sibling::android.widget.EditText")
					.sendKeys("12");
			
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			if (AppiumHelper
					.FindElementByXpath(driver,
							InsuranceIDV)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							InsuranceIDV)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,InsuranceIDV Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,InsuranceIDV Value is prefilled");
			}
			
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Insurance IDV']");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Insurance IDV']//following-sibling::android.widget.EditText")
					.sendKeys("12");
			
			
		}
	}

	public void Insurancevalidity(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			// helper.clickOnElementByXpath(driver,
			// "//android.widget.TextView[@text='Insurance Validity']");
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Insurance Validity']//following-sibling::android.widget.EditText")
					.click();
			
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Insurance Validity']//following-sibling::android.widget.EditText")
					.click();
			
		}
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			helper.clickOnElementByID(driver, "android:id/button1");
			try {
				if(AppiumHelper.FindElementByXpath(driver, Insurancevalidity_tick).isDisplayed()) {
					System.out.println("After fill the Insurancevalidity details, Tick mark  displayed");
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("After fill the Insurancevalidity details, Tick mark didnt display");
			}
	}

	public void Hypothecation(AndroidDriver<MobileElement> driver, String hypothecation, String hypothecatedbank,
			String hypothecationclosed, String nocAvailable,String form35available) throws Exception {
		this.hypothecation(driver, hypothecation);
		if (hypothecation.equalsIgnoreCase("Yes")) {
			this.hypothecatedbank(driver, hypothecatedbank);
			this.hypothecationClosed(driver, hypothecationclosed);
			if (hypothecationclosed.equalsIgnoreCase("Yes")) {
				this.Nocavaialble(driver, nocAvailable);
          
				if (nocAvailable.equalsIgnoreCase("Yes")) {
					
					this.NocImage(driver);
					  this.Form35Available(driver, form35available);
					  if(form35available.equalsIgnoreCase("Yes")) {
						  this.Form35images(driver);
					  }
					  else {
						  System.out.println("Form35images field is not available because Form35Available ifield value selected as No "); 
					  }
				} else {
             System.out.println(" Noc image field is not avialble because Noc Available field value is selected as NO ");
				}

			} else {
				  System.out.println("Noc Field & Noc image fields are not available because hypothecationclosed field value is selected as NO");
			}

		} else {
			  System.out.println("Hypothecated bank field is not avialble because hypothecation field value is selected as NO");
		}

	}

	public void hypothecatedbank(AndroidDriver<MobileElement> driver, String hypothecatedbank) throws Exception {

		try {
			
			if (AppiumHelper
					.FindElementByXpath(driver,
							Hypothecationbank)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Hypothecationbank)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Hypothecation bank Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Hypothecation Bank Value is prefilled");
			}
			

			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Hypothecation Bank ']//following-sibling::android.widget.EditText")
					.click();
			helper.ScrollToViewElement(driver, hypothecatedbank);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+hypothecatedbank+"']");
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Hypothecation Bank ']//following-sibling::android.widget.EditText")
					.click();
			helper.ScrollToViewElement(driver, hypothecatedbank);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+hypothecatedbank+"']");
			
		}
		try {
			if(AppiumHelper.FindElementByXpath(driver, Hypothecationbank_tick).isDisplayed()) {
				System.out.println("After Edited the hypothecatedbank details, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("After Edited the hypothecatedbank details, Tick mark didnt display");
		}
	}

	public void hypothecation(AndroidDriver<MobileElement> driver, String hypothecation) throws Exception {
		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							Hypothecation)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Hypothecation)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Hypothecation Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Hypothecation Value is prefilled");
			}
			
			
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Hypothecation']");
			helper.ScrollToViewElement(driver, hypothecation);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+hypothecation+"']");
			
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Hypothecation']");
			helper.ScrollToViewElement(driver, hypothecation);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+hypothecation+"']");
			
		}
		try {
			if(AppiumHelper.FindElementByXpath(driver, Hypothecation_tick).isDisplayed()) {
				System.out.println("After Edited the Hypothecation field details, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException k) {
			System.out.println("After Edited the hypothecationClosed field details, Tick mark didnt display");
		}
	}

	public void hypothecationClosed(AndroidDriver<MobileElement> driver, String hypothecationclosed) throws Exception {
		try {
			if (AppiumHelper
					.FindElementByXpath(driver,
							hypothecationClosed)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							hypothecationClosed)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Hypothecation Closed Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Hypothecation Closed Value is prefilled");
			}
			
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Hypothecation Closed']");
			helper.ScrollToViewElement(driver, hypothecationclosed);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+hypothecationclosed+"']");
			
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Hypothecation Closed']");
			helper.ScrollToViewElement(driver, hypothecationclosed);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+hypothecationclosed+"']");
			
			
		}
		
		
		try {
			if(AppiumHelper.FindElementByXpath(driver, hypothecationClosed_tick).isDisplayed()) {
				System.out.println("After Edited the hypothecationClosed field details, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException k) {
			System.out.println("After Edited the hypothecationClosed field details, Tick mark didnt display");
		}
	}

	public void Nocavaialble(AndroidDriver<MobileElement> driver, String nocAvailable) throws Exception {
		try {
			
			if (AppiumHelper
					.FindElementByXpath(driver,
							Nocavaialble)
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							Nocavaialble)
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Nocavaialble Closed Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Nocavaialble Closed Value is prefilled");
			}
			
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='NOC Available']");
			helper.ScrollToViewElement(driver, nocAvailable);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+nocAvailable+"']");
			
		} catch (NoSuchElementException p) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='NOC Available']");
			helper.ScrollToViewElement(driver, nocAvailable);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+nocAvailable+"']");
			
			
		}
		
		
		try {
			if(AppiumHelper.FindElementByXpath(driver, Nocavaialble_tick).isDisplayed()) {
				System.out.println("After Edited the Nocavaialble field, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException k) {
			System.out.println("After Edited the Nocavaialble field, Tick mark didnt display");
		}
	}

	public void NocImage(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='NOC Images']");
			helper.captureimageone(driver);
			//helper.captureimageTwo(driver);

			helper.clickOnDone(driver);
			

		} catch (NoSuchElementException k) {
			helper.scrollUp(driver);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='NOC Images']");
			helper.captureimageone(driver);
			//helper.captureimageTwo(driver);

			helper.clickOnDone(driver);
			
		}
		try {
			if(AppiumHelper.FindElementByXpath(driver, NOCImages_tick).isDisplayed()) {
				System.out.println("After Edited NocImage field, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("After Edited NocImage field, Tick mark didnt display");
		}
	}

	public void Form35Available(AndroidDriver<MobileElement> driver,String form35available) throws Exception {
		try {

			if (AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Form 35 Available*']//following-sibling::android.widget.EditText")
					.getText().isEmpty() | AppiumHelper
					.FindElementByXpath(driver,
							"//android.widget.TextView[@text='Form 35 Available*']//following-sibling::android.widget.EditText")
					.getText().equals("--select--")) {
				System.out.println("After submitted the Documents data and click on Documents again,Form35Available Value is not prefilled");
			}
			else {
				System.out.println("After submitted the Documents data and click on Documents again,Form35Available Value is prefilled");
			}
			
			
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Form 35 Available*']//following-sibling::android.widget.EditText")
					.click();
			helper.ScrollToViewElement(driver, form35available);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+form35available+"']");
			
			
			
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Form 35 Available*']//following-sibling::android.widget.EditText")
					.click();
			helper.ScrollToViewElement(driver, form35available);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+form35available+"']");
		}
		if(form35available.equalsIgnoreCase("Yes")) {
			this.Form35images(driver);
		}
		else {
			
		}
	}

	public void Form35images(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			helper.clickOnElementByXpath(driver, form35images);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='NOC
			// Images']");

			helper.captureimageone(driver);
			//helper.captureimageTwo(driver);
try {
			helper.clickOnDone(driver);
			
}
catch(NoSuchElementException e) {
	helper.scrollUp(driver);
	helper.clickOnDone(driver);
}
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			helper.clickOnElementByXpath(driver, form35images);
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='NOC
			// Images']");

			helper.captureimageone(driver);
			//helper.captureimageTwo(driver);

			helper.clickOnDone(driver);
			
			
		}
		try {
			if(AppiumHelper.FindElementByXpath(driver, form35images_tick).isDisplayed()) {
				System.out.println("After Edited Form35images, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException l) {
			System.out.println("After Edited Form35images, Tick mark didnt display");
		}

	}

	public void Duplicatekey(AndroidDriver<MobileElement> driver,String duplicatekey) throws Exception {
		try {

			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Dupilcate Key Available']//following-sibling::android.widget.EditText")
					.click();
			helper.ScrollToViewElement(driver, duplicatekey);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+duplicatekey+"']");
			
			
		} catch (NoSuchElementException e) {
			helper.scrollUp(driver);
			AppiumHelper.FindElementByXpath(driver,
					"//android.widget.TextView[@text='Dupilcate Key Available']//following-sibling::android.widget.EditText")
					.click();
			helper.ScrollToViewElement(driver, duplicatekey);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+duplicatekey+"']");
			
			
		}
		try {
			if(AppiumHelper.FindElementByXpath(driver, DuplicateKey_tick).isDisplayed()) {
				System.out.println("After Edited the DuplicateKey field, Tick mark  displayed");
			}
		}
		catch(NoSuchElementException k) {
			System.out.println("After Edited the DuplicateKey field, Tick mark didnt display");
		}
	}
}


