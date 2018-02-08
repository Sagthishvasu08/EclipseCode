package testCases;

import org.junit.Test;

import wdMethods.ProjectMethods;

public class DeleteLeadWD extends ProjectMethods {
	@Test
	public void deleteLead(){
	leafTabLogin();
	click(locateElement("LinkText", "Leads"));
	click(locateElement("LinkText", "Find Leads"));
	click(locateElement("xpath", "(//span[@class='x-tab-strip-inner']/span)[2]"));
	type(locateElement("xpath", "//input[@name='phoneNumber']"),"956435645");
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	String resultingLeadId=getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	click(locateElement("class", "subMenuButtonDangerous"));
	click(locateElement("LinkText", "Find Leads"));
	type(locateElement("xpath", "//input[@name='id']"),resultingLeadId);
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	verifyExactText(locateElement("xpath","//div[@class='x-toolbar x-small-editor']/div"), "No records to display");
	closeAllBrowsers();
	}
}	

