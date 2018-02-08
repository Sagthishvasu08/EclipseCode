package Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		Actions builder = new Actions(driver) ;
		builder.dragAndDrop(drag, drop).perform();
		
	}
}
