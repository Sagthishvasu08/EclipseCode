package week2.day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCContactus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindows=driver.getWindowHandles();
		for(String eachWindow:allWindows){
			driver.switchTo().window(eachWindow);
		}
		System.out.println(driver.getCurrentUrl());
	}

}
