package testCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLeadWD extends SeMethods{

	@Test
	public void createLead() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Create Lead"));
		type(locateElement("class", "inputBox"), "accy");
		type(locateElement("id", "createLeadForm_firstName"), "Satz");
		type(locateElement("id", "createLeadForm_lastName"), "kumar");
		click(locateElement("class", "smallSubmit"));
	
	}

}
