/**
 * 
 */
package mainTestcases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.testng.annotations.Test;
import common.AppiumHelper;
import common.BaseClass;

/**
 * @author Hema Sumanjali
 *
 */
public class Assigned extends BaseClass{
	public static String valuationTime="com.mahindra.ibbtrade_pro:id/valuation_time";
	public static String MakeAndModel="com.mahindra.ibbtrade_pro:id/CarName";
	public static String Variant="com.mahindra.ibbtrade_pro:id/variant";
	public static String leadId="com.mahindra.ibbtrade_pro:id/lead_id";
	public static String Custmername="com.mahindra.ibbtrade_pro:id/contact";
	public static String CustmerMobilenumber="com.mahindra.ibbtrade_pro:id/cusmobnumber";
	public static String Address="com.mahindra.ibbtrade_pro:id/view_address";
	public static String Manfactureyear="com.mahindra.ibbtrade_pro:id/year";
	public static String InspectionAddress="com.mahindra.ibbtrade_pro:id/ins_address";
	public static String Ok="com.mahindra.ibbtrade_pro:id/okbtn";
	public static String city="com.mahindra.ibbtrade_pro:id/cityName";
		
	public static String Call = "//android.widget.TextView[@text='Call']";
	public static String Reject = "//android.widget.TextView[@text='Reject']";
	public static String Valuate = "//android.widget.TextView[@text='Valuate']";
	public static String Followup="//android.widget.TextView[@text='Follow-Up']";
		
	public static String reason="Customer Not Available";
	public static String Submit="//android.widget.Button[@text='Submit']";
	
	
	//private static Pattern dateFrmtPtrn = 
       //     Pattern.compile("(0?[1-9]|[12][0-9]|3[01]) (?:Jan|Mar|May|Jul|Aug|Oct|Dec) (\\d{4}) | (0?[1-9]|[12][0-9]|3[01]):(0?[1-9]|[12][0-9]|3[01])");
	public static String LeadID;
	
	private static Pattern dateFrmtPtrn = 
            Pattern.compile("^\\d{1,2} [a-zA-Z]{3} \\d{4} [|] \\d{1,2}[:]\\d{1,2}[ ]");
	@Test(priority=1)
	public void Leaddetails() throws Exception {
		Thread.sleep(2000);
		AppiumHelper.FindElementByXpath(driver, HomePage.Assignedbutton).click();
		
			if (AppiumHelper.FindElementById(driver, valuationTime).isDisplayed()) {
			
			String ScheduledTime=AppiumHelper.FindElementById(driver, valuationTime).getText();
			System.out.println(ScheduledTime);
			
			
			 Matcher mtch = dateFrmtPtrn.matcher(ScheduledTime);
		        if(mtch.matches()){
		        	System.out.println("Scheduled time formate is as expected");
		            
		        }
		        else {
		        	System.out.println("Scheduled time formate is not as expected");
		        }

		} else {
			System.out.println("Scheduled time field is not visible");
		}
			
			
			
			MakeAndModel();
			Variant();
			leadId();
			location();
			Address();
			userinfo();
			Contactnumber();
			
			Valuate();
			Followup();
			Call();
		//	Reject();
	}
	
	public void MakeAndModel() {
		if (AppiumHelper.FindElementById(driver, MakeAndModel).isDisplayed()) {
			
			String ScheduledTime=AppiumHelper.FindElementById(driver, MakeAndModel).getText();
			System.out.println("Make And Model : "+ScheduledTime);
			
			

		} else {
			System.out.println("");
		}
	}
	public void Variant() {
		if (AppiumHelper.FindElementById(driver, Variant).isDisplayed()) {
			String ScheduledTime=AppiumHelper.FindElementById(driver, Variant).getText();
			System.out.println("Varint And Year : "+ScheduledTime);
			

		} else {
			System.out.println("");
		}
	}
	public void leadId() {
		if (AppiumHelper.FindElementById(driver, leadId).isDisplayed()) {
			String ScheduledTime=AppiumHelper.FindElementById(driver, leadId).getText();
			System.out.println("Lead Id: "+ScheduledTime);
			LeadID=ScheduledTime;
		} else {
			System.out.println("");
		}
	}
	public void location() {
		if (AppiumHelper.FindElementById(driver, city).isDisplayed()) {
			String ScheduledTime=AppiumHelper.FindElementById(driver, city).getText();
			System.out.println("Location : "+ScheduledTime);
		} else {
			System.out.println("");
		}
	}
	public void Address() {
		if (AppiumHelper.FindElementById(driver, Address).isDisplayed()) {
			
			AppiumHelper.FindElementById(driver, Address).click();
			
			String ScheduledTime=AppiumHelper.FindElementById(driver, InspectionAddress).getText();
			System.out.println("Address : "+ScheduledTime);
			AppiumHelper.FindElementById(driver, Ok).click();

		} else {
			System.out.println("");
		}
	}
	public void userinfo() {
		if (AppiumHelper.FindElementById(driver, Custmername).isDisplayed()) {
			String ScheduledTime=AppiumHelper.FindElementById(driver, Custmername).getText();
			System.out.println("Customer Name: "+ScheduledTime);

		} else {
			System.out.println("");
		}
	}
	public void Contactnumber() {
		if (AppiumHelper.FindElementById(driver, CustmerMobilenumber).isDisplayed()) {
			String ScheduledTime=AppiumHelper.FindElementById(driver, CustmerMobilenumber).getText();
			System.out.println(" Contact Number : "+ScheduledTime);

		} else {
			System.out.println("");
		}
	}
	public void mfgYear() {
		if (AppiumHelper.FindElementById(driver, Address).isDisplayed()) {
			String ScheduledTime=AppiumHelper.FindElementById(driver, Address).getText();
			System.out.println("Mfg year : "+ScheduledTime);
		} else {
			System.out.println("");
		}
	}
	public void Call() throws InterruptedException {
		if (AppiumHelper.FindElementByXpath(driver, Call).isDisplayed()) {
			System.out.println("Call button is displayed");
			AppiumHelper.FindElementByXpath(driver, Call).click();
			Thread.sleep(2000);
			String currentactivity=driver.currentActivity();
			String callactivity="com.android.incallui.InCallActivity";
			//System.out.println(currentactivity);
			//System.out.println(callactivity);
			
			if(currentactivity.equalsIgnoreCase(callactivity)){
				
				System.out.println("when click on call button, dial screen is displayed");
				AppiumHelper.FindElementById(driver, "com.google.android.dialer:id/incall_end_call").click();
			}
			else {
				//System.out.println(driver.getCurrentPackage());
				System.out.println(driver.currentActivity());
				
				System.out.println("when click on call button, dial screen is not displayed");
			}

		} else {
			System.out.println("");
		}
	}
	public void Valuate() {
		if (AppiumHelper.FindElementByXpath(driver, Valuate).isDisplayed()) {
			System.out.println("valuate button is displayed");

		} else {
			System.out.println("");
		}
	}
	public void Reject() throws Exception {
	if (AppiumHelper.FindElementByXpath(driver, Reject).isDisplayed()) {
		System.out.println("Rejected Button is displayed");
		AppiumHelper.FindElementByXpath(driver, Reject).click();
		helper.clickOnElementByID(driver, "com.mahindra.ibbtrade_pro:id/assign_remark");
		//AppiumHelper.FindElementByXpath(driver, "//android.widget.Button[@text='Select Reject Reason']").click();
		helper.ScrollToViewElement(driver, reason);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+reason+"']");
		
		helper.clickOnElementByXpath(driver, Submit);
		
		
		System.out.println("After Rejected the Lead following message displayed :"
				+ AppiumHelper.FindElementById(driver, ChnagePassword.sucessmesssage).getText());
		AppiumHelper.FindElementByXpath(driver, ChnagePassword.OKButton).click();
		try {
		helper.ScrollToPerticularElement(driver, LeadID);
		}
		catch(Exception e) {
			System.out.println("Rejected Lead Id is not There in Assigned list");
		}
		

	} else {
		System.out.println("");
	}
}
	
	public void Followup() {
		if (AppiumHelper.FindElementByXpath(driver, Followup).isDisplayed()) {
			System.out.println("followup Button is displayed");
			AppiumHelper.FindElementByXpath(driver, Followup).click();
			String todaydate=date();
			
			//System.out.println(AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='"+todaydate+"']").isEnabled());
			System.out.println("following dates are in disable status :");
			for(int i=1;i<Integer.parseInt(todaydate);i++) {
				
				if(AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='"+i+"']").isEnabled()) {
					//System.out.println("in calendar, past date of "+i+" is in disable status");
					
				}
				else {
					System.out.print(i+" ");
					//System.out.println("in calendar, past date of "+i+" is in enable status");
				}}
			System.out.println("");
				System.out.println("following dates are in enable status :");
				for(int k=Integer.parseInt(todaydate);k<29;k++) {
					
					if(AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='"+k+"']").isEnabled()) {
						//System.out.println("in calendar, future date of "+k+" is in enable status");
						System.out.print(k+" ");
					}
					else {
						//System.out.println("in calendar, past date of "+k+" is disable status");
					}
			//System.out.println(AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='"+i+"']").isEnabled());
				}
			
			
			
			AppiumHelper.FindElementByXpath(driver, "//android.widget.Button[@text='OK']").click();
			System.out.println("");
			System.out.println("After followup date updated following message displayed :"
					+ AppiumHelper.FindElementById(driver, ChnagePassword.sucessmesssage).getText());
			AppiumHelper.FindElementByXpath(driver, ChnagePassword.OKButton).click();
			
			
	}
		else {
			System.out.println("followup Button is not displayed");
		}
	
}
	
	public static String date() {  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd");  
	    Date date = new Date();  
	   System.out.println("Current Date : "+formatter.format(date));
		return formatter.format(date);  
	}  
    
	
	
	
}
