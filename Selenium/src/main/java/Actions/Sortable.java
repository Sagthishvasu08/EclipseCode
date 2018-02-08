package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement sort=driver.findElementByXPath("//*[@id='sortable']/li[1]");
		int xcord=sort.getLocation().getX();
		int ycord=sort.getLocation().getY();
		Actions builder=new Actions(driver);
		WebElement destination = driver.findElementByXPath("//*[@id='sortable']/li[4]");
		builder.dragAndDropBy(destination, xcord, ycord).perform();
		
		
	}
}
