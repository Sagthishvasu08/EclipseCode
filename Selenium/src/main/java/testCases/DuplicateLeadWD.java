package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DuplicateLeadWD extends SeMethods{

	@Test
	public void createLead() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Leads"));
		click(locateElement("LinkText", "Find Leads"));
		click(locateElement("xpath", "(//span[@class='x-tab-strip-inner'])[3]"));
		type(locateElement("xpath", "//input[@name='emailAddress']"),"komalsh99@gmail.com");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[7]"));
		Thread.sleep(1000);
		click(locateElement("xpath", "(//a[@class='linktext'])[6]"));
		click(locateElement("class", "subMenuButton"));
		String expectedTitle= "Duplicate Lead | opentaps CRM";
		verifyTitle(expectedTitle);
		click(locateElement("class", "smallSubmit"));

	}

}
