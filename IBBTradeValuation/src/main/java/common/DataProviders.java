/**
 * 
 */
package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

/**
 * @author Hema Sumanjali
 *
 */
public class DataProviders {
	public Object[][] GetInput(String SheetName) throws FileNotFoundException ,IOException
	{
		File src = new File("./src/Valuation_Pro_input.xlsm");
		FileInputStream fis = new FileInputStream(src);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
	    XSSFSheet  sheet=workbook.getSheet(SheetName);// get my sheet from workbook
	    int Row=sheet.getLastRowNum()+1;
	    int ColNum= sheet.getRow(0).getLastCellNum(); 
	   // System.out.println("column number="+ColNum);// get last ColNum
	    Object inputdata[][]= new Object[Row-1][ColNum]; // pass my count data in array
	    for (int i=1; i<Row; i++) {
	  	        XSSFRow row = sheet.getRow(i);
	        for (int j=0; j<ColNum; j++) {
	             XSSFCell cell = row.getCell(j);
	                String value = String.valueOf(cell);   
	               // System.out.println(value);
	                inputdata[i-1][j] = value;
	                 	         
	    
	        }}
	   
	return inputdata;
	    }
	public Object[][] getUrls(String SheetName) throws FileNotFoundException ,IOException
	{
		File src = new File("./src/MFC-URLS.xlsx");
		FileInputStream fis = new FileInputStream(src);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
	    XSSFSheet  sheet=workbook.getSheet(SheetName);// get my sheet from workbook
	    int Row=sheet.getLastRowNum()+1;
	    int ColNum= sheet.getRow(0).getLastCellNum(); 
	    // System.out.println("column number="+ColNum);// get last ColNum
	    Object inputdata[][]= new Object[Row-1][ColNum-2]; // pass my count data in array
	    for (int i=1; i<Row; i++) {
	  	        XSSFRow row = sheet.getRow(i);
	       
	             XSSFCell cell = row.getCell(0);
	                String value = String.valueOf(cell);   
	               // System.out.println(value);
	                inputdata[i-1][0] = value;
	                 	         
	    
	        }
	   
	return inputdata;
	    }
	public void SetStatus(String URL,String Status,String Error) throws FileNotFoundException ,IOException
	{
		File src = new File("./src/MFC-URLS.xlsx");
		FileInputStream fis = new FileInputStream(src);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
	    XSSFSheet  sheet=workbook.getSheet("URLS");// get my sheet from workbook
	    int Row=sheet.getLastRowNum()+1;
	    int ColNum= sheet.getRow(0).getLastCellNum(); 
	    int col = 1;
	    // System.out.println("column number="+ColNum);// get last ColNum
	   // Object inputdata[][]= new Object[Row-1][ColNum-2]; // pass my count data in array
	    for (int i=1; i<Row; i++) {
	  	        XSSFRow row = sheet.getRow(i);
	  	      XSSFCell createcell = row.getCell(col);
	             XSSFCell cell = row.getCell(0);
	             XSSFCell status = row.getCell(1);
	             XSSFCell error = row.getCell(2);
	                String value = String.valueOf(cell);   
	               // System.out.println(value);
	               // inputdata[i-1][0] = value;
	               if(value.equalsIgnoreCase(URL)) {
	            	   
	            	   
	            	   if (status == null) {
	            		   status = row.createCell(1);
	            		   status.setCellValue(Status);
	                   } else {
	                	   status.setCellValue(Status);
	                   }
	            	   if (error == null) {
	            		   error = row.createCell(2);
	            		   error.setCellValue(Error);
	                   } else {
	                	   error.setCellValue(Error);
	                   }
	            	   
	               }}
	            	   
	            	   
	            	   
	            	  /* 
	            	   if(status==null)
	            		    createcell = row.createCell(1);
	            	   createcell.setCellValue(Status);}
	               else {
	            	   status.setCellValue(Status);
	               }
	               if (error==null){
	            	   createcell = row.createCell(2);
	            	  
	            	   createcell.setCellValue(Error);
	               }
	               else {
	            	   error.setCellValue(Error);
	               }*/
	            	  FileOutputStream fileOut = new FileOutputStream("./src/MFC-URLS.xlsx");
	            	  workbook.write(fileOut);
	               
	                	         
	    	      //  }
	   
//	return inputdata;
	    }
	public void SetStatus_data(String URL,String Status,String Error) throws FileNotFoundException ,IOException
	{
		File src = new File("./src/MFC-URLS.xlsx");
		FileInputStream fis = new FileInputStream(src);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
	    XSSFSheet  sheet=workbook.getSheet("sheet2");// get my sheet from workbook
	    int Row=sheet.getLastRowNum()+1;
	    int ColNum= sheet.getRow(0).getLastCellNum(); 
	    int col = 1;
	    // System.out.println("column number="+ColNum);// get last ColNum
	   // Object inputdata[][]= new Object[Row-1][ColNum-2]; // pass my count data in array
	    for (int i=1; i<Row; i++) {
	  	        XSSFRow row = sheet.getRow(i);
	  	     // XSSFCell createcell = row.getCell(col);
	             XSSFCell cell = row.getCell(0);
	             XSSFCell status = row.getCell(1);
	             XSSFCell error = row.getCell(2);
	                String value = String.valueOf(cell);   
	               // System.out.println(value);
	               // inputdata[i-1][0] = value;
	             
	            	   if (cell == null) {
	            		   cell = row.createCell(0);
	            		   cell.setCellValue(URL);
	                   } else {
	                	   cell.setCellValue(URL);
	                   }
	               
	            	   if (status == null) {
	            		   status = row.createCell(1);
	            		   status.setCellValue(Status);
	                   } else {
	                	   status.setCellValue(Status);
	                   }
	            	   if (error == null) {
	            		   error = row.createCell(2);
	            		   error.setCellValue(Error);
	                   } else {
	                	   error.setCellValue(Error);
	                   }
	            	   
	               }
	            
	            	  FileOutputStream fileOut = new FileOutputStream("./src/MFC-URLS.xlsx");
	            	  workbook.write(fileOut);
	               
	                	         
	    	      //  }
	   
//	return inputdata;
	    }
	
	

	@DataProvider(name ="Exterior")
	protected Object[][] Login() throws FileNotFoundException, IOException {
	    return GetInput("Exteriors");
	}
	
	
	@DataProvider(name ="UnderTheHood")
	protected Object[][] UnderTheHood() throws FileNotFoundException, IOException {
	    return GetInput("UnderTheHood");
	}
	
	@DataProvider(name ="Testdrive")
	protected Object[][] Testdrive() throws FileNotFoundException, IOException {
	    return GetInput("Testdrive");
	}
	
	@DataProvider(name ="Interior")
	protected Object[][] Interior() throws FileNotFoundException, IOException {
	    return GetInput("Interior");
	}
	
	@DataProvider(name ="UnderBody")
	protected Object[][] UnderBody() throws FileNotFoundException, IOException {
	    return GetInput("UnderBody");
	}
	
	@DataProvider(name ="VehicleFeatures")
	protected Object[][] VehicleFeatures() throws FileNotFoundException, IOException {
	    return GetInput("VehicleFeatures");
	}
	
	@DataProvider(name ="Documents")
	protected Object[][] Documents() throws FileNotFoundException, IOException {
	    return GetInput("Documents");
	}
	
	
	@DataProvider(name ="BasicDetails")
	protected Object[][] BasicDetails() throws FileNotFoundException, IOException {
	    return GetInput("BasicDetails");
	}
	
	
	@DataProvider(name ="MFCWRLS")
	protected Object[][] URLS() throws FileNotFoundException, IOException {
	    return getUrls("URLS");
	}
	
	
	
	
	
	
	
	
}
