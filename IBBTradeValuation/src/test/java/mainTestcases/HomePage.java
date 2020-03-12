/**
 * 
 */
package mainTestcases;

import org.testng.annotations.Test;

import common.AppiumHelper;
import common.BaseClass;

/**
 * @author Hema Sumanjali
 *
 */
public class HomePage extends BaseClass {

	public static String Assigned = "//android.widget.TextView[@text='Assigned']";

	public static String Assignedbutton = "//android.widget.TextView[@text='Assigned']//preceding-sibling::android.widget.LinearLayout";
	public static String Pending = "//android.widget.TextView[@text='Pending']";
	public static String Pendingbutton = "//android.widget.TextView[@text='Pending']//preceding-sibling::android.widget.LinearLayout";
	public static String Completed = "//android.widget.TextView[@text='Completed']";
	public static String Completedbutton = "//android.widget.TextView[@text='Completed']//preceding-sibling::android.widget.LinearLayout";
	public static String Home = "//android.widget.TextView[@text='Home']";
	public static String DirectEvaluation = "//android.widget.TextView[@text='Direct Evaluation']";
	public static String DirectEvaluationbutton = "//android.widget.TextView[@text='Direct Evaluation']//preceding-sibling::android.widget.LinearLayout";

	public static String Hambergermenu = "//android.view.ViewGroup//android.widget.ImageButton";

	public static String version = "com.mahindra.ibbtrade_pro:id/tv_versionName";

	public static String Userdetails = "//android.widget.TextView[@text='User Details']";
	public static String Username = "//androidx.appcompat.widget.LinearLayoutCompat[1]//android.widget.CheckedTextView";
	public static String MobileNumber = "//androidx.appcompat.widget.LinearLayoutCompat[2]//android.widget.CheckedTextView";
	public static String EmailId = "//androidx.appcompat.widget.LinearLayoutCompat[3]//android.widget.CheckedTextView";
	public static String City = "//androidx.appcompat.widget.LinearLayoutCompat[4]//android.widget.CheckedTextView";

	public static String logout = "//android.widget.CheckedTextView[@text='Logout']";
	public static String Deny = "//android.widget.Button[@text='DENY']";

	@Test
	public void homepage() throws Exception {

		if (AppiumHelper.FindElementByXpath(driver, Assigned).isDisplayed()) {
			System.out.println("In Home Page Assigned Section is there");
		} else {
			System.out.println("In Home Page Assigned Section is Not there");
		}
		if (AppiumHelper.FindElementByXpath(driver, Pending).isDisplayed()) {
			System.out.println("In Home Page Pending Section is there");
		} else {
			System.out.println("In Home Page Pending Section is Not there");
		}
		if (AppiumHelper.FindElementByXpath(driver, Completed).isDisplayed()) {
			System.out.println("In Home Page Completed Section is there");
		} else {
			System.out.println("In Home Page Completed Section is not there");
		}

		helper.clickOnElementByXpath(driver, Hambergermenu);

		if (AppiumHelper.FindElementByXpath(driver, Userdetails).isDisplayed()) {
			// System.out.println("InsideHamberger menu Userdetails heading is there");
			System.out.println(" UserDetails : ");
		} else {
			System.out.println("InsideHamberger menu Userdetails heading is not there");
		}

		if (AppiumHelper.FindElementByXpath(driver, Username).isDisplayed()) {
			System.out.println("UserName : " + AppiumHelper.FindElementByXpath(driver, Username).getText());
		} else {
			System.out.println("InsideHamberger menu Username is not there");
		}

		if (AppiumHelper.FindElementByXpath(driver, MobileNumber).isDisplayed()) {
			System.out.println("Mobile Number: " + AppiumHelper.FindElementByXpath(driver, MobileNumber).getText());
		} else {
			System.out.println("InsideHamberger menu MobileNumber is not there");
		}

		if (AppiumHelper.FindElementByXpath(driver, EmailId).isDisplayed()) {
			System.out.println("Email id: " + AppiumHelper.FindElementByXpath(driver, EmailId).getText());
		} else {
			System.out.println("InsideHamberger menu EmailId is not there");
		}

		if (AppiumHelper.FindElementByXpath(driver, City).isDisplayed()) {
			System.out.println("City: " + AppiumHelper.FindElementByXpath(driver, City).getText());
		} else {
			System.out.println("InsideHamberger menu City field is not there");
		}

		if (AppiumHelper.FindElementById(driver, version).isDisplayed()) {
			System.out.println("Version: " + AppiumHelper.FindElementById(driver, version).getText());
		} else {
			System.out.println("InsideHamberger menu version field is not there");
		}

	}
}
