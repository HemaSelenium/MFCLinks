package common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.Reporter;

import Pages.BasicDetails;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import mainTestcases.HomePage;

public class AppiumHelper {

	protected static BasicDetails basicDetails = new BasicDetails();
	public static String MyJobsLayout = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/swipeRefreshLayout";
	public static String VehicleregNo = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo";
	public static String ValuateNow = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow";
	public static String Appointment = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butAppointment";
	public static String Submit = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butSubmit";
	public static int Imagecount;

	private static WebElement Element = null;

	public static WebElement FindElementById(AndroidDriver<MobileElement> driver, String ID) {
		Element = driver.findElementById(ID);
		return Element;
	}

	public static WebElement FindElementByXpath(AndroidDriver<MobileElement> driver, String Xpath) {
		Element = driver.findElementByXPath(Xpath);
		return Element;
	}

	public static WebElement FindElementByAccesabilityID(AndroidDriver<MobileElement> driver, String ID) {
		Element = driver.findElementByAccessibilityId(ID);
		return Element;
	}

	public void clickOnElementByXpath(AndroidDriver<MobileElement> driver, String Xpath) throws Exception {
		try {
		AppiumHelper.FindElementByXpath(driver, Xpath).click();
		}
		catch (NoSuchElementException e) {
			scrollUp(driver);
			AppiumHelper.FindElementByXpath(driver, Xpath).click();
		}

	}

	public void clickOnElementByID(AndroidDriver<MobileElement> driver, String ID) throws Exception {
		try {
			AppiumHelper.FindElementById(driver, ID).click();
		} catch (NoSuchElementException e) {
			scrollUp(driver);
			AppiumHelper.FindElementById(driver, ID).click();
		}
	}

	public void clickOnElementByAccessabilityID(AndroidDriver<MobileElement> driver, String ID) {
		AppiumHelper.FindElementByAccesabilityID(driver, ID).click();
	}

	public void SendkeysById(AndroidDriver<MobileElement> driver, String ID, String Input) {
		AppiumHelper.FindElementById(driver, ID).sendKeys(Input);

	}

	public void SendkeysByXpath(AndroidDriver<MobileElement> driver, String Xpath, String Input) {
		AppiumHelper.FindElementById(driver, Xpath).sendKeys(Input);
	}

	public void ScrollToViewElement(AndroidDriver<MobileElement> driver, String element) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + element + "\"));");
	}

	public void ScrollToViewElementcontainsPerticularText(AndroidDriver<MobileElement> driver, String element)
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(textContains(\""+element+"\"));");

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""
						+ element + "\").instance(0))");
	}

	public void ScrollToPerticularElement(AndroidDriver<MobileElement> driver, String element) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/recycler_view_myJob\")).scrollIntoView("
				+ "new UiSelector().text(\"" + element + "\"));");
	}

	public void ScrollToElementInAddJobScreen(AndroidDriver<MobileElement> driver, String element) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/llTop\")).scrollIntoView("
				+ "new UiSelector().text(\"" + element + "\"));");

	}

	public void ScrollInMainPage(AndroidDriver<MobileElement> driver) {
		(new TouchAction(driver)).press(PointOption.point(535, 1702))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(474, 642))
				.release().perform();
	}

	public void GetToastMessage(AndroidDriver<MobileElement> driver) throws Exception {
		try {
		WebElement ToastView = driver.findElementByXPath("//android.widget.Toast[1]");
		String ToastMessage = ToastView.getAttribute("name");
		Reporter.log("when click on Done button without captured video, following toast message displayed  : " + ToastMessage);
		if (ToastMessage.equalsIgnoreCase("Please record the Video")) {
			System.out.println("Toast Message validation done");
			VideoRecordButton_validation(driver);
			Remarks(driver);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"DONE\"));")
					.click();
			this.progressbar_validation(driver);
			this.playbutton_validation(driver);
			
			
			
		} else {
			System.out.println("Toast Message validation Not Done");
		}
		}
		catch(NoSuchElementException e) {
			System.out.println("when click on Done button without captured video, No toast message displayed ");
			
			
			
			
		}
		
	}
	
	

	public void IsToastMessageDisplayed(AndroidDriver<MobileElement> driver) {
		try {
			WebElement ToastView = driver.findElementByXPath("//android.widget.Toast[1]");
			if (ToastView.isDisplayed()) {
				this.ScrollInMainPage(driver);
				Reporter.log("toast");
			}
		} catch (NoSuchElementException e) {
			Reporter.log("exception");
		}
	}

	public void login(AndroidDriver<MobileElement> driver, String UserName, String Password) throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			driver.findElementById("com.mahindra.ibbtrade_pro:id/login_username_et").click();
			driver.findElementById("com.mahindra.ibbtrade_pro:id/login_username_et").sendKeys(UserName);
			driver.findElementById("com.mahindra.ibbtrade_pro:id/login_password_et").click();
			driver.findElementById("com.mahindra.ibbtrade_pro:id/login_password_et").sendKeys(Password);
			driver.findElementById("com.mahindra.ibbtrade_pro:id/login_submit_bt").click();

		} catch (NoSuchElementException e) {

		}

	}

	public void ClickOnValuateNow(AndroidDriver<MobileElement> driver, String RegNo)
			throws InterruptedException, IOException {
		if (AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/swipeRefreshLayout")
				.isDisplayed()) {
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);

			this.ScrollToPerticularElement(driver, RegNo);
			int count = driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo").size();
			for (int i = 0; i < count; i++)

			{
				String text = driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo").get(i)
						.getText();
				if (text.equalsIgnoreCase(RegNo)) {
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					// this.TakeScreenShot(driver, "PI2wAddedLead");
					driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow").get(i)
							.click();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					break;
				}
			}

		} else {
			Reporter.log("After click On Submit it didnt redirect to My Jobs Screen / job is not created");
		}
	}

	public void GetStatusOfCompletedLead(AndroidDriver<MobileElement> driver, String RegNo)
			throws InterruptedException, IOException {
		try {
			if (AppiumHelper
					.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/swipeRefreshLayout")
					.isDisplayed()) {
				this.ScrollToPerticularElement(driver, RegNo);
				int count = driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo").size();
				for (int i = 0; i < count; i++) {
					String text = driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo")
							.get(i).getText();
					if (text.equalsIgnoreCase(RegNo)) {
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						// this.TakeScreenShot(driver, "PI2wAddedLead");
						String Status = driver
								.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvAgeing").get(i)
								.getText();
						Reporter.log("Status Aftercompleted the lead :" + Status);
						String ButtonText = driver
								.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow")
								.get(i).getText();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						Reporter.log("Button Status Aftercompleted the lead :" + ButtonText);

						break;
					}
				}

			} else {
				Reporter.log("After click On Submit it didnt redirect to My Jobs Screen / job is not created");
			}
		} catch (NoSuchElementException e) {
			Reporter.log("After completed the lead , not redirected to the My Jobs Screen");
		}
	}

	public static void TakeScreenShot(AndroidDriver<MobileElement> driver, String FileName) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./ScreenShots/" + FileName + ".png"));
	}

	public static void TakeScreenShot(AndroidDriver<MobileElement> driver, ITestNGMethod testMethod)
			throws IOException {
		// TODO Auto-generated method stub
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./ScreenShots/" + testMethod + ".png"));
	}

	public void scrollUp(AndroidDriver<MobileElement> driver) throws Exception {

		// The viewing size of the device
		Dimension size = driver.manage().window().getSize();

		// Starting y location set to 70% of the height (near bottom)
		int starty = (int) (size.height * 0.70);
		// Ending y location set to 20% of the height (near top)
		int endy = (int) (size.height * 0.20);
		// x position set to mid-screen horizontally
		int startx = size.width / 2;
		(new TouchAction(driver)).press(PointOption.point(startx, starty))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(0))).moveTo(PointOption.point(startx, endy))
				.release().perform();
		/*
		 * (new TouchAction(driver)) .press(PointOption.point(535,
		 * 1702)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		 * .moveTo(PointOption.point(474, 642)).release().perform(); (2080, 2030)
		 * 540,1624 540,406
		 */
	}

	public void scrollDown(AndroidDriver<MobileElement> driver) throws Exception {

		// The viewing size of the device
		(new TouchAction(driver)).press(PointOption.point(345, 471))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(336, 731))
				.release().perform();

	}

	public static String RegNum() {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString().substring(0, 7);
		StringBuffer sbf = new StringBuffer("AP" + randomUUIDString);
		// Reporter.log("Reg No: " +sbf.toString());
		return sbf.toString();
	}

	public void ScrollinMyJobs(AndroidDriver<MobileElement> driver, String Regnum) throws Exception {
		// MobileElement jobs=
		// driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/recycler_view_myJob");
		List<MobileElement> listofjobs = driver
				.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo");

		loop: for (int i = 0; i < listofjobs.size(); i++) {

			while (!listofjobs.get(i).getText().equalsIgnoreCase(Regnum)) {
				this.scrollUp(driver);
				if (listofjobs.get(i).getText().equalsIgnoreCase(Regnum)) {
					listofjobs.get(i).findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow")
							.click();
					break;

				} else {
					this.scrollUp(driver);

				}
				break loop;
				/*
				 * if(listofjobs.get(i).getText().equalsIgnoreCase(Regnum)) { Reporter.log(2);
				 * listofjobs.get(i).findElementById(
				 * "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow").click();
				 * break; }
				 */

			}
		}

	}

	
	
	public void selectMulti_features(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		System.out.println("###"+ AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/titleViewTool").getText()+"###");
		List<MobileElement>avialbleOptions=driver.findElementsByClassName("android.widget.RadioButton");
		System.out.println("  Available options for the current field  are : ");
		for(int i = 0; i < avialbleOptions.size(); i++) {
		System.out.println(avialbleOptions.get(i).getText());
		}
		String[] spl = strings.split(",");
		for (int i = 0; i < spl.length; i++) {
			String feature = spl[i];
			AppiumHelper.FindElementByXpath(driver, "//android.widget.RadioButton[@text='"+feature+"']").click();
					
		}
		
		/*if(strings.equalsIgnoreCase("All Ok")) {
			try {
				clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_one");
				System.out.println("input selected as All Ok even though images are  displaying");	
			}
			catch(NoSuchElementException e) {
				System.out.println("input selected as All Ok so images are not displaying");	
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
			}
			
				}
				else {
					
					//captureimageone(driver);
					//Remarks(driver);
					driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
							.click();
					;
				}*/
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
		.click();
	}
	
	
	
	
	
	public void selectMulti(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		System.out.println("###"+ AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/titleViewTool").getText()+"###");
		List<MobileElement>avialbleOptions=driver.findElementsByClassName("android.widget.CheckBox");
		System.out.println("  Available options for the current field  are : ");
		for(int i = 0; i < avialbleOptions.size(); i++) {
		System.out.println(avialbleOptions.get(i).getText());
		}
		String[] spl = strings.split(",");
		for (int i = 0; i < spl.length; i++) {
			String feature = spl[i];
			AppiumHelper.FindElementByXpath(driver, "//android.widget.CheckBox[@text='"+feature+"']").click();
					
		}
		
		if(strings.equalsIgnoreCase("All Ok")) {
			try {
				clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_one");
				System.out.println("input selected as All Ok even though images are  displaying");	
			}
			catch(NoSuchElementException e) {
				System.out.println("input selected as All Ok so images are not displaying");	
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
			}
			
				}
				else {
					
					captureimageone(driver);
					Remarks(driver);
					driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
							.click();
					;
				}

	}
	
	public void selectMulti_aftersubmit(AndroidDriver<MobileElement> driver, String strings) throws Exception {
		System.out.println("... "+ AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/titleViewTool").getText()+" ...");
		String[] spl = strings.split(",");
		for (int i = 0; i < spl.length; i++) {
			String feature = spl[i];
			
			String selected=AppiumHelper.FindElementByXpath(driver, "//android.widget.CheckBox[@text='" + feature + "']").getAttribute("checked");
		
			if(selected.equals("true")) {
				System.out.println(feature+  ":  is selected  when come back to the same page after submit ");
			}
			else {
				System.out.println(feature+  ":  is not selected  when come back to the same page after submit ");
			}
			
		}
		
		if(strings.equalsIgnoreCase("All Ok")) {
			try {
				clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_one");
				System.out.println("input selected as All Ok even though images are  displaying");	
			}
			catch(NoSuchElementException e) {
				System.out.println("input selected as All Ok so images are not displaying");	
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
				.click();
			}
			
				}
				else {
					
					captureimageone(driver);
					Remarks(driver);
					driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Done\"));")
							.click();
					;
				}
		

	}

	public void selectMultispare(AndroidDriver<MobileElement> driver, String strings) {
		String[] spl = strings.split(",");

		for (int i = 0; i < spl.length; i++) {
			String feature = spl[i];
		//	System.out.println("Dropdown values : " + feature);
			AppiumHelper.FindElementByXpath(driver, "//android.widget.CheckBox[@text='" + feature + "']").click();
					}
}

	public void captureimageone(AndroidDriver<MobileElement> driver) throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_one");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/select_camera");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera2:id/shutter_button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera2:id/done_button");

	}

	public void captureimageTwo(AndroidDriver<MobileElement> driver) throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_two");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/select_camera");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera:id/v9_shutter_button_internal");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera:id/inten_done_apply");
	}

	public void captureimageThree(AndroidDriver<MobileElement> driver) throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_three");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/select_camera");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera:id/v9_shutter_button_internal");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera:id/inten_done_apply");
	}

	public void captureimageFour(AndroidDriver<MobileElement> driver) throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/awsimage_four");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/select_camera");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera:id/v9_shutter_button_internal");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElementByID(driver, "com.android.camera:id/inten_done_apply");
	}

	public void clickOnDone(AndroidDriver<MobileElement> driver) throws Exception {
		clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/buttondone");
	}

	public void Remarks(AndroidDriver<MobileElement> driver) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Remarks\"));");
		AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/editremarks").sendKeys("Remarks");
	}
	public void VideoRecordButton_validation(AndroidDriver<MobileElement> driver) throws Exception {
		try {
			clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/record_video");
			
			clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/btnCapture");
			Thread.sleep(32000);
						
			}
			catch(NoSuchElementException e) {
				System.out.println("unable to find Record / capture video button");
			}
	}
	
	public void progressbar_validation(AndroidDriver<MobileElement> driver) {
		try {
			if(AppiumHelper.FindElementById(driver, "android:id/progress").isDisplayed()) {
				System.out.println("After captured video , progress bar is displayed");
						
			}		}
			catch(NoSuchElementException e) {
			System.out.println("After uploaded captured video , progress bar is not displayed");
			}
	}
	
	
	
	public void playbutton_validation(AndroidDriver<MobileElement> driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/play_video").isDisplayed()) {
				System.out.println("After captured video, play video button is displayed");
			}
		} catch (NoSuchElementException e) {
			System.out.println("After captured video, play video button is not displayed");
		}

	}
	
}
