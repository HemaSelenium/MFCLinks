/**
 * 
 */
package mainTestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class URLS {
	int Row;
	public static WebDriver driver;
//	protected static DataProviders setData=new DataProviders();
	public static void main(String[] args) throws InterruptedException, IOException {
		// get my sheet from workbook
	  
		//Instantiating FirefoxDriver
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\chromedriver.exe");
		driver=new ChromeDriver();
       driver.get("https://www.mahindrafirstchoice.com");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait for 10 seconds
		
		//Used tagName method to collect the list of items with tagName "a"
		//findElements - to find all the elements with in the current page. It returns a list of all webelements or an empty list if nothing matches
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		//To print the total number of links
		System.out.println("Total links are "+links.size());	
		//used for loop to 
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			//By using "href" attribute, we could get the url of the requried link
			String url=element.getAttribute("href");
			//calling verifyLink() method here. Passing the parameter as url which we collected in the above link
			//See the detailed functionality of the verifyLink(url) method below
			verifyLink(url);			
		}	
	}
	
	// The below function verifyLink(String urlLink) verifies any broken links and return the server status. 
	public static  void verifyLink(String urlLink) throws IOException {
		
		File src = new File("./src/MFC-URLS.xlsx");
		FileInputStream fis = new FileInputStream(src);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
	    XSSFSheet  sheet=workbook.getSheet("sheet2");
	    int Row=sheet.getLastRowNum()+1;
	    for (int i=1; i<Row; i++) {
	    	 XSSFRow row = sheet.getRow(i);
	    
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
			//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
			URL link = new URL(urlLink);
			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			//Set the timeout for 2 seconds
			httpConn.setConnectTimeout(2000);
			//connect using connect method
			httpConn.connect();
			//use getResponseCode() to get the response code. 
				if(httpConn.getResponseCode()== 200) {	
					System.out.println(1);
					System.out.println(urlLink+" - "+httpConn.getResponseMessage());
					  XSSFCell cell = row.getCell(0);
					if (cell == null) {
	            		   cell = row.createCell(0);
	            		   cell.setCellValue(urlLink);
	                   }
					
					//SetStatus_data(urlLink, "passed", httpConn.getResponseMessage());
				}
				if(httpConn.getResponseCode()== 404) {
					System.out.println(2);
					System.out.println(urlLink+" - "+httpConn.getResponseMessage());
					//SetStatus_data(urlLink, "Failed", httpConn.getResponseMessage());
				}
			}
			//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
		catch (Exception e) {
			//e.printStackTrace();
		}
    

	    }


}}
