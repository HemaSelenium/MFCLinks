/**
 * 
 */


/**
 * @author Hema Sumanjali
 *
 */package common;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.IInvokedMethod;
	import org.testng.IInvokedMethodListener;
	import org.testng.ISuite;
	import org.testng.ISuiteListener;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestNGMethod;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	//import io.appium.java_client.android.AndroidDriver;

	public class Listeners implements ITestListener,ISuiteListener, IInvokedMethodListener{
		 
//		 int r=1;
		protected static AppiumHelper helper = new AppiumHelper();

		//protected static AndroidDriver<MobileElement> driver ;
		//protected static BaseClass base=new BaseClass();
		
		public void onTestStart(ISuite arg0)  {
			// TODO Auto-generated method stub
	    Reporter.log("*******"+arg0.getClass().getSimpleName()+"******* TESTCASE ******* STARTED *******",true);
	    

		}

		public void onTestSuccess(ITestResult result) {
			
			try {
				
					BaseClass.TakeScreenShot(BaseClass.driver, BaseClass.Screenshotfolder+result.getName()+"..passed.."+".png");
					BaseClass.log.info("ScreenShot Taken with the name of: "+BaseClass.Screenshotfolder+result.getName()+"..passed.."+".png");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

		
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			BaseClass.log.info("Test Failed Because of following error: "+result.getThrowable());
			try {
				
				BaseClass.TakeScreenShot(BaseClass.driver, BaseClass.Screenshotfolder+result.getName()+"..Failure.."+".png");
				BaseClass.log.info("ScreenShot Taken with the name of: "+BaseClass.Screenshotfolder+result.getName()+"..Failure.."+".png");
			//	BaseClass.log.info("Test Failed Because of following error: "+result.getThrowable(),true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub

		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub

		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub

		}

		
		
		public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
			
			
			// TODO Auto-generated method stub
			BaseClass.log.info(" ");
			
			String textMsg = "******* " + returnMethodName(arg0.getTestMethod())+"*******"+" Started *******";
			BaseClass.log.info(textMsg);
		}

		
		public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
			// TODO Auto-generated method stub
			BaseClass.log.info(" ");
			String textMsg = "******* " +returnMethodName(arg0.getTestMethod())+"*******"+" Ended *******";
			BaseClass.log.info(textMsg);
			BaseClass.log.info(" ");
		/*	try {
				//printTestResults(arg1);
			//	setMethodName(returnMethodName(arg0.getTestMethod()),Row);
			
			//	System.out.println("method name updated");
			//	Row=Row+1;
				//Row=Row+1;
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			try {
				printTestResults(arg1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		//	r=r+1;
			/*try {
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		//	r=r+1;
			
		}
	    
		public void onStart(ISuite suite) {
			
			// TODO Auto-generated method stub
			Reporter.log("*******"+suite.getName()+"******* STARTED *******",true);
			//BaseClass.log.info("*******"+method.getRealClass().get+"******* STARTED *******",true);
		
		}

		public void onFinish(ISuite suite) {
			// TODO Auto-generated method stub
			BaseClass.log.info("*******"+suite.getName()+"******* ENDED *******");
			
		}



		private void printTestResults(ITestResult result) throws IOException {


			String status;
			
			switch (result.getStatus()) {
			
			

			case ITestResult.SUCCESS:

				status = "Passed";
				BaseClass.log.info("Test Status: " + status);
				/*setStatus(status,Row);
				Reporter.log("Status Updated",true);
				*/
						break;

			case ITestResult.FAILURE:

				status = "Failed";
				BaseClass.log.info("Test Status: " + status);
				/*setStatus(status,Row);
				Reporter.log("Status Updated",true);*/
				
				break;

			case ITestResult.SKIP:

				status = "Skipped";
				BaseClass.log.info("Test Status: " + status);
				//setStatus(status,Row);
				//Reporter.log("Status Updated",true);
				
				
			}
	//r=r+1;
			//Row=Row+1;
			
		}


		private String returnMethodName(ITestNGMethod method) {

			//return method.getRealClass().getSimpleName() + "." + method.getMethodName();
			return  method.getMethodName();
		}
		

		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		/* (non-Javadoc)
		 * @see org.testng.IReporter#generateReport(java.util.List, java.util.List, java.lang.String)
		 */
		
		public static void setCellData(String Testcasename,String MethoName,String Status) throws Exception {
		    File src = new File("C:\\Users\\Hema Sumanjali\\Desktop\\OutputResults.xlsx");
			FileInputStream fis = new FileInputStream(src);
		    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
		    XSSFSheet  excelWSheet=workbook.getSheet("Report");
	        try {
	        	 int Row=1;
	        	 
	        	 System.out.println(Row);
	        	 XSSFCell  TestcaseName = excelWSheet.getRow(Row).getCell(0);
		           TestcaseName.setCellValue(Testcasename);
	          // XSSFRow row = excelWSheet.getRow(RowNum);
		           
	          XSSFCell  status = excelWSheet.getRow(Row).getCell(2);
	          status.setCellValue(Status);
	           Row++;
	           
	           XSSFCell  MethodName = excelWSheet.getRow(Row).getCell(1);
	           MethodName.setCellValue(MethoName);
	           
	           
	            // Constant variables Test Data path and Test Data file name
	            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Hema Sumanjali\\Desktop\\OutputResults.xlsx");
	           workbook.write(fileOut);
	           fileOut.flush();
	           fileOut.close();
	        } catch (Exception e) {
	            try {
	                throw (e);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }

		public static void setMethodName(String MethoName,int Row) throws Exception {
		    File src = new File("C:\\Users\\Hema Sumanjali\\Desktop\\OutputResults.xlsx");
			FileInputStream fis = new FileInputStream(src);
		    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
		    XSSFSheet  excelWSheet=workbook.getSheet("Report");
	        try {
	        	 
	        	  // Row++;
	           XSSFCell  MethodName = excelWSheet.getRow(Row).getCell(1);
	           MethodName.setCellValue(MethoName);
	          /* XSSFCell  Status = excelWSheet.getRow(Row).getCell(2);
	           Status.setCellValue(status);*/
	            // Constant variables Test Data path and Test Data file name
	            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Hema Sumanjali\\Desktop\\OutputResults.xlsx");
	           workbook.write(fileOut);
	           fileOut.flush();
	           fileOut.close();
	        } catch (Exception e) {
	            try {
	                throw (e);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	        
	      
	    }
		public static void setStatus(String status,int Row) throws Exception {
			
		    File src = new File("C:\\Users\\Hema Sumanjali\\Desktop\\OutputResults.xlsx");
			FileInputStream fis = new FileInputStream(src);
		    XSSFWorkbook workbook = new XSSFWorkbook(fis); //get my workbook
		    XSSFSheet  excelWSheet=workbook.getSheet("Report");
	        try {
	        	        	 
	          System.out.println(Row);
	          XSSFCell  Status = excelWSheet.getRow(Row).getCell(2);
	          Status.setCellValue(status);
	          // Row++;
	                  
	            // Constant variables Test Data path and Test Data file name
	           FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Hema Sumanjali\\Desktop\\OutputResults.xlsx");
	           workbook.write(fileOut);
	           fileOut.flush();
	           fileOut.close();
	        } catch (Exception e) {
	            try {
	                throw (e);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }
	}


