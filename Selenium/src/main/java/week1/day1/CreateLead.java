package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers", "./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager"); 
		driver.findElementById("password").sendKeys("crmsfa"); 
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByClassName("inputBox").sendKeys("Satz");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sathish"); 
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("test");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("test");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("15000");
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Aerospace");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Sole Proprietorship");
		driver.findElementById("createLeadForm_sicCode").sendKeys("6487");
		driver.findElementById("createLeadForm_description").sendKeys("test");
		//driver.findElementById("createLeadForm_parentPartyId").sendKeys("test");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("789");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("tres");
		driver.findElementById("createLeadForm_departmentName").sendKeys("FS");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("15");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("4");
		driver.findElementById("createLeadForm_departmentName").sendKeys("FS");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("5456");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("45698");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("fgt@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("4455567890");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("test");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.abc.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Elakkiya");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("123 do not ship");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("38112");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("38112");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("tres");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("123 ffg st");
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Alabama");
		driver.findElementByClassName("smallSubmit").click();
		
	}

}
