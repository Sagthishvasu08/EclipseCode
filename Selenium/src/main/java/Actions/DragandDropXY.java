package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropXY {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		WebElement drag=driver.findElementById("draggable");
		int xcord=drag.getLocation().getX();
		int ycord=drag.getLocation().getY();
		System.out.println("X and Y COrdinate of Dragable is:"+xcord+","+ycord);
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 240, 100).perform();;
		int mxcord=drag.getLocation().getX();
		int mycord=drag.getLocation().getY();
		System.out.println("X and Y Cordinate of Dragable after movement is:"+mxcord+","+mycord);
		
		
	}
}
