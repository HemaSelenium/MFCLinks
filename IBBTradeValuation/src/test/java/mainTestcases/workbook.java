/**
 * 
 */
package mainTestcases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/**
 * @author Hema Sumanjali
 *
 */
public class workbook {
	@Test
	 public  void main() throws Exception{
         
         FileInputStream fsIP= new FileInputStream(new File("./src/MFC-URLS.xlsx")); //Read the spreadsheet that needs to be updated
            
         XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook
            
         XSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
         int Row=worksheet.getLastRowNum()+1;
         for (int i=1; i<Row; i++) {
	  	        XSSFRow row = worksheet.getRow(i);
	  	    //  XSSFCell cell ;
	  	      
	  	    XSSFCell cell = row.getCell(0);
	  	  //  XSSFCell cell = row.getCell(0);
	  	  if (cell == null) {
	  		cell = row.createCell(1);
	  		cell.setCellValue("Hema");
          } else {
        	  cell.setCellValue("kjdsns");
          }
        
           
         FileOutputStream output_file =new FileOutputStream(new File("./src/MFC-URLS.xlsx"));  //Open FileOutputStream to write updates
            
         wb.write(output_file); //write changes
            
         //output_file.close();  //close the stream    
 } }
}