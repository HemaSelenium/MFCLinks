/**
 * 
 */
package IBBTradeValuation.IBBTradeValuation;

/**
 * @author Hema Sumanjali
 *
 */
public class dropdowns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strings ="Structural damage – LH,Structural damage – RH";
		 String[] spl = strings.split(",");
			
		 for(int i=0; i< spl.length; i++)
         {
			 System.out.println("Dropdown values : " +spl[i]);
			 //AppiumHelper.FindElementByXpath(driver, "//android.widget.CheckBox[@text='" +spl+"']").click();
             //System.out.println("Dropdown values : "+spl[i]);
         }
	}

}
