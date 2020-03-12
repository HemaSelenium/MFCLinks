/**
 * 
 */
package mainTestcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Pages.Documents;
import Pages.Documents_PrefillAndEdit;
import common.AppiumHelper;
import common.BaseClass;

/**
 * @author Hema Sumanjali
 *
 */
public class Dashboard extends BaseClass{
Documents_PrefillAndEdit documents=new Documents_PrefillAndEdit();
public static String submitResults="android:id/message";
public static String LeadId_afterSubmit="com.mahindra.ibbtrade_pro:id/pendingregno";
public static String leadidincompletedsection;
@Test
public void dashboard() throws Exception {
helper.clickOnElementByXpath(driver, HomePage.Pendingbutton);
helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/completeReport");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
AppiumHelper.FindElementById(driver, Documents.SubmitAll).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


try {
	System.out.println("After click on submit after fill all the details message dispalyed as : " +AppiumHelper.FindElementById(driver, submitResults).getText() );

}
catch(NoSuchElementException e) {
	WebElement ToastView = driver.findElementByXPath("//android.widget.Toast[1]");
	String ToastMessage = ToastView.getAttribute("name");
	//System.out.println("Report Didnt submitted successfully and error message dispalyed as : " +AppiumHelper.FindElementById(driver, submitResults).getText() );
	System.out.println("Report Didnt submitted successfully and error message dispalyed as : " +ToastMessage);
}
AppiumHelper.FindElementByXpath(driver, "//android.widget.Button[@text='OK']")	.click();

if(AppiumHelper.FindElementByXpath(driver, "//android.widget.TextView[@text='Home']").isDisplayed()) {
	System.out.println("After submitted report page is redirected to Home page");
}
else {
	System.out.println("After submitted report page is not redirected to Home page");
}
helper.clickOnElementByXpath(driver, HomePage.Completedbutton);
if(Assigned.LeadID.trim().equals(leadId_CompletedSection().trim())) {
System.out.println("after submitted the details, lead moved to Completed section.");
}
else {
System.out.println("after submitted the details, Submitted lead Unable to find in Completed section.");
}

	}
	
public static  String leadId_CompletedSection() {
	if (AppiumHelper.FindElementById(driver, LeadId_afterSubmit).isDisplayed()) {
		String leadid=AppiumHelper.FindElementById(driver, LeadId_afterSubmit).getText();
		System.out.println("Lead Id:"+leadid.split(":")[1]);
		leadidincompletedsection=leadid.split(":")[1];
	} else {
		System.out.println("lead id is not displayed");
	}
	return leadidincompletedsection;
}
	
}
