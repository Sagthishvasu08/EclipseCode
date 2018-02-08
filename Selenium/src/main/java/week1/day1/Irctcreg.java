package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Irctcreg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("sathish");
		driver.findElementById("userRegistrationForm:password").sendKeys("Palani@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Palani@123");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Cow");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sathishkumar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("M");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Periyasamy");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("17");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUL");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1990");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Professional");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("2132sdfdstr");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("sathishvasu08@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8870316949");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("123 do not ship");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600063");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Kanchipuram");
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Srinivasanagar East B.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("8870316949");
		Thread.sleep(5000);
		driver.close();
	}

}
