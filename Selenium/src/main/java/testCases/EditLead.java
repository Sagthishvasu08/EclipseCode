package testCases;



import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	@Test
	public void editLead(){
	click(locateElement("LinkText","Leads"));
	click(locateElement("LinkText","Find Leads"));
	type(locateElement("xpath","(//input[@name='firstName'])[3]"),"satz");
	click(locateElement("xpath","//button[text()='Find Leads']"));
	click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	verifyTitle("View Lead | opentaps CRM");
	click(locateElement("xpath","(//a[@class='subMenuButton'])[3]"));
	type(locateElement("id","updateLeadForm_companyName"),"Accy");
	click(locateElement("class","smallSubmit"));
	verifyPartialText(locateElement("id","viewLead_companyName_sp"),"Accy");
		}

}
