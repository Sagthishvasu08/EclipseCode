package testCases;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Test
public class ReportsExample {
	public void Reports(){
		ExtentReports report= new ExtentReports("./reports/result.html",false);
		//to override the xml file in order to customize the report 
		report.loadConfig(new File("./extend-config.xml"));
		ExtentTest test=report.startTest("Create Lead");
		test.assignAuthor("Sathis");
		test.assignCategory("SIT");
		test.log(LogStatus.PASS, "Launch Browser", "Browser Launched Successfully");
		test.log(LogStatus.WARNING, "Titele", "Title Does Not Match");
		report.endTest(test);
		report.flush();
		
		
	}
	

}
