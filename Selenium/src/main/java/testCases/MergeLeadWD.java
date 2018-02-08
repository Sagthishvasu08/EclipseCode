package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLeadWD extends SeMethods {
	@Test
	public void mergeLead() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Leads"));
		click(locateElement("LinkText", "Merge Leads"));
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "10167");
		click(locateElement("class", "x-btn-text"));
		Thread.sleep(1500);
		click(locateElement("class", "linktext"));
		Thread.sleep(1000);
		switchToWindow(0);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "10175");
		click(locateElement("class", "x-btn-text"));
		Thread.sleep(1000);
		click(locateElement("class", "linktext"));
		switchToWindow(0);
		click(locateElement("class", "buttonDangerous"));
		acceptAlert();
		click(locateElement("LinkText", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), "10175");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[7]"));
		Thread.sleep(1000);
		verifyExactText(locateElement("xpath","//div[@class='x-toolbar x-small-editor']/div"), "No records to display");
		closeAllBrowsers();
	}

}
