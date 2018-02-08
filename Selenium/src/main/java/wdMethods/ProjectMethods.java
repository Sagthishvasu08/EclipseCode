package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public  class ProjectMethods extends SeMethods {
@BeforeTest	
public void leafTabLogin(){
	startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");		
	type(locateElement("id", "password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));
	click(locateElement("LinkText", "CRM/SFA"));
}
@AfterTest
public void CloseAllBrowsers(){
	closeAllBrowsers();
}

}
