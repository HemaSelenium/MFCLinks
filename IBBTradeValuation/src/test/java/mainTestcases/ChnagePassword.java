/**
 * 
 */
package mainTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import common.AppiumHelper;
import common.BaseClass;

/**
 * @author Hema Sumanjali
 *
 */
public class ChnagePassword extends BaseClass {

	public static String ChangePassword = "//android.widget.CheckedTextView[@text='Change Password']";
	public static String ChangePasswordHeading = "//android.widget.TextView[@text='Change Password']";
	public static String oldPassword = "//android.widget.EditText[@text='Old Password']";
	public static String newPassword = "//android.widget.EditText[@text='New Password']";
	public static String Submit = "//android.widget.TextView[@text='Submit']";
	public static String sucessmesssage = "android:id/message";
	public static String OKButton = "//android.widget.Button[@text='OK']";

	@Test(priority = 2)
	public void Changepassword() throws Exception {

		helper.clickOnElementByXpath(driver, HomePage.Hambergermenu);
		helper.clickOnElementByXpath(driver, ChangePassword);

		if (AppiumHelper.FindElementByXpath(driver, ChangePasswordHeading).isDisplayed()) {
			System.out.println("When Click On Changepassword , Change password page is displayed");
			if (AppiumHelper.FindElementByXpath(driver, oldPassword).isDisplayed()) {
				System.out.println("Old password Field Is there");
				AppiumHelper.FindElementByXpath(driver, oldPassword).sendKeys(Password);

				if (AppiumHelper.FindElementByXpath(driver, newPassword).isDisplayed()) {
					System.out.println("New password Field Is there");
					AppiumHelper.FindElementByXpath(driver, newPassword).sendKeys("valuator_reg");
					AppiumHelper.FindElementByXpath(driver, Submit).click();
					NewPassword = Password;

					System.out.println("After Submit the New password following message got displayed :"
							+ AppiumHelper.FindElementById(driver, sucessmesssage).getText());
					AppiumHelper.FindElementByXpath(driver, OKButton).click();

					if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/login_username_et").isDisplayed()) {
						System.out.println("After Changed Password, App got logout and navigated to login page again");

					} else {
						System.out.println("After Changed Password, page is not navigated to login page again");
					}

				} else {
					System.out.println("New password Field Is not there");
				}

			} else {
				System.out.println("Old password Field Is not there");
			}

		} else {
			System.out.println("When Click On Changepassword , Change password page is not displayed");
		}

	}

	@Test(priority=3)
	public void Changepassword_negative() throws Exception {
		
		helper.login(driver, Username, NewPassword);
		
		if (AppiumHelper.FindElementByXpath(driver, HomePage.Home).isDisplayed()) {
			System.out.println("After Login With newly changed password, its logged in successfully and navigated to Home page");

		} else {
			System.out.println("After Login With newly changed password, page is not navigated to home page.");
		}
		
		helper.clickOnElementByXpath(driver, HomePage.Hambergermenu);
		helper.clickOnElementByXpath(driver, ChangePassword);
		driver.navigate().back();
		Thread.sleep(2000);
		if (AppiumHelper.FindElementByXpath(driver, HomePage.Home).isDisplayed()) {
			System.out.println("After click on back button in changed password screen, page is navigated to Home page");
			Thread.sleep(2000);
			this.Assigned();
			this.pending();
			this.Completed();

		
	}else{System.out.println("After click on back button in changed password screen, page is not navigated to Home page");
	}}	
		@Test(priority=4)
		public void logout() throws Exception {
			helper.clickOnElementByXpath(driver, HomePage.Hambergermenu);
			driver.findElementByXPath(HomePage.logout).click();
			if (AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/login_username_et").isDisplayed()) {
				System.out.println("After click on logout, App got logout and navigated to login page again");

			} else {
				System.out.println("After click on logout, page is not navigated to login page again");
			}
			
			
			
		}
		
		
	
	
	
	
	
	
	
	
	
	public void pending() throws InterruptedException {
		if (AppiumHelper.FindElementByXpath(driver, HomePage.Pending).isDisplayed()) {
			Thread.sleep(2000);
			AppiumHelper.FindElementByXpath(driver, HomePage.Pendingbutton).click();
			Thread.sleep(2000);
			String Pendingpagetitle=AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/toolbar_title").getText();
			if(Pendingpagetitle.contains("Pending Report")) {
				 System.out.println("When click on Pending, page is navigated to pending report page ");
				 driver.navigate().back();
			}
			else {
				 System.out.println("When click on Pending, page is not navigated to pending report page ");
			}
			
		}else {
			 System.out.println("Pending section is not there");
		}
	}
	public void Assigned() {
		if (AppiumHelper.FindElementByXpath(driver, HomePage.Assigned).isDisplayed()) {
			AppiumHelper.FindElementByXpath(driver, HomePage.Assignedbutton).click();
		String Assignedpagetitle=AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/toolbar_title").getText();
			
		if(Assignedpagetitle.contains("Lead details")) {
				 System.out.println("when click on assigned, page is navigated to Assigned page ");
				 driver.navigate().back();
			}else {
				System.out.println("when click on assigned, page is not navigated to Assigned page ");
			}
			
		}else {
			 System.out.println("Assigned section is not there in home page");
		}
		
	}
	public void Completed() throws InterruptedException {
		if (AppiumHelper.FindElementByXpath(driver, HomePage.Completed).isDisplayed()) {
			AppiumHelper.FindElementByXpath(driver, HomePage.Completedbutton).click();
			String Completedreportpagetitle=AppiumHelper.FindElementById(driver, "com.mahindra.ibbtrade_pro:id/toolbar_title").getText();
			Thread.sleep(2000);
			if(Completedreportpagetitle.contains("Complete Report")) {
			 System.out.println("When click on completed, page is navigated to completed report page ");
			 driver.navigate().back();
			}
		else {
			 System.out.println("When click on completed, page is not navigated to completed report page ");
		}
		}

		else	{
			 System.out.println("Completed section is not there");
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
