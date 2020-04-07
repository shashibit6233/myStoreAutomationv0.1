package runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.CommonFunctionsLib;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src\\test\\java\\features\\myOrder.feature", 
			glue= {"stepdefinations"}, 
			tags= {"@End2End"},  
			plugin = {"html:target/cucumber-html-report", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},  
			monochrome = true, 
			dryRun= false)	


	public class TestRunner {

		@AfterClass
		public static void writeExtentReport() throws IOException {
			Reporter.loadXMLConfig(CommonFunctionsLib.getReportConfigPath());
			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
			Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));


		}
	}


