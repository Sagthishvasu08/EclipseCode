package StringImplementation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("madurai jn",Keys.TAB);
		WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList']");
		//Table - Rows
		List<WebElement> row=table.findElements(By.tagName("tr"));
		System.out.println(row.size());//Row size
		
		System.out.println(row.get(1));
			findElements(By.tagName("td").get(1).getText());
		List<String> item=new ArrayList<String>();
			findElements((By.tagName("td")).get(1).getText());
		
	}

}
