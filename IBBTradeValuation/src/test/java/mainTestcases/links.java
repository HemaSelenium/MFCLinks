/**
 * 
 */
package mainTestcases;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class links {
	public static WebDriver driver;
	DataProviders setData=new DataProviders();
	
	@BeforeClass
    public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\chromedriver.exe");
		driver=new ChromeDriver();
       driver.get("https://www.mahindrafirstchoice.com");
    }
 
    @Test
    public void testLinks() throws Exception {
 
        //Fetch all hyper links those contains HREF attributes
        List<WebElement> links = fetchAllLinks(driver);
 
        System.out.println("Total number of hyper links on webpage : " + links.size());
 
        // Validate all URLS one by one using For loop
        for(int i = 0 ; i < links.size(); i++) {
        	//String URL=links.get(i).getAttribute("href");
        	//String Results=isLinkBroken(new URL(links.get(i).getAttribute("href")));
            try {
            	
              System.out.println("URL: " + links.get(i).getAttribute("href") + " - Result : " + isLinkBroken(new URL(links.get(i).getAttribute("href"))));
 
               // setData.SetStatus_data(URL, " ", Results);
                
                
                } catch(MalformedURLException e) {
 
                   System.out.println("Error at " + links.get(i).getAttribute("innerHTML") + " Exception occured : " + e.getMessage());
                   // setData.SetStatus_data(URL, " ", Results);
                }
            }
        }
 
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
 
      public List<WebElement> fetchAllLinks(WebDriver driver) {
 
          List<WebElement> list = new ArrayList<WebElement>();
 
          //Find all elements with anchor tag and store it into a list
          list = driver.findElements(By.tagName("a"));
 
          List<WebElement> finalList = new ArrayList<WebElement>(); ;
 
          //Now scan all hyper links in order to filter the ones those are without href attribute and save elements into FinalList
          for (int i = 0 ; i<list.size(); i++) {
 
              if(list.get(i).getAttribute("href") != null) {
 
                  finalList.add(list.get(i));
              }
          }
 
          return finalList;
 
      }
 
        public String isLinkBroken(URL url) throws Exception {
 
            String response = " ";
 
            //Create an instance of HTTP URL connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
 
            //connect to the URL
            connection.connect();
 
            // get the response
            response = connection.getResponseMessage();
 
            // Disconnect the connection
            connection.disconnect();
 
            return response;
 
            }
 
    }