package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager"); 
		driver.findElementById("password").sendKeys("crmsfa"); 
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//*[@id='ext-gen627']").click();
		driver.findElementByClassName("Leads").click();
		driver.findElementByClassName("selected").click();
		driver.findElementByXPath("//*[@id='ext-gen595']").click();

	}

}
