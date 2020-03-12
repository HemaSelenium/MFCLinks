/**
 * 
 */
package mainTestcases;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class web {
	DataProviders setData=new DataProviders();
	public static WebDriver driver;
	@Test(priority = 1)
	public void setup() {
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.mahindrafirstchoice.com/dealer/karnataka/bangalore");
	//System.out.println(driver.getPageSource());
	}
	@Test(priority = 2, dataProvider = "MFCWRLS", dataProviderClass = DataProviders.class)
	public void tefdg(String URL) throws FileNotFoundException, IOException {
		driver.get(URL);
	//System.out.println(driver.getPageSource());
	if((driver.getPageSource().contains("Error") )| (driver.getPageSource().contains("404"))) {
		
		System.out.println("When navigated to " +URL +"  error is displaying as "+driver.findElement(By.xpath("/html/body/span/h1")).getText());
		
		//System.out.println(driver.findElement(By.xpath("/html/body/span/h1")).getText());
		setData.SetStatus(URL, "Failed", driver.findElement(By.xpath("/html/body/span/h1")).getText());
		
	}
	else {
		System.out.println("When navigated to "  +URL +"   No error is displaying");
		setData.SetStatus(URL, "Pass", "");
	}
}
	
	
	
	
	
	
	
	
}
